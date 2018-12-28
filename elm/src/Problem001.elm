module Problem001 exposing (sumMultiples)


divisible : Int -> Bool
divisible n =
    remainderBy 3 n == 0 || remainderBy 5 n == 0


findMultiples : Int -> List Int
findMultiples n =
    List.filter divisible (List.range 1 n)


sumMultiples : Int -> Int
sumMultiples n =
    List.foldl (+) 0 (findMultiples n)
