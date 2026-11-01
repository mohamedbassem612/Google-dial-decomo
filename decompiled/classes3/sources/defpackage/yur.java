package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yur {
    public final java.util.List a;
    public final akfg b;

    public yur(java.util.List list, akfg akfgVar) {
        aooh.f(list, "allowedRegionCodeList");
        this.a = list;
        this.b = akfgVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.yur) {
            defpackage.yur yurVar = (defpackage.yur) obj;
            if (aooh.n(this.a, yurVar.a) && this.b == yurVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "I18nConfig(allowedRegionCodeList=" + this.a + ", detectionRegion=" + this.b + ')';
    }
}
