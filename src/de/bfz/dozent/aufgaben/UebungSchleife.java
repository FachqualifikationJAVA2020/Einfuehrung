package de.bfz.dozent.aufgaben;

public class UebungSchleife {

    public static void main(String[] args) {
    	for(int i = 1; i <= 20; i = i + 1){
            if(i % 3 == 0){
                System.out.println("piep");
            }else{
                System.out.println(i);
            }
        }
    }
}