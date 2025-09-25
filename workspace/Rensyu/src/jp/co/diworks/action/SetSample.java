package jp.co.diworks.action;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<String>set = new HashSet<String>();
		
		//値のセットはaddメゾッドを利用
		//Set
		set.add("value1");
		set.add("value2");
		set.add("value3");
		set.add("value4");
		set.add("value5");
		
		//重複要素をaddしてみる
		set.add("value2");
		
		//拡張for文を利用
		//Setを使った場合には、拡張for文で要素を取得できる。
		//set内の要素を都度sに記憶して、これを画面表示している
		for(String s : set) {
			System.out.println(s);
		}

	}

}
