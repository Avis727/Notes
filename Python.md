## PYTHON
```python
// 打包并导出环境
pip freeze > requirements.txt

// 下载环境
pip install -r requirements.txt
```

## 🐍 PyTest 自动化测试

### 命名规则（自动发现测试）
- **test suite**：文件名 `test_name.py`
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

@pytest.fixture # CONSTRUCTR
def new_list():
    return list()

def test_append(new_list):
    new_list.append('Hi')
    assert 'Hi' in new_list
    assert len(new_list) == 1

def test_len(new_list):
    assert len(new_list) == 0   # 每次测试拿到的都是全新对象
```

- 如果 fixture 用的是模块级共享对象如 `the_list = list()`，要用 `yield` + `the_list.clear()`