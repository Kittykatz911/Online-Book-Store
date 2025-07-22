class Books
{
  // attributes:
  private String Title;
  private String Author;
  private String Genre;
  private Double Price;
  private int Published; // year of publication
  private int ReferenceNumber;
  private int availableCopies;
  private boolean IsAvailable;

  // Constructors:

  public Books()
  {
    Title = "";
    Author = "";
    Genre = "";
    Price = 0.0;
    Published = 0;
    ReferenceNumber = 0;
    availableCopies = 0;
    IsAvailable = false;
  }

  //Mutators:

  public void setTitle(String title)
  {
    Title = title;
  }

  public void setAuthor(String author) 
  {
      Author = author;
  }

  public void setGenre(String genre)
  {
    Genre = genre;
  }

  public void setPrice(Double price)
  {
    Price = price;
  }

  public void setPublished(int published)
  {
    Published = published;
  }

  public void setReferenceNumber(int referenceNumber)
  {
    ReferenceNumber = referenceNumber;
  }

  public void setAvailableCopies(int Copies)
  {
    availableCopies = Copies;
  }

  public void setIsAvailable(boolean isAvailable)
  {
    IsAvailable = isAvailable;
  }

  //Accessors:

  public getTitle()
  {
    return Title;
  }

  public getAuthor()
  {
    return Author;
  }

  public getGenre()
  {
    return Genre;
  }

  public getPrice()
  {
    return Price;
  }

  public getPublished()
  {
    return Published;
  }

  public getReferenceNumber()
  {
    return ReferenceNumber;
  }

  public getAvailableCopies()
  {
    return availableCopies;
  }

  public getIsAvailable()
  {
    return IsAvailable;
  }

}
  
