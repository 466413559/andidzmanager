

/*Data for the table `right_resource` */

insert  into `right_resource`(`Id`,`resourcePath`,`resourceName`,`description`,`feature`) values (1,'111','order:create','创建订单',NULL),(2,'21','order:update','指定计划',NULL),(3,'222','order:insert','信息录入',NULL);


/*Data for the table `user` */

insert  into `user`(`Id`,`userNick`,`userName`,`password`) values (1,'测试账号4','test1','123456'),(2,'测试账号4','test2','123456'),(3,'测试账号4','test3','123456'),(4,'测试账号4','test4','123456'),(5,'张三','你是米奇我是谁','123456');


/*Data for the table `user_right_relationship` */

insert  into `user_right_relationship`(`Id`,`userId`,`resourceId`) values (1,1,1),(2,1,2),(3,1,3),(4,2,1),(5,3,2),(6,5,1),(7,4,2);

