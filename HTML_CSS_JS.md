# 必要插件
- open in browser：TechER发布，可以右击HTML文件直接打开网页，省略复制链接过程


# 打开网站
- 文件管理器找HTML文件用默认浏览器打开
- 直接在VSCODE里右键 HTML FILE 找“open in default browser”

# 浏览器的开发人员工具
F12或右键检查

# HTML
## 添加基本HTML代码
- 在HTML FILE 输入```! + TAB```

# CSS
## CSS 规则
多个 HTML 页面可以链接到同一 CSS 文件
```html
<head>
  ...
  <link rel="stylesheet" href="main.css">
```
语法
```css
.list {              /* 选择器 */
  list-style: square; /* 属性名: 属性值 */
}
```

## 选择器
```.<class_name> ```：class选择器，选择有class="class_name"的HTML元素

```#<id_name> ```：id选择器

```:root``` 选择器表示 HTML 页面中的 所有```<html>``` 元素

# JAVAScript
使用 HTML 脚本标记 `<script>`（script + TAB），链接到外部 JavaScript 文件

可以将 `<script>`元素放在` <head> `或 `<body>` 中的其他位置。 但是，通过将 `<script>` 元素放在 `<body> `部分的末尾，可以先在屏幕上显示所有页面内容，然后再加载脚本。

## 容错
HTML 文件中的 `<noscript>`：在停用 JavaScript 时显示消息

## 设置严格模式
在 Visual Studio Code 中，打开 app.js 文件并输入以下内容：`'use strict';`