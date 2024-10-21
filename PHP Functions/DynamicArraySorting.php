<?php 

/**
 *  => To run the function execute run.bat file in the PHP Functions directory.
 *  ===================== ABOUT THE PROGRAM =====================
 *  - This program is designed to sort an array of any type.
 *  - It calculates the time taken for the dynamic array  sorting.
 */
namespace DynamicArraySorting;


class DynamicArraySorting {
    protected static $randomArray = [];
    public static $randomArrayLength = NULL;

    public static function sort(array $array) {
        sort($array);
        return $array;
    }

    public static function generateDynamicArray(int $ArrayLength){
        for ($i=0; $i < $ArrayLength; $i++) { 
            self::$randomArray[] = rand(0, $ArrayLength);
        }
        return self::$randomArray;
    }

    public static function getRandomArray($randomArrayLength) {
        return self::generateDynamicArray($randomArrayLength);
    }
}

DynamicArraySorting::$randomArrayLength = rand(0, 500);
$sortingStartedAt = microtime(true);
$sortedArray = DynamicArraySorting::sort(DynamicArraySorting::getRandomArray(DynamicArraySorting::$randomArrayLength));
$sortingEndedAt = microtime(true);

$totalTime = $sortingEndedAt - $sortingStartedAt;
echo "Sorted Array: [" . implode(", ", $sortedArray) . "]<br/>";
echo "Total time taken: " . $totalTime . " seconds\n";