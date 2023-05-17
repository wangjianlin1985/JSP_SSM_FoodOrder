/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50505
Source Host           : 127.0.0.1:3306
Source Database       : ssm_onlinerest

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2020-01-08 01:49:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `adminuser`
-- ----------------------------
DROP TABLE IF EXISTS `adminuser`;
CREATE TABLE `adminuser` (
  `auid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY (`auid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of adminuser
-- ----------------------------
INSERT INTO `adminuser` VALUES ('1', 'admin', 'admin', '0');
INSERT INTO `adminuser` VALUES ('2', '22', '22', '1');
INSERT INTO `adminuser` VALUES ('3', '33', '33', '2');
INSERT INTO `adminuser` VALUES ('4', '44', '44', '3');
INSERT INTO `adminuser` VALUES ('5', '55', '55', '4');

-- ----------------------------
-- Table structure for `billitem`
-- ----------------------------
DROP TABLE IF EXISTS `billitem`;
CREATE TABLE `billitem` (
  `billid` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) DEFAULT NULL,
  `ptotal` double DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`billid`),
  UNIQUE KEY `pid` (`pid`),
  KEY `FK3510439A73B4E627` (`pid`),
  CONSTRAINT `FK3510439A73B4E627` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of billitem
-- ----------------------------

-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(255) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '生鲜水果');
INSERT INTO `category` VALUES ('2', '酒乳饮料');
INSERT INTO `category` VALUES ('3', '休闲零食');
INSERT INTO `category` VALUES ('4', '淮扬菜系');
INSERT INTO `category` VALUES ('5', '麻辣系列');
INSERT INTO `category` VALUES ('6', '东北菜');

