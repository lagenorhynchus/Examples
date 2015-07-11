module FizzBuzzFP where

fizzBuzz :: Int -> String
fizzBuzz n
  | n < 1                            = error "n cannot be less than 1"
  | isDivisibleBy3 && isDivisibleBy5 = "Fizz Buzz"
  | isDivisibleBy3                   = "Fizz"
  | isDivisibleBy5                   = "Buzz"
  | otherwise                        = show n
  where
    isDivisibleBy3 = n `mod` 3 == 0
    isDivisibleBy5 = n `mod` 5 == 0

main :: IO ()
main = mapM_ (print . fizzBuzz) [1..30]
