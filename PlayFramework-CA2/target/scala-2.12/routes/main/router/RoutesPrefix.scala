
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/brand/Downloads/WebCA2/conf/routes
// @DATE:Sun Dec 24 02:14:26 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
