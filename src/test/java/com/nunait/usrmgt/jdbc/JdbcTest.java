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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Federico Fernandez
 */
public class JdbcTest {
    private static final String URL_CONNECTION =
            "jdbc:h2:mem:test;" +
            "INIT=runscript from 'classpath:/scripts/h2-schema.sql';" +
            "DB_CLOSE_DELAY=-1";
        
    private Connection conn = null;
        
    @Test
    public void testConnection() throws ClassNotFoundException {
        Class.forName( "org.h2.Driver" );
        try {        
            Connection conn = DriverManager.
                    getConnection( URL_CONNECTION );            
            conn.close();            
        } catch ( SQLException ex ) {      
            fail( "Connection fail" );
        }        
    }
}
