package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cmq implements defpackage.cmw {
    public final defpackage.cmw a;
    public final defpackage.cmw b;

    public cmq(defpackage.cmw cmwVar, defpackage.cmw cmwVar2) {
        this.a = cmwVar;
        this.b = cmwVar2;
    }

    @Override // defpackage.cmw
    public final /* synthetic */ defpackage.cmw a(defpackage.cmw cmwVar) {
        return cmwVar != defpackage.cmw.c ? new defpackage.cmq(this, cmwVar) : this;
    }

    @Override // defpackage.cmw
    public final java.lang.Object b(java.lang.Object obj, defpackage.aonn aonnVar) {
        return this.b.b(this.a.b(obj, aonnVar), aonnVar);
    }

    @Override // defpackage.cmw
    public final boolean c(defpackage.aonj aonjVar) {
        return this.a.c(aonjVar) && this.b.c(aonjVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.cmq) {
            defpackage.cmq cmqVar = (defpackage.cmq) obj;
            if (defpackage.aooh.n(this.a, cmqVar.a) && defpackage.aooh.n(this.b, cmqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = (java.lang.StringBuilder) b(new java.lang.StringBuilder("["), new cmp(0));
        sb.append(']');
        return sb.toString();
    }
}
