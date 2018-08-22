package proxyMode.jdkProxy.myPorxy;
/*
 *一句话描述该类作用:【】
 *@Author:LB
 *
 */

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Objects;

public class MyProxy {

    private static String ln = "\r\n";

    public static Object newProxyInstance(MyClassLoad loader, Class<?>[] interfaces, MyInvocationHandler h) {

        //生成源代码
        String proxySrc = generateSrc(interfaces[0]);

        //将生成的源代码输出到磁盘，保存为.java文件
        String filePath = MyProxy.class.getResource("").getPath();
        File file = new File(filePath + "$Proxy.java");
        try {
            FileWriter fw = new FileWriter(file);
            fw.write(proxySrc);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //编译源代码，生成.class文件
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager manager = compiler.getStandardFileManager(null ,null,null);
        Iterable iterable = manager.getJavaFileObjects(file);
        JavaCompiler.CompilationTask task = compiler.getTask(null,manager,null,null,null,iterable);
        task.call();
        try {
            manager.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //将class文件中内容，动态加载到JVM
        //返回被代理的代理对象
        try {
            Class proxyClass = loader.findClass("$Proxy");
            Constructor c = proxyClass.getConstructor(MyInvocationHandler.class);
            file.delete();
            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }



        return null;
    }

    private static String generateSrc(Class<?> interfaces){

        StringBuilder src = new StringBuilder();
        src.append("package proxyMode.jdkProxy.myPorxy;" + ln);
        src.append("import java.lang.reflect.Method;" + ln);
        src.append("public class $Proxy implements " + interfaces.getName() + "{" +ln);
        src.append("MyInvocationHandler h;" + ln);
        src.append("public $Proxy(MyInvocationHandler h){"+ln);
        src.append("this.h=h;"+ln);
        src.append("}" + ln);
        for (Method m : interfaces.getMethods()) {
            src.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {"+ln);
            src.append("try {" +ln);
            src.append("Method m = "+interfaces.getName() + ".class.getMethod(\""+m.getName()+"\",new Class[]{});"+ln);
            src.append("this.h.invoke(this,m,null);"+ln);
            src.append("}catch(Throwable e){e.printStackTrace();}" + ln);
            src.append("}" +ln);
        }

        src.append("}");
        return src.toString();

    }



}
