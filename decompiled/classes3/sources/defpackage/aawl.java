package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class aawl extends android.app.Service implements defpackage.aavu {
    public android.content.ComponentName b;
    public defpackage.aawi c;
    public android.os.IBinder d;
    public android.content.Intent e;
    public android.os.HandlerThread f;
    public boolean h;
    public final java.lang.Object g = new java.lang.Object();
    public final defpackage.aawr i = new defpackage.aawr(new defpackage.aprf(this));

    public aaum e(java.lang.String str, byte[] bArr) {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.CHANNEL_EVENT") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.DATA_CHANGED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.NODE_MIGRATED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.MESSAGE_RECEIVED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.REQUEST_RECEIVED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.CAPABILITY_CHANGED") != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r0.equals("com.google.android.gms.wearable.BIND_LISTENER") != false) goto L28;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.IBinder onBind(android.content.Intent r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L65
            java.lang.String r0 = r3.getAction()
            if (r0 == 0) goto L65
            int r1 = r0.hashCode()
            switch(r1) {
                case -1487371046: goto L46;
                case -1140095138: goto L3d;
                case -786751258: goto L34;
                case 705066793: goto L2b;
                case 915816236: goto L22;
                case 1003809169: goto L19;
                case 1460975593: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L51
        L10:
            java.lang.String r1 = "com.google.android.gms.wearable.BIND_LISTENER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            goto L4e
        L19:
            java.lang.String r1 = "com.google.android.gms.wearable.CHANNEL_EVENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            goto L4e
        L22:
            java.lang.String r1 = "com.google.android.gms.wearable.DATA_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            goto L4e
        L2b:
            java.lang.String r1 = "com.google.android.gms.wearable.NODE_MIGRATED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            goto L4e
        L34:
            java.lang.String r1 = "com.google.android.gms.wearable.MESSAGE_RECEIVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            goto L4e
        L3d:
            java.lang.String r1 = "com.google.android.gms.wearable.REQUEST_RECEIVED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
            goto L4e
        L46:
            java.lang.String r1 = "com.google.android.gms.wearable.CAPABILITY_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L51
        L4e:
            android.os.IBinder r2 = r2.d
            goto L66
        L51:
            r2 = 3
            java.lang.String r0 = "WearableLS"
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L65
            java.lang.String r2 = "onBind: Provided bind intent ("
            java.lang.String r1 = ") is not allowed"
            java.lang.String r2 = a.bJ(r3, r2, r1)
            android.util.Log.d(r0, r2)
        L65:
            r2 = 0
        L66:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aawl.onBind(android.content.Intent):android.os.IBinder");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.b = new android.content.ComponentName(this, getClass().getName());
        if (android.util.Log.isLoggable("WearableLS", 3)) {
            android.util.Log.d("WearableLS", "onCreate: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.b))));
        }
        android.os.HandlerThread handlerThread = this.f;
        if (handlerThread == null) {
            handlerThread = new android.os.HandlerThread("WearableListenerService");
            handlerThread.start();
            this.f = handlerThread;
        }
        this.c = new defpackage.aawi(this, handlerThread.getLooper());
        android.content.Intent intent = new android.content.Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.e = intent;
        intent.setComponent(this.b);
        this.d = new defpackage.aawk(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (android.util.Log.isLoggable("WearableLS", 3)) {
            android.util.Log.d("WearableLS", "onDestroy: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.b))));
        }
        synchronized (this.g) {
            this.h = true;
            defpackage.aawi aawiVar = this.c;
            if (aawiVar == null) {
                throw new java.lang.IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=" + java.lang.String.valueOf(this.b));
            }
            defpackage.aawl aawlVar = aawiVar.a;
            android.os.HandlerThread handlerThread = aawlVar.f;
            if (handlerThread == null) {
                aawiVar.getLooper().quit();
            } else {
                handlerThread.quitSafely();
                try {
                    aawlVar.f.join();
                } catch (java.lang.InterruptedException e) {
                    java.lang.Thread.currentThread().interrupt();
                    android.util.Log.e("WearableLS", "Failed to join serviceHandlerThread", e);
                }
                aawiVar.a.f = null;
            }
            aawiVar.a("quit");
        }
        super.onDestroy();
    }

    public void c(com.google.android.gms.wearable.ChannelClient$Channel channelClient$Channel) {
    }

    public void d(com.google.android.gms.wearable.internal.MessageEventParcelable messageEventParcelable) {
    }

    @Override // defpackage.aavu
    public final void g(com.google.android.gms.wearable.Channel channel) {
    }

    @Override // defpackage.aavu
    public final void h(com.google.android.gms.wearable.Channel channel) {
    }

    @Override // defpackage.aavu
    public final void i(com.google.android.gms.wearable.Channel channel) {
    }

    @Override // defpackage.aavu
    public final void j(com.google.android.gms.wearable.Channel channel) {
    }
}
