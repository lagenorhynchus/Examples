module SortingTest where

import Data.Function (on)
import Data.List (sortBy)

data User = User {
  id' :: Int,
  name :: String
} deriving (Eq, Show)

main :: IO ()
main = do
  putStrLn ("users: " ++ show users)
  putStrLn ("sortedUsers1: " ++ show sortedUsers1)
  putStrLn ("sortedUsers2: " ++ show sortedUsers2)
  where
    users = [User 3 "A", User 1 "B", User 2 "C"]
    sortedUsers1 = sortBy (\x y -> compare (id' x) (id' y)) users
    sortedUsers2 = sortBy (compare `on` id') users
