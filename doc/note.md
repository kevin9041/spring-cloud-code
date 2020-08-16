
1.网关中间件的四大功能
    统一接入功能:为各种无线应用提供统一的接入服务，提供一个高性能，高并发，高可用的网关服务
    协议适配功能:当请求通过网关时，经过filter处理完，此时就需要进行协议适配，判断应该协议转发调用PRC服务，调用RET服务还是PHP提供的服务
    流量管控:网关作为所有请求流量的入口，当请求流量剧增，后端服务出现异常不可用时，网关支持负载均衡，容灾切换，使得不可用服务降级(在异地多活场景中根据流量进行分片，路由到不同的机房)
    安全防护功能:网关对所有请求进行安全防护过滤，保护后端服务

2.pom文件中的<parent>节点下的<relativePath/>代表父项目的pom.xml文件的相对路径。默认值为../pom.xml
    maven首先从当前构建项目开始查找父项目的pom文件，然后从本地仓库，最有从远程仓库。

3.
    <properties>
        <!-- 项目编译字符集编码 -->
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <!-- 项目日志字符集编码 -->
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <java.version>1.8</java.version>
        <spring-cloud.version>Finchley.RELEASE</spring-cloud.version>
    </properties>

4.![Image text](euraka_api.png)

