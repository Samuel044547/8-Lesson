import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Taks 1
        int month=3;
       switch (month){
           case 1:
               System.out.println("January");
            break;
           case 2:
               System.out.println("February");
               break;
           case 3:
               System.out.println("March");
               break;
           default:
               System.out.println("Invalid");
               break;
       }
// Taks 2
       int month1=1;
       switch (month1){
           case 1:
               System.out.println("January");
               break;
           case 2:
               System.out.println("February");
               break;
           case 3:
               System.out.println("Februsry");
               break;
           case 4:
               System.out.println("March");
               break;
           case 5:
               System.out.println("April");
               break;
           case 6:
               System.out.println("May");
               break;
           case 7:
               System.out.println("June");
               break;
           case 8:
               System.out.println("July");
               break;
           case 9:
               System.out.println("August");
               break;
           case 10:
               System.out.println("September");
               break;
           case 11:
               System.out.println("October");
               break;
           case 12:
               System.out.println("November");
               break;
           default:
               System.out.println("Invalid");
               break;
       }
// Taks 3
       String name= "Maksat";
       String surname="empty";
       switch (name){
           case  "Vasya" :
               surname="Pupkin";
               break;
           case "Arman":
              surname="Orman";
               break;
           case "MAksat":
             surname="Bala";
               break;
           default:
               System.out.println("Invalid");
               break;
       }
System.out.println("name "+name);
System.out.println("surname "+surname);
// Taks 4
        int month2=10;
        int year=2021;
        int numDays=0;
        switch (month2) {
            case 1:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    numDays = 30;
                    System.out.println("November"+numDays);
        }else{
                    numDays = 31;
                System.out.println("January" + numDays);
        }
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    numDays = 29;
                    System.out.println("November" + numDays);
                }else {
                    numDays = 28;
                    System.out.println("February " + numDays);
                }
                break;
            case 3:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    numDays = 30;
                    System.out.println("November"+numDays);
        }else {
                    numDays = 31;
                    System.out.println("Februsry"+numDays);
                }
                break;
            case 4:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    numDays = 30;
                    System.out.println("November"+numDays);
                }else {
                    numDays = 31;
                    System.out.println("March"+numDays);
                }
                break;
            case 5:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    numDays = 30;
                    System.out.println("November"+numDays);
                }else {
                    numDays = 31;
                    System.out.println("April"+numDays);
                }
                break;
            case 6:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    numDays = 30;
                    System.out.println("November"+numDays);
                }else {
                    numDays = 31;
                    System.out.println("May"+numDays);
                }
                break;
            case 7:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    numDays = 30;
                    System.out.println("November"+numDays);
                }else {
                    numDays = 31;
                    System.out.println("June"+numDays);
                }
                break;
            case 8:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    numDays = 30;
                    System.out.println("November"+numDays);
        }else {
                    numDays = 31;
                    System.out.println("July"+numDays);
                }
                break;
            case 9:
                if ((year%4==0 && year %100 !=0)||(year%400==0)) {
                    numDays = 30;
                    System.out.println("November"+numDays);
                }else {
                    numDays = 31;
                    System.out.println("August"+numDays);
                }
                break;
            case 10:
                if ((year%4==0 && year %100 !=0)||(year%400==0)) {
                    numDays = 30;
                    System.out.println("November"+numDays);
                }else {
                    numDays = 31;
                    System.out.println("September"+numDays);
                }
                break;
            case 11:
                if ((year%4==0 && year %100 !=0)||(year%400==0)) {
                    numDays = 30;
                    System.out.println("November"+numDays);
                }else {
                    numDays = 31;
                    System.out.println("October"+numDays);
                }
                break;
            case 12:
                if ((year%4==0 && year %100 !=0)||(year%400==0)) {
                    numDays = 30;
                    System.out.println("November"+numDays);
                }else {
                    numDays = 31;
                    System.out.println("November"+numDays);
                }
                break;
            default:
                System.out.println("Invalid mont "+numDays);
                break;
        }
// Taks 5
char branch ='I';
        int group=3;
        switch (group) {
            case 1:
                switch (branch) {
                    case 'F':
                        System.out.println("IT");
                        break;
                    case 'D':
                        System.out.println("Economic");
                        break;
                    case 'A':
                        System.out.println("Jyttin balasi");
                        break;
                }
                break;
            case 2:
                switch (branch) {
                    case 'E':
                        System.out.println("IT");
                        break;
                    case 'A':
                        System.out.println("Philolog");
                        break;
                    case 'G':
                        System.out.println("Math");
                        break;
                }
                break;
            case 3:
                switch (branch) {
                    case 'I':
                        System.out.println("IT Teachers");
                        break;
                    case 'F':
                        System.out.println("Just IT");
                        break;
                    case 'C':
                        System.out.println("Not IT");
                        break;
                }
                break;
        }

