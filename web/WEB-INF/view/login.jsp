
                    <h2>Login</h2>
<form action="<c:url value="oauthlogin" />" method=post >
    <div id="loginBox">
        <pre>
        <p><strong>Email:   </strong><input type="text" size="20" name="email"></p><p><strong>Password:</strong><input type="password" size="20" name="password" ></p><p><input type="submit" value="Login"> <a href="<c:url value="signup" />">Create your account here</a></p>
        </pre>
    </div>
</form>