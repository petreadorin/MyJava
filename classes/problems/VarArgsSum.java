package classes.problems;

public class VarArgsSum {
    int sum(int... n) {
        int result = 0;

        for (int i = 0; i < n.length; i++)
            result += n[i];
        return result;
    }
}
