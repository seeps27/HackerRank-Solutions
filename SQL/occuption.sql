SELECT 
    Name || '(' || SUBSTR(Occupation, 1, 1) || ')' 
FROM 
    OCCUPATIONS
ORDER BY 
    Name;
SELECT 
    'There are a total of ' || COUNT(*) || ' ' || LOWER(Occupation) || 's.' 
FROM 
    OCCUPATIONS
GROUP BY 
    Occupation
ORDER BY 
    COUNT(*), Occupation;
