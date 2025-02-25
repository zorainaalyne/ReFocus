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





-- Notificação (Zoraina)
CREATE TABLE notificacao (
    id INT AUTO_INCREMENT PRIMARY KEY,         
    usuario_id INT,                            
    tipo_notificacao ENUM('lembrete', 'alerta', 'mensagem', 'erro', 'sucesso') NOT NULL, 
    mensagem TEXT NOT NULL,                    
    data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
    data_visualizada TIMESTAMP,                
    status ENUM('pendente', 'lida', 'ignorada') DEFAULT 'pendente', 
    tarefa_id INT,                             
    calendario_id INT,                         
    FOREIGN KEY (usuario_id) REFERENCES usuario(id),  
    FOREIGN KEY (tarefa_id) REFERENCES tarefa(id),    
    FOREIGN KEY (calendario_id) REFERENCES calendario(id)  
);