// 6 Taks
String result="animal";
        switch (result){
            case "Dog":
            case "Cat":
                result="domestic animal";
                break;
            case "Tiger":
                result="wild animal";
                break;
            default:
                result="unkonow animal";
                break;
        }
// 7-12 esep
// Taks 7
        Scanner in= new Scanner(System.in);
        System.out.println("Month engiziniz 7 esep: ");
        int month0=in.nextInt();
        switch (month0){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
// Taks 8
        Scanner in8 = new Scanner(System.in);
        System.out.println("Month engiziniz 8 esep: ");
        int month6=in8.nextInt();
        switch (month6){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("Februsry");
                break;
            case 4:
                System.out.println("March");
                break;
            case 5:
                System.out.println("April");
                break;
            case 6:
                System.out.println("May");
                break;
            case 7:
                System.out.println("June");
                break;
            case 8:
                System.out.println("July");
                break;
            case 9:
                System.out.println("August");
                break;
            case 10:
                System.out.println("September");
                break;
            case 11:
                System.out.println("October");
                break;
            case 12:
                System.out.println("November");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
// Taks 9
        Scanner in10 = new Scanner(System.in);
        System.out.println("Month engiziniz 9 esep : ");
        String name1=in10.nextLine();
        String surname0="empty";
        switch (name1){
            case  "Vasya" :
                surname0="Pupkin";
                break;
            case "Arman":
                surname0="Orman";
                break;
            case "MAksat":
                surname0="Bala";
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        System.out.println("name "+name);
        System.out.println("surname "+surname);
// Taks 10
        Scanner in11= new Scanner(System.in);
        System.out.println("Jalda engizinzi 10 esep: ");
        int month7=10;
        int year1=in11.nextInt();
        int numDays1=0;
        switch (month7) {
            case 1:
                if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)){
                    numDays1 = 30;
                    System.out.println("November"+numDays1);
                }else{
                    numDays1 = 31;
                    System.out.println("January" + numDays1);
                }
                break;
            case 2:
                if ((year1 % 4 == 0 && year1% 100 != 0) || (year1 % 400 == 0)) {
                    numDays1 = 29;
                    System.out.println("November" + numDays1);
                }else {
                    numDays1 = 28;
                    System.out.println("February " + numDays1);
                }
                break;
            case 3:
                if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)){
                    numDays1 = 30;
                    System.out.println("November"+numDays1);
                }else {
                    numDays1 = 31;
                    System.out.println("Februsry"+numDays1);
                }
                break;
            case 4:
                if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)) {
                    numDays1 = 30;
                    System.out.println("November"+numDays1);
                }else {
                    numDays1= 31;
                    System.out.println("March"+numDays1);
                }
                break;
            case 5:
                if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)) {
                    numDays1 = 30;
                    System.out.println("November"+numDays1);
                }else {
                    numDays1= 31;
                    System.out.println("April"+numDays1);
                }
                break;
            case 6:
                if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)) {
                    numDays1 = 30;
                    System.out.println("November"+numDays1);
                }else {
                    numDays1 = 31;
                    System.out.println("May"+numDays1);
                }
                break;
            case 7:
                if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)) {
                    numDays1 = 30;
                    System.out.println("November"+numDays1);
                }else {
                    numDays1 = 31;
                    System.out.println("June"+numDays1);
                }
                break;
            case 8:
                if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0)){
                    numDays1 = 30;
                    System.out.println("November"+numDays1);
                }else {
                    numDays1 = 31;
                    System.out.println("July"+numDays1);
                }
                break;
            case 9:
                if ((year1%4==0 && year1 %100 !=0)||(year1%400==0)) {
                    numDays1 = 30;
                    System.out.println("November"+numDays1);
                }else {
                    numDays1 = 31;
                    System.out.println("August"+numDays1);
                }
                break;
            case 10:
                if ((year1%4==0 && year1 %100 !=0)||(year1%400==0)) {
                    numDays1 = 30;
                    System.out.println("November"+numDays1);
                }else {
                    numDays1= 31;
                    System.out.println("September"+numDays1);
                }
                break;
            case 11:
                if ((year1%4==0 && year1 %100 !=0)||(year1%400==0)) {
                    numDays1 = 30;
                    System.out.println("November"+numDays1);
                }else {
                    numDays1 = 31;
                    System.out.println("October"+numDays1);
                }
                break;
            case 12:
                if ((year1%4==0 && year1 %100 !=0)||(year1%400==0)) {
                    numDays1 = 30;
                    System.out.println("November"+numDays1);
                }else {
                    numDays1 = 31;
                    System.out.println("November"+numDays1);
                }
                break;
            default:
                System.out.println("Invalid mont "+numDays1);
                break;
        }
