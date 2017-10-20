object exercise2 {
  def balance(chars: List[Char]): Boolean = {
    def loop(acc: Int, charsList: List[Char]) : Boolean =
      if ( charsList.isEmpty ) acc == 0
      else if ( charsList.head == '(' && acc > 0) loop( acc + 1, charsList.tail)
      else if ( charsList.head == '(' && acc <= 0 ) false
      else if ( charsList.head == ')' ) loop( acc - 1, charsList.tail)
      else loop( acc, charsList.tail)
    loop(0, chars)
  }
}