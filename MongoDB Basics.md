# MongoDB Basics

标签（空格分隔）： MongoDB Basics

 关注本人其他开源成果请移步[[作者GitHub]][1]，水平有限，欢迎提出您宝贵的意见
 如果您对MongoDB有兴趣，强烈推荐[[MongoDB线上课堂]][2]，讲得很详细，非常适合利用时间碎片系统化学习MongoDB，同时对数据库知识体系也有促进作用。

---
## 1. 目录

-   [0. 返回章节目录][3]
-   [1. 目录](#目录)
-   [2. Introduction](#Introduction)
    -   [2.1. MongoDB的三个核心对象](#MongoDB的三个核心对象)
    -   [2.1. 列的类型](#列的类型)
-   [3. 查询语法](#查询语法)
    -   [CRUD](#查询语法)

## 2. Introduction
### 2.1. MongoDB的三个核心对象
* Databases 数据库，类似于传统数据库
* Collections 集合，类似于传统数据库的表
* Documents 文档，由一个json对象表述，类似传统数据库的行，类似弱类型的特性，支持比hbase更灵活的列扩展，同一列的数据类型也不受限制
  （更多信息可以通过MongoDB compass工具查看Collections的schema）

### 2.2. 列的类型
MongoDB的Documents基于json，但比json基础规范支持更多的数据类型。

直接支持：

* int
* String
* Array
* Object
* Boolean values (true and false)
* Floating-point number
* Null
* Decimal number

额外支持：

* document（支持嵌套）
* date
* coordinates（object的特例，让MongoDB更方便存储空间地理数据）

## 3. 查询语法

  [1]: https://github.com/asan3524
  [2]: https://university.mongodb.com
  [3]: https://github.com/asan3524/mongodb




