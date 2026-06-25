# CREATE.NET PROJECT
## .NET指令
```
dotnet --help：查看所有命令
dotnet add package 包名：安装包。已安装的包在.csproj
	dotnet tool install 包名：安装全局工具
	dotnet new -i 包名：安装模板
dotnet list package：查看已安装的包（顶层）
	dotnet list package --include-transitive：查看所有以安装的包（包括包依赖的包）
dotnet restore：手动还原依赖包
dotnet remove package 包名：清理掉不用的包
```
## 步骤
- Command Palette: Ctrl+Shift+P 
- type ".NET" 
- .NET: New Project + ASP.NET Core Empty project 

## .NET template file 
### .sln
多项目容器：构建信息 设置。。。
### obj folder
中间文件（编译文件）。最终输出放在bin
### Properties/launchSettings.json 
启动配置数据：端口号

applicationUrl：指定root url

### .csproj
管依赖 版本
### .cs 
入口文件


```
var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

app.MapGet("/", () => "Hello World!");

app.Run();
```
## Run and Debug
### Debug
- F5使用Degubber
- 或者VSCODE最上方选择C#，default debugger

dotnet run和debugger的结果是一样的，但dubugger可以断点和查看变量

### Run
```
dotnet run

# 改代码后自动更新+保存
dotnet watch
```


## 程序运行解析
### Host Setup

WebApplication.CreateBuilder = 启动一个"服务器管理员"，负责把所有东西组装起来

Kestrel = .NET 自带的 Web 服务器，就像一个"门卫"，专门负责接收浏览器发来的请求

### Request 处理

middleware pipeline = 可以理解成"流水线"，请求进来后要经过一道道检查（验证身份？记日志？找路由？）

路由 routing = 判断请求的网址对应哪段代码，比如 / 对应 "Hello World!"

### 响应

找到对应代码后执行，把结果原路返回给浏览器



