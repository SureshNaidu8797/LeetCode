// class Solution {
//     public boolean checkPowersOfThree(int n) {
//         if(n==0)
//         return true;
//         if(n%3==2)
//         return false;
//         return checkPowersOfThree(n/3);
//     }
// }
class Solution {
    public boolean checkPowersOfThree(int n){
        while(n>0){
            if(n%3==2){
                return false;
            }
            n/=3;
        }
        return true;
    }
}