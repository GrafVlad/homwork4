import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] correctAnswers = {3, 2, 1};
        String[] questions = new String[]{
                "Столица России?\n1. Рим\n2. Вена\n3. Москва",
                "Что лишнее?\n1. Пицца\n2. Вино\n3. Паста",
                "Название замка во Франции?\n1. Каркасон\n2. Брест\n3. Вигвам"
        };
        int result = 0;
        for (int i = 0; i < questions.length; i++) {
            String question = questions[i];
            System.out.println(question);
            try {
                int answer = sc.nextInt();
                if (answer == correctAnswers[i]) {
                    System.out.println("Верно.\n");
                    result += 1;
                } else {
                    System.out.println("Неверно.\n");
                }
            } catch (Exception e) {
                System.out.println("Пожалуйста, введите ответ цифрой.\n");
                sc.next();
                i -= 1;
            }
        }
        System.out.println("Всего правильных ответов: " + result + " из " + questions.length + ".");
    }
}