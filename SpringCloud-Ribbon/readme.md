##### 在工程的启动类中,通过@EnableDiscoveryClient向服务中心注册；并且向程序的ioc注入一个bean: restTemplate;并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。

# 使用ribbon实现负载均衡
##### 启动两个会员服务工程，端口号分别为8763、8764，订单服务 使用负载均衡策略轮训到会员服务接口。

# 什么是ribbon
##### ribbon是一个负载均衡客户端 类似nginx反向代理，可以很好的控制http和tcp的一些行为。Feign默认集成了ribbon。

# 开启ribbon
##### @LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
