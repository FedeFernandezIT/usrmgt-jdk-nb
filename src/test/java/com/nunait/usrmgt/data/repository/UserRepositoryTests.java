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

package com.nunait.usrmgt.data.repository;

import com.nunait.usrmgt.User;
import org.junit.Test;

import static org.junit.Assert.*;

/** 
 * (ES)
 * <p>
 * (EN)
 * <p>
 * @author Federico Fernandez | fede.fernandez.it@gmail.com
 * @created 2 de marzo de 2017 17:36:47 ART
 */
public class UserRepositoryTests {    
       
    @Test
    public void testRepositorySave() {
       UserRepository repository = new UserRepository();
       
       repository.save( new User("river", "plate" ));
       
       assertEquals( 1, repository.size() );
               
    }
    
}
