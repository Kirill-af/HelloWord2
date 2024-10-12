public class Main {
    public static void main(String[] args) {

        //Задание № 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Dog " + dog);
        System.out.println("Cat " + cat);
        System.out.println("Paper " + paper);

        //Задание № 2

        var old_dog = 8.0;
        var old_cat = 3.6;
        var old_paper = 763789;

        old_dog += 4;
        old_cat += 4;
        old_paper =+ 4;

        System.out.println("Dog " + old_dog);
        System.out.println("Cat " + old_cat);
        System.out.println("Paper " + old_paper);

        // Задание № 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("Dog: " + dog);
        System.out.println("Cat: " + cat);
        System.out.println("Paper: " + paper);

        //Задание № 4
        var friend = 19;

        System.out.println("friend " + friend);

        friend += 2;

        System.out.println("friend " + friend);

        friend /= 7;

        System.out.println("friend " + friend);

        //Задание № 5
        var frog = 3.5;

        System.out.println("frog " + frog);

        frog *= 10;

        System.out.println("frog " + frog);

        frog /= 3.5;

        System.out.println("frog " + frog);

        frog += 4;

        System.out.println("frog " + frog);

        //Задание № 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var totalWeight = boxer1 + boxer2;

        System.out.println("Общая масса " + totalWeight + " кг");

        var weightDifference = Math.abs(boxer1 - boxer2);

        System.out.println("Разница в массе боксеров " + weightDifference + " кг");

        //Задание № 7

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;

        var remainder = boxer1Weight % boxer2Weight;

        System.out.println("Остаток " + remainder + " кг");

        //Задание № 8
        var totalHours = 640; // Общее количество часов работы
        var hoursPerEmployee = 8; // Количество часов, которое каждый сотрудник посвящает работе

        var numberOfEmployees = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек.");

        var increasedEmployees = numberOfEmployees + 94;

        var newTotalHours = increasedEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + increasedEmployees + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками.");

    }
}