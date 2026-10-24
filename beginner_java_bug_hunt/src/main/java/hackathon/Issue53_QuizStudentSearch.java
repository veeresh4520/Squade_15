public class Issue53_QuizStudentSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {3, 10, 5, 115};
        int target = 115;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
