// fizzArray
public int[] fizzArray(int n) {
  int[] nums = new int[n];
  
  if(n != 0) {
    for(int i = 0; i < n; i++) {
      nums[i] = i;
    }
    return nums;
  } else {
    return nums;
  }
  
}

// no14
public boolean no14(int[] nums) {
  Boolean is1 = false;
  Boolean is4 = false;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 4) {
      is1 = true;
    } else if(nums[i] == 1) {
      is4 = true;
    } else {
      is1 = false;
    }
  }
  
  if(is1 && is4) {
    return false;
  } else if(nums.length > 3) {
    if(nums[0] == 1 && nums[3] == 4 || nums[0] == 4 && nums[3] == 1) {
      return false;
    } else {
      return true;
    }
  } else {
    return true;
  }
}

// post4
public int[] post4(int[] nums) {
  int last4 = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 4) {
      last4 = i;
    } else {
      last4 += 0;
    }
  }
  
  int[] post4 = new int[nums.length - last4 - 1];
  if(last4 == nums.length-1) {
    return post4;
  } else {
    for(int i = 0; i < post4.length; i++) {
      post4[i] = nums[last4 + i + 1];
    }
    return post4;
  }
}

// has12
public boolean has12(int[] nums) {
  Boolean continueOn = false;
  int whereToStart = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 1) {
      continueOn = true;
      whereToStart = i;
    } else {
      continueOn = false;
    }
  }
    for(int j = whereToStart; j < nums.length; j++) {
      if(nums[j] == 2 && nums.length > 1 && !(nums.length == 2 && nums[0] == 3)) {
        continueOn = true;
      } else {
       continueOn = false;
      }
  }
  return continueOn;
}

// countEvens
public int countEvens(int[] nums) {
  int evenCount = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 2 == 0) {
      evenCount++;
    } else {
      evenCount += 0;
    }
  }
  return evenCount;
}

// zeroFront
public int[] zeroFront(int[] nums) {

  int nums2[] = new int[nums.length];
  int count = 0;
  for (int i = nums.length - 1; i >= 0; i--) {
  if (nums[i] != 0) {
    nums2[i + count] = nums[i];
  } else {
    count++;
    }
  }
  return nums2;
}

// bigDiff
public int bigDiff(int[] nums) {
  int min = nums[0];
  int max = nums[0];
  for(int i = 1; i < nums.length; i++) {
   min = Math.min(min, nums[i]);
   max = Math.max(max, nums[i]);
  }
  return max - min;
}

// withoutTen
public int[] withoutTen(int[] nums) {
  int[] fresh = new int[nums.length];
  int zeros = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 10) {
      zeros++;
    } else {
      fresh[i-zeros] = nums[i];
    }
  }
  return fresh;
}

// lucky13
public boolean lucky13(int[] nums) {
  Boolean saw1 = false;
  Boolean saw3 = false;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 1) saw1 = true;
    if(nums[i] == 3) saw3 = true;
  }
  return (!saw1 && !saw3);
}

// modThree
public boolean modThree(int[] nums) {
  if(nums.length >= 3) {
    for(int i = 0; i < nums.length-2; i++) {
      if(nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0) return true;
      if(nums[i] % 2 != 0 && nums[i+1] % 2 != 0 && nums[i+2] % 2 != 0) return true;
    }
    return false;
  }
  return false;
}

// sum13 
public int sum13(int[] nums) {
  int sum = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 13) {
      i++;
    } else {
      sum += nums[i];
    }
  }
  return sum;
}
