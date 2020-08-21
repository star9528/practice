package Game;


import java.util.concurrent.ConcurrentHashMap;

//这是一个单例类,负责管理若干个房间中.
// 此处需要引入"房间"对象,还需要把房间对象管理起来
public class RoomManager {
    //使用Hash表把房间信息保存起来
    private ConcurrentHashMap<String,Room> rooms = new ConcurrentHashMap<>();

    public void addRoom (Room room) {
        rooms.put(room.getRoomId(),room);
    }

    public void removeRoom (String roomId) {
        rooms.remove(roomId);
    }

    public Room getRoom(String roomId) {
        return rooms.get(roomId);
    }

    private static volatile RoomManager instance = null;

    public static RoomManager getInstance() {
        if (instance == null) {
            synchronized (RoomManager.class) {
                if (instance == null) {
                    instance = new RoomManager();
                }
            }
        }
        return instance;
    }
}
