public class Main{
    public static void main(String[] args){
        int liczbaCalkowita;
        // float liczbaZmiennoprzecinkowa = 2.0f;
        double liczbaZmiennoprzecinkowaZPodwojnaOPrecyzja = 2.0;
        boolean wartoscLogiczna = false;
        char znak = 's';
        String ciagZnakow = "costam";

//        System.out.println(ciagZnakow);

//        System.out.println("Hello world!");
//
//        for(int i = 1;i <= 5;i++){
//            System.out.println("i = " + i);
//        }

        Student student = new Student(1,"Robert","Kubica");
//        student.nrIndeksu = 1;
//        student.imie = "Robert";
//        student.nazwisko = "Kubica";
        Student student2 = new Student(2,"Andrzej","Andrzejewski");
//        student2.nrIndeksu = 2;
//        student2.imie = "Andrzej";
//        student2.nazwisko = "eem";

        System.out.println(student.imie);
        System.out.println(student2.imie);
        student.przedstawSie();
    }
}