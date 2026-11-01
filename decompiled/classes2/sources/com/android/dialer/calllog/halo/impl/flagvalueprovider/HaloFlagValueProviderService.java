package com.android.dialer.calllog.halo.impl.flagvalueprovider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class HaloFlagValueProviderService extends defpackage.khu implements ahei {
    public uzx a;
    private boolean b;
    private boolean c;
    private defpackage.kvt d;
    private final amac e = new amac(this);

    @java.lang.Deprecated
    public HaloFlagValueProviderService() {
        afec.c();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.kvt y() {
        defpackage.kvt kvtVar = this.d;
        if (kvtVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.c) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return kvtVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.IBinder, java.lang.Object] */
    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        ahpm ahpmVarK = this.e.k(intent);
        try {
            uzx uzxVar = this.a;
            if (uzxVar == null) {
                throw new java.lang.IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            uzxVar.aR();
            ?? r1 = y().b;
            ahpmVarK.close();
            return r1;
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarK.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.khu, android.app.Service
    public final void onCreate() {
        ahpm ahpmVarL = this.e.l();
        try {
            this.b = true;
            ahvr.bY(getApplication() instanceof ahfx);
            if (this.d == null) {
                if (!this.b) {
                    throw new java.lang.IllegalStateException("createPeer() called outside of onCreate");
                }
                if (this.c) {
                    throw new java.lang.IllegalStateException("createPeer() called after destroyed.");
                }
                ahoq ahoqVarW = ahvr.W(195, "CreateComponent");
                try {
                    B();
                    ahoqVarW.close();
                    ahoq ahoqVarW2 = ahvr.W(196, "CreatePeer");
                    try {
                        this.d = ((defpackage.kht) agab.aC(this, defpackage.kht.class)).d();
                        ahoqVarW2.close();
                    } catch (java.lang.Throwable th) {
                        try {
                            ahoqVarW2.close();
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        ahoqVarW.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            super.onCreate();
            this.b = false;
            ahpmVarL.close();
        } catch (java.lang.Throwable th5) {
            try {
                ahpmVarL.close();
            } catch (java.lang.Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ahpm ahpmVarN = this.e.n();
        try {
            uzx uzxVar = this.a;
            if (uzxVar == null) {
                throw new java.lang.IllegalStateException("Service not initialized correctly; onDestroy called before onCreate.");
            }
            uzxVar.aQ();
            super.onDestroy();
            this.c = true;
            ahpmVarN.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarN.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
