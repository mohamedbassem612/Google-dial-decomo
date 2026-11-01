package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aosj {
    public final java.lang.Object a;
    public final defpackage.aosa b;
    public final defpackage.aono c;
    public final java.lang.Object d = null;
    public final java.lang.Throwable e;

    public aosj(java.lang.Object obj, defpackage.aosa aosaVar, defpackage.aono aonoVar, java.lang.Throwable th) {
        this.a = obj;
        this.b = aosaVar;
        this.c = aonoVar;
        this.e = th;
    }

    public static /* synthetic */ defpackage.aosj b(defpackage.aosj aosjVar, defpackage.aosa aosaVar, java.lang.Throwable th, int i) {
        java.lang.Object obj = (i & 1) != 0 ? aosjVar.a : null;
        if ((i & 2) != 0) {
            aosaVar = aosjVar.b;
        }
        defpackage.aono aonoVar = (i & 4) != 0 ? aosjVar.c : null;
        if ((i & 16) != 0) {
            th = aosjVar.e;
        }
        return new defpackage.aosj(obj, aosaVar, aonoVar, th);
    }

    public final boolean a() {
        return this.e != null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.aosj) {
            defpackage.aosj aosjVar = (defpackage.aosj) obj;
            if (defpackage.aooh.n(this.a, aosjVar.a) && defpackage.aooh.n(this.b, aosjVar.b) && defpackage.aooh.n(this.c, aosjVar.c)) {
                java.lang.Object obj2 = aosjVar.d;
                if (defpackage.aooh.n(null, null) && defpackage.aooh.n(this.e, aosjVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        defpackage.aosa aosaVar = this.b;
        int iHashCode2 = aosaVar == null ? 0 : aosaVar.hashCode();
        int i = iHashCode * 31;
        defpackage.aono aonoVar = this.c;
        int iHashCode3 = aonoVar == null ? 0 : aonoVar.hashCode();
        int i2 = (i + iHashCode2) * 31;
        java.lang.Throwable th = this.e;
        return ((i2 + iHashCode3) * 961) + (th != null ? th.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=null, cancelCause=" + this.e + ')';
    }
}
