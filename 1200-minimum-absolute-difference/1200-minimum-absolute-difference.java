class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minAb = Integer.MAX_VALUE;
        for(int i=0 ; i<arr.length-1 ; i++){
            minAb = Math.min(minAb , (arr[i+1] -arr[i]));
        }
        //we get minAb
        List<List<Integer>> output = new ArrayList<>();

        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i+1] - arr[i] == minAb){
                output.add(List.of(arr[i] , arr[i+1]));
            }
        }
        return output;
    }
}