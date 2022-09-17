package section21_30;

public class JumpGame {
	
	public static void main(String[] args) {
//		System.out.println(canJump(new int[] {3,2,1,0,4}));
//		System.out.println(canJump(new int[] {3,2,0,1,4}));

	}
	
	private static int jump(int[] nums) {
		
		int len = nums.length;
		if(len==1) return 0;
		if(nums[0] == 0) return -1;
		
		int ladder = nums[0];
		int stair = nums[0];
		int jump = 1;
		
		for(int i = 1 ; i < len ; i++) {
			if(i == len-1) return jump;
			
			if(i + nums[i] > ladder) {
				ladder = i + nums[i];
			}
			
			stair--;
			
			if(stair == 0) {
				jump++;
				if(i >= ladder) return -1;
				stair = ladder - i;
			}
		}
		
		
		return -1;
	}
	
	private static boolean canJump(int[] nums) {
		
		int len = nums.length;
		int goodPosition = len-1;
		
		for(int i = len-2 ; i >= 0 ; i--) {
			if(i + nums[i] >= goodPosition) {
				goodPosition = i;
			}
		}
		
		return goodPosition == 0 ;
		
	}

}
