class RecentCounter:
    def __init__(self):
        self.queue = []

    def ping(self, t: int) -> int:
        while len(self.queue) > 0 and (t - 3000) - self.queue[0] > 3000:
            self.queue.pop(0)
        self.queue.append(t-3000)
        return len(self.queue)
    
def main():
    obj = RecentCounter()
    print(obj.ping(1))
    print(obj.ping(100))
    print(obj.ping(3001))
    print(obj.ping(3002))
if __name__ == "__main__":
    main()    