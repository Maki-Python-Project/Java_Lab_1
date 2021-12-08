import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Soldier soldier1 = new Soldier.Builder().withSurname("Prustypa").withName("Taras").withMiddleName("Stepanovuch").withAge(20).callDate("26.05.21").build();
        Soldier soldier2 = new Soldier.Builder().withSurname("Slusar").withName("Mukola").withMiddleName("Olegovuch").withAge(23).callDate("22.05.20").build();
        Soldier soldier3 = new Soldier.Builder().withSurname("Lutvunyk").withName("Ivan").withMiddleName("Mukolaevuch").withAge(21).callDate("06.09.20").build();
        Officer officer1 = new Officer.Builder().withSurname("Buchkov").withName("Volodumur").withMiddleName("Anatolievuch").withAge(25).withRank("Starshuy Leutenant").withSalary(15000).build();
        Officer officer2 = new Officer.Builder().withSurname("Ivanov").withName("Olexandre").withMiddleName("Genadiebuch").withAge(45).withRank("Polkovnuk").withSalary(22000).build();
        Officer officer3 = new Officer.Builder().withSurname("Lebedev").withName("Olexandre").withMiddleName("Olexandrobuch").withAge(56).withRank("General Polkovnuk").withSalary(32000).build();

        List<Soldier> list = new ArrayList<>();
        list.add(soldier1);
        list.add(soldier2);
        list.add(soldier3);
        list.add(officer1);
        list.add(officer2);
        list.add(officer3);

        MilitaryBase militaryBase = new MilitaryBase.Builder().withMilitaryName("A3290").withMilitaryList(list).build();
        System.out.println(list);
        MilitaryBase.filter(list, "Taras");
        System.out.println(list);
    }
}
