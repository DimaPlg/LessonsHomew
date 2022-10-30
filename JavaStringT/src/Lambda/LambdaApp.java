package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

interface SeasonPrice {
    double calcPrice(double discount, double price);
}

class Phone {
    double price;
    String name;

    public Phone(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getSeasonPrice(double discount, SeasonPrice func) {
        return func.calcPrice(discount, price);
    }

    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
}

public class LambdaApp {
    public static void main(String[] args) {

        /*
        Phone phone = new Phone(1700.0, "NewSung S20");
        Phone phone1 = new Phone(1900.0, "WindPhone A2");
        Phone phone2 = new Phone(1000.0, "Xi U8");
        Phone phone3 = new Phone(2700.0, "Ap i13");

        double winterPrice = phone.getSeasonPrice(10, (discount, currPrice) -> {
            return currPrice - discount * 5;
        });

        double springPrice = phone.getSeasonPrice(20, (discount, currPrice) -> {
            return currPrice + (discount * 8);
        });

        double summerPrice = phone.getSeasonPrice(10, (discount, currPrice) -> {
            return currPrice * (1 - (discount/100));
        });

        double autumnPrice = phone.getSeasonPrice(15, (discount, currPrice) -> {
            return currPrice - (discount * 7);
        });

        System.out.println(phone.name + ": " + winterPrice);
        System.out.println(phone.name + ": " + summerPrice);
        System.out.println(phone.name + ": " + springPrice);
        System.out.println(phone.name + ": " + autumnPrice);
*/
/*
        Stream<Phone> phoneStream = Stream.of(new Phone(3600, "iPhone X"),
                new Phone(2500, "Pixel 2"),
                new Phone(2450, "iPhone 8"),
                new Phone(1850, "Nokia 9"));
*/
        List<Phone> pPhone = new ArrayList<>();
        pPhone.add(new Phone(2500, "Pixel 2"));
        pPhone.add(new Phone(2450, "iPhone 8"));
        pPhone.add(new Phone(2500, "Pixel 2"));
        pPhone.add(new Phone(1850, "Nokia 9"));

        pPhone.stream().sorted(new PhoneComparator())
                .forEach(p -> System.out.printf("%s - %d \n",
                        p.getName(), p.getPrice()));
    }

    static class PhoneComparator implements Comparator<Phone> {

            public int compare(Phone a, Phone b){

                if(a.getPrice()> b.getPrice())
                    return 1;
                else if(a.getPrice()< b.getPrice())
                    return -1;
                else
                    return 0;
            }
        }
}

