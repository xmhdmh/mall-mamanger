-- ----------------------------
-- admin   123456
-- ----------------------------

INSERT INTO `sys_permission` VALUES ('5', '', '用户管理', '0', '0/', 'userInfo:view', 'menu', 'userInfo/userList');

INSERT INTO `sys_role_permission` VALUES ('3', '5', '4');

INSERT INTO `sys_role` VALUES ('2', '', '管理员', 'admin');

INSERT INTO `sys_user_role` VALUES ('1', '3', '2');

INSERT INTO `user_info` VALUES ('1', '管理员', 'd3c59d25033dbf980d29554025c23a75', '8d78869f470951332959580424d4bf4f', '0', 'admin');