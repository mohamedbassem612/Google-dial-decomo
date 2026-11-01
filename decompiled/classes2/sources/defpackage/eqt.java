package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eqt {
    public static final /* synthetic */ int g = 0;
    public final java.lang.String a;
    public final defpackage.eqq b;
    public final defpackage.eqp c;
    public final defpackage.eqw d;
    public final defpackage.eql e;
    public final defpackage.eqr f;

    static {
        new defpackage.eqk().a();
        java.lang.String str = eum.a;
    }

    public eqt(java.lang.String str, defpackage.eqm eqmVar, defpackage.eqq eqqVar, defpackage.eqp eqpVar, defpackage.eqw eqwVar, defpackage.eqr eqrVar) {
        this.a = str;
        this.b = eqqVar;
        this.c = eqpVar;
        this.d = eqwVar;
        this.e = eqmVar;
        this.f = eqrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.eqt) {
            defpackage.eqt eqtVar = (defpackage.eqt) obj;
            if (j$.util.Objects.equals(this.a, eqtVar.a) && this.e.equals(eqtVar.e) && j$.util.Objects.equals(this.b, eqtVar.b) && j$.util.Objects.equals(this.c, eqtVar.c) && j$.util.Objects.equals(this.d, eqtVar.d) && j$.util.Objects.equals(this.f, eqtVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.eqq eqqVar = this.b;
        return (((((((iHashCode + (eqqVar != null ? eqqVar.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.d.hashCode()) * 31;
    }
}
