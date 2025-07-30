public class max {
    public static void main(String[] args){
        int[] arr = {2,3,-8,7,-1,2,3};
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int currsum=0;
            for(int j=i;j<arr.length;j++){
                currsum=currsum+arr[j];
                maxsum=Math.max(currsum,maxsum);
            System.out.println(maxsum);
            }
        }
    System.out.print(maxsum);

    }
    
}
