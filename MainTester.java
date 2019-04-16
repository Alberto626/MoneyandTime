package hw7;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class MainTester {

	public static void main(String[] args) {
		ArrayList moneyList = new ArrayList<Money>();
		ArrayList timeList = new ArrayList<Time>();
		Money money = new Money(13.53);
		Money money2 = new Money(16.35);
		Money money3 = new Money(34.26);
		Money money4 = new Money(6.74);
		Money money5 = new Money(8.05);
		moneyList.add(money);
		moneyList.add(money2);
		moneyList.add(money3);
		moneyList.add(money4);
		moneyList.add(money5);
		 // java.util.Arrays.sort(moneyList);
		for(int x = 0; moneyList.size() > x; x++) {
			System.out.println(moneyList.get(x));
		}
		Collections.shuffle(moneyList);
		System.out.println(5/70);
		for(int x = 0; moneyList.size() > x; x++) {
			System.out.println(moneyList.get(x));
		}
		Time time = new Time(12,4,10);
		System.out.println(time);

	}

}
