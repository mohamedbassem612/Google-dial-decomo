package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zhk {
    private final java.lang.String a;
    private final akfg b;

    public zhk(java.lang.String str, akfg akfgVar) {
        aooh.f(akfgVar, "defaultRegionCode");
        this.a = str;
        this.b = akfgVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.zhk) {
            defpackage.zhk zhkVar = (defpackage.zhk) obj;
            if (aooh.n(this.a, zhkVar.a) && this.b == zhkVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "CacheKey(rawPhoneNumber=" + this.a + ", defaultRegionCode=" + this.b + ')';
    }
}
