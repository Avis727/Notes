# 我认为不重要但考试可能会考的内容
software & program：instructions + data struction + document

4P:people（建筑者 设计师 测试 支持 用户 受众群体 stakeholder） product(models, source code, executable, doc ) process project

model1:waterfall(linear)：一条线走到黑 无法回退

model2：increment：拆分成小人物，走多次linear

model3：evolutionary：每个步骤间随时交流修改

流程：communication -> plan -> modelling ->
construction -> deployment

# Agile

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
# Testing

## 🔍 单元测试 (Unit Testing)

- 属于 **White Box Testing**：测试者知道内部实现
- 测试对象（Unit）可以是：
  - a method / function
  - complete class（需覆盖所有操作、所有属性的读写、所有可能状态）

### 处理依赖 (Dependencies)
- **Stub**：替代依赖的"假对象"
- **Driver**：调用被测模块的"假调用者"

---

## 🔗 集成测试 (Integration Testing)

- **定义**：测试两个及以上相互依赖的组件组合在一起时是否正常工作
- 核心目标：**测试模块之间的接口**
- Black Box / White Box / Gray Box 
- 需要 stub 和 driver 辅助

---

## 🖥️ 系统测试 (System Testing)
- 针对**完整、已集成的系统**
- 评估**functional（具体功能）**和**non-functional（性能 scale）**

## ✅ 验收测试 (Acceptance Testing)

---

## 🔄 测试驱动开发 TDD (Test-Driven Development)

**Agile 实践**：
```
写测试 → 运行测试(失败) → 写代码让测试通过 → 运行测试 → 测试失败则修bug → 重复
```
**核心思想**：先写测试，再写实现代码

---

## 🐍 PyTest 自动化测试

### 命名规则（自动发现测试）
- **测试套件 (test suite)**：文件名 `test_name.py`
- **测试函数**：`def test_functionName()`

### 基本写法
```python
import pytest

def test_that_passes():
    assert boolExpression

    # 测试是否抛出异常
    with pytest.raises(ErrorName):
      Track(

      )

```
- 运行命令：`pytest test_文件名.py`

### Fixture（夹具）
用 `@pytest.fixture` 提供"初始化"的对象给测试函数：

```python
import pytest

@pytest.fixture
def new_list():
    return list()

def test_append(new_list):
    new_list.append('Hi')
    assert 'Hi' in new_list
    assert len(new_list) == 1

def test_len(new_list):
    assert len(new_list) == 0   # 每次测试拿到的都是全新对象
```

⚠️ **重要原则**：**stateless（无状态）** 一个测试的结果不影响另一个测试。
- 如果 fixture 用的是模块级共享对象（如 `the_list = list()`），要用 `yield` + 清理代码语句`the_list.clear()`

# CS235 Lab 02 速查表 — 领域建模 (Domain Modelling)

## 1. Python 特殊方法（Dunder Methods）

| 方法 | 作用 |
|---|---|
| `__init__(self)` | 构造函数，创建对象时调用 |
| `__repr__(self)` | 返回可自定义的对象“官方”表示 |
| `__str__(self)` | 返回人类可读的字符串（`print()` 调用） |
| `__eq__(self, other)` | 判断两个对象是否相等（`==`） |
| `__hash__(self)` | 返回哈希值（用于 dict/set 的 key） |
| `__lt__(self, other)` | 定义小于号 `<` 的比较逻辑 |

```python
a + b   # 调用 a.__add__(b)
```

---

## 2. 封装（Encapsulation）与属性（Properties）

**封装三要素**
- Getter：读取属性
- Setter：修改属性（可加校验）
- 访问修饰符：控制可见性

**Python 访问修饰符（仅约定，不强制）**

| 写法 | 含义 | 意图 |
|---|---|---|
| `name` | 公开 (Public) | 任何地方都可访问 |
| `_name` | 受保护 (Protected) | 仅类内部及子类使用 |
| `__name` | 私有 (Private) | 不应在类外直接访问（触发名称改写 Name Mangling） |

**@property 用法**：让 `obj.attribute` 语法背后调用方法，比 `obj.get_name()` 更简洁。

```python
# 内部情况
class Student:
    def __init__(self, name, upi):
        self.name = name
        self.upi = upi

    @property (getter)
    def fullname(self):
        return self.name

    @fullname.setter
    def fullname(self, name):
        self.name = name

# 使用
student1.fullname          # 调用 getter
student1.fullname = "Joe"  # 调用 setter
```

