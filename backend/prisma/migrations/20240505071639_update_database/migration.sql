/*
  Warnings:

  - You are about to drop the column `createdAt` on the `account` table. All the data in the column will be lost.
  - You are about to drop the column `otpCode` on the `account` table. All the data in the column will be lost.
  - You are about to drop the column `otpExpires` on the `account` table. All the data in the column will be lost.
  - You are about to drop the column `updatedAt` on the `account` table. All the data in the column will be lost.
  - You are about to drop the column `subcription_id` on the `subscription` table. All the data in the column will be lost.
  - Added the required column `subscription_id` to the `account` table without a default value. This is not possible if the table is not empty.
  - Added the required column `subscription_history_id` to the `subscription` table without a default value. This is not possible if the table is not empty.

*/
-- DropForeignKey
ALTER TABLE `subscription` DROP FOREIGN KEY `subscription_subcription_id_fkey`;

-- AlterTable
ALTER TABLE `account` DROP COLUMN `createdAt`,
    DROP COLUMN `otpCode`,
    DROP COLUMN `otpExpires`,
    DROP COLUMN `updatedAt`,
    ADD COLUMN `subscription_id` INTEGER NOT NULL;

-- AlterTable
ALTER TABLE `book` ADD COLUMN `lyric` VARCHAR(191) NULL,
    ADD COLUMN `src_audio` VARCHAR(191) NULL;

-- AlterTable
ALTER TABLE `subscription` DROP COLUMN `subcription_id`,
    ADD COLUMN `subscription_history_id` INTEGER NOT NULL;

-- AddForeignKey
ALTER TABLE `account` ADD CONSTRAINT `account_subscription_id_fkey` FOREIGN KEY (`subscription_id`) REFERENCES `subscription`(`id`) ON DELETE CASCADE ON UPDATE CASCADE;

-- AddForeignKey
ALTER TABLE `subscription` ADD CONSTRAINT `subscription_subscription_history_id_fkey` FOREIGN KEY (`subscription_history_id`) REFERENCES `subcription_history`(`id`) ON DELETE CASCADE ON UPDATE CASCADE;
