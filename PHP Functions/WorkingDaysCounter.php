<?php

// #Hacktoberfest2024
// This function calculates working days between two dates, excluding weekends and custom holidays.

function countWorkingDays($startDate, $endDate, $holidays = [])
{
    $start = new DateTime($startDate);
    $end = new DateTime($endDate);
    $end->modify('+1 day'); // Include end date

    $workingDays = 0;

    while ($start < $end) {
        $dayOfWeek = $start->format('N'); // 1 (Monday) to 7 (Sunday)
        
        if ($dayOfWeek < 6 && !in_array($start->format('Y-m-d'), $holidays)) {
            $workingDays++;
        }

        $start->modify('+1 day');
    }

    return $workingDays;
}

// Example usage
$holidays = ['2024-01-01', '2024-01-15'];
$startDate = '2024-01-01';
$endDate = '2024-02-15';
echo "Working days: " . countWorkingDays($startDate, $endDate, $holidays);
