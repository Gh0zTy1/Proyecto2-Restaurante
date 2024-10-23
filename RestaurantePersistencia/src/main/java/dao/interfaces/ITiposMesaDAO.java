
package dao.interfaces;

import entidades.TipoMesa;
import excepciones.DAOException;
import java.util.List;

/**
 * Define las operaciones necesarias para manejar los tipos de mesa en el sistema
 * @author neri
 */
public interface ITiposMesaDAO {
    
    /**
     * Devuelve todos los tipos de mesa en el sistema
     * @return Lista de los distintos tipos de mesa
     * @throws DAOException Si ocurre un error en la consulta
     */
    public List<TipoMesa> obtenerTiposMesaTodos() throws DAOException;
    
    /**
     * Agrega un tipo de mesa en el sistema
     * @param tipoMesa Tipo de mesa a registrar
     * @throws DAOException Si ocurre un error en la agregacion
     */
    public void agregarTipoMesa(TipoMesa tipoMesa) throws DAOException;
    
    /**
     * Elimina un tipo de mesa en el sistema
     * @param id ID del tipo de mesa a eliminar
     * @throws DAOException Si ocurre un error en la eliminacion del tipo
     */
    public void eliminarTipoMesa(Long id) throws DAOException;
}
