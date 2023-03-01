package br.com.nat.infrastructure.mongodb;

import br.com.nat.domain.entities.Fish;
import br.com.nat.domain.repositories.FishRepository;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class FishMongoRepository implements FishRepository {

    MongoClient mongoClient;
    @Inject
    public FishMongoRepository(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @Override
    public List<Fish> getAllFishs() {
        List<Fish> fishes = new ArrayList<>();
        MongoCursor<Fish> cursor = getCollection().find().iterator();
        Fish fish = new Fish();
        fish.setName("Piranha");
        fish.setSea(false);

        getCollection().insertOne(fish);
        getCollection().insertOne(fish);

//        try {
//            while (cursor.hasNext()) {
//                Fish fish = cursor.next();
//                Fish fish1 = new Fish();
//                fish.setName(fish.getString("Pintado"));
//                fish.setSea(fish.getBoolean("sea"));
//                fishes.add(fish);
//            }
//        } finally {
//            cursor.close();
//        }
        return getCollection().find().into(new ArrayList<>());
    }

    private MongoCollection<Fish> getCollection(){
            return mongoClient.getDatabase("fishStore").getCollection("Fish", Fish.class);

    }

//    private MongoCollection getCollectionClass(){
//        return mongoClient.getDatabase("fish Stor").getCollection(String.valueOf(Fish.class));
//
//    }


//    @Override
//    public List<Fish> getAllFishs() {
//        List<Fish> fishes = new ArrayList<>();
//        getCollection().find();
//       return getCollection(Fish).find().iterator();
//    }

}