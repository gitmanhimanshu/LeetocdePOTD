/**
 * LeetCode959
 */
public class LeetCode959 {
        public int regionsBySlashes(String[] grid) {
            int n = grid.length;
            UnionFind him = new UnionFind(4 * n * n);
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int index = 4 * (i * n + j);
                    char c = grid[i].charAt(j);
                    
                    if (c == '/') {
                        him.union(index, index + 3);
                        him.union(index + 1, index + 2);
                    } else if (c == '\\') {
                        him.union(index, index + 1);
                        him.union(index + 2, index + 3);
                    } else {
                        him.union(index, index + 1);
                        him.union(index + 1, index + 2);
                        him.union(index + 2, index + 3);
                    }
                    
                    if (i + 1 < n) him.union(index + 2, index + 4 * n);
                    if (j + 1 < n) him.union(index + 1, index + 7);
                }
            }
            
            return him.getCount();
        }
        
        class UnionFind {
            int[] p, rank;
            int count;
            
            public UnionFind(int n) {
                p = new int[n];
                rank = new int[n];
                count = n;
                for (int i = 0; i < n; i++) p[i] = i;
            }
            
            public int find(int x) {
                if (p[x] != x) p[x] = find(p[x]);
                return p[x];
            }
            
            public void union(int x, int y) {
                int rp = find(x), rq = find(y);
                if (rp != rq) {
                    if (rank[rp] > rank[rq]) {
                        p[rq] = rp;
                    } else if (rank[rp] < rank[rq]) {
                        p[rp] = rq;
                    } else {
                        p[rq] = rp;
                        rank[rp]++;
                    }
                    count--;
                }
            }
            
            public int getCount() {
                return count;
            }
        }
    
public static void main(String[] args) {
    LeetCode959 obj=new LeetCode959();
    String s[]= {" /","/ "};
    System.out.println(obj.regionsBySlashes(s));
}    
}