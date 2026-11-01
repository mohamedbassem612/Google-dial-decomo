package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class absm implements defpackage.absl {
    private final java.util.Map b = new j$.util.concurrent.ConcurrentHashMap();
    private final defpackage.absg c;
    private final java.util.concurrent.atomic.AtomicInteger d;
    private final java.util.concurrent.atomic.AtomicInteger e;
    private volatile defpackage.abse f;

    public absm(defpackage.absg absgVar) {
        new j$.util.concurrent.ConcurrentHashMap();
        this.d = new java.util.concurrent.atomic.AtomicInteger();
        this.e = new java.util.concurrent.atomic.AtomicInteger();
        this.c = absgVar;
        this.f = defpackage.abse.a;
    }

    @Override // defpackage.absl
    public final void a() {
        this.e.getAndIncrement();
    }

    @Override // defpackage.absl
    public final void b() {
        this.d.getAndIncrement();
    }

    @Override // defpackage.absl
    public final void c(long j) {
        defpackage.absf absfVar = (defpackage.absf) this.b.remove(java.lang.Long.valueOf(j));
        if (absfVar != null) {
            int i = absfVar.a;
            android.os.StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = android.os.StrictMode.allowThreadDiskReads();
            try {
                defpackage.abse abseVarA = absd.a(new java.io.File(java.lang.String.format(java.util.Locale.US, "/proc/self/task/%d/schedstat", java.lang.Integer.valueOf(i))));
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (abseVarA != defpackage.abse.a) {
                    defpackage.abse abseVar = this.f;
                    this.f = new defpackage.abse(abseVar.b + abseVarA.b, abseVar.c + abseVarA.c, abseVar.d + abseVarA.d);
                }
            } catch (java.lang.Throwable th) {
                android.os.StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
    }

    @Override // defpackage.absl
    public final void d(long j) {
        java.util.Map map = this.b;
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        if (map.containsKey(lValueOf)) {
            return;
        }
        map.put(lValueOf, new defpackage.absf(android.os.Process.myTid(), j, java.lang.Thread.currentThread().getName(), this.c.a));
    }
}
