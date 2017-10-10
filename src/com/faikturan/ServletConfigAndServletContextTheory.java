package com.faikturan;

public class ServletConfigAndServletContextTheory {
	/*ServletConfig Interface
	 * ServletConfig nesnesi her servlet i�in bir tane web container olu�turuyor.
	 * web.xml tan�mlamas� yap�yoruz.
	 * 
	 * Methods of SevletConfig interface
	 * 
	 * public String getIn�tParameter(String name): Parametre degeri bize d�nderir.
	 * public Enumaration getInitParameterNames(): intialize edilen parametre 
	 * de�erlerini enumaration olarak d�nderir.
	 * public String getServletName(): Servlet name'i d�nderir.
	 * public ServletContext getServletContext(): ServletContext nesnesi d�nderir.
	 * getServletConfig() metodu bize bir tane ServletConfig nesnesi d�nderir.
	 * 
	 * 
	 * --------------------------------------------------------------------------
	 * 
	 * ServletContext Interface
	 * 
	 * Deploy edilen proje web container arac�l���yla ServletContext nesnesi d�nderir.
	 * Her uygulama i�in sadece bir tane ServletContext nesnesi olu�turulur.
	 * 
	 * Methods of ServletContext interface
	 * 
	 * public String getInitParameter(String name): 
	 * public Enumaration getInitParameterNames(): intialize edilen parametre 
	 * de�erlerini enumaration olarak d�nderir.
	 * public void setAttiribute(String name, Object object): Uygulama ya�am s�resince 
	 * nesneleri set etmemizi sa�lar.
	 * public Object getAttiribute(String name): �zel bir isim d�nderir.
	 * public Enumeration getInitParameterNames(): Context taraf�ndan intialize edilen 
	 * parametre de�erine enumeration olarak d�nderir.
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
