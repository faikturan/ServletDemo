package com.faikturan;

public class ServletConfigAndServletContextTheory {
	/*ServletConfig Interface
	 * ServletConfig nesnesi her servlet için bir tane web container oluþturuyor.
	 * web.xml tanýmlamasý yapýyoruz.
	 * 
	 * Methods of SevletConfig interface
	 * 
	 * public String getInýtParameter(String name): Parametre degeri bize dönderir.
	 * public Enumaration getInitParameterNames(): intialize edilen parametre 
	 * deðerlerini enumaration olarak dönderir.
	 * public String getServletName(): Servlet name'i dönderir.
	 * public ServletContext getServletContext(): ServletContext nesnesi dönderir.
	 * getServletConfig() metodu bize bir tane ServletConfig nesnesi dönderir.
	 * 
	 * 
	 * --------------------------------------------------------------------------
	 * 
	 * ServletContext Interface
	 * 
	 * Deploy edilen proje web container aracýlýðýyla ServletContext nesnesi dönderir.
	 * Her uygulama için sadece bir tane ServletContext nesnesi oluþturulur.
	 * 
	 * Methods of ServletContext interface
	 * 
	 * public String getInitParameter(String name): 
	 * public Enumaration getInitParameterNames(): intialize edilen parametre 
	 * deðerlerini enumaration olarak dönderir.
	 * public void setAttiribute(String name, Object object): Uygulama yaþam süresince 
	 * nesneleri set etmemizi saðlar.
	 * public Object getAttiribute(String name): Özel bir isim dönderir.
	 * public Enumeration getInitParameterNames(): Context tarafýndan intialize edilen 
	 * parametre deðerine enumeration olarak dönderir.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
