 -- Criação de Tabelas

-- Tabela Usuario
CREATE TABLE Usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,     
    email VARCHAR(150) UNIQUE NOT NULL, 
    senha VARCHAR(255) NOT NULL
);

-- Tabela Tarefa
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

-- Tabela de Tarefas (Tasks)
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

-- Tabela Gamificação
CREATE TABLE gamificacao (
    id_gamifica CHAR(36) PRIMARY KEY DEFAULT (UUID()),
    usuario_id INT NOT NULL,
    nivel INT DEFAULT 1,
    pontos INT DEFAULT 0,
    badges VARCHAR(255),
    desafios_concluidos INT DEFAULT 0,
    data_ultima_atualizacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);

-- Tabela Pomodoro
CREATE TABLE Pomodoro (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tarefa_id INT,  
    usuario_id INT, 
    duracao INT NOT NULL,                       
    tempo_iniciado TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
    tempo_terminado TIMESTAMP,      
    status ENUM('em andamento', 'finalizado', 'pausado'),
    intervalo_longo INT DEFAULT 15,             
    FOREIGN KEY (tarefa_id) REFERENCES Tarefa(id),
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);

-- Tabela Modo Foco
CREATE TABLE ModoFoco (
    id SERIAL PRIMARY KEY,
    usuarioId INT NOT NULL,
    ativo BOOLEAN DEFAULT FALSE,
    tempoAtivo INTERVAL DEFAULT '00:00:00',
    FOREIGN KEY (usuarioId) REFERENCES Usuario(id) ON DELETE CASCADE
);

-- Tabela Cliente
CREATE TABLE Cliente (
    id SERIAL PRIMARY KEY,
    nivelcliente INT NOT NULL CHECK (nivelcliente >= 1),
    status BOOLEAN DEFAULT TRUE
);

-- Tabela Calendário
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
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id), 
    FOREIGN KEY (tarefa_id) REFERENCES Tarefa(id)    
);

-- Tabela Notificação
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
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id),  
    FOREIGN KEY (tarefa_id) REFERENCES Tarefa(id),    
    FOREIGN KEY (calendario_id) REFERENCES calendario(id)  
);

