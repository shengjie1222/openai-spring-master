### 项目介绍

本项目是基于SpringBoot3.0封装的OpenAi快速开发类，支持49种场景调用。

注意：该项目还未提交到中央仓库，因此你需要下载源码到本地安装。



### 使用步骤

#### 1、导入依赖

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>cn.gjsm</groupId>
            <artifactId>openai-spring</artifactId>
            <version>1.0.2</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
    </dependencies>
</dependencyManagement>
<dependencies>
    <dependency>
        <groupId>cn.gjsm</groupId>
        <artifactId>openai-spring-boot-starter</artifactId>
        <version>1.0.2</version>
    </dependency>
</dependencies>
```

#### 2、配置秘钥

在application.yml中配置如下参数：

```yml
openai:
  token: 你的秘钥
  timeout: 5000 // 超时时间
```

