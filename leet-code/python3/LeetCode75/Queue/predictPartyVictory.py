from queue import Queue
class Solution:
    def predictPartyVictory(self, senate: str) -> str:
        if not "R" in senate:
            return "Dire"
        if not "D" in senate:
            return "Radiant"
        counterMap = {"R":"D", "D":"R"}
        q = Queue()
        for c in senate:
            q.put(c)
        currentV = q.get()
        counterV = counterMap[currentV]
        if q.qsize() > 0 and counterV in list(q.queue):
            newQ = self._ban(counterV, q)
        else:
            newQ = q
        newQ.put(currentV)
        return self.predictPartyVictory(''.join(newQ.queue))
    def _ban(self, bannedV:chr, q:Queue) -> Queue:
        newQueue = Queue()
        found = False
        while q.qsize() > 0:
            next = q.get()
            if (not found) and next == bannedV:
                found = True
                continue
            else:
                newQueue.put(next)
        return newQueue
                


def main():
    s = Solution()
    print(s.predictPartyVictory("RDD"))
    nums = "DDRRR"
    print(s.predictPartyVictory(nums))
    nums = "RDR"
    print(s.predictPartyVictory(nums))


if __name__ == "__main__":
    main() 
