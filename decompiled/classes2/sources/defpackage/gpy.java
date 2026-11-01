package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gpy {
    public final gmv a;
    public final defpackage.gpx b;
    public final defpackage.gpw c;

    public gpy(gmv gmvVar, defpackage.gpx gpxVar, defpackage.gpw gpwVar) {
        this.a = gmvVar;
        this.b = gpxVar;
        this.c = gpwVar;
        if (gmvVar.b() == 0 && gmvVar.a() == 0) {
            throw new java.lang.IllegalArgumentException("Bounds must be non zero");
        }
        if (gmvVar.b != 0 && gmvVar.c != 0) {
            throw new java.lang.IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final android.graphics.Rect a() {
        return this.a.c();
    }

    public final defpackage.gpv b() {
        gmv gmvVar = this.a;
        return gmvVar.b() > gmvVar.a() ? defpackage.gpv.b : defpackage.gpv.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (aooh.n(getClass(), obj != null ? obj.getClass() : null)) {
            aooh.d(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
            defpackage.gpy gpyVar = (defpackage.gpy) obj;
            if (aooh.n(this.a, gpyVar.a) && aooh.n(this.b, gpyVar.b) && aooh.n(this.c, gpyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "gpy { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
