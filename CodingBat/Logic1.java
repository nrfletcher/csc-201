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
