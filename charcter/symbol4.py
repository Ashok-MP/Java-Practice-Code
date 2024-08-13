def print_pattern(size):
    for i in range(size):
        for j in range(size * 2 - 1):
            if i == 0 or i == size - 1 or j == 0 or j == size * 2 - 2 or i == j or i + j == size * 2 - 2:
                print("*", end="")
            else:
                print(" ", end="")
        print()


size = 5
print_pattern(size)

