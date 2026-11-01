package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfm extends snl {
    public final defpackage.sfe a;

    public sfm(defpackage.sfe sfeVar) {
        this.a = sfeVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.sfm) && aooh.n(this.a, ((defpackage.sfm) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        defpackage.sfe sfeVar = this.a;
        if (sfeVar == null) {
            return 0;
        }
        return sfeVar.hashCode();
    }

    public final java.lang.String toString() {
        return "Success(data=" + this.a + ')';
    }
}
