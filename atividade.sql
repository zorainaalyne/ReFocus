--questão A

SELECT o.id AS pedido_id, COUNT(p.pId) AS num_produtos, SUM(p.quantitys) AS total_quantidade
FROM orders o
JOIN productsche p ON o.id = p.sId
WHERE o.id = ?
GROUP BY o.id;

--questão B

CREATE PROCEDURE InsertOrder(
    IN tId INT,
    IN cId INT,
    IN orderDate DATE
)
BEGIN
    DECLARE tableStatus ENUM('reserved', 'canceled', 'open', 'payment', 'closed');

    SELECT status INTO tableStatus FROM orders WHERE tId = tId ORDER BY id DESC LIMIT 1;

    IF tableStatus IN ('open', 'payment') THEN
        INSERT INTO orders (tId, cId, dates, status)
        VALUES (tId, cId, orderDate, 'open');
    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Pedido não permitido para esta mesa';
    END IF;
END //

DELIMITER ;