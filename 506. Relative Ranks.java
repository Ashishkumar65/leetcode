/*https://leetcode.com/problems/relative-ranks/submissions/1252601052/?envType=daily-question&envId=2024-05-08
*/

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int N = score.length;

        PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> b.getKey() - a.getKey());
        for(int i = 0 ; i < N; i++){
            pq.add(new Pair<>(score[i],i));
        }

        String[] ans = new String[N];
        int rank = 1;
        while(!pq.isEmpty()){
            Pair<Integer,Integer> pair = pq.poll();
            int ind = pair.getValue();
            if(rank == 1){
                ans[ind] = "Gold Medal";
            } else if(rank == 2){
                ans[ind] = "Silver Medal";
            } else if(rank == 3){
                ans[ind] = "Bronze Medal";
            } else{
                ans[ind] =String.valueOf(rank);
            }
            rank++;
        }
        return ans;
    }
}
