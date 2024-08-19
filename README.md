# Yushang 用户管理平台

# 简介

```
一个很基础的用户管理系统,支持注册登录,查询功能(后端具有注销,删除,等接口)
```

# 主要技术栈

```
Mybatis + Mysql + MybatisPlus + SpringMVC + SpringBoot + React(AntDesginPro)
```

# 分层开发

```
model(pojo):映射当前数据库的字段 名称要一一对应
Mapper:定义对数据库的操作 (一般情况可以直接继承BaseMapper<数据库的名称>来获得CUDR的基本操作方法)
Service:实现具体的业务逻辑
Controller:将所有的业务封装成一个可以访问的接口,使得前端再访问这个接口时会执行相对应的业务操作
```

# 项目生成的步骤(后端代码)

# 生成 Project

```
使用IDEA工具直接选择新建项目模块,构建工具选择Maven,Java语言选择8或者稍微高一点的版本
初始依赖选择Lombok(注解工具自动生成get set之类的方法) SpringBoot DevTools(修改完代码后自动重启入口)
SpringConfiguration Processer(读取属性文件) Mysql Driver(数据库的驱动) Mybatis Framework(数据库操作的驱动)<暂时用不到redis>
Spring Web (为项目提供一个可以Web访问的一个地址)<使用的是本地的端口>
```

```
1.连接数据源Mysql,创建一个数据库用来存储用户的信息
2.使用Mybatis-X代码自动生成器来生成JDBC的操作
  2.1选用Mybatis-plus3版本,然后额外勾选一个Lombok,Actual啥的,将初始勾选的toString给去掉
3.然后开始写业务层首先在接口里定义业务名称并且传好参数,然后再在类里面实现具体的业务逻辑
4.再写完登录注册逻辑之后使用junit来进行对业务的测试,看看是否真的实现了业务操作
5.测试完业务层之后,再Contolle层将其封装成一个可访问的接口,不同的业务定义不同的接口
6.封装完之后,通过IDEA中的/工具/HTTp客户端/第一个会话 来进行测试
```

# 容易犯的错误

```

* 再创建项目时,尽量选择那个比较旧的版本(Java 8),使用StringUtils工具类时,要在pom.xml文件中引入commons - lang依赖
* 在使用mybatis插件时要注意记得勾选哪个Actual什么的,去掉那个String注解那一项,然后记得引入mybatis-plus依赖 (直接在Maven仓库中搜索就可以了),同时也要配置yml文件

```

# 访问地址（暂时）

项目部署的服务器地址 [134.175.228.70](134.175.228.70)
