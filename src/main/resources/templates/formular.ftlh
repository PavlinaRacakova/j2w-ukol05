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
</head>
<body>
<main>
    <h1>Registration for summer camp</h1>
    <form action="/" method="post">

        <label for="givenName">Given name:</label>
        [@spring.formInput path="form.givenName"/]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="surname">Surname:</label>
        [@spring.formInput path="form.surname"/]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="birthday">Birthday:</label>
        <input type=date id="birthday" name="birthday" value=[@spring.bind "form.birthday"/]>
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <div>Sex:</div>
        <div>
            <input id="girl" type="radio" name="sex" value="girl"/>
            <label for="girl">Girl</label>
        </div>
        <div>
            <input id="boy" type="radio" name="sex" value="boy"/>
            <label for="boy">Boy</label>
        </div>
        [@spring.bind "form.sex"/]
        <div class="error">[@spring.showErrors "<br>"/]</div>


        <label for="campSession">Camp session:</label>
        [@spring.formSingleSelect path="form.campSession" options={
        "": "",
        "session1": "July 5th - 11th",
        "session2": "July 12th - 18th",
        "session3": "August 2nd - 10th"
        } /]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="email">Parent's email:</label>
        [@spring.formInput path="form.email" fieldType="email"/]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <label for="phoneNumber">Parent's phone number:</label>
        [@spring.formInput path="form.phoneNumber"/]
        <div class="error">[@spring.showErrors "<br>"/]</div>

        <button type="submit">Registrate your child</button>

    </form>
</main>
</body>
</html>
