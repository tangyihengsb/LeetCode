/*
由于移动偶数个单位需要消耗0，而移动奇数个单位需要消耗1，
即从筹码的下标：奇数偶数之间变换有消耗，而奇数内部、偶数内部变换则无变换，
那么我们要么将下标为奇数的变换为偶数，要么将下标为偶数的变换为奇数，取决于两者之间的最小值。

通俗来讲，我们先将所有下标为奇数的移动到一个奇数下标位置处，消耗为0；同理偶数下标的也是这样处理。

目前总消耗还是为0，且只有两种下标的筹码，它们之间一个筹码转换的消耗为1，
要得到将所有筹码转移到同一个位置的总消耗最小，那么转化为求这两个下标处个数最小者。

*/



class Solution {
    public int minCostToMoveChips(int[] chips) {
        int ans = 0;
        int odd = 0, even = 0;
        for(int i=0; i<chips.length; i++) {
            if(chips[i] % 2 != 0)   odd++;
            else    even++;
        }
        return Math.min(n1, n2);
    }
}
