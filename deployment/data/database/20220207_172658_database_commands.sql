ALTER TABLE `eventmanagement$member` CHANGE `discription` `description` NVARCHAR(1000) NULL;
UPDATE `mendixsystem$attribute`
 SET `entity_id` = 'f26e88e8-5edd-4564-8106-41a90bfc472b', 
`attribute_name` = 'description', 
`column_name` = 'description', 
`type` = 30, 
`length` = 1000, 
`default_value` = '', 
`is_auto_number` = FALSE
 WHERE `id` = '80da2be7-357d-4371-90c2-62294f4a398c';
UPDATE `mendixsystem$version`
 SET `versionnumber` = '4.2', 
`lastsyncdate` = '20220207 17:26:56';
