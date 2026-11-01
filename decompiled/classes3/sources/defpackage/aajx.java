package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aajx {
    public final defpackage.aaja a;
    public final defpackage.uzx b;

    public aajx(defpackage.aaja aajaVar, defpackage.uzx uzxVar) {
        if (aajaVar == null) {
            throw new java.lang.NullPointerException("Null handle");
        }
        this.a = aajaVar;
        this.b = uzxVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aajx) {
            defpackage.aajx aajxVar = (defpackage.aajx) obj;
            if (this.a.equals(aajxVar.a)) {
                defpackage.uzx uzxVar = this.b;
                if (uzxVar == null) {
                    if (aajxVar.b == null) {
                        return true;
                    }
                } else if (uzxVar.equals(aajxVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        defpackage.uzx uzxVar = this.b;
        return (iHashCode * 1000003) ^ (uzxVar == null ? 0 : uzxVar.hashCode());
    }

    public final java.lang.String toString() {
        defpackage.uzx uzxVar = this.b;
        return "InitializedHandle{handle=" + this.a.toString() + ", appSideVmProcess=" + java.lang.String.valueOf(uzxVar) + '}';
    }

    public aajx() {
        throw null;
    }
}
