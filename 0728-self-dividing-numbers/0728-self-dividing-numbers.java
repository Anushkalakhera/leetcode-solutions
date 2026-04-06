class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=left;i<=right;i++){
            
            int num=i;
            int n=num;
            Boolean check=true;
            while(n!=0){
                int rem=n%10;
                if(rem==0 || num%rem!=0){
                    check=false;
                    break;
                }
                n=n/10;
            }
            if(check==true){
                li.add(num);
            }
        }
        return li;
    }
}