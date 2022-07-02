class Container {
    private int item;

    public Container(int item) {
        this.item = item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }
    

    public static void main(String[] args) {
        Container count = new Container(0);     // create new Container named count

        Container count1 = count;

        System.out.println(count.getItem());    // print out the value of count
        System.out.println(count1.getItem());

        count1 = new Container(1);

        System.out.println(count.getItem());    // print out the value of count
        System.out.println(count1.getItem()); 
}




}