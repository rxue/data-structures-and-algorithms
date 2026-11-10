from typing import Set

class Solution:
    def canVisitAllRooms(self, rooms: list[list[int]]) -> bool:
        visitedRooms = {0}
        for k in rooms[0]:
            self.dfs(k, rooms, visitedRooms)
        return len(visitedRooms) == len(rooms)

    def dfs(self, key:int, rooms: list[list[int]], visitedRooms:Set[int]):
        if key in visitedRooms:
            return visitedRooms
        visitedRooms.add(key)
        for k in rooms[key]:
            currentVisitedRooms = self.dfs(k, rooms, visitedRooms)
    
def main():
    s = Solution()
    rooms = [[1,3],[3,0,1],[2],[0]]
    print(s.canVisitAllRooms(rooms))


if __name__ == "__main__":
    main()