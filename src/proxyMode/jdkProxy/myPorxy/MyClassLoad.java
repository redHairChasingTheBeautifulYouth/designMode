package proxyMode.jdkProxy.myPorxy;
/*
 *一句话描述该类作用:【代码生成，编译，重新load到jvm】
 *@Author:LB
 *
 */

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyClassLoad extends ClassLoader{

    private File baseDir;

    public MyClassLoad(){
        String path = MyClassLoad.class.getResource("").getPath();
        this.baseDir = new File(path);

    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        String className = MyClassLoad.class.getPackage().getName() + "." + name;
        if (baseDir != null) {
            File classFile = new File(baseDir ,name.replace("\\.","/")+".class");
            if (classFile.exists()) {
                FileInputStream in = null;
                try {
                    in = new FileInputStream(classFile);
                    ByteArrayOutputStream out = new ByteArrayOutputStream();
                    byte[] buff = new byte[1024];
                    int len;
                    while ((len = in.read(buff)) != -1) {
                        out.write(buff ,0 ,len);
                    }
                    return defineClass(className ,out.toByteArray() ,0,out.size());
                }catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    if (null != in) {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    classFile.delete();
                }
            }
        }
        return null;
    }
}
