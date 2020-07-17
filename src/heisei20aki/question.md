次の Java プログラムの説明を読んで，設問に答えよ。

〔プログラムの説明〕

クラス PhoneBook は電話帳を表すクラスである。名前と電話番号を格納することができる。

PhoneBook のメソッドは，次のとおりである。ここで，引数 recordNumber は行番号， name は名前， phoneNumber は電話番号を表す。

`public void set(int recordNumber, String name, String phoneNumber)`

電話帳に名前と電話番号を登録する。このメソッドを複数回呼ぶことによって， 名前と電話番号を格納できる。

`public void remove(int recordNumber)`

引数に指定した行番号の名前と電話番号を削除する。

`public static void main(String[] args)`

テスト用のプログラムである。実行結果を以下に示す。

```
山形太郎 0236661234
null null
天童よしみ 08011112345
null null
null null
-------------------------
null null
null null
天童よしみ 08011112345
null null
null null
```
