package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anpl {
    private static defpackage.anpl e;
    public int c;
    public final java.lang.Object a = new java.lang.Object();
    public final java.util.Set b = new java.util.HashSet();
    public anqd[] d = new anqd[5];

    public static synchronized defpackage.anpl a() {
        defpackage.anpl anplVar;
        anplVar = e;
        if (anplVar == null) {
            anplVar = new defpackage.anpl();
            e = anplVar;
        }
        return anplVar;
    }

    public final void b() {
        anqd[] anqdVarArr = this.d;
        this.d = (anqd[]) java.util.Arrays.copyOf(anqdVarArr, anqdVarArr.length + 5);
    }

    public final void c() {
        synchronized (this.a) {
            j$.util.DesugarCollections.unmodifiableList(java.util.Arrays.asList((anqd[]) java.util.Arrays.copyOfRange(this.d, 0, this.c)));
        }
    }

    public final anqd d(java.lang.String str, java.util.List list, java.util.List list2) {
        anqd anqdVar;
        defpackage.ahvr.bN(!defpackage.ahvr.cp(str), "missing metric name");
        synchronized (this.a) {
            java.util.Set set = this.b;
            if (set.contains(str)) {
                throw new java.lang.IllegalStateException(defpackage.a.bk(str, "Metric with name ", " already exists"));
            }
            int i = this.c;
            if (i + 1 == this.d.length) {
                b();
            }
            anqdVar = new anqd(i, str, list, list2);
            this.d[i] = anqdVar;
            set.add(str);
            this.c++;
        }
        return anqdVar;
    }
}
