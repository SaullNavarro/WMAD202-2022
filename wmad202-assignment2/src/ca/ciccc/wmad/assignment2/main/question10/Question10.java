package ca.ciccc.wmad.assignment2.main.question10;

public class Question10 {
    public void test() {
        System.out.printf("%d", findTargetNumber());
    }
    private double f1(int x) {
        return Math.pow(2, x);
    }
    private double f2(int x) {
        return Math.pow(x, 5);
    }
    private int findTargetNumber() {
        int tmp = 4;
        int t = -1;

        while(t == -1) {
            boolean isInvalid = false;

            for (int i = 4; i < tmp; i++) {
                if (!(f1(i) < f2(i))) {
                    isInvalid = true;
                    break;
                }
            }

            if (isInvalid) {
                tmp++;
                continue;
            }

            if (!(f1(tmp) > f2(tmp) || f1(tmp + 1) > f2(tmp + 1))) {
                isInvalid = true;
            }

            if (isInvalid) {
                tmp++;
                continue;
            }

            t = tmp;
        }

        return t;
    }
}
