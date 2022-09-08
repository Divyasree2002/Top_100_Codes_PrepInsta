year = int(input("Enter any year: "))

if ((year % 400 == 0) or ((year % 4 == 0) or (year % 100 != 0))):
  print("It is a Leap Year.")
else:
  print("It is not a Leap Year")