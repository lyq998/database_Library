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

Date: 2018-12-07 17:43:52
*/


-- ----------------------------
-- Table structure for borrow
-- ----------------------------
DROP TABLE IF EXISTS "public"."borrow";
CREATE TABLE "public"."borrow" (
"callnumber" varchar(20) COLLATE "default" NOT NULL,
"username" varchar(20) COLLATE "default" NOT NULL,
"backtime" varchar(40) COLLATE "default" DEFAULT (CURRENT_DATE + '90 days'::interval)
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of borrow
-- ----------------------------
INSERT INTO "public"."borrow" VALUES ('7433450', 'guest', '2019-03-06 00:00:00');
INSERT INTO "public"."borrow" VALUES ('9999000', 'admin', '2019-03-06 00:00:00');

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------

-- ----------------------------
-- Uniques structure for table borrow
-- ----------------------------
ALTER TABLE "public"."borrow" ADD UNIQUE ("callnumber");

-- ----------------------------
-- Primary Key structure for table borrow
-- ----------------------------
ALTER TABLE "public"."borrow" ADD PRIMARY KEY ("callnumber", "username");

-- ----------------------------
-- Foreign Key structure for table "public"."borrow"
-- ----------------------------
ALTER TABLE "public"."borrow" ADD FOREIGN KEY ("callnumber") REFERENCES "public"."book" ("callnumber") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "public"."borrow" ADD FOREIGN KEY ("username") REFERENCES "public"."users" ("username") ON DELETE NO ACTION ON UPDATE NO ACTION;
