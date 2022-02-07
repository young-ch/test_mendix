CREATE TABLE `eventmanagement$member` (
	`id` BIGINT NOT NULL,
	`name` NVARCHAR(200) NULL,
	`discription` NVARCHAR(1000) NULL,
	PRIMARY KEY(`id`));
INSERT INTO `mendixsystem$entity` (`id`, 
`entity_name`, 
`table_name`, 
`remote`, 
`remote_primary_key`)
 VALUES ('f26e88e8-5edd-4564-8106-41a90bfc472b', 
'EventManagement.member', 
'eventmanagement$member', 
FALSE, 
FALSE);
INSERT INTO `mendixsystem$attribute` (`id`, 
`entity_id`, 
`attribute_name`, 
`column_name`, 
`type`, 
`length`, 
`default_value`, 
`is_auto_number`)
 VALUES ('8cb1c8e6-c117-40d4-b751-eb3d183c2248', 
'f26e88e8-5edd-4564-8106-41a90bfc472b', 
'name', 
'name', 
30, 
200, 
'', 
FALSE);
INSERT INTO `mendixsystem$attribute` (`id`, 
`entity_id`, 
`attribute_name`, 
`column_name`, 
`type`, 
`length`, 
`default_value`, 
`is_auto_number`)
 VALUES ('80da2be7-357d-4371-90c2-62294f4a398c', 
'f26e88e8-5edd-4564-8106-41a90bfc472b', 
'discription', 
'discription', 
30, 
1000, 
'', 
FALSE);
UPDATE `mendixsystem$version`
 SET `versionnumber` = '4.2', 
`lastsyncdate` = '20220207 17:10:37';
