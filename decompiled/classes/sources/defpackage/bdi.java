package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bdi extends defpackage.dca {
    private final defpackage.bdm a;
    private final boolean b;
    private final defpackage.aso d;
    private final defpackage.kaw e;

    public bdi(defpackage.bdm bdmVar, defpackage.kaw kawVar, boolean z, defpackage.aso asoVar) {
        this.a = bdmVar;
        this.e = kawVar;
        this.b = z;
        this.d = asoVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.bdl(this.a, this.e, this.b, this.d);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.bdl bdlVar = (defpackage.bdl) cmvVar;
        bdlVar.b = this.a;
        bdlVar.e = this.e;
        bdlVar.c = this.b;
        bdlVar.d = this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bdi) {
            defpackage.bdi bdiVar = (defpackage.bdi) obj;
            if (defpackage.aooh.n(this.a, bdiVar.a) && defpackage.aooh.n(this.e, bdiVar.e) && this.b == bdiVar.b && this.d == bdiVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.e.hashCode()) * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.d.hashCode();
    }
}
