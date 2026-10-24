public class Issue55_QuizStudentStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A15", "B15", "C15"};
        String target = new String("B15");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
