FROM bellsoft/liberica-openjdk-alpine:11-cds

# Install needed utils: curl and jq
RUN apk add curl jq

# wprkspace
WORKDIR /home/selenium-docker

# Add the required files. Dot means copy to the current cat
ADD target/docker-resources ./
ADD runner1.sh               runner1.sh

# Environment variables
# Browser
# HUB_HOST
# TEST_SUITE
# THREAD_COUNT

# Start the runner.sh
ENTRYPOINT sh runner1.sh

# java -cp 'libs/*' \
#           -Dselenium.grid.enabled=true \
#           -Dselenium.grid.hubHost=${HUB_HOST} \
#           -Dbrowser=${BROWSER} \
#           org.testng.TestNG \
#           -threadcount ${THREAD_COUNT} \
#           test-suites/${TEST_SUITE}
