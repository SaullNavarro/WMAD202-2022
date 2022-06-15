package ca.ciccc.wmad.assignment2.main.question8;

public class Question8 {
        public void test(){
            System.out.printf("Estimated PI is %f (100 tries)\n", estimatePiWithMonteCarloApproach(100));
            System.out.printf("Estimated PI is %f (1000 tries)\n", estimatePiWithMonteCarloApproach(1000));
            System.out.printf("Estimated PI is %f (10000 tries)\n", estimatePiWithMonteCarloApproach(10000));
        }

        private float estimatePiWithMonteCarloApproach(int tries) {
            float count = 0.0F;

            for (int i = 0; i < tries; i++) {
                double x = Math.random();
                double y = Math.random();
                if (Math.pow(x, 2) + Math.pow(y, 2) < 1) count++;
            }

            return 4 * count / tries;
        }
    }
