/*
  Warnings:

  - Added the required column `otpExpires` to the `accounts` table without a default value. This is not possible if the table is not empty.

*/
-- AlterTable
ALTER TABLE `accounts` DROP COLUMN `otpExpires`,
    ADD COLUMN `otpExpires` DATETIME(3) NOT NULL;
