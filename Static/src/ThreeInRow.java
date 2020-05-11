import java.util.Scanner;
/**
* このような入力値の評価と出力を繰り返すプログラムをREPL(Read, Eval, Print, Loop)と呼ぶ。
*/
public class ThreeInRow
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("何か入力してください:");
            var line = sc.nextLine();
            if (line.equals("quit")) {
                System.out.print("bye");
                break;
            }
            System.out.println(line);
        }
    }
}