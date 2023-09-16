## Laboratory report

### Docker Hub Image
Image: [https://hub.docker.com/repository/docker/eirmas/unit-converter/general](https://hub.docker.com/repository/docker/eirmas/unit-converter/general)

#### > technical problems that you encountered during installation of the software development environment and how you have solved them
Initially I had some issues installing the correct version of gradle and have it work correclty in my setup (fish shell).
Main issue was adding gradle to path, but I solved it later by adding some script to my config.fish file.

#### > how you have validated (checked) that the software development environment is working
I've used the `gradlew check` command to run my tests to ensure it's working as expected. I've also used `gradlew build` to ensure the project is building correclty, and used the `gradlew run` command to ensure it's running as expected. I've also installed appropriate VSCode plugins to give me correct syntax highligting and helper plugins.
After some issues with adding new dependencies, I now don't receive any errors in my IDE.

#### > technical problems and how you (tried to) solve them,
I had some issues publishing the docker image to Docker Hub. It turned out I had to log out and back in for it to work.
I also didnt tag the image at first as I saw it already had the "latest" tag. I had to tag it "eirmas/unit-converter" for it to work and be tagged under my own namespace.

#### > any pending issues with this assignment which you did not manage to solve.
Solved all of them.