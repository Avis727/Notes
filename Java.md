# 下载 Java（JDK）
注意：JDK=运行+编译，JRE=只运行
- 官网下载最新版
- 配置环境变量（optional）：控制面板-系统-高级系统设置-系统环境变量-PATH

检验：win + R + cmd 打 `javac + 回车`

# Lab1 

## Variable & Literal
```Java
// 先声明类型
int x = 1
int x 
x = 1

// final=constant不可修改
final int x = 1
```

## Key Words
```Java
数据类型：boolean、byte、char、short、int、long、float、double
控制流程：if、else、for、while、do、switch、case、break、continue、return
异常处理：try、catch、finally、throw、throws
访问修饰符：public、private、protected
类/接口相关：class、interface、extends、implements、enum、abstract、final、static
其他修饰符：native、synchronized、transient、volatile、strictfp
特殊字面量：true、false、null
```

## Ptimitive Data Type
- 存储 数据本身
![](/images/Java_2026-07-21-17-53-53.png)

### Integer Data Type
- byte
- short 
- int
- long

不能用，. 0开头

### Floating Point Data Type
- float：单精度 7位小数
- double（默认）：双精度 15位小数
```Java
double d = 12.7;   // 正常
float f = 12.7;    // ❌ 会报错！因为 12.7 默认是 double，不能直接赋值给 float
float f = 12.7f;   // ✅ 需要在数字后面加 f，明确告诉编译器这是 float 类型

double a = 1.2E5; //科学计数法
```

### Boolean & Char Data Type
```Java
true false //小写
'a' //单引号 单字母：char
"hello" // string
```

## Reference Types
除了primitive type 都是 reference type，存储 address。只有reference type 可被调用method，primitive type 不能用 method
- array
- class
- enumeration：代表一组 constants 的 class
```Java
String s1 = new String("candide");
String s2 = s1.replace('d', 'p'); // 创建了新的string

enum Level{
    LOW,
    MEDIUM,
    HIGH
};
Level myVar = Level.MEDIUM;
```

- Reference Type：数量无限，memory里是地址，赋值时多个变量指向同一个对象
- Primitive Type：数量有限，memory里是数据，赋值时创建副本