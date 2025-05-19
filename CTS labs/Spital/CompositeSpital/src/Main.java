public class Main {
    public static void main(String[] args) throws Exception {
        DepartamentAbstract departament1 = new Departament(10,"Cardio");
        DepartamentAbstract departament2 = new Departament(10,"Dermato");
        DepartamentAbstract departament3 = new Departament(10,"Orto");
        DepartamentAbstract secctie1 = new Sectie(3, "s1");
        DepartamentAbstract secctie2 = new Sectie(3, "s2");
        DepartamentAbstract secctie3 = new Sectie(3, "s3");
        DepartamentAbstract secctie4 = new Sectie(3, "s4");

        try{
            departament2.addNod(departament1);
            departament2.addNod(departament3);
            departament2.addNod(secctie1);
            departament1.addNod(secctie2);
            departament3.addNod(secctie3);
            departament3.addNod(secctie4);
            departament2.getInfo("");

            System.out.println("-------------------------------");


            departament2.deleteNod(departament1);
            departament3.addNod(departament1);
            departament2.getInfo("");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}