/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.sql.parser.visitor;

import org.apache.shardingsphere.sql.parser.MySQLVisitor;
import org.apache.shardingsphere.sql.parser.autogen.MySQLStatementParser.AlterUserContext;
import org.apache.shardingsphere.sql.parser.autogen.MySQLStatementParser.CreateRoleContext;
import org.apache.shardingsphere.sql.parser.autogen.MySQLStatementParser.CreateUserContext;
import org.apache.shardingsphere.sql.parser.autogen.MySQLStatementParser.DropRoleContext;
import org.apache.shardingsphere.sql.parser.autogen.MySQLStatementParser.DropUserContext;
import org.apache.shardingsphere.sql.parser.autogen.MySQLStatementParser.RenameUserContext;
import org.apache.shardingsphere.sql.parser.autogen.MySQLStatementParser.SetDefaultRoleContext;
import org.apache.shardingsphere.sql.parser.autogen.MySQLStatementParser.SetPasswordContext;
import org.apache.shardingsphere.sql.parser.sql.ASTNode;
import org.apache.shardingsphere.sql.parser.sql.statement.dcl.AlterUserStatement;
import org.apache.shardingsphere.sql.parser.sql.statement.dcl.CreateRoleStatement;
import org.apache.shardingsphere.sql.parser.sql.statement.dcl.CreateUserStatement;
import org.apache.shardingsphere.sql.parser.sql.statement.dcl.DropRoleStatement;
import org.apache.shardingsphere.sql.parser.sql.statement.dcl.DropUserStatement;
import org.apache.shardingsphere.sql.parser.sql.statement.dcl.RenameUserStatement;
import org.apache.shardingsphere.sql.parser.sql.statement.dcl.SetPasswordStatement;
import org.apache.shardingsphere.sql.parser.sql.statement.dcl.SetRoleStatement;

/**
 * MySQL DCL visitor.
 *
 * @author panjuan
 */
public final class MySQLDCLVisitor extends MySQLVisitor {
    
    @Override
    public ASTNode visitCreateUser(final CreateUserContext ctx) {
        return new CreateUserStatement();
    }
    
    @Override
    public ASTNode visitDropRole(final DropRoleContext ctx) {
        return new DropRoleStatement();
    }
    
    @Override
    public ASTNode visitSetDefaultRole(final SetDefaultRoleContext ctx) {
        return new SetRoleStatement();
    }
    
    @Override
    public ASTNode visitCreateRole(final CreateRoleContext ctx) {
        return new CreateRoleStatement();
    }
    
    @Override
    public ASTNode visitDropUser(final DropUserContext ctx) {
        return new DropUserStatement();
    }
    
    @Override
    public ASTNode visitAlterUser(final AlterUserContext ctx) {
        return new AlterUserStatement();
    }
    
    @Override
    public ASTNode visitRenameUser(final RenameUserContext ctx) {
        return new RenameUserStatement();
    }
    
    @Override
    public ASTNode visitSetPassword(final SetPasswordContext ctx) {
        return new SetPasswordStatement();
    }
}
