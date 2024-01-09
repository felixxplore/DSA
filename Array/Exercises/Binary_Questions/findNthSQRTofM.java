public class findNthSQRTofM {
    public static void main(String[] args) {
        
    }
    static int NthRoot(int n, int m) {
        // Write your code here.

        
        // declare start and end :
        // start=1 and end=m: 
        int start=1;
        int end=m;

        while(start<=end){
            int mid=start+(end-start)/2;

            // mid ko n times multiply karo and agar vo equal aaya m ke to mid ko return kar do :
            if(Math.pow(mid, n)==m){
                return mid;
            }
            // agar values badi aayi m se to mid-1 karo 
            else if(Math.pow(mid, n)>m){
                end=mid-1;
            }
            // other values choti hain m se to mid+1
            else{
                start=mid+1;
            }
            // equal bhee nhi, and badi choti karne se start bada hoga end se loop end return -1
        }
        return -1;
    }

}

//? dry run code :
/*
 * Now, let's see the dry run:
* Initial values: start=1, end=16.
* First iteration:
* mid=8, Math.pow(8, 2) = 64 (which is greater than 16). So, set end=mid-1 => end=7.
* Second iteration:
* mid=4, Math.pow(4, 2) = 16 (which is equal to 16). So, return mid=4.
* The function will return 4, which is the correct result for the 2nd square root of 16
 */