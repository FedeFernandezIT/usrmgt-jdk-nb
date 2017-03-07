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
import com.nunait.usrmgt.UserDetails;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/** 
 * (ES)
 * <p>
 * (EN)
 * <p>
 * @author Federico Fernandez | fede.fernandez.it@gmail.com
 * @created 6 de marzo de 2017 10:29:44 ART
 */
public class UserDao {
    private final String url;    

    public UserDao(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public Connection getConnection() {        
       Connection conn = null;
       try {
            conn = DriverManager.getConnection( url );
        } catch ( SQLException ex ) {
        }        
        return conn;
    }

    public void addUser(User user) {        
        Connection conn = getConnection();        
        Statement stmt = null;
        
        String username = user.getUsername();
        String password = user.getPassword();
        
        String insertUser = "INSERT INTO users VALUES ('" +
                username + "', '" + password + "');";
        
        try {            
            stmt = conn.createStatement();
            stmt.executeUpdate( insertUser );
        } catch ( SQLException ex ) {            
            System.out.println( "ERROR: UserDao.addUser() " + ex.toString() );
        } finally {
            try {
                if ( stmt != null ) stmt.close();
                if ( conn != null ) conn.close();
            } catch ( SQLException ex ) {                
            }                        
        }
        
    }
}
