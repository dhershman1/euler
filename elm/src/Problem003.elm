module Problem003 exposing (largestPrimeFactor)

-- Largest prime factor
-- Find the largest prime factor of 600851475143


zero : Int -> Bool
zero n =
    n == 0


primeFactors : Int -> Int -> List Int -> List Int
primeFactors n divisor factors =
    let
        rem =
            remainderBy divisor n
    in
    if n < 2 then
        factors

    else if zero (remainderBy divisor n) then
        primeFactors (divisor // n) divisor (divisor :: factors)

    else
        primeFactors n (divisor + 1) factors


largestPrimeFactor : Int -> Int
largestPrimeFactor n =
    Maybe.withDefault 0 (List.maximum (primeFactors n 2 []))
