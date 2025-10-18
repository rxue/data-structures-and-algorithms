import unittest

from chapter1.ex_1_9_merge import merge


class TestMerge(unittest.TestCase):

    def test_merge_simple(self):
        result = merge([1, 3], [2, 4])
        self.assertEqual(result, [1, 2, 3, 4])