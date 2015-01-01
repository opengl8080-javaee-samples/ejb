ejb
===

#ステートフルセッションBean のパッシブ化動作確認方法
1. GlassFish を起動する。
1. Web ブラウザで `http://localhost:8080/ejb/sfsb-passivate` を**2回以上**開く。
1. [Apache JMeter](http://jmeter.apache.org/) で `sfsb-passivate.jmx` を開き、実行する。
    - この時点で、最初の頃に作成された SFSB がパッシブ化されるはず（コンソールに出力されるのを確認する）。
    - パッシブ化されない場合は、 JMeter の「スレッド数」を絞ってパッシブ化するまで実行する。
1. 最初に開いた Web ブラウザを F5 で更新する。
    - この時点で、 `NoSuchEJBException` がスローされるはず。
