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

Date: 2018-12-07 17:44:04
*/


-- ----------------------------
-- Table structure for info
-- ----------------------------
DROP TABLE IF EXISTS "public"."info";
CREATE TABLE "public"."info" (
"id" int4 DEFAULT nextval('serial'::regclass) NOT NULL,
"text" varchar(1024) COLLATE "default",
"datetime" varchar(40) COLLATE "default" DEFAULT now()
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of info
-- ----------------------------
INSERT INTO "public"."info" VALUES ('3', '这是第一个公告测试！', '2018-12-03 20:25:35.488677+08');
INSERT INTO "public"."info" VALUES ('4', 'jsp上的第一次发布公告测试', '2018-12-03 21:16:28.130945+08');
INSERT INTO "public"."info" VALUES ('5', '再发一个试试', '2018-12-03 21:17:15.444857+08');
INSERT INTO "public"."info" VALUES ('6', '总体测试一', '2018-12-07 16:43:56.921885+08');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table info
-- ----------------------------
ALTER TABLE "public"."info" ADD PRIMARY KEY ("id");
