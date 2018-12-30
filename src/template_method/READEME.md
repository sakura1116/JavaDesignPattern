### 抽象クラスの意義

抽象クラスはインスタンスを作ることができません。
抽象クラスを初めて学ぶとき、「インスタンスをつくれないクラスなどなんの役に立つのだろう」という疑問を持つ人もいます。しかしこの章で学んだTemplateMethodパターンを理解すれば、その疑問は少し解消するでしょう。
抽象メソッドにはメソッド本体が書かれていないので、具体的な処理内容はわかりません、しかし、メソッドの名前を記述することはできるのです。実際の処理内容はサブクラスまで行かななければきまりませんが、抽象クラスの段階で処理の流れを形作ることは大切なことです。
