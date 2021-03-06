# 泛型

## 概述

1. 操作的数据类型被指定为一个参数，这种参数可以用在类、接口、方法中，分别被称为 泛型类、泛型接口、泛型方法

2. 泛型：参数化类型

3. 泛型类可以有多个类型变量（使用大写形式，并且很短），用具体的类替换类型变量就是实例化泛型类型

4. 泛型方法中的<K, V>中的K、V是类型参数，而方法中的K、V被称为参数化类型。类型变量K、V先进行声明。泛型类中的类型参数和泛型方法的类型参数是没有相应联系的，泛型
方法始终以自己定义的类型参数为准。

5. 有时候类或方法需要对类型变量加以约束。譬如要对一个泛型类的对象调用compareTo方法，那么这个泛型类的就必须是Comparable接口的实现类

6. 泛型代码和虚拟机。泛型的早期实现 -> 后面的实现
   早期实现： 使用继承，比如说ArrayList只维护一个Object引用的数组。会造成2个问题：1、在获取值的时候需要进行强制类型转换。2、没有错误检查。

7. 类型擦除：（定义1）无论何时定义一个泛型类型，都自动提供了一个相应的原始类型。（定义2）原型类型的名字就是删去类型参数后的泛型类型名。
   (具体描述)擦除类型变量，并替换为限定类型（原始类型用第一个限定的类型变量来替换，无限定的变量用Object）

8. 翻译泛型表达式：调用泛型方法时，如果擦除返回类型，编译器插入强制类型转换。存取一个泛型域时也要进行强制类型转换。

9. 翻译泛型方法：类型擦除也会出现在泛型方法中，对方法进行类型擦除之后可能会遇到当前类的方法和父类继承的方法名一样但是形参列表不同的问题，那么在调用的时候如何保持多态呢？

10. 1、**虚拟机中没有泛型，只有普通的类和方法**
    2、所有的类型参数都用他们的限定类型替换
    3、桥方法被合并来保持多态
    4、为保持类型安全性，必要时插入强制类型转换

## 使用泛型时的约束与局限

1. 不能用基本类型实例化类型参数。当包装类不能接受替换时，可以使用的独立的类和方法处理它们。
  解读: 没有Pair<double>,只有Pair<Double>，原因是类型擦除之后Pair类含有Object类型的域，而Object不能存储double值。
  Q: 包装类为什么不能接受替换？

2. 运行时类型查询只适用于原始类型。
  解读: ?

3. 不能创建参数化类型的数组。
  解读：
    Pair<String>[] table = new Pair<String>[10]; // error
    类型擦除之后table的类型是Pair[]，可以转换为Object[]。
    Object[] objArr = table;
    objArr[0] = "hello";
    不过对于泛型类型，擦除会使这中机制无效。
    objArr[0] = new Pair<Employee>();// 这种赋值能够通过数组存储检查，出于这个原因，不允许创建参数化类型的数组。
    但是也只是不允许创建这些数组，而声明类型为Pair<String>[]变量仍是合法的。
    // 可以通过声明通配类型的数组，然后进行类型转换
    Pair<String>[] table = (Pair<String>[]) new Pair<?>[10];
    // 间接实现 - 泛型包装器
4. ...

## 泛型类型的继承规则

1. Pair<Manager>并不是Pair<Employee>的子类

## 通配符类型

其目的是为了指定泛型中的类型范围

1. 通配符类型中，允许类型参数变化。 Pair< ? extends Employee> // 这个地方个人称之为子类型限定

2. 通配符的超类型限定。

3. 带有超类型限定的通配符可以向泛型对象写入，带有子类型限定的通配符可以从泛型对象读取。

4. 无限定通配符。
  ? getFirst()
  void setFirst(?)。
  Pair<?> 和 Pair本质的不同在于：可以用任意Object对象调用原始Pair类的setObject方法。
  // ??? 不应该是setSecond么？

对于一些简单的操作非常有用。
public static boolean hasNulls(Pair<?> p) {
  return p.getFirst() == null || p.getSecond() == null;
}
通过hasNulls转换成泛型方法，可以避免使用通配符类型：
public static <T> boolean hasNulls(Pair<T> p) { ... }

5. 通配符捕获。一般借助一个辅助的泛型方法，方法的类型参数将能捕获哪种类型的通配符。

## 反射和泛型

1. 泛型的Class类。
