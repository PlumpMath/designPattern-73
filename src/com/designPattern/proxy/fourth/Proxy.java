 package com.designPattern.proxy.fourth;

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
	public static Object newInstance(Class infce,InvocationHandler handler) throws Exception{
		 
		 String rt = "\r\t";
		 String methodStr = "";
		 
		 Method[] methods = infce.getMethods();
		 for (Method method : methods){
			 methodStr= 
					 "	@Override" + rt +
					 "	public void " + method.getName() + "() {" + rt +
					 "		try {" + rt +
					 "			Method method = " + infce.getName() + ".class.getMethod(\"" + method.getName() + "\");" + rt + 
					 "			handler.invoke(null," + "method);" + rt +
					 "		} catch (Exception e) {" + rt +
					 "			e.printStackTrace();" + rt +
					 "		}" + rt +
					 "	}";
		 }
		 
		 String src = 
		 
		 "package com.designPattern.proxy.fourth;" + rt +
		 "import java.lang.reflect.Method;" + rt +
		 "public class TankTimeProxy implements " + infce.getName() + " {" + rt +
		 "	public TankTimeProxy(InvocationHandler handler) {" + rt +
		 "		super();" + rt +
		 "		this.handler = handler;" + rt +
		 "	}" + rt +
		 "	com.designPattern.proxy.fourth.InvocationHandler handler;" + rt +
		 methodStr + rt +
		 "}";
		 
		 //生成java源代码
		 String fileName = System.getProperty("user.dir") + "/proxy/com/designPattern/proxy/fourth/TankTimeProxy.java";
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
		 Class clazz = classLoader.loadClass("com.designPattern.proxy.fourth.TankTimeProxy");
		 System.out.println(clazz.getName());
		 classLoader.close();
		 
		 //根据构造函数实例化对象
		 Constructor constructor = clazz.getConstructor(InvocationHandler.class);
		 Object object = constructor.newInstance(handler);
		 
		 return object;
	 };
}

 