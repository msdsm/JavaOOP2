# セクション8;インタフェース

## 自分用メモ
### インターフェース
- 抽象メソッドのシグネチャを定義
    - インターフェースを使用するクラスはそのメソッドをOverrideして内容実装する必要がある
- 一つのクラスで複数のインターフェースを実装できる
    - スーパークラスは1つである必要がある(単一継承)
    - 一方でインターフェースは多重実装
- 抽象メソッド、定数、defaultメソッド、staticメソッドを定義できる
```java
アクセス修飾子 interface インターフェース名{
    戻り値の型 抽象メソッド名(型 引数,...);
}
```
- interfaceでは抽象メソッドにabstractつける必要なし
- 抽象メソッドのアクセス修飾子はつけなければ勝手にpublicになる
- 実装する側は以下
```java
アクセス修飾子 class クラス名 implements インタフェース名, インタフェース名2,...{
    (抽象メソッドのOverride必須)
}
```
- 利用する際は以下のようにできる
```java
インタフェース型 a = new 実装クラス()
```

- a.メソッド()で実装クラスのメソッドが実行される
    - そのためポリモフィズムをみたせる
    - `A[i] = (インタフェース名) 実装クラス変数`のように
### instanceof
- `実装クラス変数名 instanceof インタフェース名`でそのクラスが対象のインタフェースを実装しているかcheckできる

### クラス図
- `<<Interface>> インタフェース名(斜体)`と記述
    - `<<>>`をステレオタイプという

### Eclipseでのinterface作成方法
- ファイル->新規->インターフェース