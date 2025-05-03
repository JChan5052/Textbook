public class Textbook{
    private String title;
    private double price;
    private int edition;
    public Textbook(String booktitle, double bookPrice){
      title=booktitle;
      price=bookPrice;
      edition=1;
    }
    public Textbook(String booktitle, double bookPrice, int bookEdition){
        title=booktitle;
        price=bookPrice;
        edition=bookEdition;
      }
    public String getTitle(){
      return title;
    }
    public int getEdition(){
        return edition;
    }

    public String getBookInfusion(){
      return title + "-" + price;
    }

   public boolean canSubstituteFor(Textbook incoming){
    if (this.title.equals(incoming.getTitle())){
      if (this.edition>incoming.getEdition()) return true;
    }
     return false;
   }
}