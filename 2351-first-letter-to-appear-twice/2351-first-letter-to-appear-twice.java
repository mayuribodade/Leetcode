class Solution {
    public char repeatedCharacter(String s) {
      Queue<Character> q = new LinkedList<>();

        for(int i = 0; i < s.length(); i++) {

           if(q.contains(s.charAt(i))) {
                return s.charAt(i);
            }
           q.add(s.charAt(i));
        }

        return 'z';
    }
}