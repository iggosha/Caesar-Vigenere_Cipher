import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("������� �����: ");
        char[] word = read.nextLine().toCharArray();
        toCodeCaesar(word);
        fromCodeCaesar(word);
    }
    static public void toCodeCaesar(char[] $word) {
        System.out.println("������� ���� ��� ����������: ");
        int key;
        key = read.nextInt();
        for (int i = 0; i < $word.length; i++) $word[i] += key;
        System.out.println("������������: " + Arrays.toString($word));
    }
    static public void fromCodeCaesar(char[] $word) {
        System.out.println("������� ���� ��� �����������: ");
        int key;
        key = read.nextInt();
        for (int i = 0; i < $word.length; i++) $word[i] -= key;
        System.out.println("�������������� �����: " + Arrays.toString($word));
    }
}