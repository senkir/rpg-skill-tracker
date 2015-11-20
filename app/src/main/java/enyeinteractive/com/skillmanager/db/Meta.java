package enyeinteractive.com.skillmanager.db;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;


@Table(databaseName = SkillsDatabase.NAME)
public class Meta {

    @Column
    @PrimaryKey(autoincrement = true)
    long id;

    @Column
    String name;

}
