class Teacher {
    void teach() {
        System.out.println("Teacher is teaching");
    }
}

class MathsTeacher extends Teacher {
    void solveProblems() {
        System.out.println("Solving maths problems");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        MathsTeacher t = new MathsTeacher();
        t.teach();
        t.solveProblems();
    }
}