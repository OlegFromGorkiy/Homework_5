public class Main {
    public static void main(String[] args) {
        int i = 2;
        do {
            task_1();
            task_2();
            task_3();
            task_4();
            task_5();
            i++;
        } while (i <= 2);
    }

    public static void task_1() {
        /*
        Представим, что мы работаем в банке. У нашего банка есть сайт, на который можно зайти с компьютера или телефона,
        а также мобильное приложение. И нам, и клиенту удобнее с телефона пользоваться мобильным приложением.
        Поэтому каждый раз, когда пользователь заходит на сайт с телефона, мы должны выдавать ему ссылку
        на скачивание приложения. Но мы не знаем, iOS или Android он использует. Напишите программу, которая определяет,
        чем пользуется клиент (iOS или Android), и выдает соответствующее сообщение для обоих вариантов.
        Объявите переменную clientOS, которая равна 0 или 1. (0 — iOS, 1 — Android)
        При отработке программы в консоли должно выдаваться сообщение об установке соответствующего приложения.
        Например, для iOS оно будет звучать так:
        «Установите версию приложения для iOS по ссылке».
        А для Android так:
        «Установите версию приложения для Android по ссылке».
        **Критерии оценки**
            – Программа написана корректно и выдает правильный результат
            – Все условия задания соблюдены
            – Соблюдены правила названия переменных и пунктуация
            – Переменные инициализированы корректно.
         */
        System.out.println("Задание 1");
        int clientOS = (int) Math.round(Math.random());
        if (clientOS == 0) System.out.println("Установите версию приложения для iOS по ссылке");
        else System.out.println("Установите версию приложения для Android по ссылке");
        System.out.println("***\n");
    }

    public static void task_2() {
        /*
        К нам пришли коллеги и сообщили, что нам нужно знать не только операционную систему телефона,
        но и год его создания: от этого зависит, подойдет ли приложение для телефона или оно просто не установится.
        Если телефон произведен с 2015 по нынешний год, то приложение будет работать корректно.
        Если телефон произведен ранее 2015 года, то клиенту нужно посоветовать установить облегченную версию приложения.
        Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту при наличии двух условий
        — операционной системы телефона (iOS или Android) и года производства.
        Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об облегченной версии.
        Например, для iOS оно будет звучать так: «Установите облегченную версию приложения для iOS по ссылке».
        А для Android так:"«Установите облегченную версию приложения для Android по ссылке».
        При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение
        об установке приложения. Для обозначения года создания используйте переменную clientDeviceYear,
        где необходимо указать 2015 год.
        **Важно**: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
        **Критерии оценки**
            – Программа выполняет все условия задачи
            – Код написан без вложенностей
            – Соблюдены правила названия переменных и пунктуация
            – В консоль выводится корректная фраза в зависимости от условий задачи
         */
        System.out.println("Задание 2");
        int clientOS = (int) Math.round(Math.random());
        int modelYear = (int) (2007 + 15 * Math.random());
//        System.out.println(clientOS);
//        System.out.println(modelYear);
        if (clientOS == 0) {
            if (modelYear >= 2015) System.out.println("Установите стандартную версию приложения для iOS по ссылке");
            else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (modelYear >= 2015)
            System.out.println("Установите стандартную версию приложения для Android по ссылке");
        else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        System.out.println("***\n");
    }

    public static void task_3() {
        /*
        Напишите программу, которая определяет, является ли год високосным или нет.
        Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
        Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
        « …. год является високосным» или «... год не является високосным».
        Небольшая справка: високосным является каждый четвертый год, но не является каждый сотый. Также високосным является каждый четырехсотый год.

        **Критерии оценки:**
            – Код работает корректно, при изменении значения переменной выдает верное значение
            – В консоль выводится корректная фраза при изменении условий задачи
            – Соблюдены правила названия переменных и пунктуация.
         */
        System.out.println("Задание 3");
        int year = (int) (2022 * Math.random());
        boolean cndtn1 = year % 4 == 0;
        boolean cndtn2 = year % 100 != 0;
        boolean cndtn3 = year % 400 == 0;
        if ((cndtn1 && cndtn2) || cndtn3) System.out.printf("%d год является високосным.%n", year);
        else System.out.printf("%d год не является високосным.%n", year);
        System.out.println("***\n");
    }

    public static void task_4() {
        /*
        Вернемся к делам банковским. У нас хороший банк, поэтому для наших клиентов мы организуем доставку
        банковских карт на дом с четкой датой доставки. Чтобы известить клиента о том, когда будет доставлена
        его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
        Правила доставки такие:
        Доставка в пределах 20 км занимает сутки.
        Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        Напишите программу, которая выдает сообщение в консоль:
        "Потребуется дней: " + срок доставки
        Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
            – Программа написана корректно, выдает верный результат при изменении значения переменной
            – При изменении значения переменной с расстоянием, фраза, выведенная в консоль, корректируется
            – Правила синтаксиса и пунктуации соблюдены.
         */
        System.out.println("Задание 4");
        int deliveryDistance = (int) (140 * Math.random());
        //System.out.println(deliveryDistance);
        int time;
        if (deliveryDistance < 20) time = 1;
        else if (deliveryDistance < 60) time = 2;
        else if (deliveryDistance < 100) time = 3;
        else time = 4;
        System.out.printf("Потребуется дей: %d.%n", time);
        System.out.println("***\n");
    }

    public static void task_5() {
        /*
        Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
        Например, 1 месяц (он же январь) принадлежит к сезону зима. Для написания программы используйте оператор switch.
        Для обозначения номера месяца используйте переменную monthNumber = 12.
        Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
        **Критерии оценки**
            – Применен оператор switch.
            – Условие, при котором программа не будет выполняться, прописана
            – Значение переменной присвоено корректно
            – Правила синтаксиса и пунктуации соблюдены.
         */
        System.out.println("Задание 5");
        int monthNumber = (int) (20 * Math.random());
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.printf("%d месяц принадлежит сезону зима.%n",monthNumber);
                break;
            case 3:
            case 4:
            case 5:System.out.printf("%d месяц принадлежит сезону весна.%n",monthNumber);
                break;
            case 6:
            case 7:
            case 8:System.out.printf("%d месяц принадлежит сезону лето.%n",monthNumber);
                break;
            case 9:
            case 10:
            case 11:System.out.printf("%d месяц принадлежит сезону осень.%n",monthNumber);
                break;
            default:
                System.out.printf("Месяца №%d не существует.%n", monthNumber);
        }
        System.out.println("***\n");
    }
}
