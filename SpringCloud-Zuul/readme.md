什么是网关
Zuul的主要功能是路由转发和过滤器。路由功能是微服务的一部分，比如/api/user转发到到user服务，/api/shop转发到到shop服务。zuul默认和Ribbon结合实现了负载均衡的功能， 类似于nginx转发。

发送请求http://localhost:8769/api-order/getOrderServiceApi
转发到http://localhost:8765/getOrderServiceApi
开启网关 @EnableZuulProxy