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
package com.nunait.usrmgt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/** 
 * Prueba la performance de User (POJO)
 * 
 * @author Federico Fernandez | fede.fernandez.it@gmail.com
 * @created 27 de febrero de 2017 18:29:22 ART
 */
public class UserTests {
    
    private static UserDetails user;
    
    public UserTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println( "* UserTests: @BeforeClass" );
        user = new User( "river", "plate" );
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println( "* UserTests: @AfterClass" );
        user = null;        
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testUserGetter() {
        assertEquals( "river", user.getUsername() );
        assertEquals( "plate", user.getPassword() );
    }
    
}
