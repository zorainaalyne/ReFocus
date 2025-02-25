 -- Criação de Tabelas

 --  Usuario (Jhuly)


 --  Pomodoro(Jhuly)


 -- AUTH (Jander)


 -- Lista de Tarefas (Jander)


-- Gamificação (Vinicius)


-- Tarefa (Vinicius)


-- Modo Foco (Edsandro)


-- Cliente(Edsandro)


-- Calendário (Zoraina)

    CREATE TABLE calendario (
    id INT AUTO_INCREMENT PRIMARY KEY,          
    usuario_id INT,                                
    tarefa_id INT,                                 
    titulo VARCHAR(255) NOT NULL,               
    descricao TEXT,                                
    data_inicio DATETIME NOT NULL,                 
    data_fim DATETIME,                             
    status ENUM('pendente', 'confirmado', 'concluído', 'cancelado') DEFAULT 'pendente', 
    lembrete BOOLEAN DEFAULT FALSE,                
    tipo_evento ENUM('reunião', 'prazo', 'descanso', 'outro') DEFAULT 'outro', 
    FOREIGN KEY (usuario_id) REFERENCES usuario(id), 
    FOREIGN KEY (tarefa_id) REFERENCES tarefa(id)    
);



-- Notificação (Zoraina)
