$("#jdtest-form").on("submit", function(e){
    e.preventDefault()

    $("#results-p").html("")

    var filmId = $("input#filmId").val()
    var characterId = $("input#characterId").val()

    var url = "/api/jdtest?filmId=" + filmId + "&characterId=" + characterId

    $.get(url, function(data) {

        if(data) {
            $("#results-p").html(data)
        }

    })
})