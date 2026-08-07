# 下载 Java（JDK）
注意：JDK=运行+编译，JRE=只运行
- 官网下载最新版
- 配置环境变量（optional）：控制面板-系统-高级系统设置-系统环境变量-PATH

检验：win + R + cmd 打 `javac + 回车`

# 杂七杂八
## 小技巧
```java
//in
string.contains(substring);
string.indexOf(character);
```

## round
```Java
// 向上取整 double
Math.ceil(number);

// 向下取整 double
int a / b; //ab=int
Math.floorDiv(a, b);

// 四舍五入
Math.round(number);
```
## Math
```Java
Math.abs() 绝对值int
Math.max()/Math.min() 最大/最小 
Math.round() 四舍五入int
Math.sqrt() 平方根 
Math.pow() 幂double
Math.PI / Math.E
Math.sin/cos/tan(x)
```

## String Class
char ascii (A=65 a=97) <-> int/double
```Java
String string = "a";
// string -> int/double
// static method, provided by string class
Integer.parseInt(string); 
Double.parseDouble(string);

//int -> string
Integer.toString(integer);
String.valueOf(integer)

// string method
// instance method, provided by string
.split(分割物:\s) // return array of substrings
.charAt(index) //return string
.substring(start)
.substring(start, end+1) // return substring
.length()
.equal(另一个string) //比较内容
.concat(string) //链接
strim() //  移除前后空格
.repeat(repeatNumber) // 相当于*
.toCharArray();
String newString = new String(values)//返char[]

Character.isUpperCase(char) // char=primitive 没有method 需要用class.method()
```
![](/images/Java_![alt%20text](image-1.png).png)

## StringBuffer/StringBuilder Class
mutable
```Java
StringBuffer stringbuffer = new StringBuffer(word);

.append(data);
.reverse();
.toString();
```
---

# Lab1 

## Variable & Literal
```Java
// 先声明 VariableType(className)
int x 
x = 1
// final=constant不可修改
final int x = 1
```


## 变量类型：Ptimitive Data Type
- 存储数据本身：`byte short int long double float boolean char`
- 无 methods

### Integer Data Type
byte(1 byte) < short(2 byte) < int(4 byte) < long(8 byte)

不能用，. 0开头

### Floating Point Data Type
- double（默认小数类型）：8 byte 15位小数
- float：4 byte 7位小数

```Java
double d = 12.7;   // 正常
float f = 12.7;    // ❌ 会报错！因为 12.7 默认是 double
float f = 12.7f;   // ✅ 需要在数字后面加 f，明确告诉编译器这是 float

double a = 1.2E5; //科学计数法
```

### Boolean & Char Data Type
```Java
true false //小写
'a' //单引号 单字母：char
"hello" // string
```

## 变量类型：Reference Types
- 除了primitive type 都是 reference type
- 存储 address。
- 可被调用method
- array class enumeration（代表一组 constants 的 class）
```Java
className variableName = new createClassObject(参数)

String s1 = new String("candide");
String s2 = s1.replace('d', 'p'); // 创建了新的string

enum EnumerationName{
    LOW,
    MEDIUM,
    HIGH
};
EnumerationName myVar = EnumerationName.MEDIUM;
```

- Reference Type：memory里是地址，赋值时多个变量指向同一个对象（地址）
- Primitive Type：memory里是具体数据，赋值时创建副本

## 类型转换
### Implicit 小 - 大：直接换

```Java
double d = 4.9;
int i = 10;
double d1, d2;

d1 = i; // d1=10.0
d2 = (double) i;
```

### explicit 大 - 小：加（类型）
```Java
double d = 4.9;
int i = 10;
int i2= (int) d;
```

## Console Output
### printf() & printIn()
```Java
System.out.printf("模板", 值，值，值);
System.out.println("内容")// 自动换行
```
Format：%（格式开始符）+ 转换符

`%[对齐方式：-是左对齐，什么都不加是右对齐][width：一个整数][.precision][参数大小]转换符`
![](/images/Java_2026-07-22-19-08-15.png)

放在output里：

![](/images/Java_![alt%20text](image.png).png)

## Get Input
```Java
// 导入Scanner class
import java.util.Scanner;

// new: create object
// System.in = keyboard
Scanner console = new Scanner(System.in);

int age = console.nextInt();
```
```Java
// read input
.nextInt()
.nextDouble()
.next()
.nextLine()
```

