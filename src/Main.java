public class Main {
    public static void main(String[] args) {

        Task1 employee1 = new Task1("Ivanov", PaymentType.RATE, 3000);
        Task1 employee2 = new Task1("Sidorov", PaymentType.HOURLY, 800);
        Task1 employee3 = new Task1("Petrov", PaymentType.PIECEWORK, 5500);


        System.out.println("Task 1");
        // Разработать  и  протестировать  набор  классов  для  реше-ния  задачи  подсчета  зароботной  платы  сотрудников  неко-торой фирмы.
        // На фирме есть несколько способов оплаты труда:
        // ■ ставка – указывается, сколько сотрудник получает за рабочий день;
        // для каждого сотрудника записывается, сколько дней он отработал в месяце;
        //
        // ■ почасовая – указывается, сколько сотрудник получает в час,
        // для каждого сотрудника; записывается, сколько часов он отработал в месяце
        //
        // ■ сдельная – указывается, сколько сотрудник получит за выполненную работу;
        // для каждого сотрудника записываются суммы для каждой работы, что он успел сделать за месяц.
        employee1.printHeadForTask_1();
        employee1.printBodyForTask_1();
        employee2.printBodyForTask_1();
        employee3.printBodyForTask_1();
        System.out.printf("%10s %11s %12.2f \n", "Sum", "", employee1.getPaymentValue() + employee2.getPaymentValue() + employee3.getPaymentValue());
        System.out.println("\n");


        System.out.println("Task2");
        //Для  предыдущего  задания  вывести  отчет  с  учетом  нало-гов. Для сотрудников,
        // которые на ставке и почасовой оплате – налог 20%.Для сотрудников со сдельной оплатой труда – 15%.
        employee1.printHead();
        employee1.printBody();
        employee2.printBody();
        employee3.printBody();
        System.out.println("\n");

        System.out.println("Task 3");
//        На  основе  предыдущего  задания  сделать  новый  отчет  таким  образом,
//        что  для  сотрудников,  у  которых  нет  детей,  ставка налога выше на 5%.
        employee1 = new Task3("Ivanov with children", PaymentType.RATE, 3000, false){

            @Override
            protected void printHeadForTask_4() {

            }

            @Override
            protected void printBodyForTask_4() {

            }
        };
        employee2 = new Task3("Sidorov with children", PaymentType.HOURLY, 800, false) {

            @Override
            protected void printHeadForTask_4() {

            }

            @Override
            protected void printBodyForTask_4() {

            }
        };
        employee3 = new Task3("Petrov without child.", PaymentType.PIECEWORK, 5500) {


            @Override
            protected void printHeadForTask_4() {

            }

            @Override
            protected void printBodyForTask_4() {

            }
        };
        employee1.printHead();
        employee1.printBody();
        employee2.printBody();
        employee3.printBody();
        System.out.println("\n");

        System.out.println("Task4");
        //На основе предыдущего задания переделать отчет, с уче-том  того,
        // что  сотрудники  с  почасовой  оплатой,  половину  зарплаты  получают
        // в  валюте  (тугриках),  по  курсу  на  день  начисления заработной платы.

        employee1 = new Task4("Ivanov UAH", PaymentType.RATE, 3000, false);
        employee2 = new Task4("Sidorov USD", PaymentType.HOURLY, 800, false);
        employee3 = new Task4("Petrov UAH", PaymentType.PIECEWORK, 5500, false);

        Task4.setExchangeRate(0.034);

        employee1.printHead();
        employee1.printBody();
        employee2.printBody();
        employee3.printBody();
        System.out.println("\n");



        System.out.println("Task5");
//        Фирма  переводит  часть  сотрудников  в  офшорную  зону.  Сотрудники, находящиеся в офшоре,
//        не платят налогов. Создать новый отчет с учетом данного нововведения.

        employee1 = new Task5("Ivanov offshore", PaymentType.RATE, 3000, false, true);
        employee2 = new Task5("Sidorov offshore", PaymentType.HOURLY, 800, false, true);
        employee3 = new Task5("Petrov domestic", PaymentType.PIECEWORK, 5500, false, false);
        Task4.setExchangeRate(0.034);

        employee1.printHead();
        employee1.printBody();
        employee2.printBody();
        employee3.printBody();
        System.out.println("\n");


        System.out.println("Task 6");

//        Фирма  вводит  премии  сотрудникам,  которые  работали  больше  200  часов  в  месяц,
//        но  не  находятся  в  офшоре.  Пре-мии  должны  суммироваться  в  основную  зарплату.
//        Создать  новый отчет с учетом изменений.

        employee1 = new Task6("Ivanov offshore", PaymentType.RATE, 3000, false, true, 1000, 20);
        employee2 = new Task6("Sidorov offshore", PaymentType.HOURLY, 800, false, true, 1000, 280);
        employee3 = new Task6("Petrov domestic", PaymentType.PIECEWORK, 5500, false, false, 1000, 210);

        employee1.printHead();
        employee1.printBody();
        employee2.printBody();
        employee3.printBody();
    }
}
