 
 //THIS is only answer
 
 class MyBook extends Book{
        int price;
        MyBook(String titl,String autho,int mrp){
            super(titl,autho);
            price=mrp;
        }
    
   
    // Write your constructor here
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    } 
