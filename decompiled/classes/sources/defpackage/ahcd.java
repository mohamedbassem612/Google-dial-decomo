package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahcd {
    public final defpackage.akzc a;
    public final long b;
    public final defpackage.aexf c;
    private final java.lang.String d;

    public ahcd(java.lang.String str, defpackage.akzc akzcVar, long j, defpackage.aexf aexfVar) {
        if (str == null) {
            defpackage.aooh.i("serverToken");
        }
        if (aexfVar == null) {
            defpackage.aooh.i("commitProperties");
        }
        this.d = str;
        this.a = akzcVar;
        this.b = j;
        this.c = aexfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ahcd) {
            defpackage.ahcd ahcdVar = (defpackage.ahcd) obj;
            if (defpackage.aooh.n(this.d, ahcdVar.d) && defpackage.aooh.n(this.a, ahcdVar.a) && this.b == ahcdVar.b && defpackage.aooh.n(this.c, ahcdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        defpackage.akzc akzcVar = this.a;
        return ((((iHashCode + (akzcVar == null ? 0 : akzcVar.hashCode())) * 31) + defpackage.anty.M(this.b)) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "Metadata(serverToken=" + this.d + ", experimentToken=" + this.a + ", lastUpdateEpochMillis=" + this.b + ", commitProperties=" + this.c + ')';
    }
}
