# セクション4:継承とコンストラクタ

## 自分用メモ


### 継承とコンストラクタについて
- 継承ではコンストラクタは継承しない
- サブクラスのコンストラクタは最初にスーパークラスのコンストラクタを呼び出す必要がある
- クラスBがクラスAを継承していてクラスBのインスタンスを作成するときの処理の流れ
    1. クラスBのコンストラクタ呼び出し
    1. クラスAのコンストラクタ呼び出し
    1. クラスA部分の初期化
    1. クラスB部分の初期化

### super()
- コンストラクタの最初に必ず呼び出す
- 記述しないと暗黙的に引数なしのsuper()が呼び出される
- this()と併用不可
    - this()で参照したコンストラクタがsuper()を呼び出しているという関係