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

git 不记录 binary file, PDF, .JPG, .PNG, .log, .lib

---



## 7. GitHub 功能

### GitHub Issues
- `# + issueNumber` 可以引用过去issue
- 提交信息中写 `Fixes #12` 可自动关联并在合并时关闭该 issue

### GitHub Project
记录本


## 9. 团队协作模式图解

每个人：clone 项目 → 本地修改 → commit → push 到共享的远程仓库

## PYTHON
```python
// 打包并导出环境
pip freeze > requirements.txt

// 下载环境
pip install -r requirements.txt
```

