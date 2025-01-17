abstract class Person {
    public abstract void eat();
    public abstract void exercise();
}
class Athlete extends Person {
    public void eat() {
        System.out.println("Athlete eats a balanced and nutritious diet to fuel their performance.");
    }
    public void exercise() {
        System.out.println("Athlete engages in rigorous training and exercises regularly to stay in top shape.");
    }
}
class LazyPerson extends Person {
    public void eat() {
        System.out.println("Lazy person enjoys their favorite snacks and unhealthy food while lounging on the couch.");
    }

    public void exercise() {
        System.out.println("Lazy person rarely exercises and prefers a sedentary lifestyle.");
    }
}
class a {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        LazyPerson lazyPerson = new LazyPerson();

        System.out.println("Athlete's Lifestyle:");
        athlete.eat();
        athlete.exercise();

        System.out.println("\nLazy Person's Lifestyle:");
        lazyPerson.eat();
        lazyPerson.exercise();
        
    }
}

