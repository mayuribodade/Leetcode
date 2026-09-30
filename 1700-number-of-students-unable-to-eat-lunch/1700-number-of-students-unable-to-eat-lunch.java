class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();

        for(int i=students.length-1 ; i>=0 ; i--){
            st.push(sandwiches[i]);
        }

        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0 ; i<students.length ; i++){
            q.add(students[i]);
        }
        
        int rotation  = 0;
        while(!q.isEmpty() && rotation<q.size()){
            if(q.peek().equals(st.peek())){
                q.poll();
                st.pop();
                rotation  = 0;
            }
            else{
                int a = q.poll();
                q.add(a);
                rotation++;
            }
        }
       return q.size();
    }
}