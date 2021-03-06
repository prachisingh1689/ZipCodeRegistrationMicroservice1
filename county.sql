/*
   Friday, April 7, 20174:52:05 PM
   User: sa
   Server: IMPETUS-N262\SQLEXPRESS
   Database: casestudy
   Application: 
*/

/* To prevent any potential data loss issues, you should review this script in detail before running it outside the context of the database designer.*/
BEGIN TRANSACTION
SET QUOTED_IDENTIFIER ON
SET ARITHABORT ON
SET NUMERIC_ROUNDABORT OFF
SET CONCAT_NULL_YIELDS_NULL ON
SET ANSI_NULLS ON
SET ANSI_PADDING ON
SET ANSI_WARNINGS ON
COMMIT
BEGIN TRANSACTION
GO
CREATE TABLE dbo.county
	(
	ID varchar(50) NOT NULL,
	ZIPCODE varchar(50) NOT NULL,
	COUNTYNAME varbinary(50) NOT NULL
	)  ON [PRIMARY]
GO
ALTER TABLE dbo.county ADD CONSTRAINT
	PK_county PRIMARY KEY CLUSTERED 
	(
	ID
	) WITH( STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]

GO
ALTER TABLE dbo.county SET (LOCK_ESCALATION = TABLE)
GO
COMMIT