## 运行
```Java
public class [fileName]{
    public static void main(String[] args){
        statement;
    }
}
```

# Lab 02
## Operator
Arithmetic：+ - * / % （注意：* /如果两个运算数都是int，结果自动只保留 int part; + 遇见 string 自动变拼接； %结果符号和被除数一致）

Unary：+（正） -（负） ++（自增1） --（自减1） !（BOOL取反）
- i++：先赋值，再自增
- ++i：先自增，再赋值
```Java
int i = 0, j = -1;
j = i++; // j = 0, i = 1
```

Multiple Assignment：`s = 5 + (t = 4);`

Relational & Logical （NO CHAINED）: == >= <= ！（NOT）&&（AND） ||（OR）  

处理顺序：

![](/images/Java_2026-07-27-23-32-33.png)
![](/images/Java_2026-07-27-23-32-45.png)

Short Circuit：逻辑判断，如果一个够用就不检查第二个

## Control Structure
``` Java
if (condition){
    statement;
} else if{
    statement;
} else{
    statement;
}
// else跟着最近的if
```
？（只有一对 if else）：`boolExpression ? valueIfTrue : valueIfFalse`

``` Java
switch (parameter)
{
    case A:
        statement;
    case B:
        statement;
        break
    default:
        statement;
}

switch (parameter)
{
    case A -> statement;
    case B -> statement; // 省略了 break
    default -> statement;
}
// 从第一个合适的 case 进入，从第一个 break 跳出
```
# Lab03 Loop & Methods

## 1. while 语句（不计数控制循环）

```java
while (condition) {
    statement;
}
```
- 条件一开始为 `false` → 循环体**一次都不执行**。


## 3. for 语句（计数控制循环）

```java
for (initialization; loopContinuationCondition; increment)
    statement;

// initialization 声明并初始化控制变量 执行一次
// loopContinuationCondition 每次循环前判断，为 false 则结束 
// increment 每次循环体执行完后运行 
```
⚠️ **注意点**
- 两个分号 `;` 必须写，三个表达式都可省略。
- 省略 `loopContinuationCondition` → **死循环**。
- 初始化/步进可用逗号分隔多个表达式：
  ```java
  int total = 1, number = 2;
  for (; number <= 20; total += number, number += 2); // 空语句
  ```
- 步进可以是负数（递减循环）。
---

## 4. do...while 语句

```java
do {
    statement;
} while (condition);
```
- **先执行一次循环体**，再判断条件。

---

## 5. 分支/跳转语句

### break：立刻跳出循环
- 立即**终止最内层**的 `switch`/`for`/`while`/`do-while`。
- 执行跳到该循环之后的第一条语句。

```java
for (count = 1; count <= 10; count++) {
    if (count == 5)
        break;      // count==5 时直接跳出循环
    System.out.print(count);
}
// 输出: 1 2 3 4
```

### continue：跳过本次剩余的循环体，直接进入下一次迭代判断。

```java
for (count = 1; count <= 10; count++) {
    if (count == 5)
        continue;   // 跳过打印5，继续循环
    System.out.print(count);
}
// 输出: 1 2 3 4 6 7 8 9 10
```


### return
- 结束当前**方法**，返回调用处。
- 两种形式：
  ```java
  return;             // 无返回值
  return variableName; // 返回值，类型需匹配方法声明
  ```

### System.exit(n)
- 直接**终止整个程序**。
- 惯例：`0` = 正常结束，非 0 = 异常结束。

---

## 7. 随机数
**只创建一个random object即可**

### SecureRandom（一般程序推荐）
```java
import java.security.SecureRandom;

SecureRandom randomNumbers = new SecureRandom();
randomNumbers.nextInt(6);   // 返回 0~5（不含6）
```

### Random Class（CodeRunner 环境中必须用这个）
```java
import java.util.Random;

Random randObj = new Random(30);  // 30 是种子，结果可重复
randObj.nextInt(10);  // 返回 0~9
```


任意范围随机数：
```java
number = shiftingValue + randomNumbers.nextInt(scalingFactor);
```
- `scalingFactor`：范围内数字的个数
- `shiftingValue`：范围起始值
---

# Lab03 Methods



## 2. 方法调用的三种形式
| 形式 | 语法 | 示例 |
|---|---|---|
| 调用本类方法 | `methodName(参数)` | `max_of_2(a, b)` |
| 调用对象的方法 | `对象.methodName(参数)` | `s1.toUpperCase()` |
| 调用类的静态方法 | `类名.methodName(参数)` | `Math.min(10, 2)` |

