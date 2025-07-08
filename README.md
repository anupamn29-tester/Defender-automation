**Defender Automation Framework**
This project is a Selenium-based Automation Testing Framework for the **Defender** web application. It is built using Java, Maven, and TestNG, following the **Page Object Model (POM)** design pattern.

🧩 Project Structure
```
DefenderAutomation/
└── Defender/
    ├── pom.xml                     # Maven project file
    ├── src/
    │   └── main/
    │       └── java/
    │           ├── Utilities/      # Utility classes for query handling
    │           └── collation/
    │               └── Defender/   # Main framework logic
    │                   ├── BaseClassSetup.java
    │                   ├── DropDown.java
    │                   ├── DynamicSelectDropdown.java
    │                   └── locator/
    │                       └── Event/ and Anonymous/ # Page locators
    ├── .mvn/ and .settings/        # Maven and IDE settings
    └── screenshots/                # Screenshots of test results
```

🚀 Features
- Page Object Model (POM) design
- Maven-based build
- TestNG integration
- Custom dropdown handlers
- Dynamic locators and reusable methods
- Organized locator packages by module

⚙️ Setup Instructions
1. **Install Dependencies**  
   ```bash
   mvn clean install
   ```

2. **Run Tests**  
   Use TestNG to run test suites from the Test folder (not included in shared files). Example:
   ```bash
   mvn test
   ```


🧱 BaseClassSetup – Selenium WebDriver Initialization
`BaseClassSetup` is a foundational Java class for Selenium WebDriver automation. It provides reusable setup and configuration functionality used across test classes in your automation framework.

📁 File Location
src/main/java/collation/Defender/BaseClassSetup.java

🔧 Purpose
This class:
- Loads configuration from a properties file.
- Initializes the Chrome WebDriver using WebDriverManager.
- Sets up essential browser configurations (timeouts, window state, cookies).
- Launches the target URL defined in the properties file.

⚙️ Features

✅ Property Loading
Loads config values (like URL, credentials) from a `.property` file:
```java
FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\src\main\java\collation\def\prop\conf.property");
prop.load(ip);
```
✅ WebDriver Initialization
Uses WebDriverManager to automatically manage and setup the latest ChromeDriver:
```java
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
```

✅ Browser Setup
Applies general configurations:
- Maximizes window
- Deletes all cookies
- Sets page load and implicit wait timeouts
- Navigates to the app URL

🏁 Methods
`BaseClassSetup()`
- Loads the properties file (`conf.property`)
- Sets `prop` object to be reused throughout the framework

`lunch()`
Initializes and configures the WebDriver session:
- Launches Chrome
- Configures browser
- Opens target URL from property file

💡 Typo: `lunch()` should likely be renamed to `launch()` for clarity.

📝 Requirements

- Java 8 or higher
- Maven
- [WebDriverManager](https://github.com/bonigarcia/webdrivermanager) dependency in `pom.xml`
- `conf.property` file must contain a valid `url` key

🔐 Example `conf.property` File

```properties
url=https://defender.aptsoftware.in/
username=yourUsername
password=yourPassword
```

🔽 DynamicSelectDropdown – Utility for Dynamic UI Interactions
`DynamicSelectDropdown` is a utility class used to handle dynamic dropdowns, tables, and form fields in web applications using Selenium WebDriver. It extends `BaseClassSetup` to reuse the WebDriver and config setup.

⚙️ Features
- Interact with Kendo UI dropdowns and combo boxes
- Select random elements from tables and date pickers
- Populate random data in number fields
- Retry failed interactions with stale elements

🔧 Methods
### `kendodropdownlist(String x)`
- Selects a random value from a Kendo dropdown list based on the `data-cy` attribute.

### `kendocombobox(String x)`
- Similar to `kendodropdownlist()` but for Kendo ComboBoxes.

### `name()`
- Returns a 5-letter random uppercase string. Useful for filling random values in form fields.

### `autoselecttable(WebDriver driver, String x, int maxRetries)`
- Randomly selects and clicks a row in a table. Includes retry logic for stale or intercepted elements.

### `calender()`
- Navigates through a calendar widget to select a random date. Clicks through parent views to select year, month, and day.

### `Addnewrecords()`
- Automates the process of adding a new record:
  - Opens form
  - Selects a trace option randomly
  - Fills remarks with random string
  - Chooses a random date
  - Submits the record

### `numberfield()`
- Randomly selects enabled input fields on a form and fills them with random values (`data_<random>`). Ensures no repetition.

### `clickWithRetry(WebDriver driver, By locator)`
- Tries to click an element up to 3 times if it fails due to a `StaleElementReferenceException`.

📝 Notes

- Uses `WebDriverWait` for all UI interactions to ensure synchronization.
- Makes heavy use of `Random` and `Set` to avoid duplication.
- Code includes verbose `System.out.println()` statements for debugging purposes.


🔐 LoginPage – Automated Login Handler

`LoginPage` is a Selenium-based Page Object class that encapsulates the login workflow for the application. It inherits WebDriver setup from `BaseClassSetup` and integrates with Kendo dropdowns and event dashboard locators.

---

⚙️ Purpose

- Automates user login into the web application.
- Interacts with username, password, visibility toggle (eye icon), tenant selector, and submit button.

---

👤 Individual – Create and Edit Individual Profiles

The `Individual` class is a Page Object Model (POM) that automates the creation and editing of "Individual" profiles in the Collation platform. It combines dropdown handling, table interaction, and form data entry using Selenium WebDriver.

---

🧩 Key Components

### Dependencies
- `LoginPage`: For user authentication
- `DropDown`: For dropdown validations
- `DynamicSelectDropdown`: Utility for dynamic dropdowns, tables, and random data

### Locators
Includes over 30 `By` locators for various UI elements like:
- First name, last name, parent/spouse selection buttons
- Kendo dropdowns and textboxes
- Alias and traceability tables
- Religious, nationality, caste fields

---

🔧 Method

### `Individuallocators()`

Executes the complete automation workflow:

1. **Login Phase**
   - Calls `LoginPage.signin()` using username and password from the config.

2. **Navigation Phase**
   - Navigates to `Collation > Individual` section and clicks "Create New".

3. **Form Filling Phase**
   - Randomly generates and fills first name and last name.
   - Selects from dynamic dropdowns (e.g., salutation, marital status, sex).
   - Uses table pickers for Parent, Organization, Location, Spouse, etc.
   - Handles calendar and hot index selection.
   - Adds Alias with remarks.

4. **Submission Phase**
   - Clicks Save and verifies the success.
   - Navigates back and searches for the newly created entry.
   - Edits the record, updates values, and saves again.

---


## 💡 Highlights

- Uses `WebDriverWait` for explicit waits.
- Random data generation with `DynamicSelectDropdown.name()`.
- Handles retry logic and dynamic waits.
- Validates forms with `eve.validate()`.
- Simulates realistic user workflows.

---

✍️ Author

Anupam Naskar

