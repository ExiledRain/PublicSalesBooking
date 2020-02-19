<#import "parts/common.ftlh" as p>
<#import "parts/login.ftlh" as l>

<@p.page>
    <style>
        table, tr, th, td {
            border: 1px solid grey;
        }
    </style>
    <div>
        <@l.logout/>
        <span><a href="/user">User list</a></span>
    </div>

    <div>
        <form method="post">
            <input type="text" name="text" placeholder="Enter message text"/>
            <input type="number" name="cost" placeholder="Enter cost"/>
            <input type="text" name="description" placeholder="Enter description"/>
            <input type="text" name="customerContact" placeholder="Enter other contacts"/>
            <input type="email" name="email" placeholder="Enter email"/>
            <input type="hidden" name="_csrf" value="${_csrf.token}">
            <button type="submit">Add</button>
        </form>
    </div>
    <div>Deals List</div>

    <table>
        <thead>
        <tr>
            <th>Deal number:</th>
            <th>Cost:</th>
            <th>Email:</th>
            <th>Contact:</th>
            <th>Description:</th>
        </tr>
        </thead>
        <tbody>
        <#list messages as message>
            <tr>
                <td>${message.id}</td>
                <td>  ${message.cost}</td>
                <td>  ${message.email}</td>
                <td>  ${message.customerContact}</td>
                <td>  ${message.description}</td>
            </tr>
        </#list>
        </tbody>

    </table>
</@p.page>