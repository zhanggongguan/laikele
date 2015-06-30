# 来客了

## 开发进度

1. 先以首页为中心，将DAO层和业务层串通，表里不足的属性需要补充.

-  ~~首页相关接口函数定义，Promotion_type内容初始化~~

-  ~~开发Service层代码，IndexService层代码开发进度：100%。~~

-  开发左侧导航菜单底层代码.......［计划1号之前完成]

-  开发地点导航栏菜单代码......... [计划1号之前完成]

-  开发滚动图底下宣传代码......... [计划1号之前完成]

-  开发滚动图代码,要制定相应的策略[计划1号之前完成］

-  右侧登陆功能，［待定]

## 碰到的坑

1. Mybatis Generator工具，带上Overwrite参数后，mapper.xml相关文件并不会真正的overwrite，而是在文件末尾追加，这回造成servlet在解析xml文件时出各种莫名的问题：

> 11-Jun-2015 16:59:12.380 SEVERE [localhost-startStop-1] org.springframework.web.servlet.DispatcherServlet.initServletBean Context initialization failed

> org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'userService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.laikele.dao.mapper.UserMapper com.laikele.service.UserService.userMapper; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.laikele.dao.mapper.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}

> Related cause: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'userMapper': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire method: public final void org.mybatis.spring.support.SqlSessionDaoSupport.setSqlSessionFactory(org.apache.ibatis.session.SqlSessionFactory); nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in ServletContext resource [/WEB-INF/classes/spring-conf.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse config resource: class path resource [bean-mapping.xml]; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing SQL Mapper Configuration. Cause: java.lang.RuntimeException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.laikele.dao.entity.mapper.UserMapper.BaseResultMap                                                                                            
>     at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:292)

>     at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1185)


