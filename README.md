# java-interview-guide-part2
Java面试一站到底下册源代码

尊敬的读者您好，感谢您对本书的支持。

笔者发现，身边有不少处于中小型公司的资历较浅的开发人员，擅长使用Git的客户端管理代码，并不擅长使用Git的命令行。

简单说一下笔者的感受：很多场景下我们其实没有那么多的客户端协助工作，如Dubbo连不上Zookeeper了，Jenkins部署失败了等。
如果开发人员一味追求使用客户端协助工作，可能会造成在生产环境没有客户端的情况下（生产环境都是Linux/Unix服务器）不知所措。
笔者所从事的公司，初学者们喜欢使用客户端管理Git仓库代码，而客户端可能为了实现更多的功能，将一些危险操作也做成了一些便捷的按钮。
造成的问题是：笔者的同事经常会抱怨自己的代码被覆盖了；自己的代码已经回滚了，但是别人的分支中还有自己回滚前的代码等问题。

在一二线大型互联网公司，如笔者曾经工作过的"美团点评"，笔者的好友所在的公司"京东"，笔者同学所在的公司"阿里巴巴"等，
是不允许使用客户端管理Git代码的，开发人员必须掌握Git的命令行方式管理代码。

本书将通过Git不同分支管理不同章节的代码，使读者尽可能习惯Git命令行操作。

## 本书章节/分支

### Master分支

### 第9章 分支名：java-interview-guide-part2
本章主要讲解Spring IoC的设计理念，IoC实现原理，Spring AOP的设计理念，AOP的实现原理等内容。
在此基础上讲解Spring相关的常见面试题及答题技巧