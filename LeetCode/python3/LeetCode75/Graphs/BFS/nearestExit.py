from dataclasses import dataclass
class Solution:
    def nearestExit(self, maze: list[list[str]], entrance: list[int]) -> int:
        q = []
        q.append(Vertex(entrance[0], entrance[1]))
        while len(q) > 0:
            vistingVertex = q.pop(0)


@dataclass
class Vertex:
    d1:int
    d2:int
    distanceFromEntrance:int = 0
    isExit:bool = False
    def left(self, maze: list[list[str]]) -> Vertex:
        newD2 = self.d2 - 1
        if 0 <= newD2 < len(maze[self.d1]):
            result = maze[self.d1][newD2]
            if result == '.':
                return Vertex(self.d1, newD2, self.distanceFromEntrance + 1, self.d1 == 0 or self.d2 == 0)
        return None