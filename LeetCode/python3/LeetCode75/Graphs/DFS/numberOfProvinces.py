class Solution:
    def __init__(self): 
        self.vertice = {}
        self.forest = []
    def findCircleNum(self, isConnected: list[list[int]]) -> int:
        for cityIndex in range(len(isConnected)):
            self.vertice[cityIndex] = 'white'
        for cityIndex in range(len(isConnected)):
            if self.vertice[cityIndex] == 'white':
                tree = set()
                self.forest.append(tree)
                self._visit(isConnected, cityIndex, tree)
        return len(self.forest)
    def _visit(self, isConnected: list[list[int]], cityIndex: int, tree:set[int]):
        self.vertice[cityIndex] = 'discovered'
        tree.add(cityIndex)
        for offset in range(1, len(isConnected)):
            adjacentIdx = cityIndex+offset
            if self._isAdjacentConnected(adjacentIdx, isConnected[cityIndex]):
                if self.vertice[adjacentIdx] == 'visited':
                    adjacentTree = self._getTree(adjacentIdx)
                    if adjacentTree != tree:
                        tree.update(adjacentTree)
                        self.forest.remove(adjacentTree)
                else:
                    self._visit(isConnected, cityIndex+offset, tree)  
        self.vertice[cityIndex] = 'visited'
    def _isAdjacentConnected(self, adjacentCityIndex:int, isConnected: list[int]) -> bool:
        return  0 <= adjacentCityIndex < len(isConnected) and isConnected[adjacentCityIndex] == 1
    def _getTree(self, cityIndex:int):
        for tree in self.forest:
            if cityIndex in tree:
                return tree
        return None



def main():
    isConnected = [[1,1,1],[1,1,1],[1,1,1]]
    s = Solution()
    print(s.findCircleNum(isConnected) == 1)
    isConnected = [[1,0,0,1],[0,1,1,0],[0,1,1,1],[1,0,1,1]]
    s = Solution()
    print(s.findCircleNum(isConnected) == 1)


if __name__ == "__main__":
    main()