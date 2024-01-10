public class minRose {
    class Solution {
        public int minDays(int[] bloomDay, int m, int k) {
            // Check if it's possible to make 'm' bouquets each with 'k' roses
            if (bloomDay.length < m * k) {
                return -1; // Not enough roses to make the required bouquets
            }
    
            int start = 1;
            int end = Arrays.stream(bloomDay).max().getAsInt();
            int result = -1;
    
            while (start <= end) {
                int mid = start + (end - start) / 2;
    
                if (canMakeBouquets(bloomDay, mid, m, k)) {
                    result = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
    
            return result;
        }
    
        private boolean canMakeBouquets(int[] bloomDay, int mid, int m, int k) {
            int bouquetCount = 0;
            int consecutiveBloomedRoses = 0;
    
            for (int day : bloomDay) {
                if (day <= mid) {
                    consecutiveBloomedRoses++;
                    if (consecutiveBloomedRoses == k) {
                        bouquetCount++;
                        consecutiveBloomedRoses = 0;
                    }
                } else {
                    consecutiveBloomedRoses = 0;
                }
            }
    
            return bouquetCount >= m;
        }
    }
    
}
