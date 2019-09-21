### Spring Cloud Config Client 端

### 步骤一：创建项目
1. 选择 Spring Web、Config Client（注意：此版本下是 spring-cloud-config-client；我使用 Spring Initializr
创建的项目，默认是：spring-cloud-starter-config，需要修改成 spring-cloud-config-client）

### 步骤二：Client 端相关配置
1. 配置两个配置文件：application.properties、bootstrap.properties
2. 启动项目，在浏览器访问 http://localhost:8002/hello ，返回：Hello I am dev

### 参考
参考资料 | 网址
--- | ---
springcloud(六)：配置中心git示例 | http://www.ityouknow.com/springcloud/2017/05/22/springcloud-config-git.html