import java.util.Scanner;

/**
 * Main - основной класс программы - который содержит функцию public static void main()
 */
public class Main {
   public static final String ANSI_RESET = "\u001B[0m";
   public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
   public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
   public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
   public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
   public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
   public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
   public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
   public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
   public static final String RESET = "\033[0m";  // Text Reset

   public static final String ANSI_BLACK = "\u001B[30m";
   public static final String ANSI_RED = "\u001B[31m";
   public static final String ANSI_GREEN = "\u001B[32m";
   public static final String ANSI_YELLOW = "\u001B[33m";
   public static final String ANSI_BLUE = "\u001B[34m";
   public static final String ANSI_PURPLE = "\u001B[35m";
   public static final String ANSI_CYAN = "\u001B[36m";
   public static final String ANSI_WHITE = "\u001B[37m";

   // Regular Colors
   public static final String BLACK = "\033[0;30m";   // BLACK
   public static final String RED = "\033[0;31m";     // RED
   public static final String GREEN = "\033[0;32m";   // GREEN
   public static final String YELLOW = "\033[0;33m";  // YELLOW
   public static final String BLUE = "\033[0;34m";    // BLUE
   public static final String PURPLE = "\033[0;35m";  // PURPLE
   public static final String CYAN = "\033[0;36m";    // CYAN
   public static final String WHITE = "\033[0;37m";   // WHITE

   // Bold
   public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
   public static final String RED_BOLD = "\033[1;31m";    // RED
   public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
   public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
   public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
   public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
   public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
   public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

   // Underline
   public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
   public static final String RED_UNDERLINED = "\033[4;31m";    // RED
   public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
   public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
   public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
   public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
   public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
   public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

   // Background
   public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
   public static final String RED_BACKGROUND = "\033[41m";    // RED
   public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
   public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
   public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
   public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
   public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
   public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

   // High Intensity
   public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
   public static final String RED_BRIGHT = "\033[0;91m";    // RED
   public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
   public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
   public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
   public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
   public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
   public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

   // Bold High Intensity
   public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
   public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
   public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
   public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
   public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
   public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
   public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
   public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

   // High Intensity backgrounds
   public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
   public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
   public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
   public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
   public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
   public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
   public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
   public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE

   /**
    * Главная функция - с неё начинается выполнение программы, в ней и заканчивается, если программа отработала успешно
    *
    * @param args список входных параметров (может быть не задействован)
    */
   public static void main(String[] args) {
      System.out.println("hello".hashCode());
      System.out.println("hellO".hashCode());
/*      Example_1();
      Example_2();
      Example_3();
      Example_4();
      Example_5();
      Example_6();
      Example_7();
      Example_8();*/

      System.out.print("123456");      // C++ cout<<"123456";
      System.out.println("\t123456");  // C++ cout<<"\t123456"<<endl;

      System.out.println("  @..@");
      System.out.println(" (----)");
      System.out.println("( >__< )");
      System.out.println("^^ ~~ ^^");

      System.out.println(ANSI_GREEN_BACKGROUND + "This text has a green background but default text!" + ANSI_RESET);
      System.out.println(RED_BOLD + "This text has bold red text but a default background!" + ANSI_RESET);
      System.out.println(ANSI_GREEN_BACKGROUND + ANSI_CYAN + "This text has a green background and cyan text!" + ANSI_RESET);
   }

