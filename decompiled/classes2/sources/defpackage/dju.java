package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dju extends defpackage.djw {
    public final java.lang.String a;
    public final defpackage.dkx b;
    public final defpackage.djx c;

    public dju(java.lang.String str, defpackage.dkx dkxVar, defpackage.djx djxVar) {
        this.a = str;
        this.b = dkxVar;
        this.c = djxVar;
    }

    @Override // defpackage.djw
    public final defpackage.djx a() {
        return this.c;
    }

    @Override // defpackage.djw
    public final defpackage.dkx b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dju) {
            defpackage.dju djuVar = (defpackage.dju) obj;
            if (aooh.n(this.a, djuVar.a) && aooh.n(this.b, djuVar.b) && aooh.n(this.c, djuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.dkx dkxVar = this.b;
        int iHashCode2 = (iHashCode + (dkxVar != null ? dkxVar.hashCode() : 0)) * 31;
        defpackage.djx djxVar = this.c;
        return iHashCode2 + (djxVar != null ? djxVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "LinkAnnotation.Clickable(tag=" + this.a + ')';
    }
}
