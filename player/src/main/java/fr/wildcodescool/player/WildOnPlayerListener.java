package fr.wildcodescool.player;

import android.media.MediaPlayer;

public interface WildOnPlayerListener {
  void onPrepared(MediaPlayer mp);
  void onCompletion(MediaPlayer mp);
}
