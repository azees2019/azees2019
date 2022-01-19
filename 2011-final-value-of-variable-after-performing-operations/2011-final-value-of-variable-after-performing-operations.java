class Solution {
    public int finalValueAfterOperations(String[] str) {
        int sum =0;
        for(int i =0; i<str.length;i++){
            if(str[i].equals("X++") || str[i].equals("++X"))
                sum++;
            else
                sum--;
        }
    return sum;
}
}
   