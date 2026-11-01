package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gpm {
    public final android.content.res.Configuration a;
    public final gpl b;
    public final boolean c;
    private final gqe d;
    private final defpackage.gqd e;
    private final java.lang.String f;

    public gpm(gqe gqeVar, android.content.res.Configuration configuration, defpackage.gqd gqdVar, gpl gplVar, boolean z, java.lang.String str) {
        aooh.f(configuration, "parentConfiguration");
        this.d = gqeVar;
        this.a = configuration;
        this.e = gqdVar;
        this.b = gplVar;
        this.c = z;
        this.f = str;
    }

    public final java.lang.String toString() {
        return "gpm:{windowMetrics=" + this.d + ", configuration=" + this.a + ", windowLayoutInfo=" + this.e + ", defaultSplitAttributes=" + this.b + ", areDefaultConstraintsSatisfied=" + this.c + ", tag=" + this.f + '}';
    }
}
