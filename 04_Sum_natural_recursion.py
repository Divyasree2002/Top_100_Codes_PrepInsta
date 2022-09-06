def recursum(number):
  if number ==  0:
    return 0
  return number + recursum(number-1)

number = int(input("Enter the number : "))
print(recursum(number))