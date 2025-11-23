class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int i = 0;
        int[] ans = new int[nums1.length];
        Stack<Integer> s = new Stack<>();
        while (i < nums1.length) {
            int j = 0;
            while (j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    int k = j + 1;
                    if (k == nums2.length) {
                        s.push(-1);
                    } else {
                        while (k < nums2.length) {
                            if (nums2[k] > nums2[j]) {
                                s.push(nums2[k]);
                                break;
                            }
                            k++;
                            if ((k == nums2.length) && !(nums2[k - 1] > nums2[j])) {
                                s.push(-1);
                            }
                        }
                    }
                }
                j++;
            }
            i++;
        }
        int l = ans.length - 1;
        while (l >= 0) {
            if (!s.isEmpty()) {
                ans[l] = s.pop();
            } else {
                break;
            }
            l--;
        }
        return ans;
    }
}
