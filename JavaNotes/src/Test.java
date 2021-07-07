import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("平时分:");
        int score_common = scanner.nextInt();
        double score = (60-score_common)*100/(100-score_common);
        System.out.println("在平时分满的情况下，得到"+score+"分，即可及格");
        double score_danger = (60-score_common*0.8)*100/(100-score_common);
        System.out.println("在平时分有 "+score_common*0.8+" / "+score_common+" 的情况下，得到"+score_danger+"分，即可及格");
        score_danger = (60-score_common*0.5)*100/(100-score_common);
        System.out.println("在平时分有 "+score_common*0.5+" / "+score_common+" 的情况下，得到"+score_danger+"分，即可及格");
    }
}