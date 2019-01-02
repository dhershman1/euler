module Problem002 exposing (sumOfEvenTerms)

-- Even Fibonacci Numbers
-- By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
-- a + b = c -> b + c = d -> c + d = e


even : Int -> Bool
even n =
    remainderBy 2 n == 0


buildSeq : Int -> List Int -> List Int
buildSeq to li =
    let
        vals =
            List.take 2 li

        sum =
            List.sum vals
    in
    if sum >= to then
        li

    else
        buildSeq to (sum :: li)


sumOfEvenTerms : Int -> Int
sumOfEvenTerms n =
    buildSeq n [ 2, 1 ]
        |> List.filter even
        |> List.sum
