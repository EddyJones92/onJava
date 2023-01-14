package lesson4;

public class SwitchEx {

  public static void main(String[] args) {

    String days = "вторник";

    switch (days) {
      case "понедельник":
        System.out.println("первый");
        break;
      case "вторник":
        System.out.println("второй");
        break;
    }

    int num = 9;

    switch (num) {
      case 1, 7, 8, 9:
        System.out.println("Вы выбрали номер");
        break;
      case 2:
        System.out.println("Вы выбрали счет");
        break;
      case 3:
        System.out.println("Вы выбрали тарифы");
        break;
      case 4:
        System.out.println("Вы выбрали баланс");
        break;
      case 5:
        System.out.println("Вы выбрали");
        break;
      case 6:
        System.out.println("Вы выбрали");
        break;
      default:
        System.out.println("Не совпало");
    }


  }
}
