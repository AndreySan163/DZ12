import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        addToArrayList();
        addToLinkedList();
        addingElements();
        searchElemen();
        deletingElement();
    }

    public static void addToArrayList() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < 500_000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000_000; // Преобразовать в миллисекунды
        System.out.println("Добавление 500 000 элементов в ArrayList заняло " + duration + " ms");
    }

    public static void addToLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < 500000; i++) {
            linkedList.add(i);
        }
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000; // Преобразовать в миллисекунды
        System.out.println("Добавление 500 000 элементов в LinkedList заняло " + duration + " ms");
    }

    public static void addingElements() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int targetElement = 250000;

        // Добавление элементов в LinkedList
        long startTime = System.nanoTime();
        linkedList.add(targetElement);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Преобразовать в миллисекунды
        System.out.println("Добавление элемента в LinkedList заняло " + duration + " ms");

        // Добавление элементов в ArrayList
        startTime = System.nanoTime();
        arrayList.add(targetElement);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Преобразовать в миллисекунды
        System.out.println("Добавление элемента в ArrayList заняло " + duration + " ms");

        // Добавление элементов в TreeSet
        startTime = System.nanoTime();
        treeSet.add(targetElement);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Преобразовать в миллисекунды
        System.out.println("Добавление элемента в TreeSet заняло " + duration + " ms");

        // Добавление элементов в HashSet
        startTime = System.nanoTime();
        hashSet.add(targetElement);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Преобразовать в миллисекунды
        System.out.println("Добавление элемента в HashSet заняло " + duration + " ms");
    }

    public static void searchElemen() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int targetElement = 250000;

        // Поиск элемента в LinkedList
        long startTime = System.nanoTime();
        linkedList.contains(targetElement);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Преобразовать в миллисекунды
        System.out.println("Поиск элемента в LinkedList занял " + duration + " ms");

        // Поиск элемента в ArrayList
        startTime = System.nanoTime();
        arrayList.contains(targetElement);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Преобразовать в миллисекунды
        System.out.println("Поиск элемента в ArrayList занял " + duration + " ms");

        // Поиск элемента в TreeSet
        startTime = System.nanoTime();
        treeSet.contains(targetElement);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Преобразовать в миллисекунды
        System.out.println("Поиск элемента в TreeSet занял " + duration + " ms");

        // Поиск элемента в HashSet
        startTime = System.nanoTime();
        hashSet.contains(targetElement);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Преобразовать в миллисекунды
        System.out.println("Поиск элемента в HashSet занял " + duration + " ms");
    }

    public static void deletingElement() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int targetElement = 250000;

        // Удаление элемента из LinkedList
        long startTime = System.nanoTime();
        linkedList.remove(targetElement);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Преобразовать в миллисекунды
        System.out.println("Удаление элемента из LinkedList заняло " + duration + " ms");

        // Удаление элемента из ArrayList
        startTime = System.nanoTime();
        arrayList.remove((Integer) targetElement);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Преобразовать в миллисекунды
        System.out.println("Удаление элемента из ArrayList заняло " + duration + " ms");

        // Удаление элемента из TreeSet
        startTime = System.nanoTime();
        treeSet.remove(targetElement);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Преобразовать в миллисекунды
        System.out.println("Удаление элемента из TreeSet заняло " + duration + " ms");

        // Удаление элемента из HashSet
        startTime = System.nanoTime();
        hashSet.remove(targetElement);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000; // Преобразовать в миллисекунды
        System.out.println("Удаление элемента из HashSet заняло " + duration + " ms");
    }
}