## 1. 实例方法 (Instance Method)

- **实例方法 (Instance Method)（非静态method）**：作用于具体对象，通过 `对象引用.方法名()` 调用

## 3. 静态方法 (Static Methods)
- **不依赖任何对象的状态**，属于整个类。通过 `类名.方法名()` 直接调用，**不需要创建对象**



- 为什么 main 是 static？JVM 启动时要调用 `main`，但此时还没有创建任何对象。`static` 让 JVM (Java Virtual Machine) **不用创建对象**就能调用 main
（若漏写 `static`：**编译通过，但运行报错**）

## 4. 声明 Methods
```java
public static 返回类型 方法名(参数列表) {
    // 方法体
    return 表达式;   // 有返回值时
}
```
- **修饰符 (Modifier)**：`public`（可被其他类调用）、`static`（无需对象即可调用）
- **返回类型**：`void` 表示无返回值
- **参数**：局部变量，只在方法体内有效
- **返回**的三种方式：
  1. 无返回值 → 执行到 `}` 或遇到 `return;`
  2. 有返回值 → `return 表达式;`，先算表达式再返回
- **class variables = fields**


## 5. 方法调用栈 (Method-Call Stack)
- 每次调用方法，系统创建 **(Activation Record)**并压栈，包含：返回地址，参数，局部变量
- **LIFO（后进先出）**：调用顺序 A→B→C，返回顺序 C→B→A。方法返回后，栈被弹出，局部变量消失

## 6. 作用域 (Scope) 规则
| 声明类型 | 作用域 |
|---|---|
| `for` 循环头中声明的变量 | 仅在循环体和循环头内有效 |
| 局部变量 | 从声明处到所在**代码块**结束 |
| 参数 | 整个方法体 |
| 字段 (field) | 整个类的所有方法 |

- **遮蔽 (Shadowing)**：局部变量/参数与字段同名时，**局部的优先**

```java
public static int x = 1;              // 字段
public static void main(String[] a) {
    int x = 5;                        // 遮蔽字段 x
    System.out.println(x);            // 5（局部）
    method();                         // 内部会用字段 x = 1
}
public static void method() {
    System.out.println(x);            // 1（字段）
}
```

## 7. 方法重载 (Method Overloading)
- 同一个类中可以有**同名方法**，只要**参数列表不同**（个数/类型/顺序）（不含返回类型！）

```java
public static void aMethod() { }
public static void aMethod(int x, String y, boolean z) { }
public static void aMethod(String y, int x, boolean z) { }  // ✅ 合法：签名不同
```

### 参数提升 (Argument Promotion)
- 调用时若无精确匹配，编译器会**向"更宽"的类型自动转换**
- 提升方向唯一时才自动选择；若产生**多个可能** → 编译错误 "reference is ambiguous"

```java
public static void m1(double a) { }
public static void m1(short a) { }
m1(20);   // 调用 m1(double)，因为 int 不能自动转 short
```
# Lab 04 Arrays

## 1. 数组基础
- 数组只包含 **同一类型**
- 数组是**object**（reference type）
- 默认值：`int→0`，`boolean→false`，`String/对象→null`
- 长度固定，创建后不可改变（`arr.length` 获取长度，无括号）
- 越界访问 → 运行时抛出 `ArrayIndexOutOfBoundsException`

## 2. 声明与创建
```java
// 声明（不分配内存）
int[] a;          // 推荐写法
int a[];          // 也合法

// 创建（分配内存，初始化为默认值）
a = new int[10];

// 声明+创建 合并
int[] a = new int[10];

// 声明+初始化（用初始化列表，自动确定长度）
int[] a = {1, 2, 3};
int[] a = new int[]{1, 2, 3};
```
⚠️ **错误写法**：
- `int[10] a;` —— 声明时不能指定长度
- `new int[3]{1,2,3}` —— 用 `{}` 初始化时不能同时写长度

## 3. Methods
```java
Arrays.toString(array)
```
## 3. 遍历数组
```java
// 普通 for（可修改元素）
for (int i = 0; i < arr.length; i++) arr[i] = i;

// 增强 for（只能读，不能修改元素！）
for (int v : arr) System.out.println(v);
```

