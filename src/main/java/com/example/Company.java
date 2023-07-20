package com.example;

public class Company {

    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone();

        phone1.name = "SamsungXCover";
        phone1.color = "Black";
        phone1.memory = "128gb";
        phone1.imei = 444545;

        phone2.name = "SamsungA50";
        phone2.color = "Blue";
        phone2.memory = "128gb";
        phone2.imei = 47945;

        phone3.name = "IPhone12";
        phone3.color = "White";
        phone3.imei = 986545;
        phone3.memory = "64gb";

        phone4.name = "RealMe";
        phone4.color = "Blue";
        phone4.imei = 6897545;
        phone4.memory = "128gb";

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        Employee emp4 = new Employee();
        Employee emp5=new Employee();

        emp1.name = "Ram";
        emp1.age = 45;
        emp1.address = "Malmö";
        emp1.empId = 48545;
        emp1.phone = phone1;

        emp2.name = "Shyam";
        emp2.age = 47;
        emp2.address = "Malmö";
        emp2.empId = 497845;
        emp2.phone = phone2;

        emp3.name = "Rohit";
        emp3.age = 34;
        emp3.address = "Lund";
        emp3.empId = 12545;
        emp3.phone = phone4;

        emp4.name = "Mona";
        emp4.age = 25;
        emp4.address = "Helsingborg";
        emp4.empId = 88545;
        emp4.phone = phone3;

        emp5.name = "Sita";
        emp5.age = 31;
        emp5.address = "Landskrona";
        emp5.empId = 48685;

        Employee[] objects={emp1,emp2,emp3,emp4,emp5};
        for(Employee obj: objects) {
            System.out.println(obj.name);
            System.out.println(obj.age);
            System.out.println(obj.address);
            System.out.println(obj.empId);
            if(obj.phone !=null){
            System.out.println(obj.phone.name + "\n");

            }
            else{
                System.out.println("No phone is assigned");
            }

        }




    }
}
