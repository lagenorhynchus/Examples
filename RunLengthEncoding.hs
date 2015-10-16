module RunLengthEncoding where

import Data.List (group)

rle :: String -> String
rle = concatMap (\s -> head s : show (length s)) . group
