package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aafh implements android.content.ServiceConnection, defpackage.aacv {
    public final defpackage.aaei a;
    public android.os.IBinder b;
    private final java.lang.String d;
    private final java.lang.String e;
    private final android.content.ComponentName f;
    private final android.content.Context g;
    private final android.os.Handler h;
    private final defpackage.aafi i;
    public boolean c = false;
    private java.lang.String j = null;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r6 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aafh(android.content.Context r2, android.os.Looper r3, java.lang.String r4, java.lang.String r5, android.content.ComponentName r6, defpackage.aaei r7, defpackage.aafi r8) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            r0 = 0
            r1.j = r0
            r1.g = r2
            aanh r2 = new aanh
            r2.<init>(r3)
            r1.h = r2
            r1.a = r7
            r1.i = r8
            if (r4 == 0) goto L1e
            if (r5 == 0) goto L1e
            if (r6 != 0) goto L27
            r6 = r0
            goto L20
        L1e:
            if (r6 == 0) goto L27
        L20:
            r1.d = r4
            r1.e = r5
            r1.f = r6
            return
        L27:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "Must specify either package or component, but not both"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafh.<init>(android.content.Context, android.os.Looper, java.lang.String, java.lang.String, android.content.ComponentName, aaei, aafi):void");
    }

    private final void d() {
        if (java.lang.Thread.currentThread() != this.h.getLooper().getThread()) {
            throw new java.lang.IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // defpackage.aacv
    public final int a() {
        return 0;
    }

    public final android.os.IBinder b() {
        d();
        return this.b;
    }

    public final void c() {
        java.lang.String.valueOf(this.b);
    }

    @Override // defpackage.aacv
    public final boolean i() {
        return false;
    }

    @Override // defpackage.aacv
    public final java.lang.String j() {
        java.lang.String str = this.d;
        if (str != null) {
            return str;
        }
        android.content.ComponentName componentName = this.f;
        if (componentName != null) {
            return componentName.getPackageName();
        }
        throw new java.lang.NullPointerException("null reference");
    }

    @Override // defpackage.aacv
    public final java.lang.String k() {
        return this.j;
    }

    @Override // defpackage.aacv
    public final java.util.Set l() {
        return java.util.Collections.EMPTY_SET;
    }

    @Override // defpackage.aacv
    public final void m(defpackage.aagb aagbVar) {
        d();
        c();
        if (o()) {
            try {
                n("connect() called when already connected");
            } catch (java.lang.Exception unused) {
            }
        }
        try {
            j();
            android.content.Intent intent = new android.content.Intent();
            android.content.ComponentName componentName = this.f;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.d).setAction(this.e);
            }
            boolean zBindService = this.g.bindService(intent, this, 4225);
            this.c = zBindService;
            if (!zBindService) {
                this.b = null;
                ((defpackage.aaeo) this.i).j(new com.google.android.gms.common.ConnectionResult(1, 16, null, null, null, null), null);
            }
            c();
        } catch (java.lang.SecurityException e) {
            this.c = false;
            this.b = null;
            throw e;
        }
    }

    @Override // defpackage.aacv
    public final void n(java.lang.String str) {
        d();
        this.j = str;
        d();
        c();
        try {
            this.g.unbindService(this);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        this.c = false;
        this.b = null;
    }

    @Override // defpackage.aacv
    public final boolean o() {
        d();
        return this.b != null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.h.post(new defpackage.an(this, iBinder, 14));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.h.post(new yne(this, 8));
    }

    @Override // defpackage.aacv
    public final boolean p() {
        d();
        return this.c;
    }

    @Override // defpackage.aacv
    public final boolean q() {
        return false;
    }

    @Override // defpackage.aacv
    public final com.google.android.gms.common.Feature[] r() {
        return new com.google.android.gms.common.Feature[0];
    }

    @Override // defpackage.aacv
    public final void t(aprf aprfVar) {
    }

    @Override // defpackage.aacv
    public final void s(aahb aahbVar, java.util.Set set) {
    }
}
