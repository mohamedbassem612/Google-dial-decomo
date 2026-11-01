package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class djv extends defpackage.djw {
    public final java.lang.String a;
    public final defpackage.dkx b;

    public djv(java.lang.String str, defpackage.dkx dkxVar) {
        this.a = str;
        this.b = dkxVar;
    }

    @Override // defpackage.djw
    public final defpackage.djx a() {
        return null;
    }

    @Override // defpackage.djw
    public final defpackage.dkx b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.djv) {
            defpackage.djv djvVar = (defpackage.djv) obj;
            if (aooh.n(this.a, djvVar.a) && aooh.n(this.b, djvVar.b) && aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.dkx dkxVar = this.b;
        return (iHashCode + (dkxVar != null ? dkxVar.hashCode() : 0)) * 31;
    }

    public final java.lang.String toString() {
        return "LinkAnnotation.Url(url=" + this.a + ')';
    }
}
