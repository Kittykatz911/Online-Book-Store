package Main;

import database.DataBaseConnection; // unload contents of DataBaseConnection.java

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

  public String getTitle()
  {
    return Title;
  }

  public String getAuthor()
  {
    return Author;
  }

  public String getGenre()
  {
    return Genre;
  }

  public Double getPrice()
  {
    return Price;
  }

  public int getPublished()
  {
    return Published;
  }

  public int getReferenceNumber()
  {
    return ReferenceNumber;
  }

  public int getAvailableCopies()
  {
    return availableCopies;
  }

  public boolean getIsAvailable()
  {
    return IsAvailable;
  }

}
  
