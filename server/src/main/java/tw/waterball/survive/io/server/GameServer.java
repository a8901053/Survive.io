/*
 *  Copyright 2020 Johnny850807 (Waterball) 潘冠辰
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package tw.waterball.survive.io.server;

import tw.waterball.survive.io.protocol.router.Router;
import tw.waterball.survive.io.server.nio.NioServer;

import java.io.IOException;


public class GameServer {
    private final int serverPort = 8888;
    private Router router;

    public void start() {
        try {
            NioServer.create(serverPort).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read() {

    }

    public void onPlayerNameExists() {

    }

}
