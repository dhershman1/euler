module Problem001 exposing (sumMultiples)

-- Multiples of 3 and 5
-- Find the sum of all the multiples of 3 or 5 below 1000


divisible : Int -> Bool
divisible n =
    remainderBy 3 n == 0 || remainderBy 5 n == 0


findMultiples : Int -> List Int
findMultiples n =
    List.filter divisible (List.range 1 n)


sumMultiples : Int -> Int
sumMultiples n =
    List.sum (findMultiples n)
