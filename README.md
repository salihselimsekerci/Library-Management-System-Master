Öncelikle projeden bahsetmek isterim, sistemde bilgisi gömülü olan bir adet "admin" bulunmaktadır. Adminin username'i "admin" password ise "12345" şeklindedir.Bu bilgileri kullanarak sisteme giriş yapabilir ve sonrasında adres kayıdı ekleme,silme ve güncelleme işlemlerini yapabilirsiniz.

Projenin kodlanması ve geliştirilmesi kısmında ise JSF,JPA,HTML,CSS ve MAVEN kullanılmıştır. Geliştirme ortamları olarak ise NetBeans ve Apache Tomcat EE kullanılmıştır.Öncelikle IDE konusunda çok kararsız kaldım. Netbeans ve Eclipse IDE arasında kaldım diyebilirim.NetBeans'te hazır şablonlar sayesinde daha hızlı bitirebilmek sebebiyle tercihim NetBeans oldu.

Veritabanı olarak ise Mysql kullandım ve tabloları daha rahat görmek için HeidiSQL kullandım.

Tasarım konusunu ise Html ve CSS kullanarak tamamlamak istedim .

Uygulama sunucusu olarak Apache Tomcat kullandım.Bunun nedeni ise sektörde çok kullanılması ve diğer rakiplerine göre daha kullanışlı olduğunu öğrenmemdir.

Uygulamayı kurmak için yapılması gerekenler şöyle;

1-NetBeans IDE ve Java EE sürümü yüklenmelidir.

2-Apache Tomcat indirilip kurulmalıdır.Bu proje Apache Tomcat 8.0 ile geliştirildi.

3-Mysql en son sürümünü indiriniz.Ayrıca HeidiSQL'i indirmek size kolaylık sağlayacaktır.Ama HeidiSQL şart değil.

4-Yukarıda bulunan 3 adımı uyguladıktan sonra sistemsel olarak sorun olmayacaktır.Kodu ekten indirdikten sonra ; 
"NetBeans --> New Project --> Java Web --> Web Application --> Server Add.. Apache Tomcat or TomEE -->
Finish..
--> import project --> LMSelimStaj --> LMSelimStaj projesindeki "src" ve "web" adlı klasörleri kopyalayıp -->Belgelerim-->NetBeans Project-->LMSelimStaj klasörüne yapıştırın (hedefteki kasörlerini değiştirmeyi onaylayın).
--> NetBeans projemizde yer alan Common Klasöründen--> Create Table.java yı açıp getConnection classında bulanan getConnetcion bağlantısını tıklayın.--> CreateTable.java dosyasını run edin(sağ tık run file)-->vendor-->index.jsp dosyasını run edin.
--> Admin tablosundan kendi kullanıcı adı ve parolanızı oluşturup kullanmaya başlayabilirsiniz."

-->   Kurduğunuz Mysql'de "x" isminde bir bağlantı oluşturmanız gerekiyor.Tabiki bu adı değiştirip kendi yarattığınız bir bağlantı adresini verebilirsiniz. Ayrıca sizin Mysql kurulumu sırasında belirlediğiniz kullanıcı adı ve şifre de farklı olacaktır. kendi kullanıcı adı ve şifrelerinizi yazınız;

Eclipse Ide ile açmak isterseniz

"Eclipse IDE->File->Import-> Existing Projects into Workspace" sekmelerine basıp "browse" ile de indirilen projeyi seçip ,projeyi Eclipse'ye dahil edin.
Common_Things.java'daki url'yi proje bağlantısıyla güncelleyin, Bağlantı noktası numarasına da dikkat edin. Tomcat sunucu port numaranıza göre ekleyin.

" package common;
public class Common_Things {    
    public static String url="http://localhost:8080/LMS";
} "

Bu anlatıklarım eksiksiz uygulanmış ise proje düzgün çalışacaktır.

Saygılarımla.
İyi çalışmalar dilerim.





  