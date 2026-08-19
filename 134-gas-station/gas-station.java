class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasp=0;
        int costp=0;
        for(int i=0;i<gas.length;i++){
            gasp+=gas[i];
            costp+=cost[i];
        }

        if(gasp<costp){
            return -1;
        }
        int currentGas = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }
        return start;
    }
}