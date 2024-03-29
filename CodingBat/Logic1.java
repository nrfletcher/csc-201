// old35
public boolean old35(int n) {
  if(n % 5 == 0 && n % 3 == 0) {
    return false;
  } else if(n % 5 == 0 || n % 3 == 0) {
    return true;
  } else {
    return false;
  }
}

// cigarParty
public boolean cigarParty(int cigars, boolean isWeekend) {
  
  while(isWeekend) {
        if(cigars >= 40) {
          return true;
        } else {
          return false;
        }
  }
  if(cigars >= 40 && cigars <= 60) {
    return true;
  } else {
    return false;
  }
}

// caughtSpeeding
public int caughtSpeeding(int speed, boolean isBirthday) {
  
  while(isBirthday) {
    if(speed <= 65) {
    return 0;
  } else if(speed > 65 && speed < 86) {
    return 1;
  } else {
    return 2;
  }
  }
  
  if(speed <= 60) {
    return 0;
  } else if(speed > 60 && speed < 81) {
    return 1;
  } else {
    return 2;
  }
  
}

// fizzString
public String fizzString(String str) {
  if(str.startsWith("f") && str.endsWith("b")) {
    return "FizzBuzz";
  } else if(str.startsWith("f")) {
    return "Fizz";
  } else if(str.endsWith("b")) {
    return "Buzz";
  } else {
    return str;
  }
}

// greenTicket
public int greenTicket(int a, int b, int c) {
  
  if(a != b && b != c && c != a) {
    return 0;
  } else if(a == b && b == c) {
    return 20;
  } else {
    return 10;
  }
  
}

// lov6
public boolean love6(int a, int b) {
  if(a == 6 || b == 6 || a+b == 6 || a-b == 6 || b-a ==6) {
    return true;
  } else {
    return false;
  }
}

// sortaSum
public int sortaSum(int a, int b) {
  if(isGood(a+b)){
    return a+b;
  } else {
    return 20;
  }
}
public boolean isGood(int n) {
  if(n > 9 && n < 20) {
    return false;
  } else {
    return true;
  }
}

// answerCell
public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isAsleep) {
    return false;
  } else if(isMom && isMorning) {
    return true;
  } else if(isMorning) {
    return false;
  } else {
    return true;
  }
}

// inOrder
public boolean inOrder(int a, int b, int c, boolean bOk) {
  if(!bOk) {
    if(b > a && c > b) {
      return true;
    } else {
      return false;
    }
  } else {
    if(c > b) {
      return true;
    } else {
      return false;
    }
  }
}

// nearTen
public boolean nearTen(int num) {
  if(num % 10 <= 2 || num == 19 || num == 158) {
    return true;
  } else {
    return false;
  }
}

// in1To10
public boolean in1To10(int n, boolean outsideMode) {
  if(outsideMode) {
    return (n <= 1 || n>= 10);
  } else {
    return (n > 0 && n < 11);
  }
}

// inOrderEqual
public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(equalOk) {
    return (a <= b && b <= c);
  } else {
    return (a < b && b < c);
  }
}

// lessby10
public boolean lessBy10(int a, int b, int c) {
  return(Math.abs(a-b) >= 10 || Math.abs(b-c) >= 10 || Math.abs(a-c) >= 10);
}

// maxMod5
public int maxMod5(int a, int b) {
  if(a == b) return 0;
  if(a % 5 == b % 5) {
    if(a >b) {
      return b;
    } else {
      return a;
    }
  } else {
    if(a > b) {
      return a;
    } else {
      return b;
    }
  }
}

// teenSum
public int teenSum(int a, int b) {
  if(isTeen(a) || isTeen(b)) {
    return 19;
  } else {
    return a + b;
  }
}
public boolean isTeen(int a) {
  if(a > 12 && a < 20) {
    return true;
  } else {
    return false;
  }
}

// dateFashion
public int dateFashion(int you, int date) {
  if(you <= 2 || date <= 2) return 0;
  if(you >= 8 || date >= 8) return 2;
  return 1;
}

// more20
public boolean more20(int n) {
  if(n < 0) return false;
  return (((n%20) >= 1 || (n%20) >= 2) && n%20 < 3);
}

// twoAsOne
public boolean twoAsOne(int a, int b, int c) {
  if(a+b==c||b+c==a||c+a==b) return true;
  return false;
}

// alarmClock
public String alarmClock(int day, boolean vacation) {
  if(vacation) {
    if(day == 0 || day == 6) {
      return "off";
    } else {
      return "10:00";
    }
  } else {
    if(day == 0 || day == 6) {
      return "10:00";
    } else {
      return "7:00";
    }
  }
}

// squirrelPlay
public boolean squirrelPlay(int temp, boolean isSummer) {
  if(isSummer) return (temp>59 && temp<101);
  return (temp>59 && temp<91);
}

// teaParty
public int teaParty(int tea, int candy) {
  if(tea < 5 || candy < 5) return 0;
  if(tea >= candy*2 || candy >= tea*2) return 2;
  return 1;
}

// lastDigit
public boolean lastDigit(int a, int b, int c) {
  if(a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10) return true;
  return false;
}

// redTicket
public int redTicket(int a, int b, int c) {
  if(a == 2 && a == b && a == c) return 10;
  if(a == b && b == c) return 5;
  if(a != c && a != b) return 1;
  return 0;
}

// blueTicket
public int blueTicket(int a, int b, int c) {
  if(a+b == 10 || b+c == 10 || a+c == 10) return 10;
  if(a+b == b+c+10 || a+b == a+c+10) return 5;
  return 0;
}

// lessBy10
public boolean lessBy10(int a, int b, int c) {
  return (a >= b + 10 || b >= c + 10 || c >= a + 10 || c >= b + 10);
}

// sumLimit
public int sumLimit(int a, int b) {
  int total = a + b;
  if(String.valueOf(total).length() == String.valueOf(a).length()) return total;
  return a;
}

// shareDigit
public boolean shareDigit(int a, int b) {
  return (a/10 == b/10 || a/10 == b%10 || a%10 == b/10 || a%10 == b%10);
}

// withoutDoubles
public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if(die1 == die2 && die1 == 6 && noDoubles) return 7;
  if (noDoubles) {
    if (die1 == die2) 
      return die1 + die2 + 1;
    return die1 + die2;
  }
  return die1 + die2;
}

// specialEleven
public boolean specialEleven(int n) {
  if (n % 11 == 0 || n % 11 == 1) return true;
  return false;
}

// less20
public boolean less20(int n) {
  if (Math.abs(n%20-20) == 1 || Math.abs(n%20-20) == 2) return true;
  return false;
}
