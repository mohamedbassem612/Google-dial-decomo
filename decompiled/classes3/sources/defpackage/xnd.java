package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class xnd extends defpackage.xkq {
    private final java.lang.String b;
    private final java.lang.String d;
    private final j$.time.Duration e;

    public xnd(defpackage.xhu xhuVar, java.lang.String str) {
        this.b = xhuVar.getNodeComponent();
        this.d = str;
        j$.time.Duration durationOfSeconds = j$.time.Duration.ofSeconds(300L);
        aooh.e(durationOfSeconds, "ofSeconds(...)");
        this.e = durationOfSeconds;
        aooc.ag(new defpackage.xmr(this, 2));
    }

    @Override // defpackage.xkd
    public final j$.time.Duration b() {
        return this.e;
    }

    @Override // defpackage.xkq
    public final boolean c(defpackage.xfz xfzVar) {
        aooh.f(xfzVar, "reason");
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.xnd) && defpackage.xff.d(this, (defpackage.xib) obj);
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return this.b;
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return this.d;
    }

    public final int hashCode() {
        return defpackage.xff.c(this);
    }

    public final java.lang.String toString() {
        return "ProviderContract(".concat(defpackage.xfc.b(this));
    }
}
