$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8090/rest-server-sample-jersey/rest/userservice/users"
    }).then(function(data) {
       $('.users').append(data.success);
    });
});