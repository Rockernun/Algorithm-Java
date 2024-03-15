import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();  //  시작 시간
        int minute = scanner.nextInt();  //  시작 분
        int loading = scanner.nextInt();  //  걸린 시간

        int intoHour = (minute + loading) / 60;
        int restMinute = (minute + loading) % 60;
        int endHour = hour + intoHour;

        if (endHour >= 1) {
            endHour = endHour % 24;
        }
        System.out.println(endHour + " " + restMinute);
    }
}

/*
*  int endHour;

        if (intoHour >= 1) {
            endHour = hour + intoHour;
            if (endHour > 23) {
                endHour = endHour % 24;
            }
        }
        * 원래 내가 했던 코드이다.
        * endHour 변수를 초기화하지 않고 사용하려 했다.
        * 이는 만약 intoHour가 1보다 작을 때 endHour가 초기화되지 않을 수 있다.
* */
