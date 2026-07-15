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


