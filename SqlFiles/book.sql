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

Date: 2018-12-07 17:43:42
*/


-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS "public"."book";
CREATE TABLE "public"."book" (
"callnumber" varchar(20) COLLATE "default" NOT NULL,
"isbn" varchar(10) COLLATE "default",
"name" varchar(20) COLLATE "default",
"author" varchar(20) COLLATE "default",
"publisher" varchar(20) COLLATE "default",
"price" float8
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO "public"."book" VALUES ('0000001', '002', '再随便改一个', '李俊', '四川大学', '99.8');
INSERT INTO "public"."book" VALUES ('1222999', '054', 'test1', 'lyq', 'scu', '55.5');
INSERT INTO "public"."book" VALUES ('1232333', '001', 'test2', 'lyq', 'scu', '10');
INSERT INTO "public"."book" VALUES ('5646288', '487', 'aaa1', 'lj', 'a', '78.88');
INSERT INTO "public"."book" VALUES ('7433450', '780', 'test4', 'lyq', 'scu', '50');
INSERT INTO "public"."book" VALUES ('9999000', '552', 'test3', 'lyq', 'scu', '9.9');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table book
-- ----------------------------
ALTER TABLE "public"."book" ADD PRIMARY KEY ("callnumber");
