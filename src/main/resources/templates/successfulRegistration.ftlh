[#ftl]
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Successful Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
    <link rel="stylesheet" href="/css/custom-style.css"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body style="height: 100%;">
<section class="h-100 h-custom">
    <div class="container py-5 h-100" style="margin-top: 8vh;">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                <div class="card" style="border-radius: 1rem; background-color: rgba(193,218,252,0.85);">
                    <div class="card-body p-5 text-center">

                        <h3 class="mb-5" style="color: #000e98;">Registration Summary</h3>

                        <div class="row text-start mb-4">
                            <div class="col">
                                <h5 class="text-muted mb-2">Given name:</h5>
                                <p class="text-dark fw-bold">${form.givenName}</p>
                            </div>
                            <div class="col">
                                <h5 class="text-muted mb-2">Surname:</h5>
                                <p class="text-dark fw-bold">${form.surname}</p>
                            </div>
                        </div>

                        <div class="row text-start mb-4">
                            <div class="col">
                                <h5 class="text-muted mb-2">Birthday:</h5>
                                <p class="text-dark fw-bold">${form.getBirthdayInReadableForm()}</p>
                            </div>
                            <div class="col">
                                <h5 class="text-muted mb-2">Sex:</h5>
                                <p class="text-dark fw-bold">${form.sex}</p>
                            </div>
                        </div>

                        <div class="row text-start mb-4">
                            <div class="col">
                                <h5 class="text-muted mb-2">Camp session:</h5>
                                <p class="text-dark fw-bold">${form.campSessionInReadableForm}</p>
                            </div>
                        </div>

                        <div class="row text-start mb-4">
                            [#if form.email??]
                                <div class="col">
                                    <h5 class="text-muted mb-2">Email:</h5>
                                    <p class="text-dark fw-bold">${form.email}</p>
                                </div>
                            [/#if]
                            [#if form.phoneNumber??]
                                <div class="col">
                                    <h5 class="text-muted mb-2">Phone number:</h5>
                                    <p class="text-dark fw-bold">${form.phoneNumber}</p>
                                </div>
                            [/#if]
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>