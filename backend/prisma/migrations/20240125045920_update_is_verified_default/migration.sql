/*
  Warnings:

  - Made the column `is_verified` on table `users` required. This step will fail if there are existing NULL values in that column.

*/
-- AlterTable
ALTER TABLE `users` MODIFY `is_verified` BOOLEAN NOT NULL DEFAULT false;
