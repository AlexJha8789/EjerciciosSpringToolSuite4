ALTER TABLE `bd_semana02`.`bd_semana02` 
ADD COLUMN `salario` DECIMAL(10,2) NULL AFTER `direccion`,
ADD COLUMN `fecha_ingreso` DATETIME NULL AFTER `salario`;