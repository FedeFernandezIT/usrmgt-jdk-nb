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

/** 
 * (ES) Modela la información básica del usuario.
 * <p>
 * (EN) Models core user information.
 * <p> 
 * @author Federico Fernandez | fede.fernandez.it@gmail.com
 * @created 28 de febrero de 2017 18:03:33 ART
 */
public class User implements UserDetails {
    
    // ~ Instance fields
    // =======================================================================    
    private String password;
    private final String username;
    
    // ~ Constructors
    // =======================================================================    
    public User( String username, String password ) {
        if ( username == null || username.isEmpty() || password == null ) {
            throw new IllegalArgumentException(
                    "No se pueden pasar valores null o empty al constructor");
        }
        
        this.username = username;
        this.password = password;
    }
    
    
    // ~ Methods
    // =======================================================================    
    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }
    
}
