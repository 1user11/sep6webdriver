public class Cat {

        String name;
        String breed;
        String[] food;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Cat(String name, String breed, String[] food) {
            this.name = name;
            this.breed = breed;
            this.food=food;
    }

    public String[] getFood() {
        return food;
    }

    public void setFood(String[] food) {
        this.food = food;
    }

    public void printCat() {
            System.out.println("The cat's name is " + name + " and his breed is: " + breed);
        }

        public void meow() {
            System.out.println("Cat can meow");
        }

        public void purr() {
            System.out.println("Cat can purr");
        }

        public boolean canEat(String meal) {
            for (String f:  food  ) {
                if(f.equals(meal)) return true;
            }
            return false;
        }
}
