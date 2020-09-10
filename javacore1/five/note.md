# 继承

## 类、超类、子类

  1. Java中继承默认是共有继承

  2. Java中，对象变量时多态的

  3. 方法签名 - 方法的名字和参数列表

  4. 理解方法调用（有点不明白）

  5. final修饰符。不可变类，类中的所有方法会自动的成为final，但是不包括域。

  6. 强制类型转换。强转的原因：暂时忽视对象的实际类型之后，使用对象的全部功能。
  注意点：1、只能在继承层次内进行类型转换。2、在将超类转换成子类之前，应该使用instanceof进行检查。

  7. 抽象类的特征：
    7.1 包含一个或多个抽象方法的类本身必须要被声明为抽象类
    7.2 类即使不再含有抽象方法，也可以将类声明为抽象类
    7.3 抽象类不能被实例化
    7.4 可以定义一个抽象类变量，但是只能引用非抽象子类的对象

  8. 谨慎使用protect的属性。因为很可能导致某一个类的变更影响其派生的子类的变更。受保护的方法更具有实际意义。

  9. 4个访问修饰符的作用范围：
      9.1. private 对本类可见
      9.2. public 对所有类可见
      9.3. protected 对本包和所有子类可见
      9.4. 对本包可见 默认，不需要修饰符

## Object

 1. Object类的equals 方法用于检测一个对象是否等于另一个对象。通常而言需要重写equals方法，相等的逻辑就业务而定。
 其需要满足以下5个特性：
  1.1 自反性
  1.2 对称性
  1.3 传递性
  1.4 一致性
  1.5 对于任意非空引用x，x.equals(null)应该返回false
 2. 编写一个equals方法的建议：
  2.1 显式参数命名为otherObject，稍后需要将它转换成另一个叫做other的变量。
  2.2 检测this与otherObject是否引用同一个对象
  2.3 检测otherObject是否为null，如果为null返回false。这项检测非常重要。
  2.4 比较this与otherObject是否属于同一个类。
  2.5 将otherObject转换为相应的类类型变量
  2.6 现在开始对所有需要比较的域进行比较。
 3. hashCode方法
    3.1 散列码是由对象导出的一个整型值。散列码没有规律。
    3.2 字符串的散列码是由内容导出的，字符串缓冲其散列码是由Object类的默认的hashCode方法导出的对象的存储地址
    3.3 Equals与hashCode的定义必须保持一致，如果equals方法的比较的两个对象返回true，那么hashCode方法比较的两个对象也必须要有一样的值
    3.4 组合多个散列值时，最好的做法是调用Objects.hash()并提供多个参数。这个方法会对各个参数调用Object.hashCode()方法
 4. toString方法
    x.toString() 有的时候可以被 x + ""替代，取决于这个x是基本类型还是引用类型
    数组的toString方法为Arrays.toString()

 5. 泛型数组列表
    5.1 如果调用add且内部数组已经满了。数组列表就自动地创建一个更大的数组，并将所有的对象从较小的数组中拷贝到较大的数组中。
    5.2 size方法 返回数组列表实际的元素数目 等价于数组的length属性
    5.3 一旦确定了数组列表不会再发生变化那么可以调用trimToSize方法，将存储区域的大小调整为当前元素数量所需的存储空间数目
    5.4 访问数组列表元素的方法 不同于数组的中括号，其需要调用get/set方法,list.set(i, x),i要小于等于数组列表的大小
    5.5 add/remove 这两个方法是在某一下标添加一个元素（加完之后后面的元素后移），伴随着后续元素的移动
    5.6 经常的对数组进行插入和删除，优先考虑链表这种数据结构
 6. 自动装箱拆箱
  6.1 基本数据类型与其包装类之间的自动转换
  6.2 自动装箱、拆箱是编辑器的行为，并不是虚拟机干的。

 7. 枚举类
  7.1 比较两个枚举类型的值时，永远不要调用equals，而是直接使用 == 。
  7.2 toString方法能够返回枚举常量名
  7.3 枚举类都有一个静态方法 -- values()，它将返回一个包含全部枚举值的数组。

 8. 反射
  8.1 Class类：
    获取的方式：
      a. Object类的getClass()返回一个Class类型的实例对象。Class有一个实例方法：getName()将返回类的名称。
      b. Class类的静态方法forClass方法获得类名对应的Class对象。
      c. 如果T是任意的Java类型，T.class将代表匹配的类对象。
  8.2 Class对象的newInstance()方法，此方法调用默认的构造器初始化新创建的对象，如果没有默认的构造器就会抛出一个错误。
  8.3 组合使用forName与newInstance方法可以根据存储在字符串中的类名创建一个对象。
  8.4 反射分析类的能力 -- 检查类的结构（包括公共的域、方法包含从超类继承的方法、构造函数，甚至通过个别方法能返回类中声明的全部的域、方法不包括从超类继承的方法、构造器）
  8.5 在运行时使用反射分析对象

  ```Java
   public class Employee
      public boolean equals(Object otherObject) {
      // a quick test to see if the objects are identical
      if (this == otherObject) return true;
      // must return false if the explicit parameter is null
      if (otherObject == null) return false;
      // if the classes don't match, they can't be equal
      if (getClassO != otherObject.getClass())
      return false;
      // now we know otherObject is a non-null
      Employee Employee other = (Employee) otherObject;
      // test whether the fields have identical values
      return name.equals(other.name)
      && salary = other,salary
      && hi reDay.equals(other,hi reDay):
  ```