## 4. 数组比较与拷贝
| 操作 | 效果 |
|---|---|
| `a == b` | 比较**引用**（地址），不是内容 |
| `a.equals(b)` | ⚠️ 数组未重写 equals，等价于 `==`，不要用来比较内容 |
| `Arrays.equals(a, b)` | 正确比较**元素内容** |
| `a = b` | 只复制引用，两个变量指向同一数组 |
| `System.arraycopy(src, srcPos, dest, destPos, len)` | 真正复制元素（dest 需提前创建） |

## 5. Pass-by-Value（Java 全部是值传递）
- **primitive**：传值的副本，方法内修改不影响外部变量
- **reference（数组/对象）**：传的是**引用的副本**
  - 通过引用**修改对象内部内容**（如 `arr[0]=10`）→ 外部可见
  - 让参数**指向新对象**（如 `arr = new int[5]`）→ 外部不受影响
- 传数组元素 `f(arr[i])`：相当于primitive，不影响原数组

## 6. main 方法参数 & 可变参数
```java
public static void main(String[] args) { ... }   // 命令行参数存入 args

public static double average(double... nums) {   // 可变参数，视为数组
    // 只能放在参数列表最后，且只能出现一次
}
```

## 7. 多维数组
```java
int[][] x = new int[5][7];        // 5行7列（矩形数组）
int[][] y = { {1,2,3}, {4,5,6} }; // 数组初始化列表（嵌套）
int[][] b = new int[3][];       // 不规则数组只声明行数
b[0] = new int[2];
```
- `x.length` → 行数；`x[i].length` → 第 i 行的列数
- 用已有一维数组构造二维数组时，存的是**引用**（共享数据，修改会互相影响）
  - 如需独立副本，用 `.clone()`：`{a1.clone(), a2.clone()}`
---

## 9. 对象数组
```java
Point[] p = new Point[3];   // 只创建数组，元素默认为 null
p[0] = new Point(10, 20);   // 必须单独 new 每个元素
```
- 数组存的是**对象引用**，未初始化元素访问会抛 `NullPointerException`
- `Point[] copy = p;` 只复制引用，`copy` 和 `p` 指向同一批对象

# Lab 05 Classes and Objects

## 3. 定义 class

```java
public class MyClass {
    // 字段 (fields / attributes)
    // 构造方法 (constructors)
    // 方法 (methods)
}
```

- `public` 类必须存在与类名相同的 `.java` 文件中
- 类名、方法名、变量名都用 **camelCase**，类名首字母大写

---
## 5. class Constructor (`new`)

```java
public className(int x, int y) {
    this.x = x;
    this.y = y;
}
```

- 方法名必须和**类名相同**，**没有返回类型**
- 用 `new` 调用时自动执行
- 可以**重载 (overload)**：多个构造方法，参数列表不同即可

**默认构造方法：**：int → 0，boolean → false，引用类型（String等）→ null

**构造方法互相调用（链式构造）：**
```java
public Point() {
    this(0, 0);   // 调用另一个构造方法，必须放在第一行
}
```

---

## 7. Instance Method

**Getter / Setter 规范：**
```java
public int getField() { return attribute; }              // 访问器 accessor
public void setField(int arg) { this.Field = arg; } // 修改器 mutator
```
> 字段 `x` 对应方法名必须是 `getX()` / `setX()`

---

## 8. field & static method

```java
public class Stuff {
    private static int x = 10;      // 类变量：所有对象共享
    public static int getX() { ... } // 类方法
}
```

| 对比 | instance | static |
|---|---|---|
| 归属 | 每个对象一份 | 整个类共享一份 |
| 调用方式 | `对象名.方法()` | `类名.方法()` |
| 能否访问对方 | 能访问 static 和实例成员 | **不能**直接访问实例变量/方法（因为可能还没有对象存在，也没有 `this`） |
| 加载时机 | 创建对象时分配 | 类加载时就分配 |

常见例子：`Math.round(2.3)`、`Integer.parseInt("123")`

**典型用途：用 static 变量做计数器**
```java
public class SharedCounter {
    private static int count;   // 全类共享
    private int value;          // 每个对象独立
    public SharedCounter(int value) {
        this.value = value;
        count++;                // 每 new 一次 +1
    }
}
```
---

## 2. 创建 object

```java
Point p2 = new Point(23, 94);
```

