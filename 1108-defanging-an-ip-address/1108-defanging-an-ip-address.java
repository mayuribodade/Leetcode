class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<address.length() ; i++){
            char s = address.charAt(i);

            if(s == '.'){
                sb.append("[.]");
            }
            else{
                sb.append(s);
            }
        }
        return sb.toString();
    }
}