package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acdw {
    public final java.util.Set a;
    public final java.util.Set b;
    public final java.util.Set c;
    public final java.util.Set d;

    public acdw(java.util.Set set, java.util.Set set2, java.util.Set set3, java.util.Set set4) {
        this.a = set;
        this.b = set2;
        this.c = set3;
        this.d = set4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.acdw) {
            defpackage.acdw acdwVar = (defpackage.acdw) obj;
            if (aooh.n(this.a, acdwVar.a) && aooh.n(this.b, acdwVar.b) && aooh.n(this.c, acdwVar.c) && aooh.n(this.d, acdwVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "TargetingData(clearcutEvents=" + this.a + ", veEvents=" + this.b + ", appStateIds=" + this.c + ", requestedPermissions=" + this.d + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public acdw() {
        aoke aokeVar = aoke.a;
        this(aokeVar, aokeVar, aokeVar, aokeVar);
    }
}
