# 项目名称[feign]
    *. feign 客户端发现负载均衡
    *. JAX-WS,JAX-RS (jersey,cxf)
    *. feign http client,创建一个接口,接口上增加注解,使用它.
    *. timeout. feign 刚启动的! 在eureka上并没有找到.

# feign使用方式
    *. create feign interface http client ()
    *. add @FeignClient("store") store -> serverId

# feign异常点
    *. GetMapping 不支持,
    *. PathVariable 必须设置value
    *. 只要参数是复杂对象,既是指定GET方法,feign依然会以POST方法进行发送请求.
