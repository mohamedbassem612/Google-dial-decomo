package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apkb {
    public final defpackage.apkc a;
    public final java.lang.String b;
    public boolean c;
    public defpackage.apjz d;
    public final java.util.List e = new java.util.ArrayList();
    public boolean f;

    public apkb(defpackage.apkc apkcVar, java.lang.String str) {
        this.a = apkcVar;
        this.b = str;
    }

    public final void a() {
        java.util.TimeZone timeZone = defpackage.apjx.a;
        defpackage.apkc apkcVar = this.a;
        synchronized (apkcVar) {
            if (c()) {
                apkcVar.d(this);
            }
        }
    }

    public final void b() {
        java.util.TimeZone timeZone = defpackage.apjx.a;
        defpackage.apkc apkcVar = this.a;
        synchronized (apkcVar) {
            this.c = true;
            if (c()) {
                apkcVar.d(this);
            }
        }
    }

    public final boolean c() {
        defpackage.apjz apjzVar = this.d;
        if (apjzVar != null && apjzVar.b) {
            this.f = true;
        }
        java.util.List list = this.e;
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((defpackage.apjz) list.get(size)).b) {
                defpackage.apkc apkcVar = this.a;
                defpackage.apjz apjzVar2 = (defpackage.apjz) list.get(size);
                java.util.logging.Logger logger = apkcVar.b;
                if (logger.isLoggable(java.util.logging.Level.FINE)) {
                    antw.v(logger, apjzVar2, this, "canceled");
                }
                list.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final boolean d(defpackage.apjz apjzVar, long j, boolean z) {
        if (apjzVar == null) {
            defpackage.aooh.i("task");
        }
        defpackage.apkb apkbVar = apjzVar.c;
        if (apkbVar != this) {
            if (apkbVar != null) {
                throw new java.lang.IllegalStateException("task is in multiple queues");
            }
            apjzVar.c = this;
        }
        defpackage.apkc apkcVar = this.a;
        long jNanoTime = java.lang.System.nanoTime();
        long j2 = jNanoTime + j;
        java.util.List list = this.e;
        int iIndexOf = list.indexOf(apjzVar);
        if (iIndexOf != -1) {
            if (apjzVar.d <= j2) {
                java.util.logging.Logger logger = apkcVar.b;
                if (!logger.isLoggable(java.util.logging.Level.FINE)) {
                    return false;
                }
                antw.v(logger, apjzVar, this, "already scheduled");
                return false;
            }
            list.remove(iIndexOf);
        }
        apjzVar.d = j2;
        java.util.logging.Logger logger2 = apkcVar.b;
        if (logger2.isLoggable(java.util.logging.Level.FINE)) {
            long j3 = j2 - jNanoTime;
            antw.v(logger2, apjzVar, this, z ? "run again after ".concat(java.lang.String.valueOf(antw.u(j3))) : "scheduled after ".concat(java.lang.String.valueOf(antw.u(j3))));
        }
        java.util.Iterator it = list.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((defpackage.apjz) it.next()).d - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = list.size();
        }
        list.add(size, apjzVar);
        return size == 0;
    }

    public final void e(java.lang.String str, defpackage.aomy aomyVar) {
        if (str == null) {
            defpackage.aooh.i("name");
        }
        if (aomyVar == null) {
            defpackage.aooh.i("block");
        }
        f(new defpackage.apka(str, aomyVar));
    }

    public final void f(defpackage.apjz apjzVar) {
        if (apjzVar == null) {
            defpackage.aooh.i("task");
        }
        defpackage.apkc apkcVar = this.a;
        synchronized (apkcVar) {
            if (this.c) {
                if (!apjzVar.b) {
                    java.util.logging.Logger logger = apkcVar.b;
                    if (logger.isLoggable(java.util.logging.Level.FINE)) {
                        antw.v(logger, apjzVar, this, "schedule failed (queue is shutdown)");
                    }
                    throw new java.util.concurrent.RejectedExecutionException();
                }
                java.util.logging.Logger logger2 = apkcVar.b;
                if (logger2.isLoggable(java.util.logging.Level.FINE)) {
                    antw.v(logger2, apjzVar, this, "schedule canceled (queue is shutdown)");
                }
            } else if (d(apjzVar, 0L, false)) {
                apkcVar.d(this);
            }
        }
    }

    public final java.lang.String toString() {
        return this.b;
    }
}
