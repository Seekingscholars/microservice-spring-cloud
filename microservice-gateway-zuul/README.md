# 项目名称[eureka-server]
    *. erueka-server 单机节点(设置为服务节点)
    *. erueka-server 包含服务信息
    *. erueka-client 注册到服务上.通过application 访问.
    *. erueka-client 1-n节点.
    *. erueka-client 通过节点可以做路由(负载均衡ribbon)

# eureka 问题
    *. 自我保护.
        EMERGENCY! EUREKA MAY BE INCORRECTLY CLAIMING INSTANCES ARE UP WHEN THEY'RE NOT. RENEWALS ARE LESSER THAN THRESHOLD AND HENCE THE INSTANCES ARE NOT BEING EXPIRED JUST TO BE SAFE.