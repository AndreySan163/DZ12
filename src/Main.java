import java.util.*;

public class Main {
    public static void main(String[] args) {
        int numElements = 500000;

        // Создаем коллекции
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        // Замеряем время добавления в ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListAddTime = endTime - startTime; // Преобразовать в миллисекунды

        // Замеряем время добавления в LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListAddTime = endTime - startTime; // Преобразовать в миллисекунды

        // Замеряем время добавления в HashSet
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            hashSet.add(i);
        }
        endTime = System.nanoTime();
        long hashSetAddTime = endTime - startTime; // Преобразовать в миллисекунды

        // Замеряем время добавления в TreeSet
        startTime = System.nanoTime();
        for (int i = 0; i < numElements; i++) {
            treeSet.add(i);
        }
        endTime = System.nanoTime();
        long treeSetAddTime = endTime - startTime; // Преобразовать в миллисекунды

        System.out.println("Время добавления элементов:");
        System.out.println();
        System.out.println("Добавление элемента в ArrayList заняло " + arrayListAddTime + " ns");
        System.out.println("Добавление элемента в LinkedList заняло " + linkedListAddTime + " ns");
        System.out.println("Добавление элемента в HashSet заняло " + hashSetAddTime + " ns");
        System.out.println("Добавление элемента в TreeSet заняло " + treeSetAddTime + " ns");

        if (arrayListAddTime < linkedListAddTime && arrayListAddTime < hashSetAddTime && arrayListAddTime < treeSetAddTime) {
            System.out.println("ArrayList работает быстрее.");
        } else if (linkedListAddTime < arrayListAddTime && linkedListAddTime < hashSetAddTime && linkedListAddTime < treeSetAddTime) {
            System.out.println("LinkedList работает быстрее.");
        } else if (hashSetAddTime < arrayListAddTime && hashSetAddTime < linkedListAddTime && hashSetAddTime < treeSetAddTime) {
            System.out.println("HashSet работает быстрее.");
        } else if (treeSetAddTime < arrayListAddTime && treeSetAddTime < linkedListAddTime && treeSetAddTime < hashSetAddTime) {
            System.out.println("TreeSet работает быстрее.");
        } else {
            System.out.println("ArrayList, LinkedList, HashSet, TreeSet - имеют одинаковое время выполнения.");
        }
        System.out.println();

        // Замеряем время поиска элемента в ArrayList
        startTime = System.nanoTime();
        arrayList.contains(numElements - 1);
        endTime = System.nanoTime();
        long arrayListSearchTime = endTime - startTime; // Преобразовать в миллисекунды

        // Замеряем время поиска элемента в LinkedList
        startTime = System.nanoTime();
        linkedList.contains(numElements - 1);
        endTime = System.nanoTime();
        long linkedListSearchTime = endTime - startTime; // Преобразовать в миллисекунды

        // Замеряем время поиска элемента в HashSet
        startTime = System.nanoTime();
        hashSet.contains(numElements - 1);
        endTime = System.nanoTime();
        long hashSetSearchTime = endTime - startTime; // Преобразовать в миллисекунды

        // Замеряем время поиска элемента в TreeSet
        startTime = System.nanoTime();
        treeSet.contains(numElements - 1);
        endTime = System.nanoTime();
        long treeSetSearchTime = endTime - startTime; // Преобразовать в миллисекунды

        System.out.println("Время поиска элемента:");
        System.out.println();
        System.out.println("Поиск элемента в ArrayList занял " + arrayListSearchTime + " ns");
        System.out.println("Поиск элемента в LinkedList занял " + linkedListSearchTime + " ns");
        System.out.println("Поиск элемента в HashSet занял " + hashSetSearchTime + " ns");
        System.out.println("Поиск элемента в TreeSet занял " + treeSetSearchTime + " ns");

        if (arrayListSearchTime < linkedListSearchTime && arrayListSearchTime < hashSetSearchTime && arrayListSearchTime < treeSetSearchTime) {
            System.out.println("ArrayList работает быстрее.");
        } else if (linkedListSearchTime < arrayListSearchTime && linkedListSearchTime < hashSetSearchTime && linkedListSearchTime < treeSetSearchTime) {
            System.out.println("LinkedList работает быстрее.");
        } else if (hashSetSearchTime < arrayListSearchTime && hashSetSearchTime < linkedListSearchTime && hashSetSearchTime < treeSetSearchTime) {
            System.out.println("HashSet работает быстрее.");
        } else if (treeSetSearchTime < arrayListSearchTime && treeSetSearchTime < linkedListSearchTime && treeSetSearchTime < hashSetSearchTime) {
            System.out.println("TreeSet работает быстрее.");
        } else {
            System.out.println("ArrayList, LinkedList, HashSet, TreeSet - имеют одинаковое время выполнения.");
        }
        System.out.println();

        // Замеряем время удаления элемента из ArrayList
        startTime = System.nanoTime();
        arrayList.remove(numElements - 1);
        endTime = System.nanoTime();
        long arrayListRemoveTime = endTime - startTime; // Преобразовать в миллисекунды

        // Замеряем время удаления элемента из LinkedList
        startTime = System.nanoTime();
        linkedList.remove(numElements - 1);
        endTime = System.nanoTime();
        long linkedListRemoveTime = endTime - startTime; // Преобразовать в миллисекунды

        // Замеряем время удаления элемента из HashSet
        startTime = System.nanoTime();
        hashSet.remove(numElements - 1);
        endTime = System.nanoTime();
        long hashSetRemoveTime = endTime - startTime; // Преобразовать в миллисекунды

        // Замеряем время удаления элемента из TreeSet
        startTime = System.nanoTime();
        treeSet.remove(numElements - 1);
        endTime = System.nanoTime();
        long treeSetRemoveTime = endTime - startTime; // Преобразовать в миллисекунды

        System.out.println("Время удаления элемента:");
        System.out.println();
        System.out.println("Удаление элемента из ArrayList заняло " + arrayListRemoveTime + " ns");
        System.out.println("Удаление элемента из LinkedList заняло " + linkedListRemoveTime + " ns");
        System.out.println("Удаление элемента из HashSet заняло " + hashSetRemoveTime + " ns");
        System.out.println("Удаление элемента из TreeSet заняло " + treeSetRemoveTime + " ns");

        if (arrayListRemoveTime < linkedListRemoveTime && arrayListRemoveTime < hashSetRemoveTime && arrayListRemoveTime < treeSetRemoveTime) {
            System.out.println("ArrayList работает быстрее.");
        } else if (linkedListRemoveTime < arrayListRemoveTime && linkedListRemoveTime < hashSetRemoveTime && linkedListRemoveTime < treeSetRemoveTime) {
            System.out.println("LinkedList работает быстрее.");
        } else if (hashSetRemoveTime < arrayListRemoveTime && hashSetRemoveTime < linkedListRemoveTime && hashSetRemoveTime < treeSetRemoveTime) {
            System.out.println("HashSet работает быстрее.");
        } else if (treeSetRemoveTime < arrayListRemoveTime && treeSetRemoveTime < linkedListRemoveTime && treeSetRemoveTime < hashSetRemoveTime) {
            System.out.println("TreeSet работает быстрее.");
        } else {
            System.out.println("ArrayList, LinkedList, HashSet, TreeSet - имеют одинаковое время выполнения.");
        }
    }
}