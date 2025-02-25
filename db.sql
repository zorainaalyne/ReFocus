 -- Criação de Tabelas
 
 --  Usuario (Jhuly)


 --  Pomodoro(Jhuly)


 -- AUTH (Jander)


 -- Lista de Tarefas (Jander)


-- Gamificação (Vinicius)


-- Tarefa (Vinicius)

CREATE TABLE Tarefa (
    id INT AUTO_INCREMENT PRIMARY KEY,  
    nome VARCHAR(255) NOT NULL,        
    descricao TEXT,                    
    data_inicio DATETIME,               
    data_fim DATETIME,                  
    status VARCHAR(50),                 
    criado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  
    atualizado_em TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP 
);


-- Modo Foco (Edsandro)


-- Cliente(Edsandro)


-- Calendário (Zoraina)


-- Notificação (Zoraina)
