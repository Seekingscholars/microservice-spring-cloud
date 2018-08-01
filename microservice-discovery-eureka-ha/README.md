# eureka server高可用 peer
    *. 启动第一个节点时会抛connection
    *. 必须配置hosts 127.0.0.1 peer1 peer2 peer3 (peer3别名)
    *. 理论,启动第一个节点ok. 再启动后续节点.

# eureka client
    *. 注册服务到节点上去.
    *. 生产建议: 有多少个服务节点,就注册多少个服务节点.
    *. 如果部署服务不在同一台机器上,那么需要配置其他机器的hosts


# eureka 问题
    *. eureka Environment 配置

    *. eureka DataCenter 配置

    *. eureka 开启自我保护提示 (server自我保护.)
        EME...
    *. eureka 注册服务慢的问题如何解决
    *.