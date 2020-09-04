# 集合

## 具体集

### 链表

1. Iterator 迭代器是描述集合中位置的，所以这种依赖于位置的add方法将由迭代器负责，只有对自然有序的集合使用迭代器添加元素才有意义，由于Set，其元素是无序的。因此Iterator接口就没有add方法。LinkedList的listIterator方法返回了一个实现了ListIterator接口的迭代器对象

2.
