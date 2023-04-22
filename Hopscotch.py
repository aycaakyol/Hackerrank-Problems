n = 6
k = 11

def calculate_step(s):
    x = s // 2
    y = s % 2
    result = 0

    if y == 0:
        result += x * 3
        return str(result-1) + " " + str(result)
    else:
        result = x * 3 + 1
        return result

def a(n, k):
    dir = "up"

    if k <= n:
        return calculate_step(k)
    else:
        left = k - n
        tour = left // (n-1)

        if tour % 2 == 0:
            dir = "down"

        if left % (n-1) == 0:
            if dir == "up":
                return 1
            else:
                return calculate_step(n)
        else:

            if dir == "up":
                return calculate_step((left % (n-1)) + 1)
            else: 
                return calculate_step(n - (left % (n-1)))
        
print(a(n, k))