public class Exercise {
    public int Calculate() {
        int count = 0;
        for (int i = 0; i <= 999999; i++) {
            String num = String.format("%06d", i);
            int sum1 = num.charAt(0) - '0' + num.charAt(1) - '0' + num.charAt(2) - '0';
            int sum2 = num.charAt(3) - '0' + num.charAt(4) - '0' + num.charAt(5) - '0';
            if (sum1 == sum2) {
                count++;
            }
        }
        return count;
    }
}