   /**
    * Диапазоны различных типов данных Java
    */
   private static void Example_1() {
      System.out.println("\n\tПример 1" + System.lineSeparator());
      System.out.println("\tЦелочисленные типы данных:");
      System.out.println("Диапазон для byte (8 бит): " + Byte.MIN_VALUE + " .. " + Byte.MAX_VALUE);
      System.out.println("Диапазон для short (16 бит): " + Short.MIN_VALUE + " .. " + Short.MAX_VALUE);
      System.out.println("Диапазон для int (32 бита): " + Integer.MIN_VALUE + " .. " + Integer.MAX_VALUE);
      System.out.println("Диапазон для long (64 бита): " + Long.MIN_VALUE + " .. " + Long.MAX_VALUE);
      System.out.println("Диапазон для char (16 бит): " + (int) Character.MIN_VALUE + " .. " + (int) Character.MAX_VALUE);

      System.out.println("Вещественные типы данных:");
      System.out.println("Диапазон для float (32 бита): " + Float.MIN_VALUE + " - " + Float.MAX_VALUE);
      System.out.println("Диапазон для doulbe (64 бита) : " + Double.MIN_VALUE + " - " + Double.MAX_VALUE);

// Для boolean. Размер вне массива - 1 бит, размер в составе массива 32 бита, т.к. используется int
      System.out.println("Логический тип данных boolean(1 или 32 бита) : false-true");
   }

   /**
    * Инициализация переменных
    */
   private static void Example_2() {
      System.out.println("\n\tПример 2\n");

      // Пример литералов : a, в, k, j, н, 1, 5, 0,

      //int a,b,c; - не делайте так
      int a = 0, b = 0, c = 0;

      // -------Целочисленные типы данных
      byte var_byte = 02;        // восьмеричное целочисленное значение
      short var_short = 0x3000;  // шестнадцатеричное целочисленное значение
      int var_int = 50000;       // десятичное целочисленное значение
      long var_long = 1000000L;  // десятичное целочисленное значение типа long

      // ------Вещественные типы данных
      // Вещественное число с одинарной точностью
      float var_float = 0.21f;
      // Вещественное число с двойной точностью
      double var_double = 0.21D;

      // ------Логический тип данных
      boolean var_boolean = true;

      // ------Символьный тип данных
      char var_char = 'h';

      // ------Строка
      String var_string = "Hello!";

      //byte a_byte = 256; - ошибка компиляции

      // Пример неявного(безопасного каста)
      byte x = 127;
      x = (byte) (x + x);
      int y = x;

      // Пример явного (опасного каста)
      int x2 = 5491;
      byte y2 = (byte) x2;
      System.out.println("y2 = " + y2);

      // Шестнадцатеричное представление
      int X = 0xff; // 0x
      // Восьмеричное представление
      int Y = 0255; // 0

      System.out.println(X);
      System.out.println(Y);
   }

   /**
    * Работа с константой
    */
   private static void Example_3() {
      System.out.println("\n\tПример 3\n");
      // В Java принято для констант писать идентификаторы большими буквами
      final long LOG_TAG = 20;
      // LOG_TAG = 12; - ошибка компиляции

      System.out.println("Значение константы LOG_TAG = " + LOG_TAG);
   }

   /**
    * Арифметические операции
    */
   private static void Example_4() {
      System.out.println("\n\tПример 4\n");

      int opr1 = 30;
      int opr2 = 20;
      // Динамическая инициализация переменной
      int sum = opr1 + opr2;

      System.out.println();
      System.out.println("Сложение " + opr1 + "+" + opr2 + "=" + sum);
      System.out.println("Вычитание " + opr1 + "-" + opr2 + "=" + (opr1 - opr2));
      System.out.println("Умножение " + opr1 + "*" + opr2 + "=" + (opr1 * opr2));
      // Отбросит вещественную часть, т.к. оба операнда целочисленные
      System.out.println("Деление (неправильное) " + opr1 + "/" + opr2 + "=" + (opr1 / opr2));
      // Сохранит вещественную часть, т.к. один из операндов вещественный
      System.out.println("Деление (правильное) " + opr1 + "/" + opr2 + "=" + ((double) opr1 / opr2));
      System.out.println("Остаток от деления для int  " + opr1 + "%" + opr2 + "=" + (opr1 % opr2));
      System.out.println("Остаток от деления для double  " + opr1 + "%" + opr2 + "=" + ((double) opr1 % opr2));

      // Важное правило. Если при делении, Вы используете только целочисленные переменные, то обязательно приведите один из них к вещественному типу.
      // Или, если в выражении есть литералы, то запишите их так: 21.
      System.out.println("Результат выполнения операции 30/20=" + 30 / 20); // 1
      System.out.println("Результат выполнения операции 30./20=" + 30. / 20); // 1.5
      System.out.println("Результат выполнения операции (double)30/20=" + (double) 30 / 20); // 1.5

      // В Java, как и во многих других языках программирования нельзя делить на целочисленный ноль
      //System.out.println(20/0); // Этот фрагмент кода вызовет исключение
      System.out.println("Результат выполнения операции  20 / 0. =" + 20 / 0.);  // infinity
      System.out.println("Результат выполнения операции -20 / 0. =" + -20 / 0.); // -infinity
      System.out.println("Результат выполнения операции  0. / 0. =" + 0. / 0.);  // Nan
   }

