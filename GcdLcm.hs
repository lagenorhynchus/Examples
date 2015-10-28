{-# LANGUAGE MonadComprehensions #-}

module GcdLcm where

import Control.Applicative ((<$>))

gcd' :: Int -> Int -> Maybe Int
gcd' a b
  | a < 1 || b < 1 = Nothing
  | otherwise      = Just $ divide a b
  where
    divide x y
      | y == 0    = x
      | otherwise = divide y (x `mod` y)

lcm' :: Int -> Int -> Maybe Int
lcm' a b = fmap (a * b `div`) (gcd' a b)

lcm'' :: Int -> Int -> Maybe Int
lcm'' a b = (a * b `div`) <$> gcd' a b

lcm''' :: Int -> Int -> Maybe Int
lcm''' a b = do
  g <- gcd' a b
  return $ a * b `div` g

lcm'''' :: Int -> Int -> Maybe Int
lcm'''' a b = [a * b `div` g | g <- gcd' a b]
