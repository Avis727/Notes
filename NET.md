# CREATE.NET PROJECT
## 步骤
- Command Palette: Ctrl+Shift+P 
- type ".NET" 
- .NET: New Project + ASP.NET Core Empty project 

## file 及其用处
- .sln
多项目容器：构建信息 设置。。。

- obj folder
中间文件（编译文件）。最终输出放在bin

- Properties/launchSettings.json file
启动配置数据：端口号

applicationUrl：指定root url

- The Program.cs file
入口文件

作用：
- Host configuration: Configures the host + setting up web server.
- Service registration: Adds services （database contexts, logging, specialized services for specific frameworks）.
- Middleware pipeline configuration
- Environment configuration: Sets up environment-specific settings for development, staging, and production.


```
var builder = WebApplication.CreateBuilder(args);
var app = builder.Build();

app.MapGet("/", () => "Hello World!");

app.Run();
```



