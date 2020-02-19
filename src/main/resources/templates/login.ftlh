<#import "parts/common.ftlh" as p>
<#import "parts/login.ftlh" as l>

<@p.page>
    <h3>Login page</h3>
    <@l.login "/login"></@l.login>
    <a href="/registration">Registration</a>
</@p.page>