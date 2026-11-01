package com.android.dialer.patrick.account.ondeviceserver.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class CallingCardAccountEndpointService extends defpackage.rxu implements ahei {
    public defpackage.uzx a;
    private defpackage.rxq b;
    private boolean c;
    private boolean d;
    private final amac e = new amac(this);

    @java.lang.Deprecated
    public CallingCardAccountEndpointService() {
        afec.c();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.rxq y() {
        defpackage.rxq rxqVar = this.b;
        if (rxqVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.d) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rxqVar;
    }

    public final android.os.IBinder onBind(android.content.Intent intent) {
        ahpm ahpmVarK = this.e.k(intent);
        try {
            defpackage.uzx uzxVar = this.a;
            if (uzxVar == null) {
                throw new java.lang.IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            uzxVar.aR();
            super.onBind(intent);
            android.os.IBinder iBinderA = y().a.a();
            ahpmVarK.close();
            return iBinderA;
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarK.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rxu
    public final void onCreate() {
        ahpm ahpmVarL = this.e.l();
        try {
            this.c = true;
            ahvr.bY(getApplication() instanceof ahfx);
            if (this.b == null) {
                if (!this.c) {
                    throw new java.lang.IllegalStateException("createPeer() called outside of onCreate");
                }
                if (this.d) {
                    throw new java.lang.IllegalStateException("createPeer() called after destroyed.");
                }
                ahoq ahoqVarW = ahvr.W(765, "CreateComponent");
                try {
                    B();
                    ahoqVarW.close();
                    ahoq ahoqVarW2 = ahvr.W(766, "CreatePeer");
                    try {
                        this.b = ((defpackage.rxr) agab.aC(this, defpackage.rxr.class)).a();
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
            this.c = false;
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

    public final void onDestroy() {
        ahpm ahpmVarN = this.e.n();
        try {
            defpackage.uzx uzxVar = this.a;
            if (uzxVar == null) {
                throw new java.lang.IllegalStateException("Service not initialized correctly; onDestroy called before onCreate.");
            }
            uzxVar.aQ();
            super.onDestroy();
            this.d = true;
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
