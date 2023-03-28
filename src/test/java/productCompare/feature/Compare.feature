Feature: (TS_001) Register Functionality

#  Scenario 1:Validate adding the product for comparison from Product Display Pag
#    Given navigate to opencart
#    When Enter any existing Product name into the Search text box field
#    And Click on search icon button
#    And Click on the Product displayed in the Search results
#    And Hover the mouse cursor on Compare this Product option from the displayed Product Display Page
#    And Select Compare this Product option
#    Then Click on product comparison link from the displayed success message
#
#  Scenario 2: Validate adding the product for comparison from List View of Search Results page
#    Given navigate to opencart
#    When  Enter any existing Product name into the Search text box field
#    And Click on search icon button
#    And Select to view the search results in List view
#    And Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Search Results
#    And Select Compare this Product option2
#    And Select Compare this Product option (Validate ER-2)
#    Then Click on product comparison link from the displayed success message
#
#  Scenario 3: Validate adding the product for comparison from Grid View of Search Results page
#    Given navigate to opencart
#    When Enter any existing Product name into the Search text box field
#    And Click on search icon button
#    And Select to view the search results in Grid view
#    And  Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Search Results
#    And Select Compare this Product option
#    Then  Click on product comparison link from the displayed success message
#
#
#  Scenario 4: Open the Application URL in any supported browser
#    Given navigate to opencart
#    When Hover the mouse on any Menu say Desktops and select Show All Desktops option
#    And In the displayed Desktops category page, select List View option
#    And Hover the mouse cursor on Compare this Product option available on the Product that is displayed in the Product Category page (Validate ER-1)
#    And Select Compare this Product option (Validate ER-2)
#    Then Click on product comparison link from the displayed success message (Validate ER-3)

Scenario testcase4: Validate adding the product for comparison from List View of Product Category or Sub Category page
  Given navigate to opencart
  When Hover the mouse on any Menu say 'Desktops' and select 'Show All Desktops' option
  And In the displayed 'Desktops' category page, select 'List' View option
  And Hover the mouse cursor on 'Compare this Product' option available on the Product that is displayed in the Product Category page
  And Select 'Compare this Product' option
  Then lick on 'product comparison' link from the displayed success message
