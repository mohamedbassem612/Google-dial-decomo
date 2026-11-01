package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ufz {
    public final java.lang.String a;
    public final aiye b;
    public final aiyi c;
    public final java.lang.Long d;

    public ufz(java.lang.String str, aiye aiyeVar, aiyi aiyiVar, java.lang.Long l) {
        this.a = str;
        this.b = aiyeVar;
        this.c = aiyiVar;
        this.d = l;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ufz) {
            defpackage.ufz ufzVar = (defpackage.ufz) obj;
            if (aooh.n(this.a, ufzVar.a) && aooh.n(this.b, ufzVar.b) && aooh.n(this.c, ufzVar.c) && aooh.n(this.d, ufzVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        aiye aiyeVar = this.b;
        int iHashCode2 = (iHashCode + (aiyeVar == null ? 0 : aiyeVar.hashCode())) * 31;
        aiyi aiyiVar = this.c;
        return ((iHashCode2 + (aiyiVar != null ? aiyiVar.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "AutoBlockedCallInfo(phoneNumber=" + this.a + ", dobbyScoobyCallMetrics=" + this.b + ", revelioSettings=" + this.c + ", callCreationTimeMillis=" + this.d + ')';
    }
}
