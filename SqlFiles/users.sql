/*
Navicat PGSQL Data Transfer

Source Server         : 本地
Source Server Version : 110100
Source Host           : localhost:5432
Source Database       : postgres
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 110100
File Encoding         : 65001

Date: 2018-12-07 17:44:22
*/


-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS "public"."users";
CREATE TABLE "public"."users" (
"username" varchar(20) COLLATE "default" NOT NULL,
"password" varchar(20) COLLATE "default",
"realname" varchar(20) COLLATE "default",
"sex" char(2) COLLATE "default",
"telnumber" varchar(20) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO "public"."users" VALUES ('admin', 'root', '李俊', '男 ', '13223224578');
INSERT INTO "public"."users" VALUES ('guest', '123456', null, null, null);
INSERT INTO "public"."users" VALUES ('hahaha', '123456', null, null, null);

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table users
-- ----------------------------
ALTER TABLE "public"."users" ADD PRIMARY KEY ("username");
