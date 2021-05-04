package ejercicios.prácticos;

//@author reyapazc

import java.util.Scanner;


public class EjerciciosPrácticos {
    
    //Ejercicio 1
    
    public static String[][] aCodigo;
    
        public static void arrayList() {
        aCodigo = new String[26][2];
        
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
    }

    public static String car(char cara) {
        
        int nCar = (int) cara;
        return aCodigo[nCar - 65][0] + " " + aCodigo[nCar - 65][1];
    }
    
    public static void loop(String frase, char carFra[]){
        
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(carFra[i]).equals(" ")){
                System.out.println("");
            } else {
                System.out.println(car(carFra[i]));
            }
        }
    }
    
    public static String pay(String frase, char carFra[]){
        
        int contador = 1;
        int precio = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(carFra[i]).equals(" ")){
                contador++;
            }
        }
        if(contador <= 5){
            precio = 10;
        } else{
            precio = ((contador - 5) * 3) + 10;
        }
        return "Numero de palabras: " + contador + "\n" + "Son $" + precio + " pesos";
    }
    
    //Ejercicio 2
    
    static String[][] aPersonajes; 
    static String sex;
    
    public static void aPersonajes(){
        
        aPersonajes = new String[16][3];
            
        aPersonajes[0][0] = "Luke Skywalker";
        aPersonajes[0][1] = "172";
        aPersonajes[0][2] = "male";
        aPersonajes[1][0] = "R2-D2";
        aPersonajes[1][1] = "96";
        aPersonajes[1][2] = "n/a";
        aPersonajes[2][0] = "C-3PO";
        aPersonajes[2][1] = "167";
        aPersonajes[2][2] = "n/a";
        aPersonajes[3][0] = "Darth Vader";
        aPersonajes[3][1] = "202";
        aPersonajes[3][2] = "male";
        aPersonajes[4][0] = "Leia Organa";
        aPersonajes[4][1] = "150";
        aPersonajes[4][2] = "female";
        aPersonajes[5][0] = "Owen Lars";
        aPersonajes[5][1] = "178";
        aPersonajes[5][2] = "male";
        aPersonajes[6][0] = "Beru Whitesun lars";
        aPersonajes[6][1] = "165";
        aPersonajes[6][2] = "female";
        aPersonajes[7][0] = "R5-D4";
        aPersonajes[7][1] = "97";
        aPersonajes[7][2] = "n/a";
        aPersonajes[8][0] = "Biggs Darklighter";
        aPersonajes[8][1] = "183";
        aPersonajes[8][2] = "male";
        aPersonajes[9][0] = "Obi-Wan Kenobi";
        aPersonajes[9][1] = "182";
        aPersonajes[9][2] = "male";
        aPersonajes[10][0] = "Yoda";
        aPersonajes[10][1] = "66";
        aPersonajes[10][2] = "male";
        aPersonajes[11][0] = "Jek Tono Porkins";
        aPersonajes[11][1] = "180";
        aPersonajes[11][2] = "male";
        aPersonajes[12][0] = "Jabba Desilijic Tiure";
        aPersonajes[12][1] = "175";
        aPersonajes[12][2] = "hermaphrodite";
        aPersonajes[13][0] = "Han Solo";
        aPersonajes[13][1] = "180";
        aPersonajes[13][2] = "male";
        aPersonajes[14][0] = "Chewbacca";
        aPersonajes[14][1] = "228";
        aPersonajes[14][2] = "male";
        aPersonajes[15][0] = "Anakin Skywalker";
        aPersonajes[15][1] = "188";
        aPersonajes[15][2] = "male"; 
    }
    
    public static void filter(String gender){
        
        sex = gender;
        
        for (int i = 0; i < aPersonajes.length; i++) {
            if(aPersonajes[i][2].equals(sex)){
                System.out.println(aPersonajes[i][0]);
                System.out.println(aPersonajes[i][1]);
                System.out.println(aPersonajes[i][2]);
                System.out.println();
            }
        }
    }
    
    //Ejercicio 3
    
    public static String[][] ques;
    public static String[][] index;
    public static int contador;

    public static void javaQues() {
        
        ques = new String[10][2];
        
        ques[0][0] = "¿Es Java un lenguaje orientado a objetos?";
        ques[0][1] = "0";
        ques[1][0] = "¿Qué es un applet";
        ques[1][1] = "1";
        ques[2][0] = "¿Qué hace el siguiente operador: >?";
        ques[2][1] = "2";
        ques[3][0] = "¿Qué hace el siguiente operador >=?";
        ques[3][1] = "0";
        ques[4][0] = "¿Qué significa JDK?";
        ques[4][1] = "1";
        ques[5][0] = "¿Cuál es una IDE de Java";
        ques[5][1] = "2";
        ques[6][0] = "¿Qué significa JVM";
        ques[6][1] = "0";
        ques[7][0] = "¿De qué tipo es el valor true?";
        ques[7][1] = "1";
        ques[8][0] = "¿Cuál es el operador para sumar?";
        ques[8][1] = "2";
        ques[9][0] = "¿Cómo se imprime el mensaje Hello World?";
        ques[9][1] = "0";
    }

    public static void javaIndex() {
        
        index = new String[10][3];
        
        index[0][0] = "Sí";
        index[0][1] = "No";
        index[0][2] = "No sé";
        index[1][0] = "Una aplicación";
        index[1][1] = "Aplicación que se ejecuta dentro de un navegador";
        index[1][2] = "Una aplicación móvil";
        index[2][0] = "Igual que";
        index[2][1] = "Menor que";
        index[2][2] = "Mayor que";
        index[3][0] = "Mayor o igual que";
        index[3][1] = "Menor o igual que";
        index[3][2] = "Igual que";
        index[4][0] = "Java Direct Kit";
        index[4][1] = "Java Development Kit";
        index[4][2] = "Java Diagnose Kit";
        index[5][0] = "Swift";
        index[5][1] = "PyCharm";
        index[5][2] = "NetBeans";
        index[6][0] = "Java Virtual Machine";
        index[6][1] = "Java Virtuos Machine";
        index[6][2] = "Java Vim Machine";
        index[7][0] = "int";
        index[7][1] = "boolean";
        index[7][2] = "double";
        index[8][0] = "%";
        index[8][1] = "X";
        index[8][2] = "+";
        index[9][0] = "System.out.println('Hello, World!');";
        index[9][1] = "System.out.println('Hello, World!')";
        index[9][2] = "println('Hello, World!');";
    }

    public static void value(){
        
        String answ;
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < ques.length; i++) {
            System.out.println();
            System.out.println("Pregunta número " + (i + 1));
            System.out.println(ques[i][0]);
            System.out.println("0.- " + index[i][0]);
            System.out.println("1.- " + index[i][1]);
            System.out.println("2.- " + index[i][2]);
            System.out.println();
            System.out.print("Escribe un número de la lista como respuesta: ");
            answ = read.nextLine();
            if(ques[i][1].equals(answ)){
                contador++;
            }
        }
    }
    
    public static int contador(){
        
        return contador;
    }
    
    //Main
    
    public static void main(String[] args) {
        
        System.out.println("-Universidad Autónoma de Campeche-");
        System.out.println("------Facultad de Ingeniería------");
        System.out.println("-------Rey A. Paz-Carrillo-------");
        System.out.println("");
        System.out.println("Escoge un número de la lista para ejecutar el programa deseado:");
        System.out.println("");
        System.out.println("(1). Leer frase y transcribirla a código Morse.");
        System.out.println("(2). Filtrar sexo de los personajes de Star Wars.");
        System.out.println("(3). Java Quizz.");

        Scanner read = new Scanner(System.in);
        int choice = read.nextInt();
        choices(choice);
        
    }
        
    public static void choices(int choosen){
        
        Scanner read = new Scanner(System.in);
            
        switch (choosen) {
            case 1 -> {
                System.out.println("Escribe una frase para ser traducida a Morse y calcular el precio por traducción:");
                String frase = read.nextLine().toUpperCase();
                char carFra[] = frase.toCharArray();
                arrayList();
                loop(frase, carFra);
                System.out.println(pay(frase, carFra));
            }

            case 2 -> {
                System.out.println("Escribe el género que quieres filtrar para los personajes:");
                System.out.println("male");
                System.out.println("female");
                System.out.println("n/a");
                System.out.println("hermaphrodite");
                String gender = read.nextLine();
                aPersonajes();
                filter(gender);
            }

            case 3 -> {
                javaQues();
                javaIndex();
                value();
                System.out.println();
                System.out.println("Tu calificación fue de: " + contador + "0");
            }

            default -> System.out.println("Por favor, escoge un número de la lista para ejecutar un programa.");
        
        }
        
    }

}    