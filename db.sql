 -- Criação de Tabelas

 --  Usuario (Jhuly)
    
 --  Pomodoro(Jhuly)
    CREATE TABLE Pomodoro
    id INT AUTO_INCREMENT PRIMARY KEY,
    tarefa_id INT,  
    usuario_id INT, 
    duracao INT NOT NULL,                       
    tempo_iniciado TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
    tempo_terminado TIMESTAMP,      
    status ENUM('em andamento', 'finalizado', 'pausado')
    intervalo_longo INT DEFAULT 15,             
    FOREIGN KEY (tarefa_id) REFERENCES tarefa(id),
    FOREIGN KEY (usuario_id) REFERENCES usuario(id)

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
