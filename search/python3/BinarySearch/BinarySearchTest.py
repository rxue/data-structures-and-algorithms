import unittest

from BinarySearch import binarySearch

class TestHelper(unittest.TestCase):
    def testBinarySearch_2Numbers(self):
        self.assertEqual(binarySearch(1, [1,3]), 0)
        self.assertEqual(binarySearch(3, [1,3]), 1)
    def testBinarySearch_oddAmount(self):
        self.assertEqual(binarySearch(1, [1,3,5]), 0)
        self.assertEqual(binarySearch(3, [1,3,5]), 1)
        self.assertEqual(binarySearch(5, [1,3,5]), 2)
    def testBinarySearch_evenAmount(self):
        self.assertEqual(binarySearch(1, [1,3,5,6]), 0)
        self.assertEqual(binarySearch(3, [1,3,5,6]), 1)
        self.assertEqual(binarySearch(5, [1,3,5,6]), 2)
        self.assertEqual(binarySearch(6, [1,3,5,6]), 3)
    


if __name__ == '__main__':
    unittest.main()