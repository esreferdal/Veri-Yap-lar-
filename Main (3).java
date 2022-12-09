import java.util.scanner;

public class Main {
	public static void main(String[] args) {
	
	    int[] dizi = new int[]{12, 45, 24, 55, 4, 1, 0, 1};
        System.out.println("Huffman Kodlaması:");
        String[] huffman = huffman(dizi);
        for (int i = 0; i < huffman.length; i++) {
            if (dizi[i] > 0) {
                System.out.println(i + "] " + huffman[i]);
            }
        }	
    
    public static String[] huffman(int[] dizi) {
    String[] codage = new String[dizi.length];
    int valeur1;
    int valeur2;
    int index1 = 0;
    int index2 = 0;
    for (int i = 0; i < dizi.length; i++) {
        codage[i] = new String();
    }

        do {
        valeur1 = Integer.MAX_VALUE;
        valeur2 = Integer.MAX_VALUE;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > 0) {
                if (dizi[i] < valeur1) {
                    valeur2 = valeur1;
                    valeur1 = dizi[index1 = i];
                } else if (dizi[i] < valeur2) {
                    valeur2 = dizi[index2 = i];
                }
            }
        }
        dizi[index1] = 0;
        dizi[index2] += valeur1;
        codage[index1] = codage[index1] + "0";
        codage[index2] = codage[index2] + "1";
        } 
    while (valeur2 != Integer.MAX_VALUE);

    return codage;
    }
	}
}
