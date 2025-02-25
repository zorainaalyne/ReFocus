 -- Criação de Tabelas
 
 --  Usuario (Jhuly)


 --  Pomodoro(Jhuly)


 -- AUTH (Jander)


 -- Lista de Tarefas (Jander)
CREATE TABLE IF NOT EXISTS tasks (
    id INT AUTO_INCREMENT PRIMARY KEY,             
    title VARCHAR(255) NOT NULL,                   
    description TEXT,                                  
    due_date DATETIME,                             
    status ENUM('pending', 'in_progress', 'completed') DEFAULT 'pending',  
    priority ENUM('low', 'medium', 'high') DEFAULT 'medium',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP 
);



-- Gamificação (Vinicius)


-- Tarefa (Vinicius)


-- Modo Foco (Edsandro)


-- Cliente(Edsandro)


-- Calendário (Zoraina)


-- Notificação (Zoraina)