-- ----------------------------
-- Table structure for `categorysecond`
-- ----------------------------
DROP TABLE IF EXISTS `categorysecond`;
CREATE TABLE `categorysecond` (
  `csid` int(11) NOT NULL AUTO_INCREMENT,
  `csname` varchar(255) DEFAULT NULL,
  `cid` int(11) NOT NULL,
  PRIMARY KEY (`csid`),
  KEY `FK936FCAF2418BCBAF` (`cid`),
  CONSTRAINT `FK936FCAF2418BCBAF` FOREIGN KEY (`cid`) REFERENCES `category` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of categorysecond
-- ----------------------------
INSERT INTO `categorysecond` VALUES ('1', '香蕉', '1');
INSERT INTO `categorysecond` VALUES ('2', '苹果', '1');
INSERT INTO `categorysecond` VALUES ('3', '橙子', '1');
INSERT INTO `categorysecond` VALUES ('4', '葡萄', '1');
INSERT INTO `categorysecond` VALUES ('5', '啤酒', '2');
INSERT INTO `categorysecond` VALUES ('6', '白酒', '2');
INSERT INTO `categorysecond` VALUES ('7', '碳酸饮料', '2');
INSERT INTO `categorysecond` VALUES ('8', '果汁饮料', '2');
INSERT INTO `categorysecond` VALUES ('9', '膨化食品', '3');
INSERT INTO `categorysecond` VALUES ('10', '蜜饯果干', '3');
INSERT INTO `categorysecond` VALUES ('11', '坚果炒货', '3');
INSERT INTO `categorysecond` VALUES ('12', '糖果巧克力', '3');
INSERT INTO `categorysecond` VALUES ('13', '扬州菜', '4');
INSERT INTO `categorysecond` VALUES ('14', '淮扬菜', '4');
INSERT INTO `categorysecond` VALUES ('15', '川菜', '5');
INSERT INTO `categorysecond` VALUES ('16', '湘菜', '5');
INSERT INTO `categorysecond` VALUES ('17', '重庆系列', '5');
INSERT INTO `categorysecond` VALUES ('18', '东北炖菜', '6');
INSERT INTO `categorysecond` VALUES ('19', '东北炒菜', '6');
INSERT INTO `categorysecond` VALUES ('20', '草莓', '1');
INSERT INTO `categorysecond` VALUES ('21', '西瓜', '1');
INSERT INTO `categorysecond` VALUES ('22', '柚子', '1');
INSERT INTO `categorysecond` VALUES ('23', '蔬菜', '1');
INSERT INTO `categorysecond` VALUES ('24', '车厘子', '1');

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `messageid` int(11) NOT NULL AUTO_INCREMENT,
  `message` varchar(2000) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `messagedate` varchar(2000) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`messageid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for `orderitem`
-- ----------------------------
DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `oiid` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) NOT NULL,
  `subtotal` double DEFAULT NULL,
  `pid` int(11) NOT NULL,
  `oid` int(11) NOT NULL,
  PRIMARY KEY (`oiid`),
  KEY `FKE8B2AB61E818A405` (`oid`),
  KEY `FKE8B2AB6173B4E627` (`pid`),
  CONSTRAINT `FKE8B2AB6173B4E627` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`),
  CONSTRAINT `FKE8B2AB61E818A405` FOREIGN KEY (`oid`) REFERENCES `orders` (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderitem
-- ----------------------------
INSERT INTO `orderitem` VALUES ('5', '1', '16', '21', '3');
INSERT INTO `orderitem` VALUES ('6', '1', '38', '24', '3');
INSERT INTO `orderitem` VALUES ('7', '1', '12', '27', '3');
INSERT INTO `orderitem` VALUES ('8', '1', '8', '28', '3');
INSERT INTO `orderitem` VALUES ('9', '1', '50', '2', '4');
INSERT INTO `orderitem` VALUES ('10', '1', '60', '20', '5');
INSERT INTO `orderitem` VALUES ('11', '1', '16', '21', '5');
INSERT INTO `orderitem` VALUES ('12', '1', '15', '23', '5');
INSERT INTO `orderitem` VALUES ('13', '2', '120', '20', '6');
INSERT INTO `orderitem` VALUES ('14', '1', '16', '21', '9');
INSERT INTO `orderitem` VALUES ('15', '1', '8', '28', '10');
INSERT INTO `orderitem` VALUES ('16', '1', '38', '24', '11');
INSERT INTO `orderitem` VALUES ('17', '1', '38', '24', '12');
INSERT INTO `orderitem` VALUES ('18', '1', '15', '23', '13');
INSERT INTO `orderitem` VALUES ('19', '1', '15', '23', '14');
INSERT INTO `orderitem` VALUES ('20', '1', '40', '31', '15');
INSERT INTO `orderitem` VALUES ('21', '1', '16', '21', '16');
INSERT INTO `orderitem` VALUES ('22', '1', '12', '22', '16');
INSERT INTO `orderitem` VALUES ('23', '1', '60', '20', '17');
INSERT INTO `orderitem` VALUES ('24', '1', '60', '20', '18');
INSERT INTO `orderitem` VALUES ('25', '1', '15', '23', '18');
INSERT INTO `orderitem` VALUES ('26', '1', '9', '30', '19');
INSERT INTO `orderitem` VALUES ('27', '1', '40', '31', '20');
INSERT INTO `orderitem` VALUES ('28', '1', '15', '23', '21');
INSERT INTO `orderitem` VALUES ('29', '1', '12', '22', '22');
INSERT INTO `orderitem` VALUES ('30', '1', '15', '23', '22');
INSERT INTO `orderitem` VALUES ('31', '1', '15', '23', '23');
INSERT INTO `orderitem` VALUES ('32', '1', '12', '22', '25');
INSERT INTO `orderitem` VALUES ('33', '2', '32', '21', '26');
INSERT INTO `orderitem` VALUES ('34', '1', '15', '23', '26');
INSERT INTO `orderitem` VALUES ('35', '2', '24', '22', '27');
INSERT INTO `orderitem` VALUES ('36', '1', '15', '23', '28');
INSERT INTO `orderitem` VALUES ('37', '1', '9', '30', '29');
INSERT INTO `orderitem` VALUES ('38', '1', '12', '27', '30');

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `oid` int(11) NOT NULL AUTO_INCREMENT,
  `money` double DEFAULT NULL,
  `state` int(11) NOT NULL,
  `receiveInfo` varchar(255) DEFAULT NULL,
  `phoNum` varchar(255) DEFAULT NULL,
  `order_time` datetime DEFAULT NULL,
  `uid` int(11) NOT NULL,
  `accepter` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`oid`),
  KEY `FKC3DF62E5FC32F8E` (`uid`),
  CONSTRAINT `FKC3DF62E5FC32F8E` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('3', '74', '1', '上海市静安区', '13913812312', '2018-01-30 22:58:30', '3', '嗷大猫');
