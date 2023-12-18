# Homework no. 5

Create a webpage for registering for a summer camp for kids. The page will include a form that, upon submission, will undergo validation. If the form is filled out correctly, a page displaying a summary of the entered information will appear. If there are any errors in the form, the form will be displayed again with the user-entered data filled in, and error messages will be displayed for the erroneous fields.

1. Fork the source repository into your GitHub account, or continue with the task from the previous lesson.
2. Clone the repository from your GitHub account to your local computer.
3. Run the cloned application and open the page http://localhost:8080/ in a browser. You'll see a page displaying "TODO."
4. Create a Java Bean to store the form data for registration, naming it RegistraceForm. Store gender and selected session as String; use a code for the session, like session-1, session-2, etc.
5. Create a controller method to receive data from the RegistraceForm form.
6. Create an HTML form with the following details. The form's appearance isn't crucial, but if you want to create a functional form without writing styles, you can use the Bootstrap library. Participant's details (child's):
   * Name (required field)
   * Surname (required field)
   * Date of birth (required field)
   * Gender (boy/girl – required field)
   * Session (e.g., July 5th to 11th, July 12th to 18th, July 19th to 25th – required field)
   * Parent's email (optional field)
   * Parent's phone (optional field)
7. Configure validation of the form data in Java.
8. In the controller method, check the conditions. If they're not met, ensure that an appropriate error message is displayed next to the respective field.
   * Age between 9 and 15 years (inclusive). A reminder of the code for calculating age:
```java
Period period = birthDate.until(LocalDate.now());
int age = period.getYears();
```
9. Create a page to display the registration summary. You can copy the page with the form and use spans instead of inputs or set the inputs' attribute to readonly.
10. Check if everything is functioning correctly.
11. Commit and push the changes (the resulting code) to your repository on GitHub.
12. Insert the link to your repository as the solution to the task on the Moje Czechitas portal.

# Úkol 5

Vytvoř stránku pro registraci na letní dětský tábor. Stránka bude obsahovat formulář, po jeho odeslání se provede validace. Pokud bude formulář v pořádku,
zobrazí se stránka s rekapitulací zadaných údajů. Pokud bude ve formuláři nějaká chyba, zobrazí se znovu formulář, údaje zadané uivatelem v něm budou vyplněné
a u políček s chybou bude vypsána chybová zpráva.  

1. Udělej fork zdrojového repository do svého účtu na GitHubu, případně pokračuj ve svém úkolu z předchozí lekce.
1. Naklonuj si repository **ze svého účtu** na GitHubu na lokální počítač.
1. Spusť si naklonovanou aplikaci a otevři v prohlížeči stránku [http://localhost:8080/](http://localhost:8080/). Zobrazí se stránka s textem „TODO“.
1. Vytvoř přepravku (Java Bean) pro uložení údajů formuláře `RegistraceForm`. Pohlaví a zvolený turnus ukládej jako `String`, pro turnus zvol nějaký kód – např. `turnus-1`, `turnus-2` apod.
1. Vytvoř metodu controlleru, která bude přijímat údaje z formuláře v `RegistraceForm`.
1. Vytvoř HTML formulář s následujícími údaji. Na vzhledu formuláře tolik nezáleží, pokud ale chceš bez psaní stylů vytvořit docela použitelný formulář,
   můžeš použít knihovnu Bootstrap.
   Údaje o účastníkovi (dítěti):
   * jméno (povinný údaj)
   * příjmení (povinný údaj)
   * datum narození (povinný údaj)
   * pohlaví (chlapec/dívka – povinný údaj)
   * turnus (např. 5. až 11. července, 12. až 18. července, 19. až 25. července – povinný údaj)
   * e-mail na rodiče (volitelný údaj)
   * telefon na rodiče (volitelný údaj)
1. Nakonfiguruj validaci údaj z formuláře v Javě.
1. V metodě controlleru zkontroluj následující podmínky. Pokud nebudou splněné, zařiď, aby se u příslušného políčka vypsala odpovídající chybová zpráva. 
   * věk mezi 9 a 15 roky (včetně) – připomínám kód pro výpočet věku:
     ```java
     Period period = birthDate.until(LocalDate.now());
     int vek = period.getYears();
     ```
1. Vytvoř stránku pro zobrazení rekapitulace registrace. Můžeš zkopírovat stránku s formulářem a místo `input`ů použít `span`y, případně inputům nastav atribut `readonly`.   
1. Zkontroluj, zda vše funguje.
1. *Commitni* a *pushnni* změny (výsledný kód) do svého repository na GitHubu.
1. Vlož odkaz na své repository jako řešení úkolu na portálu [Moje Czechitas](https://moje.czechitas.cz).

## Bootstrap
Pokud chceš vytvořit formulář, který bude vypadat docela rozumně, a nechceš vytvářet vlastní styly, můžeš použít [Bootstrap](https://getbootstrap.com/). Popis
vložení Bootstrapu do stránky je v dokumentaci na stránce [Introduction](https://getbootstrap.com/docs/5.2/getting-started/introduction/). Důležité je do
hlavičky stránky vložit element `<link>`odkazující na `bootstrap.min.css` (v kódu bude celá cesta, tak, jak je uvedená na stránkách Bootstrapu). Stránka dále
popisuje vložení JavaScriptové knihovny používané Bootstrapem, ta není pro formuláře potřeba.

Na další stránce je popis [formulářů v Bootstrapu](https://getbootstrap.com/docs/5.2/forms/overview/). Obvykle stačí najít si v dokumentaci vzorový kód, ten si
zkopírovat do své stránky a upravit jej – zejména upravit texty a atributy `name` a `id` u elementů `<input>` a atrinbut `for` u elementů `<label>`.

## Odkazy

* odkaz na stránku [Lekce 6](https://java.czechitas.cz/2023-podzim/java-2-online/lekce-6.html)
* Java SE 17 [Javadoc](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/) – dokumentace všech tříd, které jsou součástí základní Javy ve verzi 17.
* Dokumentace [Spring Boot](https://spring.io/projects/spring-boot#learn) – odsud je anotace `@SpringBootApplication` a třída `SpringApplication`.
* Dokumentace [Spring Framework](https://spring.io/projects/spring-framework#learn) – odsud jsou anotace `@Controller`, `@GetRequest` a třída `ModelAndView`.
* Dokumentace [Freemarker](https://freemarker.apache.org/docs/) – šablonovací systém pro HTML použitý v projektu.
* Dokumentace [podpora java.time pro Freemarker](https://github.com/lazee/freemarker-java-8) – knihovna pro použití `java.time` tříd ve Freemarkeru.
* Dokumentace [HTML formulářů](https://developer.mozilla.org/en-US/docs/Learn/Forms)
* [Bootstrap](https://getbootstrap.com) – jeden z CSS frameworků
* [Bootstrap Icons](https://icons.getbootstrap.com) – sada ikon pro použití na webu
* [Unsplash](https://unsplash.com) – obrázky a fotografie k použití zdarma
