 -- Criação de Tabelas
 
 --  Usuario (Jhuly)


 --  Pomodoro(Jhuly)


 -- AUTH (Jander)
CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,           
    email VARCHAR(255) NOT NULL UNIQUE,          
    password_hash VARCHAR(255) NOT NULL,       
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
    status ENUM('active', 'inactive', 'suspended') DEFAULT 'active' 
);

 -- Lista de Tarefas (Jander)


-- Gamificação (Vinicius)


-- Tarefa (Vinicius)


-- Modo Foco (Edsandro)


-- Cliente(Edsandro)


-- Calendário (Zoraina)


-- Notificação (Zoraina)
