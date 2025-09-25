package jp.co.diworks.action;

import java.util.HashMap;
import java.util.Map;

public class MapSmple {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String,String> map = new HashMap<String,String>();
		
		//値のセットはputメゾッドを利用
		//Mapを使った場合には、put()で要素を記憶できる
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		
		//値の取得
		//Mapを使った場合には、get()で要素を取得できる
		String value = map.get("key1"); //value1が取得できる
		System.out.println(value);
				
		//存在しないkeyの場合はnull
		String valueNull = map.get("key6");
		System.out.println(valueNull);
				
		//mapに該当するkeyが存在するか否かチェックすることも可能
		if(map.containsKey("key1")) {
			System.out.println("key1は存在します");
		}else {
			System.out.println("key1は存在しません");
		}
		
		
		//拡張for文を利用してすべて情報を取得する
		//拡張for文：「map.entrySet()」に要素が記憶されている。
		//↳これを「Map.Entry<String,String>」で取得できる様にしている
		//拡張for文を使って取得したものは都度(ループ毎に)「e」に記憶される
		//e.gerKey()とするとキーが、e.getValue()とすると要素が取得できる
		for(Map.Entry<String,String> e : map.entrySet()) {
			System.out.println(e.getKey()+ " : " + e.getValue());
		}

	}

}
