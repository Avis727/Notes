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
# Lab03 Loop

## 1. 循环结构总览

| 循环类型 | 执行次数 | 特点 |
|---|---|---|
| `while` | 0 次或多次 | 先判断条件，再执行 |
| `for` | 0 次或多次 | 计数控制，单行写初始化/条件/步进 |
| `do...while` | **至少 1 次** | 先执行一次，再判断条件 |

---

## 2. while 语句

```java
while (condition) {
    statement;
}
```
- 条件一开始为 `false` → 循环体**一次都不执行**。

### 哨兵控制循环（Sentinel-Controlled）
- 用于**不知道要重复多少次**的情况（如用户输入直到输入 -1 为止）。
- 逻辑：**循环前先读一次，循环体末尾再读一次**。

```java
System.out.print("Enter grade or -1 to quit: ");
int grade = input.nextInt();

while (grade != -1) {
    total += grade;
    gradeCounter += 1;
    System.out.print("Enter grade or -1 to quit: ");
    grade = input.nextInt();   // 循环体末尾再次输入
}
```

---

## 3. for 语句（计数控制循环）

```java
for (initialization; loopContinuationCondition; increment)
    statement;
```

| 部分 | 作用 |
|---|---|
| `initialization` | 声明并初始化控制变量（只在 for 内可见） |
| `loopContinuationCondition` | 每次循环前判断，为 false 则结束 |
| `increment` | 每次循环体执行完后运行 |

⚠️ **注意点**
- 两个分号 `;` 必须写，三个表达式都可省略。
- 省略 `loopContinuationCondition` → **死循环**。
- 初始化/步进可用逗号分隔多个表达式：
  ```java
  for (; number <= 20; total += number, number += 2)
      ; // 空语句
  ```
- 步进可以是负数（递减循环）。
- for 与等价 while 的转换：
  ```java
  initialization;
  while (loopContinuationCondition) {
      statement;
      increment;
  }
  ```
- **经验法则**：for → 计数控制；while → 哨兵控制。

---

## 4. do...while 语句

```java
do {
    statement;
} while (condition);
```
- **先执行一次循环体**，再判断条件。
- 常见坑：
  ```java
  int counter = 100;
  do {
      System.out.print(counter);
      counter++;
  } while (counter <= 10);   // 条件一开始就 false，但已经执行了一次！
  ```

---

## 5. 分支/跳转语句

### break
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

### continue
- **跳过本次剩余的循环体**，直接进入下一次迭代判断。

```java
for (count = 1; count <= 10; count++) {
    if (count == 5)
        continue;   // 跳过打印5，继续循环
    System.out.print(count);
}
// 输出: 1 2 3 4 6 7 8 9 10
```

⚠️ **for vs while 中 continue 的区别（重要坑点）**
- `for`：continue 后仍会执行 `increment`，再判断条件。
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

## 6. 嵌套循环 + break

- `break` 只终止**最内层**循环。

```java
for (int i = 0; i < row; i++) {
    for (int j = 0; j < row; j++) {
        if (i + j >= row)
            break;          // 只跳出内层 for
        System.out.print("*");
    }
    System.out.println();
}
```

---

## 7. 随机数

### SecureRandom（一般程序推荐）
```java
import java.security.SecureRandom;

SecureRandom randomNumbers = new SecureRandom();
randomNumbers.nextInt(6);   // 返回 0~5（不含6）
```

### Random（CodeRunner 环境中必须用这个）
```java
import java.util.Random;

Random randObj = new Random(30);  // 30 是种子，结果可重复
randObj.nextInt(10);  // 返回 0~9
```

| 类 | 特点 |
|---|---|
| `SecureRandom` | 不可预测（真随机），用于实际项目 |
| `Random` | 可用种子重现相同序列，**CodeRunner 判题用这个** |

### 缩放与偏移（Scaling & Shifting）
```java
number = shiftingValue + randomNumbers.nextInt(scalingFactor);
```
- `scalingFactor`：范围内数字的个数
- `shiftingValue`：范围起始值

例：模拟骰子（1~6）
```java
int dice = 1 + randomNumbers.nextInt(6); // 1~6
```

---

## 8. 易错点速记

| 场景 | 结果 |
|---|---|
| `while (x < 100); { x += 10; }` （注意多余的 `;`） | while 视为空循环体，死循环；后面 `{}` 只执行一次 |
| `do{...} while(cond);` 条件初始为 false | 循环体仍**执行一次** |
| `for` 省略 continuation condition | 死循环 |
| while/do-while 中 `i++` 写在 `continue` 之后 | 死循环 |
| `break` vs `continue` | break=退出循环；continue=跳到下一次迭代 |
