/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Follow up:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

#include <vector>
#include <algorithm>

class Solution
{
public:
    void rotate(vector<int> &nums, int k)
    {
        if (k > nums.size())
        {
            k = k - nums.size();
        }
        if (k == 0)
        {
            return;
        }

        else if (nums.size() <= 2 && k != 2)
        {
            reverse(nums.begin(), nums.end());
        }
        else if (k % nums.size() != 0)
        {

            reverse(nums.begin(), nums.end());
            reverse(nums.begin(), nums.begin() + k);
            reverse(nums.begin() + k, nums.end());
        }
    }
};