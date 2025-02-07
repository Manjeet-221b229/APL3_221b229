class LakeDuck implements Duck,Quack{
    @Override
    public void swim() {
        System.out.println("Lake Duck is swimming.");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck quacks!");
    }
}