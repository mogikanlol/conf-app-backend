@ECHO OFF

set buildDir="../build/"

for %%f in (%buildDir%*) do (
    if NOT conf-app.jar == %%f (
        echo fullname: %%f
        start "%%f" "java" -jar "%buildDir%"%%f
    )
)