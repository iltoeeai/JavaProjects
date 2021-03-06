package Paskaitos.d26;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MokiniaiNeStatiniai {

    public static void main(String[] args) {
        MokiniaiNeStatiniai m = new MokiniaiNeStatiniai();
        m.run();
    }

    void run() {
        List<Mokinys> mokiniai = new ArrayList<>();
        mokiniai.add(new Mokinys(1001, "V1", "P1", LocalDate.of(2000, 1, 1), 8));
        mokiniai.add(new Mokinys(1019, "V6", "P6", LocalDate.of(2002, 12, 25), 7.5));
        mokiniai.add(new Mokinys(1002, "V2", "P2", LocalDate.of(2000, 4, 15), 5.3));
        mokiniai.add(new Mokinys(1010, "V3", "P3", LocalDate.of(2001, 5, 5), 8.3));
        mokiniai.add(new Mokinys(1012, "V4", "P4", LocalDate.of(2001, 6, 15), 9));
        mokiniai.add(new Mokinys(1015, "V5", "P5", LocalDate.of(2001, 1, 25), 9.9));

        Map<Integer, CntAvg> m2 = calc2(mokiniai);
        System.out.println(m2);
    }

    Map<Integer, CntAvg> calc2(List<Mokinys> mokiniai) {
        // suskaiciuoti kiek mokiniu yra pagal metus ir koks ju vidurkis

        Map<Integer, CntAvg> m2 = new HashMap<>();
        // mokiniai.forEach((Mokinys mokinys) -> {
        for (Mokinys mokinys : mokiniai) {
            int metai = mokinys.getBirthday().getYear();
            if (m2.containsKey(metai)) {
                CntAvg value = m2.get(metai);
                value.counter++;
                value.average = (value.average * (value.counter - 1) + mokinys.getAverage()) / value.counter;
            } else {
                m2.put(metai, new CntAvg(1, mokinys.getAverage()));
            }
        } // );

        return m2;
    }

    class CntAvg {
        int counter;
        double average;

        CntAvg(int counter, double average) {
            this.counter = counter;
            this.average = average;
        }

        @Override
        public String toString() {
            return "counter=" + counter +
                    ", average=" + average;
        }
    }
}
