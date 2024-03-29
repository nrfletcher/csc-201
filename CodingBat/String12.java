// makeAbba
public String makeAbba(String a, String b) {
  return a+b+b+a;
}

// extraEnd
public String extraEnd(String str) {
  return str.substring(str.length()-2, str.length()) +
  str.substring(str.length()-2, str.length()) +
  str.substring(str.length()-2, str.length());
}

// makeTags
public String makeTags(String tag, String word) {
  return "<"+tag+">" + word + "</"+tag+">";
}

// firstTwo
public String firstTwo(String str) {
  if(str.length() > 2) {
    return str.substring(0, 2);
  } else {
    return str;
  }
}

// withoutEnd
public String withoutEnd(String str) {
  return str.substring(1, str.length()-1);
}

// withoutX2
public String withoutX2(String str) {
  if(str.length() > 2) {
    if(str.substring(0, 2).contains("x")) {
      return str.substring(0, 2).replace("x", "") + str.substring(2, str.length());
    } else {
      return str;
    }
  } else {
    return str.replace("x", "");
  }
}

// doubleChar
public String doubleChar(String str) {
  
  int total = str.length();
  char chr;
  StringBuilder finalS = new StringBuilder(total*2);
  for(int i = 0; i < total; i++) {
    chr = str.charAt(i);
    finalS.append(chr);
    finalS.append(chr);
  }
  return finalS.toString();
}

// countCode
public int countCode(String str) {
  int counter = 0;
  for(int i = 0; i < str.length()-3; i++) {
    if(isCode(str.substring(i, i+4))) counter++;
  }
  return counter;
}
public boolean isCode(String str) {
  if(str.charAt(0) == 'c' && str.charAt(1) == 'o' && str.charAt(3) == 'e') return true;
  return false;
}

// getSandwich
public String getSandwich(String str) {
  Boolean seenBread = false;
  int firstSeen = 0;
  int lastSeen = 0;
  
  for(int i = 0; i < str.length()-4; i++) {
    if(str.substring(i, i+5).equals("bread") && !seenBread) {
      seenBread = true;
      firstSeen = i;
    }
    if(str.substring(i, i+5).equals("bread") && seenBread) lastSeen = i;
  }
  if(lastSeen > 0 && firstSeen != lastSeen) return str.substring(firstSeen+5, lastSeen);
  return "";
}
