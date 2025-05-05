1. Consultas de Usuário
a) Selecionar todos os usuários
sql
Copiar
SELECT * FROM Usuario;
b) Selecionar um usuário específico pelo email
sql
Copiar
SELECT * FROM Usuario WHERE email = 'email@example.com';
c) Atualizar o nome de um usuário
sql
Copiar
UPDATE Usuario SET nome = 'Novo Nome' WHERE id = 1;
d) Deletar um usuário
sql
Copiar
DELETE FROM Usuario WHERE id = 1;
2. Consultas de Tarefa
a) Selecionar todas as tarefas
sql
Copiar
SELECT * FROM Tarefa;
b) Selecionar tarefas de um determinado status
sql
Copiar
SELECT * FROM Tarefa WHERE status = 'pendente';
c) Atualizar a descrição de uma tarefa
sql
Copiar
UPDATE Tarefa SET descricao = 'Nova descrição da tarefa' WHERE id = 1;
d) Deletar uma tarefa
sql
Copiar
DELETE FROM Tarefa WHERE id = 1;
3. Consultas de Gamificação
a) Selecionar o nível e pontos de um usuário na gamificação
sql
Copiar
SELECT nivel, pontos FROM gamificacao WHERE usuario_id = 1;
b) Atualizar o nível e pontos de um usuário na gamificação
sql
Copiar
UPDATE gamificacao SET nivel = 2, pontos = 50 WHERE usuario_id = 1;
4. Consultas de Pomodoro
a) Selecionar pomodoros de um usuário
sql
Copiar
SELECT * FROM Pomodoro WHERE usuario_id = 1;
b) Atualizar o status de um pomodoro
sql
Copiar
UPDATE Pomodoro SET status = 'finalizado' WHERE id = 1;
c) Deletar um pomodoro
sql
Copiar
DELETE FROM Pomodoro WHERE id = 1;
5. Consultas de Modo Foco
a) Selecionar todos os modos de foco ativos de um usuário
sql
Copiar
SELECT * FROM ModoFoco WHERE usuarioId = 1 AND ativo = TRUE;
b) Atualizar o status do modo foco de um usuário
sql
Copiar
UPDATE ModoFoco SET ativo = FALSE WHERE usuarioId = 1;
6. Consultas de Cliente
a) Selecionar todos os clientes com status ativo
sql
Copiar
SELECT * FROM Cliente WHERE status = TRUE;
b) Atualizar o nível de um cliente
sql
Copiar
UPDATE Cliente SET nivelcliente = 3 WHERE id = 1;
7. Consultas de Calendário
a) Selecionar eventos de um usuário
sql
Copiar
SELECT * FROM calendario WHERE usuario_id = 1;
b) Atualizar o status de um evento de calendário
sql
Copiar
UPDATE calendario SET status = 'concluído' WHERE id = 1;
c) Deletar um evento de calendário
sql
Copiar
DELETE FROM calendario WHERE id = 1;
8. Consultas de Notificação
a) Selecionar todas as notificações de um usuário
sql
Copiar
SELECT * FROM notificacao WHERE usuario_id = 1;
b) Atualizar o status de uma notificação
sql
Copiar
UPDATE notificacao SET status = 'lida' WHERE id = 1;
c) Deletar uma notificação
sql
Copiar
DELETE FROM notificacao WHERE id = 1;
9. Consultas Complexas
a) Selecionar todas as tarefas de um usuário, incluindo suas notificações
sql
Copiar
SELECT T.*, N.*
FROM Tarefa T
JOIN notificacao N ON N.tarefa_id = T.id
WHERE T.usuario_id = 1;
b) Selecionar o nome do usuário, a tarefa e a data de término de todas as tarefas que foram concluídas
sql
Copiar
SELECT U.nome, T.nome AS tarefa, T.data_fim
FROM Usuario U
JOIN Tarefa T ON T.usuario_id = U.id
WHERE T.status = 'concluído';
10. Consultas de Relações entre Tabelas
a) Buscar todas as tarefas de um usuário e suas informações de gamificação
sql
Copiar
SELECT T.nome AS tarefa, T.descricao, G.nivel, G.pontos
FROM Tarefa T
JOIN gamificacao G ON G.usuario_id = T.usuario_id
WHERE T.usuario_id = 1;