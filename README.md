# Registration-Form-with-HTML-and-CSS
<h1>Simple Responsive Registration Form with HTML and CSS</h1>

<h2>Post Content:</h2>
This project demonstrates a responsive registration form with centered content, built using HTML and CSS. The form includes user input fields such as name, username, password, gender, email, and academic information. The content is fully centered both vertically and horizontally to create a clean and professional appearance on all screen sizes.

<h2>Key Features:</h2>
     * Centered Content: The form and all elements are centered using CSS flexbox for a clean and modern layout.
     * Responsive Design: Works seamlessly on different devices and screen sizes.
     * User-Friendly Form Layout: Includes necessary fields for user registration with modern input styles and a submit button.
     * Hover Effects: Subtle hover effect on the submit button for improved user experience.

<h2>How to Use:</h2>
     1. Clone the repository and open index.html in your browser to view the form.
     2. Customize the form fields or action URL as needed for your project.
     3. Extend the form styles by modifying the CSS to fit your design.

<h2>Demo:</h2>
      Open index.html in your browser to view the centered registration form.

      <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Centered Registration Form</title>
    <style>
        /* Center the entire body content */
        body {
            font-family: sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        /* Container for the form */
        .container {
            background-color: #fff;
            padding: 30px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            width: 350px;
            text-align: center;
        }

        h2 {
            margin-bottom: 30px;
        }

        .form-group {
            margin-bottom: 20px;
            text-align: left; /* Align labels and inputs */
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="password"],
        input[type="email"],
        input[type="number"],
        input[type="date"],
        select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }

        button {
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
            margin-top: 20px;
        }

        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Registration Form</h2>
        <form action="register" method="post">
            <div class="form-group">
                <label for="first-name">First Name:</label>
                <input type="text" name="first-name" placeholder="Enter your first name" required>
            </div>

            <div class="form-group">
                <label for="last-name">Last Name:</label>
                <input type="text" name="last-name" placeholder="Enter your last name" required>
            </div>

            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" name="username" placeholder="Set your username" required>
            </div>

            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" name="password" placeholder="Set your login password" required>
            </div>

            <div class="form-group">
                <label for="gender">Gender:</label>
                <select name="gender" id="gender" required>
                    <option value="Select">Select</option>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                    <option value="Other">Other</option>
                </select>
            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" name="email" placeholder="Enter your email address" required>
            </div>

            <div class="form-group">
                <label for="mobile-no">Mobile No:</label>
                <input type="number" id="mobile-no" name="mobile-no" placeholder="Enter your mobile number" required>
            </div>

            <div class="form-group">
                <label for="dob">DOB:</label>
                <input type="date" id="dob" name="dob" required>
            </div>

            <div class="form-group">
                <label for="graduation-year">Graduation Passing Year:</label>
                <select name="graduation-year" id="graduation-year" required>
                    <option value="Select Year">Select Year</option>
                    <option value="2021">2021</option>
                    <option value="2022">2022</option>
                    <option value="2023">2023</option>
                    <option value="2024">2024</option>
                    <option value="2025">2025</option>
                </select>
            </div>

            <div class="form-group">
                <label for="semesters">How many semesters have you completed in graduation?</label>
                <input type="number" id="semesters" name="semesters" required>
            </div>

            <div class="form-group">
                <label for="tenth-percentage">10th Percentage:</label>
                <input type="number" name="tenth-percentage" placeholder="Enter your percentage" required>
            </div>

            <div class="form-group">
                <label for="twelfth-percentage">12th Percentage:</label>
                <input type="number" name="twelfth-percentage" placeholder="Enter your percentage" required>
            </div>

            <div class="form-group">
                <label for="experience">Fresher Experience:</label>
                <input type="text" name="experience" placeholder="Type here">
            </div>

            <button type="submit">Submit</button>
        </form>
    </div>

</body>
</html>
