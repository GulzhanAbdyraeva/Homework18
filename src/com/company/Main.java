package com.company;

public class Main {
    /**
     * 1. Уй-булолор квартирада, общежитиеде жана гостиницада жашашат
     * 2. Квартирада жашагандар ком услуга толошот
     * 3. Общежитие менен гостиницада жашагандар аренда толошот
     * 4. Уй-булолор бир канча адамдан турушат
     * 5. Кайсы жерде канча адам жашаганын консольго чыгарыныз
     * 6. Жашоо демек озунун адресин корсотуу
     * Hint: кыймыл аракеттерди интерфейс аркылуу реализация кыласыздар,квартира бул класстар, уй було бул массив, адам бул класс.
     **/

    public static void main(String[] args) {
        Person person1 = new Person("Aidai", 21, "Mederova/Sovetskaya 142");
        Person person2 = new Person("Beyonce", 34, "Sovoealj/aoaidfua 12");
        Person person3 = new Person("Beeke", 30, "Colifonia 12");
        Person person4 = new Person("kasi", 45, "New York  12");
        Person person5 = new Person("Riki", 22, "aldiufaoi ");
        Person person6 = new Person("Ruf", 35, "berlin 357");
        Person person7 = new Person("Samanta", 18, "alalidg ");

        Person[] fam1 = {person1, person2};
        Person[] fam2 = {person3, person4};
        Person[] fam3 = {person5, person6, person7};

        Apartment apartment = new Apartment("Apartment", "America", fam1);
        System.out.println(apartment);
        int count1 = 0;
        for (Person i : fam1) {
            count1++;
        }
        System.out.println("\nNumber of people that live in Apartment is : "+count1);
        apartment.comUsluga();
        System.out.println();

        Hostel hostel = new Hostel("Hostel", "China", fam2);
        System.out.println(hostel);
        int count2 = 0;
        for(Person i: fam2){
            count2++;
        }
        System.out.println("\nThe number of people in the hostel is : "+ count2);
        hostel.arenda();
        System.out.println();

        Hotel hotel = new Hotel("Hotel", "Berlin", fam3);
        System.out.println(hotel);
        int count3 = 0;
        for (Person i : fam3) {
            count3++;
        }
        System.out.println("\nThe number of people in the Hotel is : "+count3);
        hotel.arenda();


    }
}
