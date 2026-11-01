package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cxk extends dca {
    private final java.lang.Object a;

    public cxk(java.lang.Object obj) {
        this.a = obj;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.cxl(this.a);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        ((defpackage.cxl) cmvVar).a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.cxk) && aooh.n(this.a, ((defpackage.cxk) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "LayoutIdElement(layoutId=" + this.a + ')';
    }
}
