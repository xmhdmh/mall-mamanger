/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : mall

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-09-02 11:45:25
*/

SET FOREIGN_KEY_CHECKS=0;

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
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='广告分类';

-- ----------------------------
-- Records of t_ads_category
-- ----------------------------
INSERT INTO `t_ads_category` VALUES ('1', '幻灯片', '备注', null, '0', null, null, null);
INSERT INTO `t_ads_category` VALUES ('9', '撒的', '是的', '2016-08-19 16:41:19', '0', null, null, null);
INSERT INTO `t_ads_category` VALUES ('10', 'sdfd', 'sfsdf', '2016-08-19 17:55:57', '0', null, null, null);
INSERT INTO `t_ads_category` VALUES ('11', 'dfg', 'dfgdg', '2016-08-19 17:56:20', '0', null, null, null);

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
INSERT INTO `t_sys_sequences` VALUES ('2', 't_abs_category', '11', '2016-08-10 15:40:05', '1', '1', '99999999');
INSERT INTO `t_sys_sequences` VALUES ('3', 't_pro_category', '1', '2016-08-10 15:40:28', '1', '1', '99999999');
