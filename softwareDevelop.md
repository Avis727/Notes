# 我认为不重要但考试可能会考的内容
software & program：instructions + data struction + document

4P:people（建筑者 设计师 测试 支持 用户 受众群体 stakeholder） product(models, source code, executable, doc ) process project

model1:waterfall(linear)：一条线走到黑 无法回退

model2：increment：拆分成小人物，走多次linear

model3：evolutionary：每个步骤间随时交流修改

流程：communication -> plan -> modelling ->
construction -> deployment

# Agile
- increment：modules(function)
- iterative：持续feedback
mindset + 4 values + 12 principles + practices (scrum XP custom)

个体和互动	>	流程和工具
可工作的软件	>	详尽的文档
客户合作	>	合同谈判
响应变化	>	遵循计划

8️⃣ 敏捷 12 条原则
- 尽早、持续交付有价值的软件
- 欢迎需求变更（即使在后期）
- 频繁交付可用软件（几周~几月，越短越好）
- 业务人员和开发者每天一起工作
- 以受激励的个体为核心，给予信任和支持
- 面对面沟通是最有效的信息传递方式
- 可工作的软件是进度的主要衡量标准
- 提倡可持续开发，团队应保持稳定节奏
- 持续关注技术卓越和良好设计
- 简单——最大化"未完成工作量"的艺术
- 最好的架构/需求/设计来自自组织团队
- 团队定期反思如何变得更高效
---

# Git & 版本控制系统 

## 2. 版本控制系统（VCS）基本概念
> VCS: Version Control System（Git, Subversion, Mercurial）

> 管理：源代码，文档，脚本，配置文件，media

> gitnore：编译产物，库文件，虚拟环境

**分布式 VCS（如 Git）特点**：
- 每个人的电脑上都有**完整的仓库副本**（含全部历史）
- 每个克隆都是一份完整备份
- 支持分支等灵活工作流

---

## 3. Git 核心概念

**Commit** 
**Branch** 
**Main/Master** 
**Repository (repo)** 

**分支工作流程**：新功能/修复 bug → 新建分支开发 → 测试通过 → 合并回主分支

---

## 4. Git 工作区域（4 个阶段）

```
工作目录  →  暂存区  →  本地仓库  →  远程仓库
Working    Staging    Local        Remote
Directory   Area    Repository   Repository
```
---

## 5. 常用 Git 命令速查

| 命令 | 作用 |
|---|---|
| `git init` | 创建一个新的空仓库 |
| `git clone <url>` | 从远程克隆一个仓库到本地 |
| `git add <文件>` | 把文件加入暂存区 |
| `git commit -m "说明"` | 提交暂存区内容并写提交信息 |
| `git status` | 查看当前状态（分支/改动情况） |
| `git branch` | 查看本地/远程有哪些分支 |
| `git checkout <分支/提交>` | 切换分支或某个历史提交 |
| `git push` | 把本地提交推送到远程仓库 |
| `git fetch` | 下载远程仓库最新数据（不合并） |
| `git merge` | 合并两条开发历史 |
| `git pull` | 拉取远程更新并自动合并 |

---

## 6. 实战示例

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

//push到GITHUB
git push -u origin main     
```

**克隆已有仓库：**
```bash
git clone https://github.com/user/repo-name
```

---

## 7. GitHub 是什么？

### GitHub Issues
- `# + issueNumber` 可以引用过去issue
- 提交信息中写 `Fixes #12` 可自动关联并在合并时关闭该 issue

---

## 8. Fork 与 Pull Request（开源协作流程）

常用于给别人的开源项目贡献代码：

1. **Fork** 原仓库到自己账号下
2. **Clone** 到本地
3. 本地开发、修改（Contribute）
4. **Push** 到自己的远程仓库
5. 提交 **Pull Request** 通知原作者
6. 原作者审核通过后 **Merge** 合并你的改动

---

## 9. 团队协作模式图解

每个人：clone 项目 → 本地修改 → commit → push 到共享的远程仓库

