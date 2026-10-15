cmake_minimum_required(VERSION 3.15)
project(GuessNum LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_CXX_EXTENSIONS OFF)

add_executable(GuessNum
    src/main.cpp
    include/randNumGen.h
)

target_include_directories(GuessNum PRIVATE
    ${CMAKE_CURRENT_SOURCE_DIR}/include
)

# Optional: Enable standard compiler warnings
if(MSVC)
    target_compile_options(GuessNum PRIVATE /W4)
else()
    target_compile_options(GuessNum PRIVATE -Wall -Wextra -Wpedantic)
endif()