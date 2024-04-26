public class FirstArray {
    public static void main(String[] args) {
        int[] nums = new int[901];
        int[] coms = new int[nums.length];
        for (int i = 0, b = 100; i < nums.length; i++, b++){
            nums[i] = b;
        }
        for (int i = 0, c = 900; i < coms.length; i++, c--){
            coms[i] = nums[c];
        }
        for (int i : coms){
            System.out.println(i);
        }
    }
}
