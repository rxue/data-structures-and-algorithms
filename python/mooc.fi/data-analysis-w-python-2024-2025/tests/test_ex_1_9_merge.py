import unittest

from chapter1.ex_1_9_merge import merge


class TestMerge(unittest.TestCase):

    def test_merge_base(self):
        result = merge([1, 3], [2, 4])
        self.assertEqual(result, [1, 2, 3, 4])
    def test_merge_base_opposite(self):
        result = merge([2, 4], [1, 3])
        self.assertEqual(result, [1, 2, 3, 4])
    def test_merge_with_same(self):
        result = merge([4], [4])
        self.assertEqual(result, [4, 4])
        