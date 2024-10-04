第一次作业——模拟业务

本任务的目标是要输出学生的电脑配置，根据这个逻辑关系所以结构上我定义了两个类，分别是computer和student。

computer类

顾名思义，在这个类中存储了电脑的相关属性，model：电脑的型号（例如：“MACBOOK PRO 13”）。cpu：电脑使用的CPU类型（例如：“APPLE M4”）。neicun：内存的大小，以GB为单位（例如：“16”）。yingpan：硬盘的存储容量，以GB为单位（例如：“512”）。xianka：使用的显卡（例如：“apple gpu”）。通过getit()方法来使用。

student类

本类表示学生，包括他们的姓名、学号和使用的电脑。也可以看作把computer类嵌套在里面，name：学生的姓名（例如：“张三”）。xuehao：学生的学号（例如：“20180101”）。computer：与学生相关联的Computer类实例。通过display方法来使用。

main函数

在main方法中，创建了两个Computer和Student的实例。程序展示每个学生的详细信息及其对应的电脑配置。
