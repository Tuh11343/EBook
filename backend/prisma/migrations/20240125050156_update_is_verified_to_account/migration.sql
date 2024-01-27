/*
  Warnings:

  - You are about to drop the column `is_verified` on the `users` table. All the data in the column will be lost.

*/
-- AlterTable
ALTER TABLE `accounts` ADD COLUMN `is_verified` BOOLEAN NOT NULL DEFAULT false;

-- AlterTable
ALTER TABLE `users` DROP COLUMN `is_verified`;
