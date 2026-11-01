package com.google.android.libraries.dialer.blocking.messagebased;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class MessageBasedBlockingService extends abvw {
    private static final aimz j = aimz.i("com/google/android/libraries/dialer/blocking/messagebased/MessageBasedBlockingService");
    public ajct a;
    public ajct b;
    public aaco c;
    public ucr d;
    public zjs e;
    public agsm f;
    public uhs g;
    public hum h;
    public kgl i;
    private android.os.Messenger k;

    public static android.os.Bundle c(int i, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("errorCode", i);
        bundle.putString("errorMessage", str);
        return bundle;
    }

    public static void d(android.os.Bundle bundle, android.os.Messenger messenger, int i) {
        if (messenger != null) {
            android.os.Message messageObtain = android.os.Message.obtain((android.os.Handler) null, i);
            messageObtain.setData(bundle);
            try {
                messenger.send(messageObtain);
            } catch (android.os.RemoteException e) {
                a.by(j.c(), "Exception while replying to blocking message.", "com/google/android/libraries/dialer/blocking/messagebased/MessageBasedBlockingService", "replyWithBundle", (char) 288, "MessageBasedBlockingService.java", e);
            }
        }
    }

    public final android.os.IBinder onBind(android.content.Intent intent) {
        return this.k.getBinder();
    }

    public final void onCreate() {
        super.onCreate();
        this.k = new android.os.Messenger(new defpackage.abvy(this, android.os.Looper.getMainLooper()));
    }
}