   /**
    * Сокращенная запись арифметических операций
    */
   private static void Example_5() {
      System.out.println("\n\tПример 5\n");

      double a = 100;
      a++; // a = a + 1; a += 1;
      a--; // a = a - 1; a -= 1;

      System.out.println("Переменная изначально : a = " + a);

      // a = a + 20;
      a += 20;
      System.out.println("a+=20  = " + a);

      //a = a - 20;
      a -= 20;
      System.out.println("a-=20  = " + a);
      a /= 3;  // a = a / 3;
      System.out.println("a/=3  = " + a);
      a *= 7;
      System.out.println("a*=7  = " + a);
      a %= 3;
      System.out.println("a%3  = " + a);
   }

   /**
    * Инкремент, декремент
    */
   private static void Example_6() {
      // Достаточно часто, при написании программ, необходимо увеличивать или уменьшать значение переменной на 1
      // Т.е. мы можем записать это действие, как :
      // x = x + 1; x = x - 1 ; или
      // x+=1; x-=1; но в Java для этого предусмотрены специальный операторы, которые упрощают эти действия

      // ++x - префиксный инкремент, сначала увеличиваем - потом используем
      // x++ - постфиксный инкремент, сначала используем - потом увеличиваем

      // --x - префиксный декремент, сначала уменьшаем - потом используем
      // x-- - постфиксный декремент, сначала используем - потом уменьшаем

      System.out.println("\n\tПример 6\n");

      int x = 0;

      System.out.println("Использовали постфиксный инкремент (x++) : " + x++);
      System.out.println("Перешли к следующей команде : " + x);
      System.out.println("Использовали префиксный инкремент (++x) : " + ++x);

      // Для декремента всё аналогично
   }

