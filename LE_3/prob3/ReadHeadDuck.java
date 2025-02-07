class RedHeadDuck implements Duck,Quack,Fly{
    @Override
    public void swim() {
        System.out.println("RedHead Duck is swimming.");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck quacks!");
    }

    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying.");
    }
}