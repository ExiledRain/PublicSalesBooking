<#import "parts/common.ftlh" as p>
<#import "parts/login.ftlh" as l>

<@p.page>
    <h3>Add new USER</h3>
    <#if message??>
        ${message}
    </#if>
    <@l.login "/registration" />
</@p.page>