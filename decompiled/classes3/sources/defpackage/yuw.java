package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yuw {
    public final defpackage.yuu a;
    public final defpackage.yur b;
    public final defpackage.yuq c;

    public yuw(defpackage.yuu yuuVar, defpackage.yur yurVar, defpackage.yuq yuqVar) {
        aooh.f(yuuVar, "modelConfig");
        aooh.f(yurVar, "i18nConfig");
        aooh.f(yuqVar, "backgroundDownloadConfig");
        this.a = yuuVar;
        this.b = yurVar;
        this.c = yuqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.yuw) {
            defpackage.yuw yuwVar = (defpackage.yuw) obj;
            if (aooh.n(this.a, yuwVar.a) && aooh.n(this.b, yuwVar.b) && aooh.n(this.c, yuwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "SharpieConfig(modelConfig=" + this.a + ", i18nConfig=" + this.b + ", backgroundDownloadConfig=" + this.c + ')';
    }
}