1. **声明 (Declaration)**：`Point p;` —— 此时还没有对象，只是声明了一个引用变量
2. **实例化 (Instantiation)**：`new` 关键字分配内存，返回对象引用
3. **初始化 (Initialization)**：`new` 后紧跟构造方法调用，如 `Point(23,94)`

---
## 4. Modifier (Visibility)

| 修饰符 | 可访问范围 |
|---|---|
| `public` | 任何地方都能访问 |
| `private` | 只能在类内部访问 |

**一般原则：**
- 对象的 field **一律 private**（数据隐藏 / 信息隐藏）
- 供外部调用的方法一般 `public`
- 只是内部辅助用的"帮助方法"不要设为 `public`

---


## 6. `this` 关键字

| 用法 | 作用 |
|---|---|
| `this.x = x;` | 指 instance variable（class 外部对象） |
| `this(...)` | 在构造方法第一行调用本类的另一个构造方法 |

---
- `==` 比较地址
- `.equals()` 比较值
```java
@Override
public boolean equals(Object obj) {

    if (this == obj)
        return true;

    if (!(obj instanceof ClassName))
        return false;

    ClassName other = (ClassName)obj;

    return field1 == other.field1
        && field2 == other.field2
        && field3 == other.field3;
}
```

## 9. enum（枚举）

表示**一组固定的 instances**，有field & constructor & method

```java
enum Size {
    SMALL(3), REGULAR(5), LARGE(7);   // 括号内是传给 constructor 的参数
    /*
    public static final Size SMALL   = new Size(3);  
    public static final Size REGULAR = new Size(5);  
    */

    private final double price;
    private Size(double p) {          // 构造方法必须 private，不允许在外部自己new instance
        price = p;
    }
    public double getPrice() { return price; }
}
```

**Enum Methods**
```java
EnumName.CONSTANT.ordinal();        // 0 （常量的位置，从0开始）
EnumName.CONSTANT.toString();       // "SMALL"
EnumName.valueOf("CONSTANT");   // 返回 Size.LARGE
EnumName.values();       // 返回包含所有常量的 array
```
---

## 10. 常见易错点

- ❌ `Author a = new Author();` 不存在默认构造
- ❌ 字段设为 `public` —— 违反封装原则，应为 `private` + getter/setter
- ✅ `System.out.println(obj)` 会自动调用对象的 `toString()` 

---

# Java ArrayList 速查表 (CompSci 230)

## 1. 基本概念

- `ArrayList` 属于 **集合(Collection)**，用于存储对象，自动管理增删改查
- 只能存储 **对象**，不能直接存储基本数据类型（int、boolean等）
- 有两个关键属性：
  - **size**：当前实际存储的元素个数
  - **capacity**：内部数组分配的容量（可自动扩容）

```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<String>();
list.add("apple");

ArrayList<Integer> nums = new ArrayList<Integer>();
```

---

## 2. 泛型 (Generics)

- `<E>` 是占位符，创建时指定存储的数据类型
- Java 5 起推荐写法：

```java
ArrayList<String> words = new ArrayList<String>();
```

- ⚠️ 旧写法 `ArrayList words = new ArrayList();` 不推荐（无类型检查）
- 只能加入指定类型的对象，加入其他类型会报错

---

## 3. 常用方法一览

| 方法 | 作用 |
|---|---|
| `add(E x)` | 在末尾添加元素 |
| `add(int index, E x)` | 在指定位置插入元素，其余元素后移 |
| `get(int index)` | 获取指定位置的元素 |
| `set(int index, E x)` | 替换指定位置的元素，返回旧元素 |
| `remove(int index)` | 按索引删除元素，返回被删除元素 |
| `remove(Object x)` | 按值删除第一个匹配元素，返回true/false |
| `contains(E x)` | 是否包含某元素 |
| `indexOf(E x)` | 第一次出现的索引，找不到返回-1 |
| `lastIndexOf(E x)` | 最后一次出现的索引 |
| `size()` | 返回元素个数 |
| `isEmpty()` | 是否为空 |
| `clear()` | 清空所有元素 |
| `toString()` | 转成字符串，如 `[One, Two, Three]` |
| `trimToSize()` | 把容量裁剪到当前元素个数 |
| `equals(Object o)` | 大小和元素顺序都相同才为true |

### 索引越界
`get()` / `set()` / `remove(int)` 的 index 必须满足 `0 <= index < size()`，否则抛出 `IndexOutOfBoundsException`

---

## 4. 遍历方式

