/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : mall

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-10-13 09:41:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ads
-- ----------------------------
DROP TABLE IF EXISTS `ads`;
CREATE TABLE `ads` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `link_address` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `picture_address` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ads
-- ----------------------------
INSERT INTO `ads` VALUES ('1', '23', '23', '23', '32');

-- ----------------------------
-- Table structure for demo
-- ----------------------------
DROP TABLE IF EXISTS `demo`;
CREATE TABLE `demo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `user_age` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of demo
-- ----------------------------
INSERT INTO `demo` VALUES ('1', '测试', null, null);
INSERT INTO `demo` VALUES ('2', '测试', null, null);

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `opt_time` datetime DEFAULT NULL COMMENT '操作时间',
  `opt_category` bigint(20) DEFAULT NULL COMMENT '日志分类',
  `opt_summary` varchar(255) DEFAULT NULL COMMENT '记录被操作业务数据的变更内容',
  `ip_address` varchar(16) DEFAULT NULL COMMENT '计算机ip地址',
  `computer_name` varchar(32) DEFAULT NULL COMMENT '计算机名称',
  `operator` bigint(20) DEFAULT NULL COMMENT '操作人员的用户Id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES ('1', '2016-09-28 16:02:09', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('2', '2016-09-28 16:07:03', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('3', '2016-09-28 16:56:26', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('4', '2016-09-29 09:40:57', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('5', '2016-09-29 14:24:46', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('6', '2016-09-29 14:56:47', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('7', '2016-09-29 15:09:37', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('8', '2016-09-29 15:49:54', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('9', '2016-09-29 15:54:12', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('10', '2016-09-29 15:57:08', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('11', '2016-09-29 16:24:56', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('12', '2016-09-29 16:26:32', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('13', '2016-09-29 16:27:23', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('14', '2016-09-29 16:35:42', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('15', '2016-09-29 16:38:34', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('16', '2016-09-29 16:40:14', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('17', '2016-09-29 16:43:12', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('18', '2016-09-29 16:44:26', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('19', '2016-09-29 16:46:53', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('20', '2016-09-29 16:47:26', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('21', '2016-09-29 16:48:03', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('22', '2016-09-29 17:50:11', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('23', '2016-09-29 17:50:34', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('24', '2016-09-30 09:54:06', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('25', '2016-10-06 16:31:33', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('26', '2016-10-06 16:34:39', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('27', '2016-10-06 17:18:26', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('28', '2016-10-06 17:18:32', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('29', '2016-10-06 17:34:05', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('30', '2016-10-07 13:23:48', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('31', '2016-10-07 15:00:50', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('32', '2016-10-07 15:30:12', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('33', '2016-10-07 16:08:53', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('34', '2016-10-08 11:32:36', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('35', '2016-10-08 15:38:45', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('36', '2016-10-08 15:40:24', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('37', '2016-10-08 15:42:50', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('38', '2016-10-08 15:46:11', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('39', '2016-10-08 15:50:58', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('40', '2016-10-08 15:54:36', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('41', '2016-10-08 15:55:55', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('42', '2016-10-08 16:36:02', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('43', '2016-10-11 13:44:02', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('44', '2016-10-11 13:50:58', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('45', '2016-10-11 13:53:09', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('46', '2016-10-11 13:59:19', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('47', '2016-10-11 15:45:03', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('48', '2016-10-11 15:46:42', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('49', '2016-10-11 16:04:22', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('50', '2016-10-11 16:07:43', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('51', '2016-10-11 17:59:23', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('52', '2016-10-11 17:59:29', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('53', '2016-10-11 18:00:49', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('54', '2016-10-12 09:12:27', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('55', '2016-10-12 09:58:32', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('56', '2016-10-12 09:58:36', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('57', '2016-10-12 10:03:20', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('58', '2016-10-12 10:04:38', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('59', '2016-10-12 10:38:53', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('60', '2016-10-12 10:41:15', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('61', '2016-10-12 11:36:38', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('62', '2016-10-12 13:11:23', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('63', '2016-10-12 13:15:35', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('64', '2016-10-12 13:18:39', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('65', '2016-10-12 13:44:29', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('66', '2016-10-12 14:05:18', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('67', '2016-10-12 14:12:30', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('68', '2016-10-12 14:27:27', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('69', '2016-10-12 16:29:00', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('70', '2016-10-12 17:22:33', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('71', '2016-10-13 09:28:43', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');
INSERT INTO `sys_log` VALUES ('72', '2016-10-13 09:40:41', null, '登录系统', '10.200.104.225', 'PC-00-002680', '2');

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `available` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `parent_ids` varchar(255) DEFAULT NULL,
  `permission` varchar(255) DEFAULT NULL,
  `resource_type` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', '', '用户管理', '0', '0/', 'userInfo:view', 'menu', 'userInfo/userList');
INSERT INTO `sys_permission` VALUES ('2', '', '用户添加', '1', '0/1', 'userInfo:add', 'button', 'userInfo/userAdd');
INSERT INTO `sys_permission` VALUES ('3', '', '用户删除', '1', '0/1', 'userInfo:del', 'button', 'userInfo/userDel');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `available` bit(1) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', '', '管理员', 'admin');
INSERT INTO `sys_role` VALUES ('2', '', 'VIP会员', 'vip');

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `role_id` bigint(20) DEFAULT NULL,
  `permission_id` bigint(20) DEFAULT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('1', '1', '1');
INSERT INTO `sys_role_permission` VALUES ('2', '1', '2');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_id` bigint(20) DEFAULT NULL,
  `role_id` bigint(20) DEFAULT NULL,
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1', '1');
INSERT INTO `sys_user_role` VALUES ('2', '1', '2');

