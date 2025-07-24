package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import database.DataBaseConnection; // unload contents of DataBaseConnection.java

class Users
{
  // attributes:
  private String Username;
  private String Password;
  private String FirstName;
  private String LastName;
  private String Email;
  private String Books; // list of books bought
  private Double Balance;
  private int UserID;
  private int Gems;
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
    Email = email;
  }

  public void setBooks(String books)
  {
    Books = books;
  }

  public void setBalance(Double balance)
  {
    Balance = balance;
  }

  public void setUserID(int userID)
  {
    UserID = userID;
  }

  public void setGems(int gems)
  {
    Gems = gems;
  }

  public void setNumBooks(int numBooks)
  {
    NumBooks = numBooks;
  }

  // Accessors:
  
  public boolean Valid(String inusername, String pass) // method to validate user login
  {
    boolean good = false;

    try(Connection connect = DataBaseConnection.getConnection())
    {
      String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
      PreparedStatement statement = connect.prepareStatement(sql);

      statement.setString(1, inusername);
      statement.setString(2, pass);

      ResultSet result = statement.executeQuery();

      if(result.next()) // if the login is valid then set the attributes
      {
        good = true;
        setUsername(result.getString("username"));
        setPassword(result.getString("password"));
        setFirstName(result.getString("first_name"));
        setLastName(result.getString("last_name"));
        setEmail(result.getString("email"));
        setBooks(result.getString("books"));
        setBalance(result.getDouble("balance"));
        setUserID(result.getInt("user_id"));
        setGems(result.getInt("gems"));
        setNumBooks(result.getInt("num_books"));
      }
    } 
    catch (SQLException e) 
    {
      e.printStackTrace();
    }

    return good; // should make Valid be true of login is good
  }

  public String getUsername()
  {
    return Username;
  }

  public String getPassword()
  {
    return Password;
  }

  public String getFirstName()
  {
    return FirstName;
  }

  public String getLastName()
  {
    return LastName;
  }

  public String getEmail()
  {
    return Email;
  }

  public String getBooks()
  {
    return Books;
  }

  public Double getBalance()
  {
    return Balance;
  }

  public int getUserID()
  {
    return UserID;
  }

  public int getGems()
  {
    return Gems;
  }

  public int getNumBooks()
  {
    return NumBooks;
  }
}
