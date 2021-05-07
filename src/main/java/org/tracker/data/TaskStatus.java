package org.tracker.data;

import org.mongodb.morphia.annotations.Embedded;

@Embedded
public enum TaskStatus {
    New,
    Started,
    Waiting,
    Completed;
}
