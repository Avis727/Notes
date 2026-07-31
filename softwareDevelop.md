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

# Domain Modeling

## 1. 领域建模 (Domain Modeling)

- **作用**：把需求翻译成软件组件
  - **分析 (Analysis)**：定义系统及其需求
  - **设计 (Design)**：基于需求推导出概念设计
- 提供系统的**static structure**：classes？fields (variables)) & methods？class interrelated / interacted
- 核心：捕捉主要**业务实体 (entities)** 及其**关系 (relationships)**

---

## 2. UML (Unified Modeling Language)

- **UML (Unified Modeling Language)**：软件蓝图的标准表示法


### UML 图分类
- **结构图 (Structural)**：Class、Object、Component、Package、Deployment、Composite Structure、Profile
- **行为图 (Behavioral)**：Use Case、Activity、State Machine、Interaction（Sequence、Communication、Timing、Interaction Overview）

---

## 3. Class Diagrams 组成部分

### 结构元素
| 元素 | 内容 |
|---|---|
| 类 (Class) | 类名 / 属性 / 方法 |
| 接口 (Interface) | 协议（name+MethodName） |
| 包 (Package) | 文件夹图标 |

### Access Modifiers
| 修饰符 | 符号 | Class | Package | Subclass | Global |
|---|---|---|---|---|---|
| public | `+` | ✅ | ✅ | ✅ | ✅ |
| protected | `#` | ✅ | ✅ | ✅ | ❌ |
| default | `~` | ✅ | ✅ | ❌ | ❌ |
| private | `-` | ✅ | ❌ | ❌ | ❌ |

### 关系类型

- **继承 (Inheritance/Generalization)** ——>：class之间
- **实现 (Realization/Implementation)** ---->：class→interface
- **依赖 (Dependency)**----："临时使用"，实现细节
- **关联 (Association)**——：对象间动态使用关系，默认双向
- **聚合 (Aggregation)** ——<>："is part of"整体消失部分仍可存在
- **组合 (Composition)**——<|>："is entirely made of"，随整体消亡

![](/images/softwareDevelop_2026-07-31-01-06-11.png)
---

## 4. 类的识别（从需求 User Story）

- **名词 (Nouns)** → **class, object, fields**
- **动词 (Verbs)** → **methods**



---

## 5. 关系在代码中的实现




### 关联的修饰
- **Name**：通常是动词/动词短语，标注在关联线上（如 "owns", "registers"）
- **角色 (Role)**：通常是名词/名词短语，标注在关联端点（如 "registeredKeeper"）
- **多重性 (Multiplicity)**：标注参与对象数量

| 含义 | 记法 |
|---|---|
| 恰好一个 | `1` |
| 零或一个 | `0..1` |
| 多个（零或多个） | `*` 或 `0..*` |
| 一个或多个 | `1..*` |
| 指定范围 | `2..4` |

---




