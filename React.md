# 初始化
- 下载 Node.js

Component：一段可重用的代码，它代表用户界面的一部分
```JavaScript
function ...(){
}
```

Property：传给组件的数据叫 Props（Properties的缩写）
```JavaScript
<Profile name="小明" age={18} />
```

`onSomething` 代表 events

`handleSomething` 代表 function which handle those events

# 运行步骤
```JavaScript
npm install

npm run
npm start //开启本地服务器
```
# 文件结构
- app.js：React组件，负责页面长什么样
- style.css
- index.js：入口文件。把app变成HTML并挂到浏览器

# 关键字和语法
`export`：使得该函数可以在当前文件之外访问。

`default`：告诉其他使用您代码的文件，此函数是您文件中的主要函数。

`<>`和 `</>`：使用Fragment来包裹多个相邻的 JSX 元素。React 组件需要返回单个 JSX 元素，而不是多个相邻的 JSX 元素
```JavaScript
export default function Square() {
  return (
    <>
      <button className="square">X</button>
      <button className="square">X</button>
    </>
  );
}
```

# 各类文件后缀
- TypeScript：比JavaScript多了Type
- JSX： JavaScript 代码{}和 HTML 标签<>的组合
- .tsx = TypeScript + JSX
- .ts：普通TypeScript
- .js：普通JavaScript
- .jsx：JavaScript + JSX

# React 开发者工具
React开发者工具可以让你检查React组件的props和状态。它有Chrome、Firefox和Edge浏览器扩展程序版本。