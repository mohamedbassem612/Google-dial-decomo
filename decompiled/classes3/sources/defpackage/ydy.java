package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ydy {
    private static volatile defpackage.ydy d;
    public boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    private ydy(android.content.Context context) {
        this.b = new java.util.HashSet();
        this.c = new defpackage.aeok(new defpackage.yfv(new defpackage.ydv(this, context)), new defpackage.ydw(this));
    }

    static defpackage.ydy a(android.content.Context context) {
        if (d == null) {
            synchronized (defpackage.ydy.class) {
                if (d == null) {
                    d = new defpackage.ydy(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yfw] */
    final synchronized void b(defpackage.ydi ydiVar) {
        ?? r0 = this.b;
        r0.add(ydiVar);
        if (this.a || r0.isEmpty()) {
            return;
        }
        java.lang.Object obj = this.c;
        ?? r1 = ((defpackage.aeok) obj).d;
        boolean z = true;
        ((defpackage.aeok) obj).a = ((android.net.ConnectivityManager) r1.a()).getActiveNetwork() != null;
        try {
            aa$.ExternalSyntheticApiModelOutline1.m((android.net.ConnectivityManager) r1.a(), (android.net.ConnectivityManager.NetworkCallback) ((defpackage.aeok) obj).c);
        } catch (java.lang.RuntimeException e) {
            if (android.util.Log.isLoggable("ConnectivityMonitor", 5)) {
                android.util.Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
            z = false;
        }
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yfw] */
    final synchronized void c(defpackage.ydi ydiVar) {
        ?? r0 = this.b;
        r0.remove(ydiVar);
        if (this.a && r0.isEmpty()) {
            java.lang.Object obj = this.c;
            ((android.net.ConnectivityManager) ((defpackage.aeok) obj).d.a()).unregisterNetworkCallback((android.net.ConnectivityManager.NetworkCallback) ((defpackage.aeok) obj).c);
            this.a = false;
        }
    }

    public final ajcq d(ajcq ajcqVar, ahzi ahziVar) {
        return dff.m(new defpackage.vus(this, ajcqVar, ahziVar, 3));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final void e(java.lang.Runnable runnable) {
        synchronized (this.c) {
            boolean z = true;
            if (!this.b.remove(runnable) && !this.a) {
                z = false;
            }
            ahvr.bD(z);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f() {
        aify aifyVarN;
        synchronized (this.c) {
            this.a = true;
            ?? r3 = this.b;
            aifyVarN = aify.n((java.util.Collection) r3);
            r3.clear();
        }
        int size = aifyVarN.size();
        for (int i = 0; i < size; i++) {
            ((java.lang.Runnable) aifyVarN.get(i)).run();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, java.lang.Object] */
    public final synchronized android.os.IBinder g() {
        if (!this.a) {
            try {
                this.a = true;
                ((anqk) this.c).b();
            } catch (java.io.IOException e) {
                android.util.Log.e("ActionsService", "Unable to start server ".concat(this.c.toString()), e);
            }
        }
        return ((anrp) this.b).a;
    }

    public ydy(anqk anqkVar, anrp anrpVar) {
        this.c = anqkVar;
        this.b = anrpVar;
    }

    public ydy() {
        this.c = new java.lang.Object();
        this.b = new java.util.ArrayList();
    }
}
