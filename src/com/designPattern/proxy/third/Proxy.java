 package com.designPattern.proxy.third;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
 public class Proxy {
	 @SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object newInstance(Class infce) throws Exception{
		 
		 String rt = "\r\t";
		 String methodStr = "";
		 
		 Method[] methods = infce.getMethods();
		 for (Method method : methods){
			 methodStr= 
					 "	@Override" + rt +
					 "	public void " + method.getName() + "() {" + rt +
					 "		long start = System.currentTimeMillis();" + rt +
					 "		System.out.println(\"Start time:\"+start);" + rt +
					 "		t."+method.getName()+"();" + rt +
					 "		long end = System.currentTimeMillis();" + rt +
					 "		System.out.println(\"Run time:\"+(end-start));" + rt +
					 "	}";
		 }
		 
		 String src = 
		 
		 "package com.designPattern.proxy.third;" + rt +
		 "public class TankTimeProxy implements " + infce.getName() + " {" + rt +
		 "	 Moveable t;" + rt + 
		 "	public TankTimeProxy(Moveable t) {" + rt +
		 "		super();" + rt +
		 "		this.t = t;" + rt +
		 "	}" + rt +
		 methodStr + rt +
		 "}";
		 
		 //生成java源代码
		 String fileName = System.getProperty("user.dir") + "/proxy/com/designPattern/proxy/third/TankTimeProxy.java";
		 File file = new File(fileName);
		 FileWriter fw = new FileWriter(file);
		 fw.write(src);
		 fw.flush();
		 fw.close();
		 
		 //进行编译
		 JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		 StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		 Iterable<? extends JavaFileObject> units = fileManager.getJavaFileObjects(fileName);
		 CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);
		 task.call();
		 fileManager.close();
		 
		//实例化代理类
		 URL[] urls = new URL[]{new URL("file:/" + System.getProperty("user.dir") + "/proxy/")};
		 URLClassLoader classLoader = new URLClassLoader(urls);
		 Class clazz = classLoader.loadClass("com.designPattern.proxy.third.TankTimeProxy");
		 System.out.println(clazz.getName());
		 classLoader.close();
		 
		 //根据构造函数实例化对象
		 Constructor constructor = clazz.getConstructor(Moveable.class);
		 Object object = constructor.newInstance(new Tank());
		 
		 return object;
	 };
}

 