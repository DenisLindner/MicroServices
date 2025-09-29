package com.denis.service_tasks;

import java.time.LocalDateTime;

public record TasksRequest(String title, String email, LocalDateTime dueDate, Boolean notified) {
}