```java
// 普通for循环
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}

// 增强for循环 (for-each)
for (String value : list) {
    System.out.println(value);
}
```

---

## 5. 包装类 (Wrapper Classes)

基本类型不是对象，需要包装类转换：

| 基本类型 | 包装类 |
|---|---|
| boolean | Boolean |
| char | Character |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |

### 常用转换方法

```java
// 值/字符串 → 对象
Integer i1 = Integer.valueOf(42);
Integer i2 = Integer.valueOf("42");

// 对象 → 值
System.out.println(i1.intValue());   // 42

// 字符串 → 值 (parse)
Integer.parseInt("42");        // 42
Boolean.parseBoolean("true");  // true
Double.parseDouble("2.71");    // 2.71
```

### 自动装箱/拆箱 (Autoboxing / Autounboxing)

Java 5起，int ↔ Integer 等自动互相转换：

```java
ArrayList<Integer> numbers = new ArrayList<Integer>();
numbers.add(12);   // autoboxing: int → Integer
int sum = 0;
for (int i : numbers) {   // autounboxing: Integer → int
    sum += i;
}
```

---

## 6. ArrayList vs Array 对比

| 特性 | Array | ArrayList |
|---|---|---|
| 容量 | 固定，创建后不可变 | 自动扩容 |
| 存储类型 | 基本类型 + 对象 | 只能是对象 |
| 元素个数 | `array.length` | `list.size()` |
| 访问/修改元素 | `arr[i]` / `arr[i] = x` | `list.get(i)` / `list.set(i, x)` |
| 打印 | 只显示内存地址 | 显示完整内容 |

### 相互转换

```java
// Array → ArrayList
Point[] points1 = {new Point(1,2), new Point(3,4)};
ArrayList<Point> points2 = new ArrayList<>(Arrays.asList(points1));

// ArrayList → Array
String[] copy = new String[words.size()];
copy = words.toArray(copy);
```

`Arrays` 类还提供 `sort()`、`toString()` 等静态工具方法。

---

# CS230 异常处理 (Exceptions) 速查表

## 1️⃣ 什么是异常？

**异常 (Exception)** = 程序运行时打断正常执行流程的事件。

- 出错时，方法会创建一个**异常对象**并"抛出"（throw）给运行时系统
- 异常对象包含：错误信息 (message) + 方法调用栈 (call stack)
- 如果没人处理，Java 默认处理器会打印错误信息并**终止程序**

```
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Example1.main(Example1.java:4)
```

**常见异常举例：**

| 异常类型 | 触发原因 |
|---|---|
| `ArithmeticException` | 除以 0 |
| `ArrayIndexOutOfBoundsException` | 数组下标越界 |
| `NullPointerException` | 使用未初始化的对象引用 |
| `NumberFormatException` | 字符串转数字格式错误 |
| `FileNotFoundException` | 找不到指定文件 |

---

## 2️⃣ 异常层级结构 (Hierarchy)

```
Throwable
├── Error              ← 严重错误，程序无法恢复，不要捕获
│   ├── OutOfMemoryError
│   └── StackOverflowError
└── Exception           ← 可以被捕获和处理
    ├── IOException                    ← Checked（受检异常）
    │   └── FileNotFoundException
    └── RuntimeException               ← Unchecked（非受检异常）
        ├── ArithmeticException
        ├── NullPointerException
        ├── ArrayIndexOutOfBoundsException
        └── NumberFormatException
```

- **Error**：JVM 层面的严重问题（如内存不足），程序**无法恢复**，不该捕获
- **Exception**：程序逻辑错误，**可以**捕获处理

---

## 3️⃣ try-catch 基本用法

```java
try {
    // 可能出错的代码
} catch (Exception e) {
    // 出错时执行
    System.out.println("Error");
}
System.out.println("continue...");  // 无论是否出错都会执行
```

**执行规则：**
1. `try` 块内一旦出错，**立刻跳出**，剩余代码不执行
2. 匹配的 `catch` 块被执行
3. 之后程序**继续正常运行**（不会终止）

---

## 4️⃣ 多个 catch 块 (Multiple catch)

```java
try {
    ...
} catch (NumberFormatException e) {
    System.out.println("格式错误");
} catch (ArithmeticException e) {
    System.out.println("计算错误");
} catch (Exception e) {
    System.out.println("其他异常");
}
```

### ⚠️ 关键规则

