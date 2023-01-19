# 一个NB的Project
## 技术选型
1. SpringCloud && Alibaba最新版
2. gateway
3. openFeign
4. sentinel


## 配置说明
1. sentinel的dashboard配置,直接启动官网提供的包 `java -jar sentinel-dashboard.jar --server.port=8999 `
然后项目里指定sentinel的地址 
```yaml
spring:
  cloud:
    sentinel:
      transport:
        dashboard: localhost:8999
```
    sentinel使用参考: https://github.com/alibaba/Sentinel/wiki/%E6%B3%A8%E8%A7%A3%E6%94%AF%E6%8C%81#sentinelresource-%E6%B3%A8%E8%A7%A3