INSERT INTO `orders` VALUES ('4', '50', '1', '1212121', '1212121212', '2019-06-29 00:00:00', '1', '212121212');
INSERT INTO `orders` VALUES ('5', '91', '1', '', '', '2019-06-30 00:00:00', '5', '');
INSERT INTO `orders` VALUES ('6', '120', '0', '', null, '2019-06-30 00:00:00', '5', '');
INSERT INTO `orders` VALUES ('7', '0', '0', '', null, '2019-06-30 00:00:00', '5', '');
INSERT INTO `orders` VALUES ('8', '0', '0', '', null, '2019-06-30 00:00:00', '5', '');
INSERT INTO `orders` VALUES ('9', '16', '1', '', '', '2019-06-30 00:00:00', '5', '');
INSERT INTO `orders` VALUES ('10', '8', '1', '', '', '2019-06-30 00:00:00', '5', '');
INSERT INTO `orders` VALUES ('11', '38', '1', '', '', '2019-06-30 00:00:00', '5', '');
INSERT INTO `orders` VALUES ('12', '38', '1', '', '', '2019-06-30 00:00:00', '5', '');
INSERT INTO `orders` VALUES ('13', '15', '0', '', null, '2019-07-02 00:00:00', '1', '');
INSERT INTO `orders` VALUES ('14', '15', '0', '', null, '2019-07-02 00:00:00', '6', '');
INSERT INTO `orders` VALUES ('15', '40', '0', '', null, '2019-07-02 00:00:00', '6', '');
INSERT INTO `orders` VALUES ('16', '28', '0', '', null, '2019-07-02 00:00:00', '6', '');
INSERT INTO `orders` VALUES ('17', '60', '0', '', null, '2019-07-02 00:00:00', '6', '');
INSERT INTO `orders` VALUES ('18', '75', '1', '', '', '2019-07-02 00:00:00', '6', '');
INSERT INTO `orders` VALUES ('19', '9', '1', '', '', '2019-07-02 00:00:00', '5', '');
INSERT INTO `orders` VALUES ('20', '40', '0', '', null, '2019-07-02 00:00:00', '1', '');
INSERT INTO `orders` VALUES ('21', '15', '1', '', '', '2019-07-02 00:00:00', '5', '');
INSERT INTO `orders` VALUES ('22', '27', '0', '', null, '2019-07-02 00:00:00', '8', '');
INSERT INTO `orders` VALUES ('23', '15', '0', '', null, '2019-07-02 00:00:00', '5', '');
INSERT INTO `orders` VALUES ('24', '0', '0', '', null, '2019-07-02 00:00:00', '5', '');
INSERT INTO `orders` VALUES ('25', '12', '0', '', null, '2019-07-03 00:00:00', '8', '');
INSERT INTO `orders` VALUES ('26', '47', '0', null, null, '2019-07-04 00:00:00', '9', null);
INSERT INTO `orders` VALUES ('27', '24', '0', null, null, '2019-07-04 00:00:00', '8', null);
INSERT INTO `orders` VALUES ('28', '15', '1', '袁世杰', '121212121212', '2019-07-08 00:00:00', '1', '袁世杰');
INSERT INTO `orders` VALUES ('29', '9', '1', '广西南宁市青秀区仙湖经济开发区南宁师范大学3号', '18276907851', '2019-12-07 00:00:00', '1', '覃国振');
INSERT INTO `orders` VALUES ('30', '12', '1', '', '', '2019-12-07 00:00:00', '1', '');

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pname` varchar(255) NOT NULL,
  `market_price` double DEFAULT NULL,
  `shop_price` double NOT NULL,
  `image` varchar(255) DEFAULT NULL,
  `pdesc` varchar(5000) DEFAULT NULL,
  `is_hot` int(11) DEFAULT NULL,
  `pdate` timestamp NULL DEFAULT NULL,
  `csid` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`pid`),
  KEY `FKED8DCCEF5F778050` (`csid`),
  CONSTRAINT `FKED8DCCEF5F778050` FOREIGN KEY (`csid`) REFERENCES `categorysecond` (`csid`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '葡萄干', '15', '20', 'products/small_017.jpg', '新疆葡萄干', '1', '2018-01-30 14:42:03', '1', '10');
INSERT INTO `product` VALUES ('2', '开心果', '38', '50', 'products/small_022.jpg', '太好吃了', '1', '2018-01-30 14:44:13', '1', '11');
INSERT INTO `product` VALUES ('3', '红富士苹果', '8', '10', 'products/apple.jpg', '富士苹果的特点是体积很大，遍体通红，形状很圆，平均大小如棒球一般。果实的重量中，有9－11%是单糖，而且其果肉紧密，比其他很多苹果变种都要甜美和清脆，因此受到全世界消费者的广泛喜爱。富士苹果与其他苹果相比有更长的最佳食用日期，甚至无需放入冰箱保存。室温下可保存4个月，如果放入冰箱，富士苹果可保存5到7个月。\r\n落叶乔木，树高可达15米，栽培条件下一般高3～5米。树干灰褐色，老皮有不规则的纵裂或片状剥落，小枝光滑。单叶互生，椭圆至卵圆形，叶缘有锯齿。伞房花序，花瓣白色，含苞时带粉红色，雄蕊20枚，花柱5枚。果实为仁果，颜色及大小因品种而异。喜光，喜微酸性到中性土壤。最适于土层深厚、富含有机质、心土为通气排水良好的沙质土壤。据农业部测定，红富士苹果还含有胡萝卜素、脂肪、蛋白质、Ca、Fe等人体需要的营养物质。\r\n红富士\r\n红富士\r\n红富士树势强健，树体比国光高大，树姿开张似国光。树冠外围长势较强，内堂细弱枝较多。幼树比国光开张角度大,横向生长快，干周加粗快。顶端优势强。枝条较密，外围：年生发育枝红褐色，皮表层多生白色水锈，皮孔中等大小或较小，节问较长。多年生枝暗灰褐色，皮孔稠密，中大微凸。主干黄褐色，叶片中大，较薄，多为椭圆形，基部较圆。叶面光滑，叶背茸毛较多。叶脉突起，叶缘多中深复锯齿。花芽（顶花芽）圆锥形，中大，鳞片较松散，茸毛较多。叶芽三角形，中大，饱满，茸毛较多。每个花序多为5朵花簇生，花朵较大，淡粉红色，开花较整齐。', '0', '2018-01-30 14:50:42', '1', '2');
INSERT INTO `product` VALUES ('5', '大橙子', '6', '8', 'products/003.jpg', '美国橙子', '0', '2018-01-30 14:54:55', '1', '3');
INSERT INTO `product` VALUES ('10', '红心蜜柚', '4', '5', 'products/005.jpg', '红心蜜柚', '0', '2018-01-30 14:56:49', '1', '22');
INSERT INTO `product` VALUES ('14', '有机草莓', '20', '30', 'products/youjicaomei.jpg', '奶油草莓', '0', '2018-01-30 14:59:44', '1', '20');
INSERT INTO `product` VALUES ('16', '哈密瓜', '12', '15', 'products/010.jpg', '新疆哈密瓜', '0', '2018-01-30 15:02:19', '1', '21');
INSERT INTO `product` VALUES ('17', '橘子', '6', '8', 'products/006.jpg', '江西橘子', '0', '2018-01-30 15:03:21', '1', '3');
INSERT INTO `product` VALUES ('20', '车厘子', '50', '60', 'products/013.jpg', '美国进口', '1', '2018-01-30 17:18:03', '1', '24');
INSERT INTO `product` VALUES ('21', '松花皮蛋', '16', '16', 'products/20150928092710.jpg', '剁椒松花蛋', '1', '2018-01-30 23:30:50', '14', '13');
INSERT INTO `product` VALUES ('22', '青椒干子', '12', '12', 'products/20150928093200.jpg', '青椒干子', '1', '2018-01-30 23:31:13', '14', '14');
INSERT INTO `product` VALUES ('23', '番茄炒蛋', '15', '15', 'products/20150928093413.jpg', '略甜，番茄炒蛋。', '1', '2018-01-30 23:31:48', '14', '14');
INSERT INTO `product` VALUES ('24', '红烧排骨', '38', '38', 'products/big_05.jpg', '红烧排骨', '0', '2018-01-30 23:32:24', '14', '14');
INSERT INTO `product` VALUES ('25', '剁椒鱼头', '50', '50', 'products/djyt.jpg', '麻辣入味', '0', '2018-01-30 23:32:53', '15', '15');
INSERT INTO `product` VALUES ('26', '阳澄湖大闸蟹', '128', '128', 'products/big_06.jpg', '阳澄湖大闸蟹（2只）', '0', '2018-01-30 23:33:26', '13', '14');
INSERT INTO `product` VALUES ('27', '麻婆豆腐', '12', '12', 'products/big_02.jpg', '麻婆豆腐', '0', '2018-01-30 23:33:46', '8', '15');
INSERT INTO `product` VALUES ('28', '青椒土豆丝', '8', '8', 'products/20150928092539.jpg', '青椒土豆丝', '0', '2018-01-30 23:34:20', '15', '13');
INSERT INTO `product` VALUES ('29', '西红柿蛋汤', '18', '18', 'products/20150928094134.jpg', '西红柿蛋汤', '0', '2018-01-30 23:34:46', '14', '14');
INSERT INTO `product` VALUES ('30', '芙蓉蔬菜汤', '9', '9', 'products/20150928092910.jpg', '芙蓉蔬菜汤', '0', '2018-01-30 23:35:23', '14', '14');
INSERT INTO `product` VALUES ('31', '酸汤肥牛', '38', '40', 'products/20150928093914.jpg', '酸汤肥牛', '0', '2018-01-30 23:36:21', '14', '18');

-- ----------------------------
-- Table structure for `shopcartitem`
-- ----------------------------
DROP TABLE IF EXISTS `shopcartitem`;
CREATE TABLE `shopcartitem` (
  `cartitemid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `pcount` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `ptotal` double DEFAULT NULL,
  `pname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cartitemid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopcartitem
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `addr` varchar(255) DEFAULT NULL,
  `state` varchar(255) NOT NULL DEFAULT '1',
  `code` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'user', '123456', '巴卓', 'hikitty@qq.com', '13555512345', '上海市', '1', null);
INSERT INTO `user` VALUES ('2', 'jack', '123456', '马云', 'jack@qq.com', '13812312312', '中国', '1', null);
INSERT INTO `user` VALUES ('3', 'hellokitty', '123456', '张三', 'aodamao@qq.com', '13555512345', '上海市', '0', 'ca0f6f5a-36da-402d-8c0f-22587423de20');
INSERT INTO `user` VALUES ('4', '12', '12', '12', '1@gmail.com', '12', '12', '0', '7c62d99d-c759-4dd4-87e8-9a1eed997cf2');
INSERT INTO `user` VALUES ('5', 'zc', '123456', '', '', '', '', '0', '7b2de927-adf7-4bc4-b5b0-3d99d82013b1');
INSERT INTO `user` VALUES ('6', '111', '123', 'zc', '111@.com', '123456', '常州', '0', '127ef49d-08c1-4c07-a413-a6bee9210f48');
INSERT INTO `user` VALUES ('7', '1111', '', '', '', '', '', '0', 'e67240b2-cb6c-492d-a675-c45961e68d91');
INSERT INTO `user` VALUES ('8', '123456', '123456', '丹巴', '155699@.com', '15586674895', '西藏', '1', null);
INSERT INTO `user` VALUES ('9', '3456', '3456', '小美', '', '12345678945', '', '0', '7ff1e82b-88e0-4b0b-9bb2-a15b0240e633');
