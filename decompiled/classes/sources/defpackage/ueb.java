package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ueb {
    public final java.util.Map a;
    public final java.util.Set b;

    public ueb(java.util.Map map, java.util.Set set) {
        if (map == null) {
            defpackage.aooh.i("cachedStatusFromVerdict");
        }
        this.a = map;
        this.b = set;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ueb) {
            defpackage.ueb uebVar = (defpackage.ueb) obj;
            if (defpackage.aooh.n(this.a, uebVar.a) && defpackage.aooh.n(this.b, uebVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "VerdictCacheResult(cachedStatusFromVerdict=" + this.a + ", numbersNotInCache=" + this.b + ')';
    }
}
