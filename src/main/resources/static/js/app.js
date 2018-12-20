
/**
 * Use Ajax To Update romanNumeral
 * @param romanNumeral
 * @returns {boolean}
 */
function lookUpRomanNumeral(romanNumeral) {
    var numbers = /^[0-9]+$/;
    //Validation
    if(!romanNumeral.value.match(numbers))
    {
        alert('Please input numeric characters only [>=1]....');
        $('#romanNumeralFormID')[0].reset();
        $("#responceDivID").text("");
        return false;
    }
    //Validation
    if(romanNumeral.value==0)
    {
        alert('Please input numeric characters only [>=1]....');
        $('#romanNumeralFormID')[0].reset();
        $("#responceDivID").text("");
        return false;
    }
    //Ajax Function
    $.ajax({
        url : "/numberProcess.html",
        data: "romanNumeral=" + romanNumeral.value,
        type: "post",
        success: function(response) {
            $("#responceDivID").text(response);
        },
        error : function(e) {
            console.log("ERROR: ", e);
        },
        done : function(e) {
            console.log("DONE");
        }
    });
}

