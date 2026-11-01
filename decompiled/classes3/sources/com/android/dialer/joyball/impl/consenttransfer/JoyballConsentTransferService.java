package com.android.dialer.joyball.impl.consenttransfer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class JoyballConsentTransferService extends defpackage.rip implements ahei {
    public defpackage.uzx a;
    private boolean b;
    private boolean c;
    private final amac d = new amac(this);
    private hwv e;

    @java.lang.Deprecated
    public JoyballConsentTransferService() {
        afec.c();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final hwv y() {
        hwv hwvVar = this.e;
        if (hwvVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.c) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return hwvVar;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [aoir, java.lang.Object] */
    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        ahpm ahpmVarK = this.d.k(intent);
        try {
            defpackage.uzx uzxVar = this.a;
            if (uzxVar == null) {
                throw new java.lang.IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            uzxVar.aR();
            ylc ylcVar = (defpackage.aehh) y().c.a();
            ahpmVarK.close();
            return ylcVar;
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarK.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rip, android.app.Service
    public final void onCreate() {
        ahpm ahpmVarL = this.d.l();
        try {
            this.b = true;
            ahvr.bY(getApplication() instanceof ahfx);
            if (this.e == null) {
                if (!this.b) {
                    throw new java.lang.IllegalStateException("createPeer() called outside of onCreate");
                }
                if (this.c) {
                    throw new java.lang.IllegalStateException("createPeer() called after destroyed.");
                }
                ahoq ahoqVarW = ahvr.W(722, "CreateComponent");
                try {
                    B();
                    ahoqVarW.close();
                    ahoq ahoqVarW2 = ahvr.W(723, "CreatePeer");
                    try {
                        this.e = ((defpackage.rje) agab.aC(this, defpackage.rje.class)).e();
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
        ahpm ahpmVarN = this.d.n();
        try {
            defpackage.uzx uzxVar = this.a;
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
