class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[]  a = paragraph.split("[!?',;.\\s]+");

       HashSet<String> bannedset = new HashSet<>();

       for(String words : banned){
        bannedset.add(words);
       }

       HashMap<String , Integer> map = new HashMap<>();

       String ans = "";
       int maxcount = 0;

       for(String word : a){
        if(!word.isEmpty()  && !bannedset.contains(word)){
            int count = map.getOrDefault(word , 0)+1;
            map.put(word , count);

            if(count> maxcount){
            maxcount = count;
            ans = word;
         }
        }
       }
       return ans;
    }
}