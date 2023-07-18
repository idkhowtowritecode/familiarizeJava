/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// @lc code=start
class Solution {
    /*
     * I think this problem is a simple but an important problem to check someone
     * really knows greedy.
     * the main question of the algorithm is
     * that how can we show that the update always result in a valid gas station(gas
     * > cost),
     * 
     * observation: if a small circuit its netGas is negative, then no valid start
     * point int that interval.
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // get a gas leaving array
        for (int i = 0; i < gas.length; i++) {
            gas[i] = gas[i] - cost[i];
        }

        int start = 0;
        int accumulateGas = 0;
        int netGas = 0;

        for (int i = 0; i < gas.length; i++) {
            accumulateGas += gas[i];
            netGas += gas[i];
            // this help us to reach a valid point
            if (accumulateGas < 0) {

                accumulateGas = 0;

                start = i + 1;
            }
        }
        if (netGas < 0)
            return -1;
        return start;
    }
}
// @lc code=end
