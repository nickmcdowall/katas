package com.nick.kata.leetcode.twosum;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @See https://leetcode.com/problems/two-sum/
 */
@RunWith(JUnitParamsRunner.class)
public class SolutionTest {

    private Solution solution = new Solution();

    @Parameters({
            "0,1, 8,  4,4",
            "0,1, 6,  4,2",
            "0,1, 10, 1,9",
            "0,2, 10, 1,0,9",
            "0,1, 9,  2,7,11,15",
            "0,3, 9,  2,15,11,7",
            "0,3, -9, -2,15,11,-7",
    })
    @Test
    public void findIndicesOfNumbersThatSumToMakeTarget(int index1, int index2, int target, String... numStrings) {
        int[] nums = convert(numStrings);

        int[] result = solution.twoSum(nums, target);

        int[] expectedResult = {index1, index2};

        assertThat(result, equalTo(expectedResult));
    }

    private int[] convert(String[] numsStrings) {
        return Arrays.stream(numsStrings)
                .map(Integer::new)
                .mapToInt(integer -> integer.intValue())
                .toArray();
    }
}
