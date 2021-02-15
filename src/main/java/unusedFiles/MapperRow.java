package unusedFiles;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.master.model.CountryModel;

public class MapperRow implements RowMapper<CountryModel> {

	@Override
	public CountryModel mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		CountryModel country = new CountryModel();
		country.setCountryName(resultSet.getString("countryName"));
		return country;
	}

}