   /**
    * Math - класс для работы с математикой
    */
   private static void Example_7() {
      // Для различных задач, связанных с математикой в Java предусмотрен класс Math
      // Далее рассмотрим класс Math, содержащий различные математически функции. Рассмотрим некоторые из них:

      // Math.abs(n) — возвращает модуль числа n.
      // Math.round(n) — возвращает целое число, ближайшее к вещественному числу n (округляет n по математическим правилам округления).
      // Math.ceil(n) — возвращает ближайшее к числу n справа число с нулевой дробной частью (например, Math.ceil(3.4) в результате вернёт 4.0).
      // Math.floor(n) — возвращает ближайшее к числу n слева число с нулевой дробной частью (например, Math.floor(3.8) в результате вернёт 3.0).
      // Math.cos(n), Math.sin(n), Math.tan(n) — тригонометрические функции sin, cos и tg от аргумента n, указанного в радианах.
      // Math.acos(n), Math.asin(n), Math.atan(n) — обратные тригонометрические функции, возвращают угол в радианах.
      // Math.toDegrees(n) — возвращает градусную меру угла в n радианов.
      // Math.toRadians(n) — возвращает радианную меру угла в n градусов.
      // Math.sqrt(n) — возвращает квадратный корень из n.
      // Math.pow(n, b) — возвращает значение степенной функции n в степени b, основание и показатель степени могут быть вещественными.
      // Math.log(n) — возвращает значение натурального логарифма числа n.
      // Math.log10(n) — возвращает значение десятичного логарифма числа n.

      // Большинство из этих функций принимает и возвращает значение типа double

      // Кроме функций в рассматриваемом классе имеются две часто используемых константы:
      // Math.PI — число «пи», с точностью в 15 десятичных знаков.
      // Math.E — экспонента - число Неппера (основание экспоненциальной функции), с точностью в 15 десятичных знаков.

      // Примеры использования:
      System.out.println("\n\tПример 7\n");

      System.out.println(Math.abs(-2.33)); // выведет 2.33
      System.out.println(Math.round(Math.PI)); // выведет 3
      System.out.println(Math.round(9.5)); // выведет 10
      System.out.println(Math.round(9.5 - 0.000000001)); // выведет 9
      System.out.println(Math.ceil(9.1)); // выведет 10.0
      System.out.println(Math.floor(9.9)); // выведет 9.0
      // Находим гипотенузу треугольника с катетами 3 и 4
      double a = 3, b = 4;

      double c = Math.sqrt(a * a + b * b); // Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
      System.out.println(c); // выведет на экран результат вычисления из переменной с
      double s1 = Math.cos(Math.toRadians(60));
      System.out.println(s1); // выведет косинус угла в 60 градусов

      // Также, класс Math позволяет получить псевдослучайное значение
      // Примеры:

      System.out.println(Math.random()); // вещественное число из [0;1)
      System.out.println(Math.random() + 3); // вещественное число из [3;4)
      System.out.println(Math.random() * 5); // вещественное число из [0;5)
      System.out.println((int) (Math.random() * 5)); // целое число из [0;4]
      System.out.println(Math.random() * 5 + 3); // вещественное число из [3;8)
      System.out.println((int) (Math.random() * 5 + 3)); // целое число из [3;7]
      System.out.println((int) (Math.random() * 11) - 5); // целое число из [-5;5]


      double x = 5;
      a = 3 * Math.pow(x, 1 / 3) - 7;
      System.out.println("\na = " + a);
   }

   /**
    * Ввод/вывод данных различных типов в консоли
    */
   private static void Example_8() {
      System.out.println("\n\tПример 8\n");

      // Создаём экземпляр класса Scanner для считывания данных, введенных пользователем
      Scanner scanner = new Scanner(System.in);

      byte var_byte = 0;
      short var_short = 0;
      int var_int = 0;
      long var_long = 0L;

      char var_char = '\0'; // \0 - символ окончания строки

      float var_float = 0.0f;
      double var_double = 0.0;

      boolean var_bool = true;

      String string = "";

      System.out.println("\nBefore input:\nbyte: " + var_byte);
      System.out.println("short: " + var_short);
      System.out.println("int: " + var_int);
      System.out.println("long: " + var_long);
      System.out.println("char: " + var_char);
      System.out.println("float: " + var_float);
      System.out.println("double: " + var_double);
      System.out.println("boolean: " + var_bool);
      System.out.println("String: " + string);

      System.out.println("Введите значение для переменной типа byte:");
      var_byte = scanner.nextByte();
      System.out.println("Введите значение для переменной типа short:");
      var_short = scanner.nextShort();
      System.out.println("Введите значение для переменной типа int:");
      var_int = scanner.nextInt();
      System.out.println("Введите значение для переменной типа long:");
      var_long = scanner.nextLong();
      System.out.println("Введите значение для переменной типа char:");
      var_char = scanner.next().charAt(0);
      System.out.println("Введите значение для переменной типа float:");
      var_float = scanner.nextFloat();
      System.out.println("Введите значение для переменной типа double:");
      var_double = scanner.nextDouble();
      System.out.println("Введите значение для переменной типа String:");
      string = scanner.next();

      System.out.println("\nЗначения переменных после ввода:");
      System.out.println("nbyte: " + var_byte);
      System.out.println("short: " + var_short);
      System.out.println("int: " + var_int);
      System.out.println("long: " + var_long);
      System.out.println("char: " + var_char);
      System.out.println("float: " + var_float);
      System.out.println("double: " + var_double);
      System.out.println("String: " + string);
   }
}