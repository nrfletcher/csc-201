// all array 1 finished

// sum2
public int sum2(int[] nums) {
  if(nums.length < 2) {
    if(nums.length < 1) {
      return 0;
    } else {
    return nums[0];
    }
  } else {
    return nums[0] + nums[1];
  }
}

// makePi
public int[] makePi() {
  int[] pi = {3, 1, 4};
  return pi;
}

// reverse3
public int[] reverse3(int[] nums) {
  int first = nums[0];
  int middle = nums[1];
  int last = nums[2];
  nums[0] = last;
  nums[1] = middle;
  nums[2] = first;
  return nums;
}

// commonEnd
public boolean commonEnd(int[] a, int[] b) {
  if(a[0] == b[0] || a[a.length-1] == b[b.length-1]) {
    return true;
  } else {
    return false;
  }
}

// firstLast6
public boolean firstLast6(int[] nums) {
  if(nums[0] == 6 || nums[nums.length-1] == 6) {
    return true;
  } else {
    return false;
  }
}

// has23
public boolean has23(int[] nums) {
  if(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
    return true;
  } else {
    return false;
  }
}

// sameFirstLast
public boolean sameFirstLast(int[] nums) {
  if(nums.length > 0) {
    if(nums[0] == nums[nums.length-1]) {
      return true;
    } else {
      return false;
    }
  } else {
    return false;
  }
}

// sum3
public int sum3(int[] nums) {
  return nums[0] + nums[1] + nums[2];
}

// maxEnd3
public int[] maxEnd3(int[] nums) {
  if(nums[0] > nums[2]) {
    nums[1] = nums[0];
    nums[2] = nums[0];
    return nums;
  } else {
    nums[1] = nums[2];
    nums[0] = nums[2];
    return nums;
  }
}

// biggerTwo
public int[] biggerTwo(int[] a, int[] b) {
  if(a[0] + a[1] > b[0] + b[1]) {
    return a;
  } else if(a[0] + a[1] < b[0] + b[1]) {
    return b;
  } else {
    return a;
  }
}

// middleWay
public int[] middleWay(int[] a, int[] b) {
  int[] fresh = new int[2];
  fresh[0] = a[1];
  fresh[1] = b[1];
  return fresh;
}

// no23
public boolean no23(int[] nums) {
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 3 || nums[i+1] == 3 || nums[i] == 2 || nums[i+1] == 2) {
      return false;
    } else {
      return true;
    }
  }
  return false;
}

// makeEnds
public int[] makeEnds(int[] nums) {
  int[] newmofo = new int[2];
  newmofo[0] = nums[0];
  newmofo[1] = nums[nums.length-1];
  return newmofo;
}

// make2
public int[] make2(int[] a, int[] b) {
  int[] fresh = new int[2];
  if(a.length < 1) {
    fresh[0] = b[0];
    fresh[1] = b[1];
  } else if(a.length == 1) {
    fresh[0] = a[0];
    fresh[1] = b[0];
  } else {
    fresh[0] = a[0];
    fresh[1] = a[1];
  }
  return fresh;
}

// fix23
public int[] fix23(int[] nums) {
  if(nums[0] == 2 && nums[1] == 3) {
    nums[1] = 0;
  } else if(nums[1] == 2 && nums[2] == 3) {
    nums[2] = 0;
  } 
  return nums;
}

// frontPiece
public int[] frontPiece(int[] nums) {
  if(nums.length < 3) {
    return nums;
  } else {
    int[] newS = new int[2];
    newS[0] = nums[0];
    newS[1] = nums[1];
    return newS;
  }
}

// maxTriple
public int maxTriple(int[] nums) {
  if(nums[0] > nums[nums.length-1] && nums[0] > nums[nums.length/2]) {
    return nums[0];
  } else if(nums[nums.length-1] > nums[0] && nums[nums.length-1] > nums[nums.length/2]) {
    return nums[nums.length-1];
  } else {
    return nums[nums.length/2];
  }
}

// makeLast
public int[] makeLast(int[] nums) {
  int[] big = new int[nums.length*2];
  for(int i = 0; i < big.length-1; i++) {
    big[i] = 0;
    big[big.length-1] = nums[nums.length-1];
  }
  return big;
}

// front11
public int[] front11(int[] a, int[] b) {
  int[] single = new int[1];
  int[] doub = new int[2];
  int[] empty = new int[0];
  if(a.length<1&&b.length<1) {
    return empty;
  }
  if(a.length>0&&b.length>0) {
    doub[0] = a[0];
    doub[1] = b[0];
    return doub;
  } else if(a.length>0) {
    single[0] = a[0];
    return single;
  } else {
    single[0] = b[0];
    return single;
  }
}

// swapEnds
public int[] swapEnds(int[] nums) {
  int[] arr = new int[nums.length];
  arr[0] = nums[nums.length-1];
  arr[arr.length-1] = nums[0];
  for(int i = 1; i < nums.length-1; i++) {
    arr[i] = nums[i];
  }
  return arr;
}

// double23
public boolean double23(int[] nums) {
  int count2 = 0;
  int count3 = 0;
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 2) count2++;
    if(nums[i] == 3) count3++;
  }
  if(count2 > 1 || count3 > 1) return true;
  return false;
}

// plusTwo
public int[] plusTwo(int[] a, int[] b) {
  int[] c = new int[4];
  c[0] = a[0];
  c[1] = a[1];
  c[2] = b[0];
  c[3] = b[1];
  return c;
}

// midThree 
public int[] midThree(int[] nums) {
  int mid = (nums.length/2);
  int[] midT = new int[3];
  midT[0] = nums[mid-1];
  midT[1] = nums[mid];
  midT[2] = nums[mid+1];
  return midT;
}

// rorateLeft3
public int[] rotateLeft3(int[] nums) {
  int temp = nums[0];
  nums[0] = nums[1];
  nums[1] = nums[2];
  nums[2] = temp;
  return nums;
}

// start1
public int start1(int[] a, int[] b) {
  if(a.length > 0 && a[0] == 1 && b.length > 0 && b[0] == 1) return 2;
  if(a.length > 0 && a[0] == 1) return 1;
  if(b.length > 0 && b[0] == 1) return 1;
  return 0;
}

// unlucky1 
public boolean unlucky1(int[] nums) {
  if (nums.length > 1 && nums[0] == 1 && nums[1] == 3) return true;
  if (nums.length > 1 && nums[1] == 1 && nums[2] == 3) return true;
  if (nums.length > 2 && nums[nums.length-2] == 1 && nums[nums.length-2] == 3) return true;
  if (nums.length > 2 && nums[nums.length-2] == 1 && nums[nums.length-1] == 3) return true;
  return false;
}

// makeMiddle
public int[] makeMiddle(int[] nums) {
  int[] nums2 = new int[2];
  nums2[0] = nums[nums.length/2-1];
  nums2[1] = nums[nums.length/2];
  return nums2;
}
