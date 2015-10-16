module RunLengthEncoding where

import Data.List (group)

-- | ランレングス符号化
--
-- >>> rle "AAAABBCCCA"
-- "A4B2C3A1"
-- >>> rle ""
-- ""
rle :: String -> String
rle = concatMap (\s -> head s : show (length s)) . group
