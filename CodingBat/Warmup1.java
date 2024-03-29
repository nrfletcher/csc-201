// Sleepin
public boolean sleepIn(boolean weekday, boolean vacation) {
  
 if(weekday == false || vacation == true) {
   return true;
 } else {
   return false;
 }
}

// Diff21
public int diff21(int n) {
  
  if(n > 21) {
    return Math.abs((n-21)*2);
  } else {
    return Math.abs(n-21);
  }
}

// backAround
public String backAround(String str) {
  return str.substring(str.length()-1, str.length()) + str +
  str.substring(str.length()-1, str.length());
}

// hasTeen
public boolean hasTeen(int a, int b, int c) {
  if((a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20)) {
    return true;
  } else {
    return false;
  }
}

// mixStart
public boolean mixStart(String str) {
  if(str.contains("ix")) {
    return true;
  } else {
    return false;
  }
}

// endUp
public String endUp(String str) {
  if(str.length() < 3) {
    return str.toUpperCase();
  } else {
    return str.substring(0, str.length()-3) + 
    str.substring(str.length()-3, str.length()).toUpperCase();
  }
}

// warmup1
public int close10(int a, int b) {
  if(a == b || Math.abs(a-10) == Math.abs(b-10)) {
    return 0;
  } else if(Math.abs(a-10) > Math.abs(b-10)) {
    return b;
  } else {
    return a;
  }
}

// loneTeen
public boolean loneTeen(int a, int b) {
  if((a > 12 && a < 20) && !(b > 12 && b <20) || !(a > 12 && a < 20) && (b > 12 && b <20)) {
    return true;
  } else {
    return false;
  }
}

// stringE
public boolean stringE(String str) {
  int eCount = 0;
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == 'e') {
      eCount++;
    } else {
      eCount += 0;
    }
  }
  
  if(eCount > 0 && eCount < 4) {
    return true;
  } else {
    return false;
  }
}

// front22
public String front22(String str) {
  if(str.length() < 1) {
    return str;
  } else if(str.length() < 2) {
    return str.substring(0, 1) + str + str.substring(0, 1);
  } else {
    return str.substring(0, 2) + str + str.substring(0, 2);
  }
}

// in 1020
public boolean in1020(int a, int b) {
  if((a > 9 && a < 21) || (b > 9 && b < 21)) {
    return true;
  } else {
    return false;
  }
}

// in3050
public boolean in3050(int a, int b) {
  if(((a > 29 && a < 41) && (b > 29 && b < 41)) || ((a > 39 && a < 51) && (b > 39 && b < 51))) {
    return true;
  } else {
    return false;
  }
}

// delDel
public String delDel(String str) {
  if(str.length() < 4) {
    return str;
  } else if(str.substring(1, 4).equals("del")) {
    return str.substring(0, 1) + str.substring(4, str.length());
  } else {
    return str;
  }
}

// intMax
public int intMax(int a, int b, int c) {
  if(a > b && a > c) {
    return a;
  } else if(b > a && b > c) {
    return b;
  } else {
    return c;
  }
}

// everyNth
public String everyNth(String str, int n) {
 String finished = "";
    for(int i = 0; i <= str.length()-1; i += n) {
      finished += str.charAt(i);
    }
  return finished;
}

// startOz
public String startOz(String str) {
 if(str.length() < 2) {
   return str;
 } else {
    if(str.substring(0, 2).equals("oz")) {
    return "oz";
  } else if(str.charAt(0) == 'o') {
    return "o";
  } else if(str.charAt(1) == 'z') {
    return "z";
  } else {
    return "";
  }
 }
}

// lastDigit
public boolean lastDigit(int a, int b) {
  if(a % 10 == b % 10) {
    return true;
  } else {
    return false;
}
}

// idek
public int max1020(int a, int b) {
  if(!(a > 9 && a < 21) && !(b > 9 && b < 21)) {
    return 0;
  } else if((a > 9 && a < 21) && (b > 9 && b < 21)) {
    if(a > b) {
      return a;
    } else {
      return b;
    }
  } else if(a > 9 && a < 21) {
    return a;
  } else {
    return b;
  }
}
