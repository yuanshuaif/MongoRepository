1.MongoDB是分布式文件存储数据库。C++编写。高扩展、高性能;
2.MongoDB是一个介于关系数据库和非关系数据库之间的产品，是非关系数据库当中功能最丰富，最像关系数据库的;
3.支持的数据结构是类似于json的bjson;
4.支持类似于面向对象的查询语言;
5.构成区别:
    关系数据库一般由数据库（database）、表（table）、记录（record）三个层次概念组成;
    MongoDB是由数据库（database）、集合（collection）、文档对象（document）三个层次组成;
6.如何防止MongoDB被攻击
    1). 做好访问认证。打开你的MongoDB配置文件（.conf），设置为auth=true;
    2). 做好防火墙设置。建议管理者关闭27017端口的访问;
    3). Bind_ip，绑定内网IP访问;
    4). 做好升级。请管理者务必将软件升级到最新版本;
7.存储数据的特点
    MongoDB的适合对大量或者无固定格式的数据进行存储，比如：日志、文件等;
    对事物支持较弱;


MongoDB uri语法的说明:
mongodb://[username:password@]host1[:port1][,host2[:port2],...[,hostN[:portN]]][/[database][?options]]
    mongodb:// 这是固定的格式，必须要指定。
    username:password@ 可选项，如果设置，在连接数据库服务器之后，驱动都会尝试登陆这个数据库
    host1 必须的指定至少一个host, host1 是这个URI唯一要填写的。它指定了要连接服务器的地址。如果要连接复制集，请指定多个主机地址。
    portX 可选的指定端口，如果不填，默认为27017
    /database 如果指定username:password@，连接并验证登陆指定数据库。若不指定，默认打开 test 数据库。
    ?options 是连接选项。如果不使用/database，则前面需要加上/。所有连接选项都是键值对name=value，键值对之间通过&或;（分号）隔开
 spring.data.mongodb.uri=mongodb://name:pass@localhost:27017/test
 多个IP集群配置:
 spring.data.mongodb.uri=mongodb://user:pwd@ip1:port1,ip2:port2/database


2.*之后的版本不支持MongoTemplate
    使用MongoRepository:
        配置MongoDB uri
        默认方法、按照属性查询、自定义@Query(value="{'name':?0}",fields="{'name':1}")
        @Document(collection = "user")  指定实体类对应到哪个集合（多个实体类对应到一个集合）

