class ExtendedInt(val value:Int) {
    def isMultipleOf(n:Int*):Seq[Int] = n filter(_!=0) filter(value%_==0)
}