// Taks 11
        Scanner in12= new Scanner(System.in);
        System.out.println("san engiziniz 11 esep: ");
        char branch1 ='I';
        int group1=in12.nextInt();
        switch (group1) {
            case 1:
                switch (branch1) {
                    case 'F':
                        System.out.println("IT");
                        break;
                    case 'D':
                        System.out.println("Economic");
                        break;
                    case 'A':
                        System.out.println("Jyttin balasi");
                        break;
                }
                break;
            case 2:
                switch (branch1) {
                    case 'E':
                        System.out.println("IT");
                        break;
                    case 'A':
                        System.out.println("Philolog");
                        break;
                    case 'G':
                        System.out.println("Math");
                        break;
                }
                break;
            case 3:
                switch (branch1) {
                    case 'I':
                        System.out.println("IT Teachers");
                        break;
                    case 'F':
                        System.out.println("Just IT");
                        break;
                    case 'C':
                        System.out.println("Not IT");
                        break;
                }
                break;
        }
// taks 12
        Scanner al= new Scanner(System.in);
        System.out.println("Enter username");
        int animal0 =al.nextInt();
        switch (animal0){
            case 1:
                System.out.println("Dog");
                break;
            case 2:
                System.out.println("Cat");
                break;
            case 3:
                System.out.println("Cow");
                break;
            case 4:
                System.out.println("Tiger");
                break;
            case 5:
                System.out.println("panda");
           break;
            case 6:
                System.out.println("bear");
            default:
                System.out.println("unkonow animal");
                break;
        }
// taks 13
Scanner my0bj= new Scanner(System.in);
        System.out.println("Enter username");
        String userName=my0bj.nextLine();
        System.out.println("Username is"+userName);
// taks 14
        Scanner my0bj1= new Scanner(System.in);
        System.out.println("Enter name,age and salary:");
        String name0=my0bj1.nextLine();
        int age =my0bj1.nextInt();
        double salary=my0bj1.nextDouble();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
// Problem 1
        Scanner apta= new Scanner(System.in);
        System.out.println("san engiz problem 1");
int kun=apta.nextInt();
switch (kun){
    case 1:
        System.out.println("Пн");
        break;
    case 2:
        System.out.println("Вт");
        break;
    case 3:
        System.out.println("Ср");
        break;
    case 4:
        System.out.println("Чт");
        break;
    case 5:
        System.out.println("Пт");
        break;
    case 6:
        System.out.println("Сб");
        break;
    case 7:
        System.out.println("Вс");
        break;
    default:
        System.out.println("apta jоk");
        break;
}
// Problem 2
        Scanner ai= new Scanner(System.in);
        System.out.println("san engiz problem 2");
        int Kun=ai.nextInt();
        switch (Kun) {
            case 1:
                System.out.println("Қантар");
                break;
            case 2:
                System.out.println("Ақпан");
                break;
            case 3:
                System.out.println("Наурыз");
                break;
            case 4:
                System.out.println("Сәуір");
                break;
            case 5:
                System.out.println("Мамыр");
                break;
            case 6:
                System.out.println("Маусым");
                break;
            case 7:
                System.out.println("Шілде");
                break;
            case 8:
                System.out.println("Тамыз");
                break;
            case 9:
                System.out.println("Кыркүйек");
                break;
            case 10:
                System.out.println("Қазан");
                break;
            case 11:
                System.out.println("Қараша");
                break;
            case 12:
                System.out.println("Желтоксан");
                break;
            default:
                System.out.println("Ондай ай жоқ");
                break;
        }
// Problem 3
        Scanner mezgil= new Scanner(System.in);
        System.out.println("san engiz problem 3");
        int nomer=mezgil.nextInt();
        switch (nomer) {
            case 1:
                System.out.println("Қыс мезгіліне: Желтоқсан, Қантар, Ақпан айлары кіреді");
                break;
            case 2:
                System.out.println("Көктем мезгіліне: Наурыз, Сәуір, Мамыр айлары кіреді");
                break;
            case 3:
                System.out.println("Жаз мезгіліне: Маусым, Шілде, Тамыз айлары кіреді");
                break;
            case 4:
                System.out.println("Күз  мезгіліне: Қырқүйек, Қазан, Қараша айлары кіреді");
                break;
            default:
                System.out.println("Ондай жыл мезгілі жоқ");
        }
    }
    }
