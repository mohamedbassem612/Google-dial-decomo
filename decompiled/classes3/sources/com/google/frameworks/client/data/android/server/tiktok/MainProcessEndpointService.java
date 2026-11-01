package com.google.frameworks.client.data.android.server.tiktok;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class MainProcessEndpointService extends defpackage.akcn {
    public defpackage.akck a;
    public anrq b;

    public final android.os.IBinder onBind(android.content.Intent intent) {
        super.onBind(intent);
        return this.a.a();
    }

    @Override // defpackage.akcn
    public final void onCreate() {
        super.onCreate();
        this.a.b(anty.aT(new java.util.HashMap()), this.b);
    }
}