⚠️ `__attr`会被 python自动改写为 `_ClassName__attr`，从外部直接用 `obj.__attr` 会报 `AttributeError`
```python
class ExampleMangling:
    def __init__(self):
        self.__secret = "hidden"

e = ExampleMangling()
print(e.__secret)                     # ❌ 报错！AttributeError

print(e._ExampleMangling__secret)     # ✅ 可以，但很丑
# 输出: hidden
```

---

## 3. 类图（Class Diagrams）

类图展示：**类 + 属性 + 方法 + 关系（如多重性 `*`、`1...4`）**


**从图到代码的关键点**
- `__` 开头属性 → 私有，通常用 `@property` 暴露
- `_` 开头属性 → 受保护，可直接读，setter 需校验时才封装
- 领域方法（如 `add_student`, `enroll_course`）内部要做业务规则校验，异常时 `raise` 自定义错误（如 `EnrollmentError`, `CourseFullError`）

---

## 4. 测试驱动开发（TDD）

**核心循环（红-绿循环）**

1. **写一个会失败的测试**（先定义“应该做什么”）
2. **写最少量代码让测试通过**（再实现“怎么做”）
3. 重复，不断迭代，不是一次性的checklist

```
写测试 → 跑测试(失败,红色) → 写实现代码 → 跑测试(通过,绿色) → 下一个问题
```

**写测试前要问的问题（以 Genre 类为例）**
- 这个类需要哪些字段？是否都是必填？
- 什么样的输入是无效的？（校验规则）
- 对象之间的关系是什么？（如某 track 属于哪个 genre）

**保持测试常跑**：改动代码后如果破坏了已测试过的规则，旧测试会立刻失败提醒你（回归测试思想）。

**示例流程**

```python
# 1. 先写测试（此时 Genre 类还不存在/不完整）
import pytest
from model.Genre import Genre

def test_genre_is_created_with_id_and_name():
    genre = Genre(genre_id="G001", name="Pop")
    assert genre.genre_id == "G001"
    assert genre.name == "Pop"
# 运行 -> FAILED: AttributeError

# 2. 实现最简代码使其通过
class Genre:
    def __init__(self, genre_id: str, name: str):
        self.__genre_id = genre_id
        self.__name = name
        self.__tracks = []

    @property
    def genre_id(self):
        return self.__genre_id

    @property
    def name(self):
        return self.__name

    @name.setter
    def name(self, new_name: str):
        if not new_name or not new_name.strip():
            raise ValueError("Genre name cannot be empty")
        self.__name = new_name
# 运行 -> PASSED
```

---

## 5. 本次 Lab 任务：音乐库应用（Music Library）

**业务需求**
- 用户可按 **genre**（流派）浏览 tracks
- 每个 track 含：title, duration, artist, album 等详细信息
- 用户可按 title/artist/album 等搜索 tracks
- 用户可收藏 tracks，并对听过的 tracks 打分/评论

### Task 1 — TDD
- 为 `Track` 类写 **至少 3 个测试**
- 此时应该全部 **失败**（因为 Track 还没实现）
- 完成 Task 2 后应全部 **通过**

### Task 2 — 实现领域模型

**`Track` 类字段**
- Unique ID, Title, Artist, Album, Year
- Composers（列表）, Lyrics, Duration
- Associated Genres, Producers（列表）

**`Genre` 类字段**
- Unique ID, Name, 关联的 tracks 列表

关系：`Track` *——* `Genre`（多对多）

**使用领域模型（演示流程）**
1. 创建若干 tracks，打印
2. 创建两个 genres，打印
3. 把 tracks 加入对应 genre，打印每个 genre 及其关联的 tracks

---

## 6. 速记要点 Checklist

- [ ] `__init__` 初始化所有属性
- [ ] 私有属性用 `__`，受保护用 `_`，配合 `@property` 暴露
- [ ] 需要校验的属性写 `@x.setter` 并 `raise ValueError`
- [ ] 实现 `__str__` / `__eq__`（必要时 `__hash__`, `__repr__`）
- [ ] 领域方法中做业务规则校验，违反则抛自定义异常
- [ ] 先写测试再写实现（TDD），保持测试集持续运行
- [ ] 多对多关系（如 Track↔Genre）需要双向维护列表



