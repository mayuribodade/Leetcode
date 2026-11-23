class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0 ; i<=rowIndex ; i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0 ; j<=i ; j++){
                if(i == j  || j==0){
                    row.add(1);
                }
                else{
                    int a = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                    row.add(a);
                }
            }
            if(i == rowIndex){
                return row;
            }
              list.add(row);
        }
        return new ArrayList<>();
    }
}