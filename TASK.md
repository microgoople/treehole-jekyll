# treehole[树洞]

## 2017-04-25
### 完善了install页面
### 实现了
* 安装时声称install.lock标识文件
* 安装时第一步验证数据库可用性

## 2017-05-08  下一步设想
### 博客基础信息页
* 用户信息
    * 用户名 
    * 密码 
    * 邮箱
* 安装信息
    * 安装日期
    * 博客版本
    * 系统型号
* 友链信息
    * 名称
    * 链接
    * 添加日期
    
    
> mvn clean package assembly:single -Pprod -Dmaven.test.skip=true

## 2017-06-12

### 基本上完成一大半了，现在可以出一个初级的版本部署运行了


## 计划
* 日志统计部分还需要完善
* 系统设置部分
* 第一个大版本完善
* 适配jekyll模板 预计是做一个导入模板功能，程序中做转换

## 评论管理


## 主题收集
[jekyll默认主题] https://github.com/jekyll/minima.git
[H2O] https://github.com/kaeyleo/jekyll-theme-H2O.git
[vno] https://github.com/onevcat/vno-jekyll.git

https://github.com/thien/blueface.git

需要添加每篇文章下边的版权声明插件

tools 里边 对 page。。。.posts 之类的做一下转换