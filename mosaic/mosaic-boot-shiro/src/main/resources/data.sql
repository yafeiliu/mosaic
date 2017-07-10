INSERT INTO `SysPermission` VALUES ('1', '1', '用户管理', '0', '0/', 'userInfo:view', 'menu', 'userInfo/userList');
INSERT INTO `SysPermission` VALUES ('2', '1', '用户添加', '1', '0/1', 'userInfo:add', 'button', 'userInfo/userAdd');
INSERT INTO `SysPermission` VALUES ('3', '1', '用户删除', '1', '0/1', 'userInfo:del', 'button', 'userInfo/userDel');
INSERT INTO `SysRole` VALUES ('1', '1', '管理员', 'admin');
INSERT INTO `SysRole` VALUES ('2', '1', 'VIP会员', 'vip');
INSERT INTO `SysRolePermission` VALUES ('1', '1');
INSERT INTO `SysRolePermission` VALUES ('1', '2');
INSERT INTO `SysUserRole` VALUES ('1', '1');
INSERT INTO `SysUserRole` VALUES ('1', '2');
INSERT INTO `UserInfo` VALUES ('1', '管理员', 'admin', 'd3c59d25033dbf980d29554025c23a75', '8d78869f470951332959580424d4bf4f', '0');




INSERT INTO `Sys_Role` VALUES ('1', '', '管理员', 'admin');
INSERT INTO `Sys_Role` VALUES ('2', '', 'VIP会员', 'vip');
INSERT INTO `Sys_Permission` VALUES ('1', '', '用户管理', '0', '0/', 'userInfo:view', 'menu', 'userInfo/userList');
INSERT INTO `Sys_Permission` VALUES ('2', '', '用户添加', '1', '0/1', 'userInfo:add', 'button', 'userInfo/userAdd');
INSERT INTO `Sys_Permission` VALUES ('3', '', '用户删除', '1', '0/1', 'userInfo:del', 'button', 'userInfo/userDel');

INSERT INTO `Sys_Role_Permission` VALUES ('1', '1');
INSERT INTO `Sys_Role_Permission` VALUES ('1', '2');

#INSERT INTO `User_Info` VALUES ('1', '管理员', 'admin', 'd3c59d25033dbf980d29554025c23a75', '8d78869f470951332959580424d4bf4f', '0');
INSERT INTO `user_info` VALUES ('1', '管理员', 'd3c59d25033dbf980d29554025c23a75', '8d78869f470951332959580424d4bf4f', '0', 'admin');
INSERT INTO `Sys_User_Role` VALUES ('1', '1');
INSERT INTO `Sys_User_Role` VALUES ('1', '2');