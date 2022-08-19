public class Main {
    public static void main(String[] args) {

        //IF
        int numeroIf = 3;
        if (numeroIf > 0){
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }

        //WHILE
        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //DO-WHILE
        int numeroDoWhile=3;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while (numeroDoWhile<3);

        //FOR ¿?
        for (int numeroFor = 0; numeroFor <=3; numeroFor++){
            System.out.println(numeroFor);
        }

        //CASE
        var estacion = "invierno";

        switch (estacion){
            case "primavera":
                System.out.println("Te encuentras en primavera");
                break;
            case "verano":
                System.out.println("Te encuentras en verano");
                break;
            case "otoño":
                System.out.println("Te encuentras en otoño");
                break;
            case "invierno":
                System.out.println("Te encuentras en invierno");
                break;
            default:
                System.out.println("Esta no es una estación");
        }
    }

}