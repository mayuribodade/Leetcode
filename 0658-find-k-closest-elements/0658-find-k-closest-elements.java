class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        //from example one
        //The 4 closest numbers to 3.
         //If distances are equal, choose the smaller number.

         List<Integer> list = new ArrayList<>();
         // store array elem in list
         for(int n : arr){
            list.add(n);
         }
         //now our list is createdd
         //now find its distances and sort them according to distance
         // By using Comparators
         Collections.sort(list, (a,b)-> {
         
         int d1 = Math.abs(a-x);
         int d2 = Math.abs(b-x);

         if(d1==d2){//if boths didtance same pick smaller array elem
           return a-b;
           //a-b means jese aaray ke eelm 1-2= -1 hota he negative ans aaya to a ko choose karega that is 1 which is smaller
         }
         //otherwise
         return d1-d2;
         }
         );
         //now we want list upto k elememts
         List<Integer> ans = list.subList(0,k);
         Collections.sort(ans);
         return ans;
    }
}