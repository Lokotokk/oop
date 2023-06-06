package hmLesson3;

public class Main {
    public static void main(String[] args) {
//       Создать список по аналогии LinkedList (список связанных элементов), реализовать в нем iterable интерфейс.
//       Список должен содержать элементы со ссылкой на следующий элемент
//       (если показалось мало, то реализовать ссылку и на предыдущий элемент)
//       Формат сдачи: ссылка на гитхаб проект.

        LinkedUnits<String> linkedUnits = new LinkedUnits<>();
        linkedUnits.add("str1");
        linkedUnits.add("str2");
        linkedUnits.add("str3");
        linkedUnits.add("str4");
        linkedUnits.add("str5");
        linkedUnits.add("str6");

        System.out.printf("list size: %d\n", linkedUnits.size());

        System.out.println("---for-each---");
        for (LinkedUnits<String> it = linkedUnits; it.hasNext(); ) {
            String value = it.next();
            System.out.println(value);
        }

        System.out.println("---remove-index-3---");
        System.out.println(linkedUnits.remove(3));

        System.out.println("---set-element-index-1--");
        linkedUnits.set("new value", 1);

        System.out.println("---get-elements-by-index---");
        for (int i = 0; i < linkedUnits.size(); i++) {
            System.out.println(linkedUnits.get(i));
        }

        System.out.println("---clear---");
        linkedUnits.clear();
        System.out.printf("list size: %d\n", linkedUnits.size());
    }
}
