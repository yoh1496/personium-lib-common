/**
 * Personium
 * Copyright 2014-2022 Personium Project Authors
 * - FUJITSU LIMITED
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.personium.common.auth.token;

import java.util.List;


/**
 *  interface of access token issued by a cell that the subject does not belong to and is visiting.
 */
public interface IExtRoleContainingToken {
    /**
     * returns the URL of the visiting cell.
     * TODO what is the difference from the issuer?
     * @return visiting cell URL
     */
    String getExtCellUrl();

    String getIssuer();

    String getSubject();

    /**
     * returns a list of roles assigned at visiting cell (issuer cell).
     * @return List of roles assigned at visiting cell
     */
    List<Role> getRoleList();
}
