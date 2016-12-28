/*
Navicat MySQL Data Transfer

Source Server         : maiba
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : maiba

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2016-12-28 20:18:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `commentId` int(11) NOT NULL AUTO_INCREMENT,
  `postId` int(11) DEFAULT NULL,
  `comment` varchar(200) DEFAULT NULL,
  `userName` varchar(20) DEFAULT NULL,
  `datetime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`commentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for post
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `postId` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(20) DEFAULT NULL,
  `context` varchar(2000) DEFAULT NULL,
  `userName` varchar(11) DEFAULT NULL,
  `clickNumber` int(3) DEFAULT NULL,
  `replyNumber` int(3) DEFAULT NULL,
  `date` timestamp NULL DEFAULT NULL,
  `lastReplyTime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`postId`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES ('25', '我是zz', '这是我第一个帖子', '12', '0', '0', '2016-12-14 15:02:50', null);
INSERT INTO `post` VALUES ('26', 'rwrewtr', '<p>rwetret<img src=\"http://img.baidu.com/hi/jx2/j_0019.gif\"/><img title=\"1482303538423051320.png\" alt=\"apk图标.png\" src=\"/ueditor/jsp/upload/image/20161221/1482303538423051320.png\"/></p>', '13', '0', '0', '2016-12-21 14:59:02', null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL,
  `password` varchar(10) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('6', '12', '121212', 'Lee', '12', '12@qq.com');
INSERT INTO `user` VALUES ('7', '13', '131313', 'zhang', '13', '13@qq.com');
INSERT INTO `user` VALUES ('8', '14', '141414', 'huang', '14', '18813299979@163.com');
INSERT INTO `user` VALUES ('15', '15', '151515', 'Lin', '15', '18813299979@163.com');
