# 初始化
- 下载 Node.js

Component：组件是一段可重用的代码，它代表用户界面的一部分。组件用于渲染、管理和更新应用程序中的 UI 元素。


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
- JSX： JavaScript 代码和 HTML 标签的组合
- .tsx = TypeScript + JSX
- .ts：普通TypeScript
- .js：普通JavaScript
- .jsx：JavaScript + JSX