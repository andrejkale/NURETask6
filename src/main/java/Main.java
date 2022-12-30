import abiturient.CorrespondenceStudent;
import abiturient.Student;
import building.Theater;
import edition.CatalogAndEncyclopedia;
import employee.Engineer;
import employee.Manager;

public class Main {
    public static void main(String[] args) {
        CatalogAndEncyclopedia book = new CatalogAndEncyclopedia();
        CatalogAndEncyclopedia catalog = new CatalogAndEncyclopedia();
        CatalogAndEncyclopedia encyclopedia = new CatalogAndEncyclopedia();

       CatalogAndEncyclopedia javaMethod = book.publishBook("JAVA_Methods_Programming", "EPAM", true);
       CatalogAndEncyclopedia ikeaCatalog = catalog.publishCatalog("IKEA", "IKEA", false);
       CatalogAndEncyclopedia bigUkrainianEncyclopedia = encyclopedia.publishEncyclopedia("Большая украинская энциклопедия"
                , "различные авторы"
                , false);

        CatalogAndEncyclopedia.printBook(javaMethod);
        CatalogAndEncyclopedia.printBook(ikeaCatalog);
        CatalogAndEncyclopedia.printBook(bigUkrainianEncyclopedia);

        Student sergeyIvanov = new CorrespondenceStudent("Sergey", "Ivanov");
        CorrespondenceStudent.printStudent(sergeyIvanov);
        System.out.println(sergeyIvanov.getName());
        System.out.println(sergeyIvanov.getSecondName());
        System.out.println(sergeyIvanov.getType());

        Engineer qaEngineer = new Engineer("QA automation", 3000.50, 3, false);
        Manager qaManager = new Manager("QA automation manager", 5500.35, 5, false);

        Engineer.printEngineer(qaEngineer);
        Manager.printManager(qaManager);

        Theater kharkovTheater = new Theater("Kharkov"
                , 2
                , 500
                , 2
                , 3
                , "Public building"
                , true);

        Theater.printTheater(kharkovTheater);
    }
}
