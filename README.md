### AOP的一个例子
文字讲解可以看 https://my.oschina.net/yanquan345/blog/203415 很清晰

在这个demo里面，也就是设定了在student类的add方法前后和中间都会有手动输出的方法

也即是让我们写代码的时候考虑主流程，写log啊，其他等等需要做的可以通过AOP切片编程的思想来额外写

然后放在context里做一做注入啥的