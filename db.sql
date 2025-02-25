 -- Criação de Tabelas
 
 --  Usuario (Jhuly)


 --  Pomodoro(Jhuly)


 -- AUTH (Jander)


 -- Lista de Tarefas (Jander)


-- Gamificação (Vinicius)

CREATE TABLE gamificacao (
    id_gamifica CHAR(36) PRIMARY KEY DEFAULT (UUID()),
    usuario_id INT NOT NULL,
    nivel INT DEFAULT 1,
    pontos INT DEFAULT 0,
    badges VARCHAR(255),
    desafios_concluidos INT DEFAULT 0,
    data_ultima_atualizacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);



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
