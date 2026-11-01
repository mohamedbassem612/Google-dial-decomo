package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aabg implements android.content.ServiceConnection {
    public int a;
    public final android.os.Messenger b;
    public final java.util.Queue c;
    public final android.util.SparseArray d;
    public final /* synthetic */ defpackage.afiq e;
    public defpackage.afpl f;

    public aabg(defpackage.afiq afiqVar) {
        j$.util.Objects.requireNonNull(afiqVar);
        this.e = afiqVar;
        this.a = 0;
        this.b = new android.os.Messenger((android.os.Handler) new aanh(android.os.Looper.getMainLooper(), new etz(this, 3)));
        this.c = new java.util.ArrayDeque();
        this.d = new android.util.SparseArray();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public final void a() {
        this.e.c.execute(new defpackage.yne(this, 3));
    }

    public final synchronized void b() {
        if (this.a == 1) {
            g("Timed out while binding");
        }
    }

    public final synchronized void c(int i) {
        android.util.SparseArray sparseArray = this.d;
        defpackage.aabi aabiVar = (defpackage.aabi) sparseArray.get(i);
        if (aabiVar != null) {
            android.util.Log.w("MessengerIpcClient", a.bj(i, "Timing out request: "));
            sparseArray.remove(i);
            aabiVar.c(new defpackage.aabj("Timed out waiting for response", null));
            d();
        }
    }

    public final synchronized void d() {
        if (this.a == 2 && this.c.isEmpty() && this.d.size() == 0) {
            if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
                android.util.Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = 3;
            aaik.a().b((android.content.Context) this.e.b, this);
        }
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public final synchronized boolean e(defpackage.aabi aabiVar) {
        int i = this.a;
        if (i == 0) {
            this.c.add(aabiVar);
            aais.an(this.a == 0);
            if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
                android.util.Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.a = 1;
            android.content.Intent intent = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                aaik aaikVarA = aaik.a();
                defpackage.afiq afiqVar = this.e;
                if (aaikVarA.c((android.content.Context) afiqVar.b, intent, this, 1)) {
                    afiqVar.c.schedule(new defpackage.yne(this, 4), 30L, java.util.concurrent.TimeUnit.SECONDS);
                } else {
                    g("Unable to bind to service");
                }
            } catch (java.lang.SecurityException e) {
                f("Unable to bind to service", e);
            }
        } else if (i == 1) {
            this.c.add(aabiVar);
        } else {
            if (i != 2) {
                return false;
            }
            this.c.add(aabiVar);
            a();
        }
        return true;
    }

    final synchronized void f(java.lang.String str, java.lang.Throwable th) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            android.util.Log.d("MessengerIpcClient", "Disconnected: ".concat(java.lang.String.valueOf(str)));
        }
        int i = this.a;
        if (i == 0) {
            throw new java.lang.IllegalStateException();
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            this.a = 4;
            return;
        }
        if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
            android.util.Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.a = 4;
        aaik.a().b((android.content.Context) this.e.b, this);
        defpackage.aabj aabjVar = new defpackage.aabj(str, th);
        java.util.Queue queue = this.c;
        java.util.Iterator it = queue.iterator();
        while (it.hasNext()) {
            ((defpackage.aabi) it.next()).c(aabjVar);
        }
        queue.clear();
        int i2 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.d;
            if (i2 >= sparseArray.size()) {
                sparseArray.clear();
                return;
            } else {
                ((defpackage.aabi) sparseArray.valueAt(i2)).c(aabjVar);
                i2++;
            }
        }
    }

    public final synchronized void g(java.lang.String str) {
        f(str, null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
            android.util.Log.v("MessengerIpcClient", "Service connected");
        }
        defpackage.afiq afiqVar = this.e;
        afiqVar.c.execute(new defpackage.wdm(this, iBinder, 12, null));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 2)) {
            android.util.Log.v("MessengerIpcClient", "Service disconnected");
        }
        defpackage.afiq afiqVar = this.e;
        afiqVar.c.execute(new defpackage.yne(this, 5));
    }
}
