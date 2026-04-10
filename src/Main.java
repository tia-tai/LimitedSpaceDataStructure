public class Main {
    public static void main(String[] args) {
        QueueData animalQueue = new QueueData();
        String animal1 = "Dog";
        String animal2 = "Cat";
        String animal3 = "Giraffe";

        for (int i = 0; i < 34; i = i + 1) {
            System.out.println(animalQueue.put(animal1));
            System.out.println(animalQueue.put(animal2));
            System.out.println(animalQueue.put(animal3));
        }

        for (int i = 0; i < 34; i = i + 1) {
            System.out.println(animalQueue.get());
            System.out.println(animalQueue.get());
            System.out.println(animalQueue.get());
        }

        StackData animalStack = new StackData();
        for (int i = 0; i < 34; i = i + 1) {
            System.out.println(animalStack.put(animal1));
            System.out.println(animalStack.put(animal2));
            System.out.println(animalStack.put(animal3));
        }

        for (int i = 0; i < 34; i = i + 1) {
            System.out.println(animalStack.get());
            System.out.println(animalStack.get());
            System.out.println(animalStack.get());
        }
    }
}