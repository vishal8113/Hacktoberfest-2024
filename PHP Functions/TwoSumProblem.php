<?php 
namespace TwoSumProblem;

/**
 * To Execute the following code just run the run file and then provide TwoSumProblem.php in URL like this: http://localhost:8002/TwoSumProblem.php
 * *************************************************************************************************************************************************
 * This code simply figures out which of the array indexs array used to find the sum of two numbers.
 * - It checks if the subtraction of main & derived array can figure out the targeted value. If yes, then it will return the index of main array which found the result.
*/
class TwoSumProblem {
    
    public static $target = 10; //Change the target value as per your desire.
    public static $nums = [2,4,8,11,18];
    protected static $mapping = [];
    protected static $totalIterations = 0;

    public static function twoSum($nums, $target) {
        foreach ($nums as $mainKey => $value) {
            if(!in_array($value, Self::$mapping)){
                Self::$mapping[] = $value;
            }
            foreach (Self::$mapping as $childKey => $mappingValue) {
                if($target == $value - $mappingValue || $target == $mappingValue - $value ){
                    return "Keys Matched: $childKey, $mainKey || From Array: {".implode(', ', $nums)."}";
                }else{
                    $response = "Could not find any key to calculate two sum index values.";
                }
            }
            self::$totalIterations++;

        }
        return $response;
    }

    public static function getTwoSumResponse(){
        echo Self::twoSum(Self::$nums, Self::$target);
    }
}

TwoSumProblem::getTwoSumResponse();