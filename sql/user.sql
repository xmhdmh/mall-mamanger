-- ----------------------------
-- admin   123456
-- ----------------------------

INSERT INTO `sys_permission` VALUES ('1', '', '用户管理', '0', '0/', 'userInfo:view', 'menu', 'userInfo/userList',1);
INSERT INTO  sys_role  (id,available,description,role)VALUES('1', 1, '管理员', 'admin');

INSERT INTO `sys_role_permission` VALUES ('1', '1', '1');



INSERT INTO `sys_user_role` VALUES ('1', '1', '1');

INSERT INTO  user_detail (id,nick_name,sex) VALUES('1','admin',1);

INSERT INTO user_login VALUES ('1','d3c59d25033dbf980d29554025c23a75','8d78869f470951332959580424d4bf4f','0','admin','125396467@qq.com','15957166651',sysdate(),1)