| 规则 | 说明 |
|---|---|
| **匹配第一个** | 运行时系统从上到下找**第一个**类型匹配的 catch，执行后跳过其余 catch |
| **顺序很重要** | **子类异常必须写在父类前面**，否则**编译报错**（父类会"吃掉"所有子类异常） |
| **无匹配 = 程序终止** | 若没有任何 catch 匹配，异常向上抛，最终被默认处理器终止程序 |
| **catch (Exception e)** | 可以捕获所有异常（因为所有异常都是 Exception 子类） |

✅ 正确顺序：
```java
catch (NumberFormatException e) {...}   // 子类在前
catch (Exception e) {...}               // 父类在后
```

❌ 错误顺序（编译不通过）：
```java
catch (Exception e) {...}               // 父类在前 → 报错！
catch (NumberFormatException e) {...}   // 子类永远不会被匹配到
```

---

## 5️⃣ finally 块

**finally 中的代码保证会被执行**（无论是否抛出异常，甚至有 `return`）

```java
try {
    ...
} catch (Exception e) {
    ...
} finally {
    System.out.println("一定会执行！");
}
```

| 情况 | finally 是否执行 |
|---|---|
| try 正常结束，无异常 | ✅ 执行 |
| try 抛异常，被 catch 捕获 | ✅ 执行（在 catch 之后） |
| try 抛异常，**没有**匹配的 catch | ✅ 执行（然后程序才终止，`finally` 后的代码不执行） |
| catch 中有 `return` | ✅ finally 仍会先执行，然后才真正 return |

📌 **用途**：清理资源（关闭文件、数据库连接等），做"善后工作"

---

## 6️⃣ throw vs throws（非常容易考的点！）

| 关键字 | 用法 | 作用 |
|---|---|---|
| `throw` | 语句，在方法**内部**使用 | **主动抛出**一个异常对象 |
| `throws` | 写在方法**声明**上 | **声明**该方法可能抛出的异常类型，交给上层调用者处理 |

```java
// throw：手动抛出异常
if (condition) {
    throw new Exception("发生错误");
}

// throws：方法声明可能抛出异常，不在方法内处理
public void method1() throws IOException {
    ...
}

public void method2() throws IOException, ArithmeticException {
    ...
}
```

### 该用 try-catch 还是 throws？

| 情况 | 选择 |
|---|---|
| 知道该怎么处理错误，本地能解决 | 用 `try-catch`（程序继续运行） |
| 不清楚该怎么处理，交给上层处理 | 用 `throws`（若一路传到 main 没人处理，程序终止） |

---

## 7️⃣ Checked vs Unchecked 异常

| 类型 | 说明 | 例子 |
|---|---|---|
| **Checked（受检）** | 编译器**强制**要求 catch 或用 throws 声明，否则**编译报错** | `IOException`, `FileNotFoundException` |
| **Unchecked（非受检）** | `RuntimeException` 及其子类，**编译器不强制**处理 | `ArithmeticException`, `NullPointerException`, `NumberFormatException` |

📌 记忆法：**RuntimeException 家族 = 非受检**，其余 Exception 子类（非 RuntimeException）= 受检

---

## 8️⃣ 快速代码模板

```java
// 完整结构
try {
    // 可能出错的代码
} catch (SpecificException e) {
    // 处理特定异常（子类写前面）
} catch (Exception e) {
    // 处理其他/通用异常
} finally {
    // 清理代码，一定执行
}
```

```java
// 循环中跳过错误值继续处理
for (String s : values) {
    try {
        result += Integer.parseInt(s);
    } catch (NumberFormatException e) {
        // 忽略无效值，continue 到下一个
    }
}
```

```java
// 遇到错误立刻中止并返回当前结果
for (String s : values) {
    try {
        result += Integer.parseInt(s);
    } catch (NumberFormatException e) {
        System.out.println("Error: Invalid value!");
        return result;   // 直接结束方法
    }
}
```

---

## ✅ 考试重点速记

1. **异常匹配顺序**：从上到下找第一个匹配的 catch；子类必须写在父类前面
2. **finally 永远执行**（除非 JVM 崩溃/System.exit）
3. **throw** = 抛出一个异常实例；**throws** = 方法签名声明可能抛出的异常类型
4. **Checked 异常**编译器强制处理；**Unchecked（RuntimeException）**不强制
5. `catch` 参数类型必须是 `Throwable` 的子类
6. try 块内一旦异常发生，**该行之后的代码立即跳过**

