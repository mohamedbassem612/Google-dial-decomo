package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class faz {
    public final defpackage.eqg a;

    @java.lang.Deprecated
    public final int b = 0;
    public final defpackage.aizh c;
    public final defpackage.erm d;
    public final defpackage.ffu e;

    public faz(defpackage.fbo fboVar) {
        this.a = (defpackage.eqg) fboVar.a;
        this.c = (defpackage.aizh) fboVar.b;
        this.d = (defpackage.erm) fboVar.c;
        this.e = (defpackage.ffu) fboVar.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.faz) {
            defpackage.faz fazVar = (defpackage.faz) obj;
            int i = fazVar.b;
            if (this.a.equals(fazVar.a) && j$.util.Objects.equals(this.c, fazVar.c) && this.d.equals(fazVar.d) && j$.util.Objects.equals(this.e, fazVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        defpackage.aizh aizhVar = this.c;
        int iHashCode2 = ((iHashCode + (aizhVar == null ? 0 : aizhVar.hashCode())) * 31) + this.d.hashCode();
        defpackage.ffu ffuVar = this.e;
        return (iHashCode2 * 31) + (ffuVar != null ? ffuVar.hashCode() : 0);
    }
}
