--consulta 1
select name, count (p.id) as total_posts from users u LEFT JOIN posts p on u.id = p.user_id 
GROUP by u.id

--Consulta 2
select * from posts p LEFT join comments c on p.id = c.post_id WHERE c.post_id is NULL

--consulta 3
select title, created_at from posts order by created_at DESC LIMIT 5;