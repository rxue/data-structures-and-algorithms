from dataclasses import dataclass
class Solution:
    def nearestExit(self, maze: list[list[str]], entrance: list[int]) -> int:
        q = []
        q.append(Vertex(entrance[0], entrance[1], maze))
        visited = set()
        while len(q) > 0:
            visitingVertex = q.pop(0)
            if not visitingVertex.isExit(): # in case the visiting vertex is exit, there is no need to append it to the queue for moving the next step
                leftV = visitingVertex.left()
                if leftV not in visited and leftV is not None:
                    q.append(leftV)
                upV = visitingVertex.up()
                if upV not in visited and upV is not None:
                    q.append(upV)    
                rightV = visitingVertex.right()
                if rightV not in visited and rightV is not None:
                    q.append(rightV)
                downV = visitingVertex.down()
                if downV not in visited and downV is not None:
                    q.append(downV)
            visited.add(visitingVertex)
        exits = {e for e in visited if e.isExit()}
        return -1 if len(exits) == 0 else min({e.distanceFromEntrance for e in exits})



@dataclass
class Vertex:
    d1:int
    d2:int
    maze:list[list[str]]
    distanceFromEntrance:int = None
    def __eq__(self, other):
        return self.d1 == other.d1 and self.d2 == other.d2
    def __hash__(self):
        return hash((self.d1, self.d2))

    def left(self):
        return self._moveTo(self.d1, self.d2 - 1)
    def up(self):
        return self._moveTo(self.d1-1, self.d2)
    def right(self):
        return self._moveTo(self.d1, self.d2+1)
    def down(self):
        return self._moveTo(self.d1+1, self.d2)
    def isExit(self) -> bool:
        return not self.isEntrance() and (self.d1 == 0 or self.d2 == 0 or self.d1 == len(self.maze)-1 or self.d2 == len(self.maze[self.d1]) - 1)
    def isEntrance(self) -> bool:
        return self.distanceFromEntrance == None
        
    def _moveTo(self, newD1:int, newD2:int):
        if 0 <= newD1 < len(self.maze) and 0 <= newD2 < len(self.maze[newD1]):
            result = self.maze[newD1][newD2]
            if result == '.':
                distanceFromEntrance = 1 if self.distanceFromEntrance is None else self.distanceFromEntrance + 1
                return Vertex(newD1, newD2, self.maze, distanceFromEntrance)
        return None

def main():
    maze = [[".","+"]]
    s = Solution()
    print("shortest path: " + str(s.nearestExit(maze, [0,0])))
    maze = [["+","+",".","+"],[".",".",".","+"],["+","+","+","."]]
    s = Solution()
    print("shortest path: " + str(s.nearestExit(maze, [1,2])))
    maze = [["+","+","+"],[".",".","."],["+","+","+"]]
    print("shortest path: " + str(s.nearestExit(maze, [1,0])))


if __name__ == "__main__":
    main()