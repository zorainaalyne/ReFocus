 -- Criação de Tabelas
 
 --  Usuario (Jhuly)


 --  Pomodoro(Jhuly)


 -- AUTH (Jander)


 -- Lista de Tarefas (Jander)


-- Gamificação (Vinicius)


-- Tarefa (Vinicius)


-- Modo Foco (Edsandro)
CREATE TABLE ModoFoco (
    id SERIAL PRIMARY KEY,
    usuarioId INTEGER NOT NULL,
    ativo BOOLEAN DEFAULT FALSE,
    tempoAtivo INTERVAL DEFAULT '00:00:00',
    FOREIGN KEY (usuarioId) REFERENCES Usuario(id) ON DELETE CASCADE
);

-- Cliente(Edsandro) 


-- Calendário (Zoraina)


-- Notificação (Zoraina)
