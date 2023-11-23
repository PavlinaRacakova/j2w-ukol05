[#ftl]
[#import "/spring.ftl" as spring]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Registration for summer camp</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
    <link rel="stylesheet" href="/css/style.css"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<main>
    <h1>Registration for summer camp</h1>
    <form action="/" method="post">

        <div class="mb-3">
            <label for="givenName">Given name:</label>
            [@spring.formInput path="form.givenName"/]
            <div class="error">[@spring.showErrors "<br>"/]</div>
        </div>

        <div class="mb-3">
            <label for="surname">Surname:</label>
            [@spring.formInput path="form.surname"/]
            <div class="error">[@spring.showErrors "<br>"/]</div>
        </div>

        <div class="mb-3">
            <label for="birthday">Birthday:</label>
            <input type=date id="birthday" name="birthday" value=[@spring.bind "form.birthday"/]>
            <div class="error">[@spring.showErrors "<br>"/]</div>
            [#list springMacroRequestContext.getBindStatus("form").errorMessages as customValidationError]
                <div class="error"><b>${customValidationError}</b></div>
            [/#list]
        </div>

        <div class="mb-3">
            <div>Sex:</div>
            <div>
                <input class="form-check-input" id="girl" type="radio" name="sex" value="girl"/>
                <label class="form-check-label" for="girl">Girl</label>
            </div>
            <div>
                <input class="form-check-input" id="boy" type="radio" name="sex" value="boy"/>
                <label class="form-check-label" for="boy">Boy</label>
            </div>
            [@spring.bind "form.sex"/]
            <div class="error">[@spring.showErrors "<br>"/]</div>
        </div>

        <div class="mb-3">
            <label for="campSession">Camp session:</label>
            [@spring.formSingleSelect path="form.campSession" options={
            "": "",
            "${enum1}": "${enum1.campSessionDateInReadableForm}",
            "${enum2}": "${enum2.campSessionDateInReadableForm}",
            "${enum3}": "${enum3.campSessionDateInReadableForm}"
            } /]
            <div class="error">[@spring.showErrors "<br>"/]</div>
        </div>

        <div class="mb-3">
            <label for="email">Parent's email:</label>
            [@spring.formInput path="form.email" fieldType="email"/]
            <div class="error">[@spring.showErrors "<br>"/]</div>
        </div>

        <div class="mb-3">
            <label for="phoneNumber">Parent's phone number:</label>
            [@spring.formInput path="form.phoneNumber"/]
            <div class="error">[@spring.showErrors "<br>"/]</div>
        </div>

        <div class="col-12">
            <button class="btn btn-primary" type="submit">Registrate your child</button>
        </div>
    </form>
</main>
</body>
</html>
