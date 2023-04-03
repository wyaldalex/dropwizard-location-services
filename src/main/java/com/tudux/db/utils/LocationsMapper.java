package com.tudux.db.utils;

import com.tudux.data.Country;
import com.tudux.data.State;
import com.tudux.data.Type;
import com.tudux.model.Location;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationsMapper implements ResultSetMapper<Location> {

    @Override
    public Location map(int index, ResultSet rs, StatementContext ctx) throws SQLException {
        Long id = rs.getLong("id");
        String code = rs.getString("code");
        Country country = Country.valueOf(rs.getString("country"));
        State state = State.valueOf(rs.getString("state"));
        Type type = Type.valueOf(rs.getString("type"));
        String name = rs.getString("name");
        String createdOn = rs.getString("createdOn");
        String modifiedOn = rs.getString("modifiedOn");

        return new Location(id, createdOn, modifiedOn, country, state, type, code, name);
    }
}
