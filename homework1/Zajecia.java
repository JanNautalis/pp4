package homework1;

import java.util.ArrayList;

public class Zajecia {
    private String nazwa;
    private ArrayList<String> studenci = new ArrayList<>();

    public Zajecia(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajStudenta(String student) {
        if (studenci.size() < 10) {
            studenci.add(student);
            System.out.println("Dodano studenta " + student + " do zajęć " + nazwa + ".");
        } else {
            System.out.println("Nie można dodać studenta " + student + " do zajęć " + nazwa + " - przekroczona maksymalna liczba studentów.");
        }
    }

    public void wypiszListeStudentow() {
        System.out.println("Lista studentów na zajęciach " + nazwa + ":");
        for (String student : studenci) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Zajecia matematyka = new Zajecia("Matematyka");
        matematyka.dodajStudenta("Jan Kowalski");
        matematyka.dodajStudenta("Anna Nowak");
        matematyka.dodajStudenta("Piotr Wójcik");
        matematyka.dodajStudenta("Katarzyna Kowalczyk");
        matematyka.dodajStudenta("Adam Zieliński");
        matematyka.dodajStudenta("Marta Kwiatkowska");
        matematyka.dodajStudenta("Michał Wojciechowski");
        matematyka.dodajStudenta("Magdalena Kaczmarek");
        matematyka.dodajStudenta("Tomasz Adamczyk");
        matematyka.dodajStudenta("Krzysztof Nowicki");
        matematyka.dodajStudenta("Kacper Gromek");
        matematyka.wypiszListeStudentow(); // powinno wyświetlić listę 10 studentów
    }
}

