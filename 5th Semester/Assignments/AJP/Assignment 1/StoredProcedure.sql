DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `studentUpsert`(IN id INT, IN studentName VARCHAR(50), IN srn VARCHAR(50))
BEGIN
	INSERT INTO student (StudentID, StudentName, SRN, Course) VALUES (id, studentName, srn, "MCA") ON DUPLICATE KEY UPDATE 
    StudentName = VALUES (studentName), SRN = VALUES (srn);
    SELECT * FROM student;
END$$
DELIMITER ;
