 

public class upparBound {
    // here we found uppar bound : means found smallest element but it largest than n :
    // for exmaple : 1,2,3,6,7,8,11,11,11,12 : in this array n=1, so find a value it larger than n but smallest :

    public static void main(String[] args) {
        int[] a={1,2,3,6,7,8,11,11,11,12};

        int start=0;
        int ans=-1;
        int target=1;
        int end=a.length-1;

        while ( start<=end) {
            int mid=start+((end-start)/2);
            if(a[mid]>target){
                ans=mid;
                end=mid-1;

            }else{
                start=mid+1;
            }
            
        }
        System.out.println(ans);
    }
}
