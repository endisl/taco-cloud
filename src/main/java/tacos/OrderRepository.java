package tacos;

import org.springframework.data.repository.CrudRepository;

import tacos.TacoOrder;

import java.util.Date;
import java.util.List;
//import java.util.Optional;

public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByDeliveryZip(String deliveryZip);

    List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(
            String deliveryZip, Date startDate, Date endDate);
}



/*public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}*/