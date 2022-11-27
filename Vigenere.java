import java.util.Arrays;
import java.util.Scanner;

public class Vigenere {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("���� ��������");
        System.out.println("������� �����: ");
        char[] word = read.nextLine().toCharArray();
        toCipherVigenere(word);
        fromCipherVigenere(word);

    }
    static public void toCipherVigenere(char[] $word) {
        System.out.println("������� ����: ");
        char[] key = read.nextLine().toCharArray();
        for (int i = 0; i < $word.length; i++) $word[i] += (int) key[i%(key.length)]-1040;
        System.out.println("������������: " + Arrays.toString($word));
    }

    static public void fromCipherVigenere(char[] $word) {
        System.out.println("������� ����: ");
        char[] key = read.nextLine().toCharArray();
        for (int i = 0; i < $word.length; i++) $word[i] -= (int) key[i%(key.length)]-1040;
        System.out.println("�������������� �����: " + Arrays.toString($word));
    }
}
