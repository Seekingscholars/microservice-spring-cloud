# eureka server高可用 peer
    *. 启动第一个节点时会抛connection
    *. 必须配置hosts 127.0.0.1 eureka1 eureka2 eureka3 (eureka1别名)
    *. 理论,启动第一个节点ok. 再启动后续节点.
    *. 使用security 撰写 必须放置在main同级目录下.
    *. 主要原因是spring boot 2.0.1 发现攻击csxf CSRF(Cross-site request forgery)跨站请求伪造,也被称为“One Click Attack”或者Session Riding,通常缩写为CSRF或者XSRF,是一种对网站的恶意利用。
    *. 继承WebSecurityConfigurerAdapter 重写configure 禁用  http.csrf().disable();