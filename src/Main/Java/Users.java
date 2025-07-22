class Users
{
  // attributes:
  private String Username;
  private String Password;
  private String FirstName;
  private String LastName;
  private String email;
  private String Books; // list of books bought
  private Double balance;
  private int userID;
  private int gems;
  private int NumBooks; // number of books bought

  // Constructors:
  public Users()
  {
    username = "";
    password = "";
    FirstName = "";
    LastName = "";
    email = "";
    Books = "";
    balance = 0.0;
    userID = 0;
    gems = 0;
    NumBooks = 0;
  }

  // Mutators:

  public void setUsername(String username)
  {
    Username = username;
  }

  public void setPassword(String password)
  {
    Password = password;
  }

  public void setFirstName(String firstName)
  {
    FirstName = firstName;
  }

  public void setLastName(String lastName)
  {
    LastName = lastName;
  }

  public void setEmail(String email)
  {
    this.email = email;
  }

  public void setBooks(String books)
  {
    Books = books;
  }

  public void setBalance(Double balance)
  {
    this.balance = balance;
  }

  public void setUserID(int userID)
  {
    this.userID = userID;
  }

  public void setGems(int gems)
  {
    this.gems = gems;
  }

  public void setNumBooks(int numBooks)
  {
    NumBooks = numBooks;
  }

  // Accessors:
  
  public getUsername()
  {
    return Username;
  }

  public getPassword()
  {
    return Password;
  }

  public getFirstName()
  {
    return FirstName;
  }

  public getLastName()
  {
    return LastName;
  }

  public getEmail()
  {
    return email;
  }

  public getBooks()
  {
    return Books;
  }

  public getBalance()
  {
    return balance;
  }

  public getUserID()
  {
    return userID;
  }
  
  public getGems()
  {
    return gems;
  }

  public getNumBooks()
  {
    return NumBooks;
  }
}
