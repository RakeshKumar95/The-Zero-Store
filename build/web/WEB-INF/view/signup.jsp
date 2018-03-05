<h2>Registration</h2>

<form id="signupTable" action="<c:url value='oauth'/>" method="post">
        <table>
            <tr>
                <td><label for="name">Name:</label></td>
                <td class="inputField">
                    <input type="text"
                           size="31"
                           maxlength="45"
                           id="name"
                           name="name"
                           value='${param.name}'>
                </td>
            </tr>
            <tr>
                <td><label for="email">Email:</label></td>
                <td class="inputField">
                    <input type="text"
                           size="31"
                           maxlength="45"
                           id="email"
                           name="email"
                           value='${param.email}'>
                </td>
            </tr>
          
            <tr>
                <td><label for="password">Password:</label></td>
                <td class="inputField">
                    <input type="password"
                           size="31"
                           maxlength="45"
                           id="password"
                           name="password"
                           class="password"
                           value='${param.password}' >
                </td>
            </tr>
            <tr>
                <td><label for="confirmPassword">Confirm Password:</label></td>
                <td class="inputField">
                    <input type="password"
                           size="31"
                           maxlength="45"
                           id="confirm_password"
                           name="confirmPassword"
                           class="password"
                           value='${param.confirmPassword}' >
                </td>
            </tr>
            <tr>
                <td colspan="4">
                    <input type="submit" value="Register"><a href="login">Login here!</a>
                </td>
            </tr>
           
        </table>
    </form>