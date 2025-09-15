package jp.co.diworks.action;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		List<String>list = new ArrayList<String>();
		
		//値の記憶はaddメゾッドを利用
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//値の取得1
		for (int i = 0; i < list.size(); i++) {
			//値の取得はgetメゾッドを利用
			System.out.println(list.get(i));
			//→Listを使った場合はget()で要素を取得できる
		}
		
		//値の取得2
		for (String s :list) {
			System.out.println(s);
			//Listを使った場合には拡張for文でも要素を取得できる
			//list内の要素を都度「s」に記憶して、これを画面表示している
		}
	}
}


