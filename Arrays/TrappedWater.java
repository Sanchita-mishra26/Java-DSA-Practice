package Arrays;

public class TrappedWater {
    public static int trappedWater(int heights[]) {
        int n = heights.length;
        
        // left max boundary
        int LeftMax[] = new int[n];
        LeftMax[0] = heights[0];
        for(int i = 0; i < n; i++) {
            LeftMax[i] = Math.max(heights[i], LeftMax[i-1]);    
        }

        // right max boundary
        int RightMax[] = new int[n];
        RightMax[n-1] = heights[n-1];
        for(int i = n-2; i >= 0; i--) {
            RightMax[i] = Math.max(heights[i], RightMax[i+1]);
        }

        // calculate trapped water
        int water = 0;
        for(int i = 0; i < n; i++) {
            int waterLevel = Math.min(LeftMax[i], RightMax[i]);
            water += waterLevel - heights[i];
        }
        return water;
    }

    public static void main(String args[]) {
        int heights[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped water: " + trappedWater(heights));
    }
}
