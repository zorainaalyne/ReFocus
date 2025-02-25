 -- Criação de Tabelas

 --  Usuario (Jhuly)
     CREATE TABLE Usuario
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,     
    email VARCHAR(150) UNIQUE NOT NULL, 
    senha VARCHAR(255) NOT NULL,

 --  Pomodoro(Jhuly)


 -- AUTH (Jander)


 -- Lista de Tarefas (Jander)


-- Gamificação (Vinicius)


-- Tarefa (Vinicius)


-- Modo Foco (Edsandro)


-- Cliente(Edsandro)


-- Calendário (Zoraina)
CREATE TABLE CALENDAR
    id INT,
    tarefaid INT,
    dataevento DATE
);




-- Notificação (Zoraina)
