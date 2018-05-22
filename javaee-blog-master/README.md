# MyBlog

a personal blog site based on Jsp/Servlet - 基于jsp/servlet的个人博客网站

## introduction - 简介

java web博客项目，尽最大可能实现mvc模式，没有使用到框架，实现了首页预览，文章发布，点赞，评论，Markdown格式编写，分类，标签，阅读排行，时间轴，管理员管理博客，访客记录等。

* 主要涉及到的知识点有jsp,servlet,mysql,bootstrap,html/css/js,ajax,json

* 数据库连接池使用了[c3p0](http://www.mchange.com/projects/c3p0/) 你可以在src/c3p0-config.xml配置连接池和数据库信息

* Markdown编辑器使用了[editor.md](https://github.com/pandao/editor.md)


### database - 数据库

你可以在src/目录下找到详细的sql文件。

* t_article - 文章表
* t_article_delet - 删除的文章表 避免误删
* t_comment - 评论表
* t_tag - 文章的标签表
* t_user - 管理员表
* t_visitor - 访问记录表

### package intro - 包介绍

#### java
* blog/ajax 接受ajax请求的servlet
* blog/dao 数据库接口类
* blog/daoImple 数据库接口实现类
* blog/db 非主要业务的数据库操作
* blog/filter 过滤器
* blog/junit 测试包
* blog/model bean包
* blog/service 面向web的服务层
* blog/servlet 主要的控制器servlet
* blog/utils 工具包
#### web
* admin 管理员网页
* css 样式
* editormd 
* img 图片
* js javascript
* page 主要网页
* upload 图片上传文件夹

### jar intro - 使用到的jar包

* mysql-connector-java   jdbc to mysql

* c3p0-0.9.5.2.jar     c3p0数据库连接池
* mchange-commons-java.jar 

* commons-beanutils-1.9.3-bin.zip  BeanUtils
* commons-logging-1.2-bin.zip

* jstl.jar  jstl标签库
* standard.jar 

* commons-fileupload.jar 文件上传
* commons-io-2.5.jar
* commons-lang-2.5.jar

* commons-collections-3.1 集合工具包

* json-lib-2.1-jdk15 json包
* ezmorph-1.0.3

### preview - 预览

![lose the img](https://github.com/Lemonreds/MyBlog/blob/master/CAPTRUE/1.png)

![lose the img](https://github.com/Lemonreds/MyBlog/blob/master/CAPTRUE/2.png)

![lose the img](https://github.com/Lemonreds/MyBlog/blob/master/CAPTRUE/3.png)

![lose the img](https://github.com/Lemonreds/MyBlog/blob/master/CAPTRUE/4.png)

![lose the img](https://github.com/Lemonreds/MyBlog/blob/master/CAPTRUE/5.png)

![lose the img](https://github.com/Lemonreds/MyBlog/blob/master/CAPTRUE/6.png)

![lose the img](https://github.com/Lemonreds/MyBlog/blob/master/CAPTRUE/7.png)

![lose the img](https://github.com/Lemonreds/MyBlog/blob/master/CAPTRUE/8.png)


