def print_pattern(rows):
    for i in range(1, rows + 1):
        print(chr(64 + i) * i)
rows = 5
print_pattern(rows)
