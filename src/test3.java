import java.util.Scanner;
public class test3 {
    public static  void main (String[] args) {
        Scanner inp = new Scanner(System.in);
        int i, tpl=0, bln=0;
        double ort;
        System.out.print("Sayi giriniz: ");
        i = inp.nextInt();

        for (int j = 0; j <= i; j++) {
            if (j%3==0 && j%4==0){
                System.out.println(j);
                tpl+=j;
                bln++;
                }
           }
        ort = tpl / (bln-1);
        System.out.println("bolunebilen sayilarin ortalamasi: "+ort);
    }

}





