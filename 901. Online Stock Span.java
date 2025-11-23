class StockSpanner {
    Stack<Integer> prices = new Stack<>();
    Stack<Integer> span = new Stack<>();

    public StockSpanner() {

    }

    public int next(int price) {
        int count = 1;
        while (!prices.isEmpty() && price >= prices.peek()) {
            count += span.peek();
            prices.pop();
            span.pop();
        }
        prices.add(price);
        span.add(count);
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
