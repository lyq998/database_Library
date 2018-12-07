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

Date: 2018-12-07 17:44:13
*/


-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS "public"."manager";
CREATE TABLE "public"."manager" (
"managername" char(20) COLLATE "default",
"password" char(20) COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of manager
-- ----------------------------
INSERT INTO "public"."manager" VALUES ('lyq                 ', 'lyq123456           ');
INSERT INTO "public"."manager" VALUES (null, null);

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------
