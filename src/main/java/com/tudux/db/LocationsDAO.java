package com.tudux.db;

import com.tudux.db.utils.LocationsMapper;
import com.tudux.model.Location;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(LocationsMapper.class)
public interface LocationsDAO {

    @SqlQuery("SELECT * FROM locations")
    List<Location> getAll();

    @SqlQuery("SELECT * FROM locations WHERE id = :id")
    Location getById(@Bind("id") int id);

    @SqlUpdate("INSERT INTO locations (code, country, state, type, name, createdOn, modifiedOn) VALUES (:code, :country, :state, :type, :name, :createdOn, :modifiedOn)")
    int insert(@BindBean Location location);

    @SqlUpdate("UPDATE locations SET code = :code, country = :country, state = :state, type = :type, name = :name, createdOn = :createdOn, modifiedOn = :modifiedOn WHERE id = :id")
    int update(@BindBean Location location);

    @SqlUpdate("DELETE FROM locations WHERE id = :id")
    int delete(@Bind("id") int id);

}
