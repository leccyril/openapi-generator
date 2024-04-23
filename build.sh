#!/bin/bash

set -e

main() {
    export APP_NAME="tokenization-service"
    export VERSION=${1:-unspecified}

    docker build --no-cache --rm -t "${APP_NAME}:${VERSION}" -t "${APP_NAME}:latest" .
}

main "$@"