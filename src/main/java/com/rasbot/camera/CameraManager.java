package com.rasbot.camera;

import com.rasbot.server.MessageCallback;

/**
 * Created by dpodolak on 19.08.16.
 */
public interface CameraManager {

    MessageCallback getMessageCallback();

    void start();
}
