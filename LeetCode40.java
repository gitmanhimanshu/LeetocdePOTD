import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode40 {
   
    List<List<Integer>> results;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        results = new ArrayList<>();
        Arrays.sort(candidates);
        solve(0, target, candidates, new ArrayList<>());
        return results;
    }

    void solve(int index, int target, int[] candidates, List<Integer> current) {
        if (target == 0) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            current.add(candidates[i]);
            solve(i + 1, target - candidates[i], candidates, current);
            current.remove(current.size() - 1);
        }
    }
public static void main(String[] args) {
    LeetCode40 obj=new LeetCode40();
    
    System.out.println(obj.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
}
}


