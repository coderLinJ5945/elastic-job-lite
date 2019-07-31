# elastic-job-lite-console

## 大致代码思路
1. Registry 注册中心，用于配置、存储和使用zookeeper 解决分布式分片
2. JobAPI 定时任务的相关操作，基于elastic-core 和 lifecycle 实现 job的启、停、删除等。
3. EventTrace 事件追踪数据源服务
