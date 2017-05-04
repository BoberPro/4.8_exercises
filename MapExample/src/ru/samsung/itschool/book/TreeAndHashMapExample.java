package ru.samsung.itschool.book;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeAndHashMapExample {
	
	private static void testMap(Map<String, String> map) {
        System.out.println(map.getClass());

        // Добавление элементов в ассоциативный массив.
        map.put("Russia", "Moscow");
        map.put("USA", "Washington");
        map.put("France", "Paris");

        // Проход по всем элементам массива.
        System.out.println("All elements:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
        // Быстрый поиск элемента по ключу.
        System.out.println("Russia:");
        System.out.println("Russia -> " + map.get("Russia"));

        // Удаление элемента по ключу.
        map.remove("Russia");

        // Несуществующий элемент обозначается как null.
        System.out.println("Russia after remove:");
        System.out.println("Russia -> " + map.get("Russia"));
        System.out.println();

        System.out.println("New map:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
        // Возвращаем Россию обратно.
        map.put("Russia", "Moscow");
}
	
	public static void main(String[] args) {
		testMap(new HashMap<String, String>());
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        testMap(treeMap);

        // с TreeMap можно брать подмножество по аналогии с treeSet.
        SortedMap<String, String> submap = treeMap.tailMap("Germany");
        System.out.println("Submap:");
        for (Map.Entry<String, String> entry : submap.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

	}

}
