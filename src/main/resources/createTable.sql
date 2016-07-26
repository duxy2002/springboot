-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema cloud_wechat_print
-- -----------------------------------------------------
-- the database of WeChat Public Printing
DROP SCHEMA IF EXISTS `cloud_wechat_print` ;

-- -----------------------------------------------------
-- Schema cloud_wechat_print
--
-- the database of WeChat Public Printing
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cloud_wechat_print` DEFAULT CHARACTER SET utf8 ;
USE `cloud_wechat_print` ;

-- -----------------------------------------------------
-- Table `cloud_wechat_print`.`t_print_error`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cloud_wechat_print`.`t_print_error` ;

CREATE TABLE IF NOT EXISTS `cloud_wechat_print`.`t_print_error` (
  `ERROR_CODE` INT(11) NOT NULL COMMENT '错误码',
  `ERROR_MESSAGE` VARCHAR(255) NULL DEFAULT '' COMMENT '错误信息',
  `ERROR_HELP_URL` VARCHAR(500) NULL DEFAULT '' COMMENT '帮助url',
  `ERROR_TITLE` VARCHAR(255) NULL DEFAULT '' COMMENT '名称',
  `ERROR_COVER_URL` VARCHAR(500) NULL DEFAULT '',
  PRIMARY KEY (`ERROR_CODE`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '打印错误信息表';


-- -----------------------------------------------------
-- Table `cloud_wechat_print`.`t_printer`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cloud_wechat_print`.`t_printer` ;

CREATE TABLE IF NOT EXISTS `cloud_wechat_print`.`t_printer` (
  `ID` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `NAME` VARCHAR(255) NULL COMMENT '打印机名',
  `DISPLAY_NAME` VARCHAR(255) NULL DEFAULT NULL COMMENT '打印机显示名',
  `PROXY` VARCHAR(128) NULL DEFAULT NULL COMMENT '代理',
  `SN` VARCHAR(128) NULL DEFAULT NULL COMMENT '序列号',
  `PRINTER_ID` BIGINT(20) NULL COMMENT '打印机ID(有可能用不到)',
  `MANUFACTURE` VARCHAR(255) NULL DEFAULT NULL COMMENT '制造商',
  `MODEL` VARCHAR(255) NULL DEFAULT NULL COMMENT '型号',
  `SETUP_URL` VARCHAR(255) NULL DEFAULT NULL COMMENT '安装URL',
  `SUPPORT_URL` VARCHAR(255) NULL DEFAULT NULL COMMENT '支持URL',
  `UPDATE_URL` VARCHAR(255) NULL DEFAULT NULL COMMENT '更新URL',
  `FIRMWARE` VARCHAR(255) NULL DEFAULT NULL COMMENT '固件(有可能用不到)',
  `LOCAL_SETTINGS` VARCHAR(255) NULL DEFAULT NULL COMMENT '本地设置(有可能用不到)',
  `SEMACTIC_STATE` VARCHAR(255) NULL DEFAULT NULL COMMENT 'SEMACTIC_STATE(有可能用不到)',
  `USER_CODE` VARCHAR(255) NULL DEFAULT NULL COMMENT '用户CODE(有可能用不到)',
  `CAPABILITES` VARCHAR(255) NULL DEFAULT NULL COMMENT '能力(有可能用不到)',
  `DEFAULTS` VARCHAR(255) NULL DEFAULT NULL COMMENT '有可能用不到',
  `SIGNATURE` VARCHAR(255) NULL DEFAULT NULL COMMENT '签名',
  `STATUS` INT(2) NULL DEFAULT NULL COMMENT '状态',
  `ADDRESS` VARCHAR(255) NULL COMMENT '地址',
  `OWNER_ID` BIGINT(20) NULL COMMENT 'Owner_ID',
  `USER_ID` BIGINT(20) NULL,
  `TECHNIAN_ID` BIGINT(20) NULL COMMENT 'Technian_ID',
  `QR_URL` VARCHAR(255) NULL COMMENT '二维码URL',
  `EXPIRE_DATE` DATETIME NULL DEFAULT NULL COMMENT '失效时间',
  `CREATE_DATE` DATETIME NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_DATE` DATETIME NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '打印机情报表';


-- -----------------------------------------------------
-- Table `cloud_wechat_print`.`t_company`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cloud_wechat_print`.`t_company` ;

CREATE TABLE IF NOT EXISTS `cloud_wechat_print`.`t_company` (
  `COMPANY_ID` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `MCH_TYPE` CHAR(1) NULL COMMENT '商户类型(1:租赁商户，2:渠道商户)',
  `PARENT_ID` BIGINT(20) NULL,
  `NAME` VARCHAR(255) NULL COMMENT '名称',
  `ADDRESS` VARCHAR(255) NULL DEFAULT NULL COMMENT '地址',
  `CONTACT` VARCHAR(255) NULL DEFAULT NULL COMMENT '联系人',
  `PHONE` VARCHAR(20) NULL DEFAULT NULL COMMENT '联系电话',
  `EMAIL` VARCHAR(128) NULL DEFAULT NULL COMMENT '邮件地址',
  `WECHAT_ACCOUNT_ID` VARCHAR(45) NULL COMMENT '微信公众号',
  `ALI_PAY_ID` VARCHAR(45) NULL DEFAULT NULL COMMENT '支付宝支付账号ID',
  `START_DATE` DATETIME NULL DEFAULT NULL COMMENT '利用开始时间',
  `END_DATE` DATETIME NULL DEFAULT NULL COMMENT '利用终了时间',
  `NOTES` VARCHAR(512) NULL DEFAULT NULL COMMENT '备注',
  `CREATE_DATE` DATETIME NULL COMMENT '创建时间',
  `UPDATE_DATE` DATETIME NULL COMMENT '更新时间',
  PRIMARY KEY (`COMPANY_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '商户情报表';


-- -----------------------------------------------------
-- Table `cloud_wechat_print`.`t_wechat_subscriber`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cloud_wechat_print`.`t_wechat_subscriber` ;

CREATE TABLE IF NOT EXISTS `cloud_wechat_print`.`t_wechat_subscriber` (
  `ID` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `WECHAT_ACCOUNT_ID` VARCHAR(45) NULL COMMENT '微信公众号',
  `OPEN_ID` VARCHAR(45) NULL COMMENT '关注用户ID',
  `START_DATE` DATETIME NULL COMMENT '关注开始时间',
  `END_DATE` DATETIME NULL COMMENT '取消关注时间',
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '公众号关注用户情报表';


-- -----------------------------------------------------
-- Table `cloud_wechat_print`.`t_unit_price`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cloud_wechat_print`.`t_unit_price` ;

CREATE TABLE IF NOT EXISTS `cloud_wechat_print`.`t_unit_price` (
  `ID` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `COMPANY_ID` BIGINT(20) NULL COMMENT '商户ID',
  `CHILD_COMPANY_ID` BIGINT(20) NULL COMMENT '子商户ID',
  `TYPE` INT(2) NULL COMMENT '单价类型',
  `UNIT_PRICE` DECIMAL(13,4) NULL COMMENT '单价',
  `START_DATE` DATETIME NULL COMMENT '单价有效开始时间',
  `END_DATE` DATETIME NULL COMMENT '单价有效终了时间',
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '价格表';


-- -----------------------------------------------------
-- Table `cloud_wechat_print`.`t_order`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cloud_wechat_print`.`t_order` ;

CREATE TABLE IF NOT EXISTS `cloud_wechat_print`.`t_order` (
  `ORDER_ID` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `COMPANY_ID` BIGINT(20) NOT NULL COMMENT '商户ID',
  `PREPAY_END_TIME` DATETIME NULL COMMENT '预支付完成时间',
  `PAY_NOTIFY_TIME` DATETIME NULL DEFAULT NULL COMMENT '异步通知支付结果接收时间',
  `PAY_END_TIME` DATETIME NULL COMMENT '支付完成时间',
  `STATUS` VARCHAR(45) NOT NULL COMMENT '状态',
  `TOTAL_FEE` DECIMAL(13,4) NOT NULL DEFAULT 0 COMMENT '金额',
  `PICKUP_CODE` VARCHAR(6) NULL COMMENT 'PickupCode',
  `WECHAT_ACCOUNT` VARCHAR(45) NOT NULL COMMENT '关注用户ID',
  `CREATE_DATE` DATETIME NULL COMMENT '创建时间',
  `UPDATE_DATE` DATETIME NULL COMMENT '更新时间',
  PRIMARY KEY (`ORDER_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '订单表(Order)';


-- -----------------------------------------------------
-- Table `cloud_wechat_print`.`t_order_detail`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cloud_wechat_print`.`t_order_detail` ;

CREATE TABLE IF NOT EXISTS `cloud_wechat_print`.`t_order_detail` (
  `ID` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `ORDER_ID` BIGINT(20) NULL COMMENT '订单ID',
  `FILE_TYPE` VARCHAR(45) NULL COMMENT '文件类型（现只支持照片）',
  `PICTURE_ID` BIGINT(20) NULL COMMENT '照片ID',
  `PRINTER_ID` BIGINT(20) NULL COMMENT '打印机ID',
  `STATUS` VARCHAR(45) NULL COMMENT '状态',
  `PRINT_END_DATE` DATETIME NULL COMMENT '打印完成时间',
  `PRINT_ERROR_CODE` INT(11) NULL COMMENT '打印错误Code',
  `FEE` DECIMAL(13,4) NULL COMMENT '金额',
  `CREATE_DATE` DATETIME NULL COMMENT '创建时间',
  `UPDATE_DATE` DATETIME NULL COMMENT '更新时间',
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '订单明细表(Job)';


-- -----------------------------------------------------
-- Table `cloud_wechat_print`.`t_user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cloud_wechat_print`.`t_user` ;

CREATE TABLE IF NOT EXISTS `cloud_wechat_print`.`t_user` (
  `USER_ID` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'User_ID',
  `NAME` VARCHAR(255) NOT NULL COMMENT '名字',
  `LOGIN_NAME` VARCHAR(255) NOT NULL COMMENT 'Login名称',
  `PASSWORD` VARCHAR(255) NOT NULL COMMENT '密码',
  `EMAIL` VARCHAR(128) NULL COMMENT '邮箱地址',
  `CREATE_DATE` DATETIME NULL,
  `UPDATE_DATE` DATETIME NULL,
  `ENABLED` TINYINT(1) NULL,
  PRIMARY KEY (`USER_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '用户表';


-- -----------------------------------------------------
-- Table `cloud_wechat_print`.`t_role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cloud_wechat_print`.`t_role` ;

CREATE TABLE IF NOT EXISTS `cloud_wechat_print`.`t_role` (
  `ROLE_ID` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'Role_ID',
  `NAME` VARCHAR(255) NULL COMMENT '名字',
  `DESCRIPTION` VARCHAR(255) NULL COMMENT '描述',
  PRIMARY KEY (`ROLE_ID`))
ENGINE = InnoDB
COMMENT = '角色表';


-- -----------------------------------------------------
-- Table `cloud_wechat_print`.`t_user_role_map`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cloud_wechat_print`.`t_user_role_map` ;

CREATE TABLE IF NOT EXISTS `cloud_wechat_print`.`t_user_role_map` (
  `ID` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `USER_ID` BIGINT(20) NULL COMMENT 'User_ID',
  `ROLE_ID` BIGINT(20) NULL COMMENT 'Role_ID',
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '用户角色表';


-- -----------------------------------------------------
-- Table `cloud_wechat_print`.`t_picture`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cloud_wechat_print`.`t_picture` ;

CREATE TABLE IF NOT EXISTS `cloud_wechat_print`.`t_picture` (
  `PICTURE_ID` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `OPEN_ID` VARCHAR(45) NOT NULL COMMENT '发送方微信账号(OpenID)',
  `COMPANY_ID` BIGINT(20) NOT NULL COMMENT '商户ID',
  `PICTURE_URL` VARCHAR(255) NOT NULL COMMENT '图片链接',
  `MEDIA_ID` VARCHAR(128) NOT NULL COMMENT 'MediaID',
  `PICTURE_CONTENT` MEDIUMBLOB NULL COMMENT '图片内容',
  `PAGE_COUNT` INT(11) NULL DEFAULT 0 COMMENT '页数',
  `ACCOUNT_ID` VARCHAR(45) NULL,
  `CONTENT_TYPE` VARCHAR(45) NULL,
  `USED_FLAG` CHAR(1) NULL,
  `CREATE_DATE` DATETIME NULL,
  `UPDATE_DATE` DATETIME NULL,
  PRIMARY KEY (`PICTURE_ID`))
ENGINE = InnoDB
COMMENT = '图片情报表';


-- -----------------------------------------------------
-- Table `cloud_wechat_print`.`t_wechat`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cloud_wechat_print`.`t_wechat` ;

CREATE TABLE IF NOT EXISTS `cloud_wechat_print`.`t_wechat` (
  `ACCOUNT_ID` VARCHAR(45) NOT NULL COMMENT '微信公众号\n',
  `APPID` VARCHAR(45) NOT NULL,
  `APPSECRET` VARCHAR(45) NOT NULL,
  `ACCESS_TOKEN` VARCHAR(255) NULL,
  `VALID_FLG` TINYINT(1) NULL DEFAULT 1,
  `CREATE_DATE` DATETIME NULL COMMENT '创建时间\n',
  `UPDATE_DATE` DATETIME NULL COMMENT '更新时间\n',
  `MCH_ID` VARCHAR(100) NULL,
  `API_PAYMENT_KEY` VARCHAR(100) NULL,
  PRIMARY KEY (`ACCOUNT_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cloud_wechat_print`.`persistent_logins`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `cloud_wechat_print`.`persistent_logins` ;

CREATE TABLE IF NOT EXISTS `cloud_wechat_print`.`persistent_logins` (
  `username` VARCHAR(64) NOT NULL,
  `series` VARCHAR(64) NOT NULL,
  `token` VARCHAR(64) NOT NULL,
  `last_used` TIMESTAMP NOT NULL,
  PRIMARY KEY (`series`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
