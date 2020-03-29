package ${package}.dao;

// import java.util.Optional;
//import org.springframework.data.jdbc.repository.query.Query;
// import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.PagingAndSortingRepository;
import ${package}.domain.${className};
public interface ${className}Dao extends PagingAndSortingRepository<${className},${pk.attrType}> {

}
