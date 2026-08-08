# 必要插件
- open in browser：TechER发布，允许右击HTML文件直接打开网页，省略复制链接过程
- 文件管理器找HTML文件用默认浏览器打开
- 直接在VSCODE里右键 HTML FILE 找“open in default browser”
- 开发人员工具：F12或右键检查

# CSS
## CSS 规则
多个 HTML 页面可以链接到同一 CSS 文件
```html
<head>
  ...
  <link rel="stylesheet" href="main.css">
```


# JAVAScript
使用 HTML 脚本标记 `<script>`（script + TAB），链接到外部 JavaScript 文件

可以将 `<script>`元素放在` <head> `或 `<body>` 中的其他位置。 但是，通过将 `<script>` 元素放在 `<body> `部分的末尾，可以先在屏幕上显示所有页面内容，然后再加载脚本。

## 容错
HTML 文件中的 `<noscript>`：在停用 JavaScript 时显示消息

## 设置严格模式
在 Visual Studio Code 中，打开 app.js 文件并输入以下内容：`'use strict';`

# HTML

## 一，HTML 文档结构（必备骨架）
- ```! + TAB```生成骨架
- 检查 HTML5 代码是否规范：`http://validator.w3.org`


```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>页面标题</title>
</head>
<body>
  内容写这里
</body>
</html>

<!-- 注释内容 -->
```

## 三、Block-level，独占一行

| 标签 | 作用 |
|---|---|
| `<p>` | 段落 |
| `<h1>`~`<h6>` | 标题，1级最大，6级最小 |
| `<ol>` + `<li>` | 有序列表（自动编号） |
| `<ul>` + `<li>` | 无序列表（项目符号） |
| `<dl>` + `<dt>` + `<dd>` | Description：Term + Description |
| `<table>` `<tr>` `<th>` `<td>` | 表格/row/head/data(column) |
| `<div>` | 无语义的分区容器 |

**HTML5 语义化标签**（让结构更清晰）：
`<header>` `<nav>` `<main>` `<article>` `<section>` `<aside>` `<footer>`

## 四、Inline，不换行

| 标签 | 作用 |
|---|---|
| `<a href="url">链接文字</a>` | 超链接，`href` 指定目标地址 |
| `<img src="文件" alt="描述">` | 图片，`alt` 用于加载失败/读屏 |
| `<br>` | break 换行（空标签，无需闭合） |
| `<em>` | 强调（斜体，语义化） |
| `<strong>` | 强调（加粗，语义化） | 
| `<span>` | 行内容器 |


## 五、URL 路径

- **绝对路径**：`http://域名/路径/文件` （协议+主机+路径+文件）
- **相对路径**：`la/main.html` 或 `index.html`（省略前面部分）

## 六、HTML 表单（Forms）

表单是一组接收用户输入并提交给服务器的控件。

```html
<form action="/processform" method="post">
  <label>姓名：</label>
  <input type="text" name="first"><br>
  <input type="date" name="birthday">
  <input type="email" name="email">
  <input type="number" name="offer">
  <input type="range" min="0" max="50" value="10">
  <input type="radio" name="delivery" value="Pickup" checked>自提
  <input type="checkbox" name="day" value="Friday" checked>周五
  <textarea name="detail"></textarea>
  <button type="submit">提交</button>
</form>
```

常见 `<input type="">` 取值：`text` `date` `email` `number` `range` `radio` `checkbox`

---

# CSS 基础

- **CSS（层叠样式表）**：控制网页的外观、布局、排版；HTML 管"是什么"，CSS 管"长什么样"。
- 可以内嵌在 HTML 里，也可以放进独立 `.css` 文件。

## 九、CSS 规则语法

```css
选择器 {
  属性: 值;
  属性: 值;
}
```

示例：
```css
h1 { color: green; }
```
- **选择器（selector）**：作用对象是谁
- **属性（property）**：改什么
- **值（value）**：改成什么

## 十、分组规则

```css
/* 多个选择器共用同一属性 */
h1, h2 { font-weight: bold; }

/* 同一选择器设置多个属性 */
h1 {
  color: green;
  text-align: center;
}
```

## 十一、三种选择器

| 类型 | 语法 | HTML 用法 | 场景 |
|---|---|---|---|
| 元素选择器 | `body { ... }` | 直接对标签生效 | 整体统一样式 |
| 类选择器 | `.className { ... }` | `<p class="className">` | 一类元素（可重复用） |
| ID 选择器 | `#idName { ... }` | `<p id="idName">` | 单个唯一元素 |

> ⚠️ 当多条规则冲突时，**后写的规则优先**（层叠特性）。

## 十二、CSS 注释

```css
/* 这是注释，可跨行 */
```
❌ 不支持 `//` 单行注释，也不支持 HTML 的 `<!-- -->`

## 十三、CSS 三种写法位置（优先级从低到高）

1. 浏览器默认样式
2. **外部样式表**（External）：写在独立 `.css` 文件里
   ```html
   <link rel="stylesheet" href="theme.css" type="text/css">
   ```
3. **内部样式表**（Internal）：写在 `<head>` 里
   ```html
   <style>
     p { color: red; }
   </style>
   ```
4. **内联样式**（Inline）：写在标签属性里，优先级最高
   ```html
   <p style="color: red;">文字</p>
   ```

## 十四、常用 CSS 属性速查

**颜色**
| 属性 | 说明 |
|---|---|
| `color` | 文字颜色 |
| `background-color` | 背景颜色 |

**字体**
| 属性 | 说明 |
|---|---|
| `font-family` | 字体（多词字体名要加引号） |
| `font-size` | 字号 |
| `font-style` | 是否斜体 |
| `font-weight` | 是否加粗 |

**文本**
| 属性 | 说明 |
|---|---|
| `text-align` | 对齐方式 |
| `text-decoration` | 下划线等装饰 |
| `text-indent` | 首行缩进 |
| `line-height` / `word-spacing` / `letter-spacing` | 间距控制 |

**列表**
```css
ol { list-style-type: lower-roman; } /* i, ii, iii... */
```
可选：`none` `disc` `circle` `square` `decimal` `lower-alpha` `upper-alpha` `lower-roman` `upper-roman` 等

**边框**
```css
p {
  border-color: green;
  border-style: double;
  border-width: medium;
}

/* 表格边框常用简写 */
table, tr, td {
  border: 1px solid black;
}
```

