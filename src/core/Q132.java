package core;

abstract class XXX{public abstract void methodX();}
interface YYY{public void methodY();}

/* NO public class Q132 extends X implements Y{public  void methodZ() {}} 
//The type Q132 must implement the inherited abstract method Y.methodY()*/
//
public abstract class Q132 extends XXX implements YYY{public  void methodZ() {}}
//NO public class Q132 extends X implements Y{public  void methodX() {}} 
// D)Yes public abstract class Q132 extends XXX implements YYY{}
//E) NO public class Q132 extends XXX implements YYY{public void methodY() {}}




