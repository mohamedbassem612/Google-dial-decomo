package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agyb {
    public final defpackage.agxi a;
    public final java.lang.Object b;
    public final defpackage.agyn c;
    public final long d;
    public final defpackage.agyc e;
    public final int f;

    public agyb(defpackage.agxi agxiVar, java.lang.Object obj, defpackage.agyn agynVar, long j, int i, defpackage.agyc agycVar) {
        this.a = agxiVar;
        if (obj == null) {
            throw new java.lang.NullPointerException("Null contentKey");
        }
        this.b = obj;
        this.c = agynVar;
        this.d = j;
        this.f = i;
        this.e = agycVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agyb) {
            defpackage.agyb agybVar = (defpackage.agyb) obj;
            if (this.a.equals(agybVar.a) && this.b.equals(agybVar.b) && this.c.equals(agybVar.c) && this.d == agybVar.d && this.f == agybVar.f && this.e.equals(agybVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (((((iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.f;
        defpackage.agyn agynVar = this.c;
        java.lang.Object obj = this.b;
        java.lang.String string = this.a.toString();
        java.lang.String string2 = obj.toString();
        java.lang.String string3 = agynVar.toString();
        if (i != 1) {
            str = i != 2 ? "SUBSCRIBE" : "FORCE_REFRESH";
        } else {
            str = "UNDEFINED";
        }
        return "SubscribeCallState{dataSource=" + string + ", contentKey=" + string2 + ", tolerance=" + string3 + ", index=" + this.d + ", subscribeCallType=" + str + ", subscribeSequenceState=" + this.e.toString() + '}';
    }

    public agyb() {
        throw null;
    }
}
