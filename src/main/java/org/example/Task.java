package org.example;

interface Task
{
    /**
     * Запускает задачу
     */
    void start() throws InterruptedException;
    /**
     * Останавливает задачу
     */
    void stop();
}
