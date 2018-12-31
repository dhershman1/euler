module Problem002 exposing (sumOfEvenTerms)

-- Even Fibonacci Numbers
-- By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
-- a + b = c -> b + c = d -> c + d = e


even : Int -> Bool
even n =
    remainderBy n 2 == 0



-- buildSeq : Int -> Int -> List Int -> List Int
-- buildSeq to n li =
--     if n == to then
--         li
--     else
--         buildSeq to n (List.append (List.singleton (List.head li)) li)


evenTerms : Int -> List Int
evenTerms n =
    List.filter even (buildSeq n 1 [ 1 ])


sumOfEvenTerms : Int -> List Int
sumOfEvenTerms n =
    evenTerms n



-- List.foldl (+) 0 (evenTerms n)
