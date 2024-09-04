import java.util.HashSet;
import java.util.Set;

public class LeetCode874 {
        int x, y;
        public int robotSim(int[] commands, int[][] obstacles) {
            Set<String> him = new HashSet<>();
            for (int[] a : obstacles) {
                him.add(a[0] + "," + a[1]);
            }
            x = 0;
            y = 0;
            int dir = 0;
    int ans=0;
            for (int i : commands) {
                if (i == -1) {
                    dir = (dir + 1) % 4;
                } else if (i == -2) {
                    dir = (dir + 3) % 4;
                } else {
                    for (int j = 1; j <= i; j++) {
                        int nx = x;
                        int ny = y;
                        if (dir == 0) {
                            ny++;
                        } else if (dir == 1) {
                            nx++;
                        } else if (dir == 2) {
                            ny--;
                        } else {
                            nx--;
                        }
                        if (him.contains(nx + "," + ny)) {
                            break;
                        }
                        x = nx;
                        y = ny;
                    }
                    ans=Math.max(ans,x*x+y*y);
                }
            }
    
           
            return ans;
        }
        public static void main(String[] args) {
            LeetCode874 obj=new LeetCode874();
            System.out.println(obj.robotSim(new int[]{4,-1,4,-2,4}, new int[][]{{2,4}}));
        }
    }
            
        
    
    // void solve(int dir) {
    // if (dir == 0) {
    // y = y + 1;
    // } else if (dir == 2) {
    // y = y - 1;
    // } else if (dir == 1) {
    // x = x + 1;
    // } else {
    // x = x - 1;
    // }
    // }
    
    // int turn(int pos) {
    // pos = (pos % 360 + 360) % 360;
    // if (pos >= 0 && pos < 90) {
    // return 1;
    // } else if (pos >= 90 && pos < 180) {
    // return 2;
    // } else if (pos >= 180 && pos < 270) {
    // return -1;
    // } else {
    // return -2;
    // // }
    // }
    // }
    

