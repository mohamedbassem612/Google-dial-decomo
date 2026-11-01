package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apkc {
    public static final defpackage.apkc a;
    private static final java.util.logging.Logger e;
    public final java.util.logging.Logger b;
    public int c;
    public final defpackage.zzx d;
    private int f;
    private boolean g;
    private long h;
    private int i;
    private final java.util.List j;
    private final java.util.List k;
    private final java.lang.Runnable l;

    static {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(defpackage.apkc.class.getName());
        defpackage.aooh.e(logger, "getLogger(...)");
        e = logger;
        a = new defpackage.apkc(new defpackage.zzx((java.util.concurrent.ThreadFactory) new defpackage.apjw(java.lang.String.valueOf(defpackage.apjx.b).concat(" TaskRunner"), true)), logger);
    }

    public apkc(defpackage.zzx zzxVar, java.util.logging.Logger logger) {
        if (logger == null) {
            defpackage.aooh.i("logger");
        }
        this.d = zzxVar;
        this.b = logger;
        this.f = 10000;
        this.j = new java.util.ArrayList();
        this.k = new java.util.ArrayList();
        this.l = new defpackage.ahjn(this, 16);
    }

    private final void e() {
        java.util.TimeZone timeZone = defpackage.apjx.a;
        int i = this.i;
        if (i <= this.c) {
            this.i = i + 1;
            defpackage.zzx zzxVar = this.d;
            java.lang.Runnable runnable = this.l;
            if (runnable == null) {
                defpackage.aooh.i("runnable");
            }
            ((java.util.concurrent.ThreadPoolExecutor) zzxVar.a).execute(runnable);
        }
    }

    public final defpackage.apjz a() {
        boolean z;
        java.util.TimeZone timeZone = defpackage.apjx.a;
        while (true) {
            java.util.List list = this.k;
            if (list.isEmpty()) {
                return null;
            }
            long jNanoTime = java.lang.System.nanoTime();
            java.util.Iterator it = list.iterator();
            long jMin = Long.MAX_VALUE;
            defpackage.apjz apjzVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                defpackage.apjz apjzVar2 = (defpackage.apjz) ((defpackage.apkb) it.next()).e.get(0);
                long jMax = java.lang.Math.max(0L, apjzVar2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = java.lang.Math.min(jMax, jMin);
                } else {
                    if (apjzVar != null) {
                        z = true;
                        break;
                    }
                    apjzVar = apjzVar2;
                }
            }
            if (apjzVar != null) {
                apjzVar.d = -1L;
                defpackage.apkb apkbVar = apjzVar.c;
                if (apkbVar == null) {
                    defpackage.aooh.g();
                }
                apkbVar.e.remove(apjzVar);
                java.util.List list2 = this.k;
                list2.remove(apkbVar);
                apkbVar.d = apjzVar;
                this.j.add(apkbVar);
                if (z || (!this.g && !list2.isEmpty())) {
                    e();
                }
                return apjzVar;
            }
            if (this.g) {
                if (jMin >= this.h - jNanoTime) {
                    return null;
                }
                notify();
                return null;
            }
            this.g = true;
            this.h = jNanoTime + jMin;
            if (jMin > 0) {
                try {
                    try {
                        long j = jMin / 1000000;
                        java.lang.Long.signum(j);
                        wait(j, (int) (jMin - (1000000 * j)));
                    } catch (java.lang.InterruptedException unused) {
                        java.util.List list3 = this.j;
                        int size = list3.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            ((defpackage.apkb) list3.get(size)).c();
                        }
                        java.util.List list4 = this.k;
                        int size2 = list4.size();
                        while (true) {
                            size2--;
                            if (size2 < 0) {
                                break;
                            }
                            defpackage.apkb apkbVar2 = (defpackage.apkb) list4.get(size2);
                            apkbVar2.c();
                            if (apkbVar2.e.isEmpty()) {
                                list4.remove(size2);
                            }
                        }
                        this.g = false;
                    }
                } catch (java.lang.Throwable th) {
                    this.g = false;
                    throw th;
                }
            }
            this.g = false;
        }
    }

    public final defpackage.apkb b() {
        int i;
        synchronized (this) {
            i = this.f;
            this.f = i + 1;
        }
        return new defpackage.apkb(this, "Q" + i);
    }

    public final void c(defpackage.apjz apjzVar, long j, boolean z) {
        java.util.TimeZone timeZone = defpackage.apjx.a;
        defpackage.apkb apkbVar = apjzVar.c;
        if (apkbVar == null) {
            defpackage.aooh.g();
        }
        if (apkbVar.d != apjzVar) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        boolean z2 = apkbVar.f;
        apkbVar.f = false;
        apkbVar.d = null;
        this.j.remove(apkbVar);
        if (j != -1 && !z2 && !apkbVar.c) {
            apkbVar.d(apjzVar, j, true);
        }
        if (apkbVar.e.isEmpty()) {
            return;
        }
        this.k.add(apkbVar);
        if (z) {
            return;
        }
        e();
    }

    public final void d(defpackage.apkb apkbVar) {
        java.util.TimeZone timeZone = defpackage.apjx.a;
        if (apkbVar.d == null) {
            boolean zIsEmpty = apkbVar.e.isEmpty();
            java.util.List list = this.k;
            if (zIsEmpty) {
                list.remove(apkbVar);
            } else {
                int i = defpackage.apjv.a;
                if (!list.contains(apkbVar)) {
                    list.add(apkbVar);
                }
            }
        }
        if (this.g) {
            notify();
        } else {
            e();
        }
    }
}