-- ----------------------------
-- Table structure for t_ads
-- ----------------------------
DROP TABLE IF EXISTS `t_ads`;
CREATE TABLE `t_ads` (
  `ID` int(8) NOT NULL AUTO_INCREMENT,
  `SORT_ID` int(8) DEFAULT NULL,
  `ABS_PATH` varchar(128) DEFAULT NULL,
  `ABS_LINK` varchar(255) DEFAULT NULL,
  `CREATED_TIME` datetime DEFAULT NULL,
  `CREATED_BY` int(8) DEFAULT NULL,
  `UPDATED_TIME` datetime DEFAULT NULL,
  `UPDATED_BY` int(8) DEFAULT NULL,
  `IS_SHOW` int(1) DEFAULT '0',
  `ABS_ORDER` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_T_ABS_CATEGORY` (`SORT_ID`),
  CONSTRAINT `FK_T_ABS_CATEGORY` FOREIGN KEY (`SORT_ID`) REFERENCES `t_ads_category` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='广告表';

-- ----------------------------
-- Records of t_ads
-- ----------------------------

-- ----------------------------
-- Table structure for t_ads_category
-- ----------------------------
DROP TABLE IF EXISTS `t_ads_category`;
CREATE TABLE `t_ads_category` (
  `ID` int(8) NOT NULL AUTO_INCREMENT,
  `SORT_NAME` varchar(64) DEFAULT NULL,
  `SORT_REMARKS` varchar(255) DEFAULT NULL,
  `CREATED_TIME` datetime DEFAULT NULL,
  `IS_ACTIVE` int(1) DEFAULT '0',
  `CREATED_BY` int(8) DEFAULT NULL,
  `UPDATED_TIME` datetime DEFAULT NULL,
  `UPDATED_BY` int(8) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='广告分类';

-- ----------------------------
-- Records of t_ads_category
-- ----------------------------
INSERT INTO `t_ads_category` VALUES ('1', '幻灯片', '备注', null, '0', null, null, null);
INSERT INTO `t_ads_category` VALUES ('9', '撒的', '是的', '2016-08-19 16:41:19', '0', null, null, null);
INSERT INTO `t_ads_category` VALUES ('10', 'sdfd', 'sfsdf', '2016-08-19 17:55:57', '0', null, null, null);
INSERT INTO `t_ads_category` VALUES ('11', 'dfg', 'dfgdg', '2016-08-19 17:56:20', '0', null, null, null);
INSERT INTO `t_ads_category` VALUES ('12', 'trt', 'ertertertert', '2016-09-29 10:03:11', '1', null, null, null);
INSERT INTO `t_ads_category` VALUES ('13', 'asd', 'asd', '2016-09-29 10:44:10', '0', null, null, null);
INSERT INTO `t_ads_category` VALUES ('14', 'fdsf', '发斯蒂芬', '2016-09-29 10:44:16', '0', null, null, null);
INSERT INTO `t_ads_category` VALUES ('15', 'sdfsdf', 'sdfsdf', '2016-09-29 10:44:24', '0', null, null, null);
INSERT INTO `t_ads_category` VALUES ('16', '水电费水电费', '水电费是的', '2016-09-29 10:44:32', '0', null, null, null);
INSERT INTO `t_ads_category` VALUES ('17', '水电费', '水电费', '2016-09-29 10:44:38', '0', null, null, null);
INSERT INTO `t_ads_category` VALUES ('18', '水电费水电费4', '水电费d', '2016-09-29 10:44:47', '0', null, null, null);

-- ----------------------------
-- Table structure for t_pro_category
-- ----------------------------
DROP TABLE IF EXISTS `t_pro_category`;
CREATE TABLE `t_pro_category` (
  `ID` int(8) NOT NULL AUTO_INCREMENT,
  `CATE_NAME` varchar(64) DEFAULT NULL,
  `IS_ONE_CATEGORY` int(1) DEFAULT NULL,
  `CREATED_BY` int(8) DEFAULT NULL,
  `CREATED_TIME` datetime DEFAULT NULL,
  `UPDATED_BY` int(8) DEFAULT NULL,
  `UPDATED_TIME` datetime DEFAULT NULL,
  `REMARKS` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品分类';

-- ----------------------------
-- Records of t_pro_category
-- ----------------------------

-- ----------------------------
-- Table structure for t_sys_dic
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_dic`;
CREATE TABLE `t_sys_dic` (
  `DICT_KEY` int(8) NOT NULL AUTO_INCREMENT,
  `DICT_NO` int(4) DEFAULT NULL,
  `DICT_NAME` varchar(64) DEFAULT NULL,
  `IS_ACTIVE` int(1) DEFAULT NULL,
  `CREATED_BY` int(8) DEFAULT NULL,
  `CREATED_TIME` datetime DEFAULT NULL,
  `UPDATED_BY` int(8) DEFAULT NULL,
  `UPDATED_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`DICT_KEY`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统字典表';

-- ----------------------------
-- Records of t_sys_dic
-- ----------------------------

-- ----------------------------
-- Table structure for t_sys_sequences
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_sequences`;
CREATE TABLE `t_sys_sequences` (
  `SEQ_CODE` int(8) NOT NULL AUTO_INCREMENT,
  `SEQ_NAME` varchar(32) DEFAULT NULL,
  `SEQ_NO` int(12) DEFAULT NULL,
  `SEQ_DATE` datetime DEFAULT NULL,
  `SEQ_STEP` int(8) DEFAULT NULL,
  `SEQ_MIN` int(12) DEFAULT NULL,
  `SEQ_MAX` int(12) DEFAULT NULL,
  PRIMARY KEY (`SEQ_CODE`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_sequences
-- ----------------------------
INSERT INTO `t_sys_sequences` VALUES ('1', 't_abs', '1', '2016-08-10 15:38:53', '1', '1', '99999999');
INSERT INTO `t_sys_sequences` VALUES ('2', 't_abs_category', '18', '2016-08-10 15:40:05', '1', '1', '99999999');
INSERT INTO `t_sys_sequences` VALUES ('3', 't_pro_category', '1', '2016-08-10 15:40:28', '1', '1', '99999999');

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  `state` tinyint(4) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('2', '管理员', 'd3c59d25033dbf980d29554025c23a75', '8d78869f470951332959580424d4bf4f', '0', 'admin');
