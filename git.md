# 想对哪个文件夹操作就先`cd 文件名`到对应路径
# Linux

# 初始化/连接远程：

- `git init`初始化本地仓库
- `git clone` 链接克隆远程仓库到本地
- `git remote add origin 仓库链接`链接连接远程仓库

# 查看状态：

- `git status`查看哪些文件被修改了
- `git log`查看提交历史
- `git branch`查看所有分支

# 基本操作（每天都用）：

- `git add .`把所有改动加入暂存区
- `git add 文件名`只加某个文件
- `git commit -m "说明"`提交，说明写改了什么
- `git push`推送到 GitHub
- `git pull`从 GitHub 拉取最新代码

# 分支操作：
- `git branch 分支名`创建新分支
- `git checkout 分支名`切换分支
- `git checkout -b 分支名`创建并切换
- `git merge 分支名`合并分支
- `git branch -m 新名字`改当前分支名
- `git branch -d 分支名`删除分支

# 撤销操作：
- `git restore 文件名`撤销文件的修改
- `git reset HEAD~1`撤销上一次提交（保留代码）

## 实战示例

**本地创建 并提交仓库：**
```bash
//本地创建空仓库
mkdir MyGameRepo
cd MyGameRepo
git init

//链接GITHUB和本地仓库
git remote add origin https://github.com/你的用户名/MyGameRepo.git
git add README
git commit -m "commit of README file"

//push到GITHUB，-u相当于set-upstream
git push -u origin main     
```

**克隆已有仓库：**
```bash
git clone https://github.com/user/repo-name
```
**Fork 与 Pull Request**

1. **Fork** 原仓库到自己账号下
2. **Clone** 到本地
3. 本地开发、修改（Contribute）
4. **Push** 到自己的远程仓库
5. 提交 **Pull Request** 通知原作者
6. 原作者审核通过后 **Merge** 合并你的改动

---


