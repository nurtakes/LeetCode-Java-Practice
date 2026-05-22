class Solution {
    public boolean isHappy(int n) {
        while(true) {
            int counter = 0;
            int tempForCounter = n; 
            while(tempForCounter != 0) {
                tempForCounter = tempForCounter / 10;
                counter++;
            }
            
            double sum = 0;
            int tempForDigits = n; 
            
            for(int i = 1; i <= counter; i++) {
                int basamak = tempForDigits % 10; 
                sum += Math.pow(basamak, 2);
                tempForDigits = tempForDigits / 10; 
            }
            
            if(sum == 1) {
                return true;
            }
            
            if(sum == 4) {
                return false; 
            }
            
            n = (int) sum;
        }
    }
}

