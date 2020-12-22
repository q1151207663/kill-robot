# README

## 让你快乐的程序

这是一个可以让你感到快乐的程序，目标是支持霰弹枪、水枪、舔狗三种开火模式，向你的目标对象开火。
目前它初步实现了三种模式，使用它可以进行三种模式的弹药持久化、在线获取、刷新追加弹药库等功能。
后面将对它进行自动开火的功能开发，目标会提供GUI界面供你方便使用。

---

## 自定义配置
从使用上讨论，建议你只修改application.properties文件中的：

1. scrawl.thread.count     爬虫线程数量
2. scrawl.retry.count     失败重试次数
3. magazine.shotgun.diskpath     霰弹枪弹匣持久化位置
4. magazine.watergun.diskpath     水枪弹匣持久化位置
5. magazine.lickdog.diskpath      舔狗弹匣持久化位置
6. log.error.diskpath      异常日志文件持久化位置



从学习上讨论，学习此项目需要你掌握以下基础知识：

1. Java基础知识，包括Class、Interface、Enum、IO、Exception等
2. Spring、Spring MVC、Spring Boot框架
3. 网络爬虫的基础知识，包括Http协议和一些基础的反爬常识，如果了解HttpClient或WebMagic你会看的更加舒适。

---

## 环境依赖

在你本地运行此项目需要以下环境(暂时)：

1. java version 1.8x
2. maven 3.6x
3. win系统
4. 联网主机

---

## 接口

### LickDoggunApi

舔狗模式Api入口类

| 接口名                               | 参数    | 返回值    | 参数描述 | 接口描述                           | 调用入口 |
| :----------------------------------- | ------- | --------- | -------- | ---------------------------------- | -------- |
| persistenceLickDoggunLevel           | Integer | ApiResult | 装弹数量 | 填充舔狗模式等级弹匣，持久化到本地 | 暂无     |
| refreshAndPersistenceLickDoggunLevel | Integer | ApiResult | 装弹数量 | 刷新并填充舔狗模式等级弹匣         | 暂无     |
| refreshLickDoggunLevel               | /       | ApiResult |          | 刷新舔狗模式等级弹匣               | 暂无     |
| onlineLickDoggunFire                 | /       | ApiResult |          | 在线获取子弹，不持久化到本地       | 暂无     |

### ShotgunApi

霰弹枪模式Api入口类

| 接口名                            | 参数    | 返回值    | 参数描述 | 接口描述                         | 调用入口 |
| --------------------------------- | ------- | --------- | -------- | -------------------------------- | -------- |
| persistenceShotgunLevel           | Integer | ApiResult | 装弹数量 | 填充霰弹枪等级弹匣，持久化到本地 | 暂无     |
| refreshAndPersistenceShotgunLevel | Integer | ApiResult | 装弹数量 | 刷新并填充霰弹枪模式等级弹匣     | 暂无     |
| refreshShotgunLevel               | /       | ApiResult |          | 刷新霰弹枪模式等级弹匣           | 暂无     |
| onlineShotgunFire                 | /       | ApiResult |          | 在线获取子弹，不持久化到本地     | 暂无     |

### WatergunApi

水枪模式Api入口类

| 接口名                             | 参数    | 返回值    | 参数描述 | 接口描述                       | 调用入口 |
| ---------------------------------- | ------- | --------- | -------- | ------------------------------ | -------- |
| persistenceWatergunLevel           | Integer | ApiResult | 装弹数量 | 填充水枪等级弹匣，持久化到本地 | 暂无     |
| refreshAndPersistenceWatergunLevel | Integer | ApiResult | 装弹数量 | 刷新并填充水枪模式等级弹匣     | 暂无     |
| refreshWatergunLevel               | /       | ApiResult |          | 刷新水枪模式等级弹匣           | 暂无     |
| onlineWatergunFire                 | /       | ApiResult |          | 在线获取子弹，不持久化到本地   | 暂无     |

---

## ApiResult

ApiResult是调用接口后统一返回的视图类，它包含三个属性：

1. code，接口调用反馈回来的状态码，0表示成功，-1表示调用失败，-2表示不仅调用失败，异常日志持久化也失败
2. msg，接口调用失败后包含的描述信息
3. data，接口调用成功后包含的数据信息

---

## 程序说明

该程序或许可以比喻为无限弹药的自动化步枪，现在初步实现了第一个模块——自动装弹模块；未来我会为它实现开火的功能。

### scrawl-robot模块
弹药提供服务模块，包含和弹药相关的一系列api

### script-robot模块
自动开火服务模块，包含和开火相关的一系列api

### ui-robot模块
提供界面支持

### setting-robot模块
提供修改个别配置的支持

### common-robot模块
共用模块