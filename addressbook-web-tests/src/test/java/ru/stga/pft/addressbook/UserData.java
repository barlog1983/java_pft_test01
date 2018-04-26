package ru.stga.pft.addressbook;

public class UserData {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String title;
  private final String companyname;
  private final String companyaddress;
  private final String homephone;
  private final String mobilephone;
  private final String workphone;
  private final String fax;
  private final String email1;
  private final String email2;
  private final String email3;
  private final String homesite;
  private final String birthdayear;
  private final String secondeyar;
  private final String useraddress;
  private final String userphone;
  private final String usernotes;

  public UserData(String firstname, String middlename, String lastname, String nickname, String title, String companyname, String companyaddress, String homephone, String mobilephone, String workphone, String fax, String email1, String email2, String email3, String homesite, String birthdayear, String secondeyar, String useraddress, String userphone, String usernotes) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.title = title;
    this.companyname = companyname;
    this.companyaddress = companyaddress;
    this.homephone = homephone;
    this.mobilephone = mobilephone;
    this.workphone = workphone;
    this.fax = fax;
    this.email1 = email1;
    this.email2 = email2;
    this.email3 = email3;
    this.homesite = homesite;
    this.birthdayear = birthdayear;
    this.secondeyar = secondeyar;
    this.useraddress = useraddress;
    this.userphone = userphone;
    this.usernotes = usernotes;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompanyname() {
    return companyname;
  }

  public String getCompanyaddress() {
    return companyaddress;
  }

  public String getHomephone() {
    return homephone;
  }

  public String getMobilephone() {
    return mobilephone;
  }

  public String getWorkphone() {
    return workphone;
  }

  public String getFax() {
    return fax;
  }

  public String getEmail1() {
    return email1;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getHomesite() {
    return homesite;
  }

  public String getBirthdayear() {
    return birthdayear;
  }

  public String getSecondeyar() {
    return secondeyar;
  }

  public String getUseraddress() {
    return useraddress;
  }

  public String getUserphone() {
    return userphone;
  }

  public String getUsernotes() {
    return usernotes;
  }
}
