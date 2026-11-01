package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jzx {
    public static final long a;
    public final defpackage.aoin b;
    public final defpackage.aolr c;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        a = 3660000L;
    }

    public jzx(defpackage.aazc aazcVar, defpackage.aoin aoinVar, defpackage.aolr aolrVar) {
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        this.b = aoinVar;
        this.c = aolrVar;
    }
}
