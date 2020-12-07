$("Submit").click(function(WildMap) {
    var client = document.getElementById('nameDetail').value;
    alert('Hello' + ' Thank you. ' + ' We have received your record successfully ' + '!');
    party.preventDefault();
});

//  *************RESET FORM*****************
$("Submit").on('click', function(){
    $('form').each(function(){
        this.reset();
    });
});