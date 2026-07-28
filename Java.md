# 下载 Java（JDK）
注意：JDK=运行+编译，JRE=只运行
- 官网下载最新版
- 配置环境变量（optional）：控制面板-系统-高级系统设置-系统环境变量-PATH

检验：win + R + cmd 打 `javac + 回车`

# 杂七杂八
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
.substring(start, end+1) // return substring
.length()
.equal(另一个string) //比较内容
.concat(string) //链接
strim() //  移除前后空格
```
![](/images/Java_![alt%20text](image-1.png).png)

## StringBuffer Class
mutable
```Java
StringBuffer stringbuffer = new StringBuffer(word);

.append(data);
.reverse();
.toString();
```

# Lab1 

## Variable & Literal
```Java
// 先声明class
int x = 1
int x 
x = 1
// final=constant不可修改
final int x = 1
```


## 变量类型：Ptimitive Data Type
存储数据本身：`byte short int long double float boolean char`

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
除了primitive type 都是 reference type，存储 address。只有reference type 可被调用method，primitive type 不能用 method
- array class enumeration（代表一组 constants 的 class）
```Java
className variableName = new createClassObject(参数)

String s1 = new String("candide");
String s2 = s1.replace('d', 'p'); // 创建了新的string

enum Level{
    LOW,
    MEDIUM,
    HIGH
};
Level myVar = Level.MEDIUM;
```

- Reference Type：数量无限，memory里是地址，赋值时多个变量指向同一个对象（地址）
- Primitive Type：数量有限，memory里是数据，赋值时创建副本

## 类型转换
### Implicit
小 - 大：直接换
```Java
double d = 4.9;
int i = 10;
double d1, d2;

d1 = i; // d1=10.0
d2 = (double) i;
```

### explicit
大 - 小：加（类型）
```Java
double d = 4.9;
int i = 10;
int i2= (int) d;
```

## Console Output
### printf() & printIn()
```Java
System.out.printf(模板 [值，值，值]);
System.out.printf("%.2f...%.3f..", num1, num2)
System.out.println("")// 自动换行
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
        System.out.printIn("hello");
    }
}
//system: class
//out: object
// printIn: method
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

// initialization 声明并初始化控制变量
// loopContinuationCondition 每次循环前判断，为 false 则结束 |
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

⚠️ **重要坑点**
- `while`/`do-while`：continue **直接跳到条件判断**，如果 `i++` 写在 continue **之后**，则**永远不会执行** → 死循环！

```java
// 正确写法（for 不会死循环）
for (; i < 4; i++) {
    if (i == 2) continue;
    System.out.print(i);
}

// 危险写法（while 会死循环！）
while (j < 4) {
    if (j == 2) continue;   // j==2时跳过下面的 j++，死循环
    System.out.print(j);
    j++;
}
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

## 1. 简介

- **实例方法 (Instance Method)**：作用于具体对象，通过 `对象引用.方法名()` 调用

- 每个方法只做**一件事**，方法名要能表达这件事

## 2. 方法调用的三种形式
| 形式 | 语法 | 示例 |
|---|---|---|
| 调用本类方法 | `methodName(参数)` | `max_of_2(a, b)` |
| 调用对象的方法 | `对象.methodName(参数)` | `s1.toUpperCase()` |
| 调用类的静态方法 | `类名.methodName(参数)` | `Math.min(10, 2)` |

## 3. 静态方法 (Static Methods)
- **不依赖任何对象的状态**，属于整个类
- 通过 `类名.方法名()` 直接调用，**不需要创建对象**


- 为什么 main 是 static？JVM 启动时要调用 `main`，但此时还没有创建任何对象。`static` 让 JVM **不用创建对象**就能调用 main
（若漏写 `static`：**编译通过，但运行报错**）

## 4. 声明 Methods
```java
public static 返回类型 方法名(参数列表) {
    // 方法体
    return 表达式;   // 有返回值时
}
```
- **修饰符**：`public`（可被其他类调用）、`static`（无需对象即可调用）
- **返回类型**：`void` 表示无返回值
- **参数**：局部变量，只在方法体内有效
- **返回**的三种方式：
  1. 无返回值 → 执行到 `}` 或遇到 `return;`
  2. 有返回值 → `return 表达式;`，先算表达式再返回


## 5. 方法调用栈 (Method-Call Stack)
- 每次调用方法会压入一个 **(Activation Record)**，包含：返回地址，参数，局部变量
- **LIFO（后进先出）**：调用顺序 A→B→C，返回顺序 C→B→A
- 方法返回后，其栈帧被弹出，局部变量随之消失

## 6. 作用域 (Scope) 规则
| 声明类型 | 作用域 |
|---|---|
| `for` 循环头中声明的变量 | 仅在循环体和循环头内有效 |
| 局部变量 | 从声明处到所在**代码块**结束 |
| 参数 | 整个方法体 |
| 字段 (field) | 整个类的所有方法 |

- ⚠️ 同一方法内**不能**重复声明同名局部变量/参数（编译错误）
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
- 同一个类中可以有**同名方法**，只要**参数列表不同**（个数/类型/顺序）
- **方法签名 = 方法名 + 参数列表**（不含返回类型！）
- ❌ **返回类型不同、签名相同** → 编译错误
- ❌ 参数**顺序不同但类型集合相同**（如 `(int,double)` vs `(double,int)`）易导致**调用歧义 (ambiguous)**

```java
public static void aMethod() { }
public static void aMethod(int x, String y, boolean z) { }
public static void aMethod(String y, int x, boolean z) { }  // ✅ 合法：签名不同
```

### 参数提升 (Argument Promotion)
- 调用时若无精确匹配，编译器会**向"更宽"的类型自动转换**（只能升级，不能降级）：
```
byte/char → short/int → int → long → float → double
```
- 提升方向唯一时才自动选择；若产生**多个可能** → 编译错误 "reference is ambiguous"

```java
public static void m1(double a) { }
public static void m1(short a) { }
m1(20);   // 调用 m1(double)，因为 int 不能自动转 short
```



