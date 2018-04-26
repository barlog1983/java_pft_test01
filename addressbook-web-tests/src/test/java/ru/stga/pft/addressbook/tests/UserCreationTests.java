package ru.stga.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stga.pft.addressbook.model.UserData;

public class UserCreationTests extends TestBase {

  @Test
  public void testUserCreation() {
    app.getNavigationHelper().gotoUserPage();
    app.getUserHelper().initUserCreation();
    app.getUserHelper().fillUserForm(new UserData("Test1", "Test2", "Test3", "Test4", "Test5", "Test6", "Test7", "Test6", "Test9", "Test10", "Test11", "Test12", "Test13", "Test14", "Test15", "1998", "1999", "Test16", "Test17", "\\9"));
    app.getUserHelper().submitUserCreation();
    app.getNavigationHelper().gotoUserPage();
  }

}
