USE REFOCUS;
CREATE TABLE Usuario (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL
);
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
CREATE TABLE gamificacao (
    id_gamifica CHAR(36) PRIMARY KEY,
    usuario_id INT NOT NULL,
    nivel INT DEFAULT 1,
    pontos INT DEFAULT 0,
    badges VARCHAR(255),
    desafios_concluidos INT DEFAULT 0,
    data_ultima_atualizacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);
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
CREATE TABLE ModoFoco (
    id INT AUTO_INCREMENT PRIMARY KEY,
    usuarioId INT NOT NULL,
    ativo BOOLEAN DEFAULT FALSE,
    tempoAtivo TIME DEFAULT '00:00:00',
    FOREIGN KEY (usuarioId) REFERENCES Usuario(id) ON DELETE CASCADE
);
CREATE TABLE Cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nivelcliente INT NOT NULL CHECK (nivelcliente >= 1),
    status BOOLEAN DEFAULT TRUE
);
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





