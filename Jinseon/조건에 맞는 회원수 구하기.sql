SELECT COUNT(USER_ID) as USERS
FROM USER_INFO
ORDER by USER_ID DESC
WHERE JOINED like "2021%" and AGE >= 20 and AGE <= 29;
