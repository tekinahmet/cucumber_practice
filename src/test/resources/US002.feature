@US002 @Registration
Feature:  US002: Registration should be successful using email and username

  Scenario: US002AC01: Choose a username that can contain any chars, but it cannot be blank
    Given User goes to homepage
    When user clicks user icon
    And user clicks register link
    Given US002AC01TC01: User leaves the username blank, there should be Your username is required. error message
    When US002AC01TC02: User enters username special chars £#$€, there should be Your username is invalid. error message
    And US002AC01TC03: User enters username  that can contain any chars, there should not be any error message



# REST IS HOMEWORK !!!

  #Scenario: US002AC02: username should be validated using api and must be unique

  Scenario: US002AC03: email id cannot be created without "@" sign and "." extension
  Given US002AC03TC01: User enters the email as johndoe.com, there should be This field is invalid error message
  When US002AC03TC02: User enters the email as john@doecom, there should be This field is invalid error message
  And US002AC03TC03: User enters the email as john@doe., there should be This field is invalid error message
  And US002AC03TC04: User enters the email as @doe.com, there should be This field is invalid error message
  Then US002AC03TC05: User enters the email as john@doe.com, there should not be any error message

  Scenario:US002AC04: email cannot be left blank
  Given US002AC04TC01: User leaves the email blank, there should be Your email is required. error message
  When US002AC04TC02: User enters the email as john@doe.com, there should not be any error message