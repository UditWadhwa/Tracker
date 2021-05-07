package org.tracker.data;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;

@Embedded
public enum TaskType {

    Miscellaneous,
    Fitness,
    Reading,
    TechReading,
    Family,
    Preparation;


}
