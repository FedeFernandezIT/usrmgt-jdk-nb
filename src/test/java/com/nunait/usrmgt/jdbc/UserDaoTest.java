/*
 * Copyright 2017 NunaIT.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nunait.usrmgt.jdbc;

import com.nunait.usrmgt.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Federico Fernandez
 */
public class UserDaoTest {
    
    public UserDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        String url =
            "jdbc:h2:mem:test;" +
            "INIT=runscript from 'classpath:/scripts/h2-schema.sql';" +
            "DB_CLOSE_DELAY=-1";
        try {        
            Connection conn = DriverManager.getConnection( url );            
            conn.close();            
        } catch ( SQLException ex ) {      
            fail( "Connection fail" );
        }
    }
    
    @Test
    public void testNoArgConstructorDoesntExist() {
        Class<UserDao> clazz = UserDao.class;
        
        try {
            clazz.getDeclaredConstructor( (Class<?>[]) null );
            fail( "Should have throw NoSuchMethodException" );
        } catch ( NoSuchMethodException ex ) {            
        } 
    }
    
    @Test
    public void testConstructorWithStringConnection() {
        String url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
        
        UserDao userDao = new UserDao( url );
        
        assertEquals( url, userDao.getUrl() );
    }
    
    @Test
    public void testGetConnection() {
        String url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";        
        Connection conn = null;
        
        UserDao dao = new UserDao( url );
        conn = dao.getConnection();
        
        assertNotEquals( null, conn);        
    }
    
    @Test
    public void testAddUser() {
        String url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";        
        
        UserDao dao = new UserDao( url );    
        
        dao.addUser( new User( "river", "plate" ));        
        dao.addUser( new User("boca", "juniors" ));
        
        assertEquals( new Long(2) , countUsers() );
        
    }
    
    private Long countUsers() {
        String url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
        String query = "SELECT COUNT(*) FROM users;";
        Connection conn = null;
        Long count = null ;
        
        try {                        
            conn = DriverManager.getConnection( url );
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery( query );
                                                
            while ( rs.next() ) {                
                count =  rs.getLong( "COUNT(*)" );
            }
            
        } catch ( SQLException ex ) {
            System.out.println( "ERROR: countUser " + ex.toString() );
        } finally {
            if ( conn != null ) try {
                conn.close();
            } catch ( SQLException ex ) {                
            }
        }        
        return count;
    }    
    
}
