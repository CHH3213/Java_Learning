package pers.chh3213.classLearn20220101exercise;
/**
 * 内部类与外部类访问权限
 */
public class A {
    String a = "a";
    private String privateA = "privateA";
    protected String protectedA = "protectedA";
    public String publicA = "publicA";

    public static void main(String[] args){
        A a = new A();
        a.test();
        a.accessB();
        
    }

    public void test(){
        B b = new B();
        b.accessA();
    }
    public void accessB(){
        B b = new B();
        System.out.println(b.b);
        System.out.println(b.privateB);
        System.out.println(b.protectedB);
        System.out.println(b.publicB);
    }

     class B{
        String b = "b";
        static int d = 1;
        private String privateB = "privateB";
        protected String protectedB = "protectedB";
        public String publicB = "publicB";
        public void accessA(){
        	A objA = new A();
            System.out.println(objA.a);
            System.out.println(objA.privateA);
            System.out.println(objA.protectedA);
            System.out.println(objA.publicA);
        }
    }
}


/**
 * 匿名内部类访问权限测试
 */
//public class A {
//    String a = "a";
//    private String privateA = "privateA";
//    protected String protectedA = "protectedA";
//    public String publicA = "publicA";
//
//    public static void main(String[] args){
//        A a = new A();
//        a.test();
//    }
//
//    public void test(){
//        B b = new B(){
//            @Override
//            public void accessA(){
//            	//匿名内部类访问外部类
//                System.out.println(a);
//                System.out.println(privateA);
//                System.out.println(protectedA);
//                System.out.println(publicA);
//            }
//        };
//        b.accessA();
//        accessB(b);
//    }
//
//    public void accessB(B b){
//    	//外部类访问内部类
//        System.out.println(b.b);
//        System.out.println(b.privateB);
//        System.out.println(b.protectedB);
//        System.out.println(b.publicB);
//    }
//
//    static class B{
//        String b = "b";
//        private String privateB = "privateB";
//        protected String protectedB = "protectedB";
//        public String publicB = "publicB";
//
//        public void accessA(){
//
//        }
//    }
//}
//
//
