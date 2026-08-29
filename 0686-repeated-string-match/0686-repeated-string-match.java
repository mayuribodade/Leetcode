class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder repeatedstring = new StringBuilder();

        int mincopiesOfA = (int) Math.ceil(
            (double) b.length()/a.length()
        );
        //one value should be in double for ceil value so that it will gives us ceil val
        //ex 9.0/4 = 2.25 = 3 int integer

        for(int i=0 ; i<mincopiesOfA ; i++){
            repeatedstring.append(a);
        }

        //if in that length b occurs then return count of mincopies 
        //if not then adding one more a can definitely gives us b

        if(repeatedstring.toString().contains(b)) return mincopiesOfA;

        //add 1 more a
        repeatedstring.append(a);
        //again check 

         if(repeatedstring.toString().contains(b)) return mincopiesOfA +1;


          return -1;

    }
}