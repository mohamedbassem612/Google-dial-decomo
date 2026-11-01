package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ber extends defpackage.dca {
    private final defpackage.aomy a;
    private final defpackage.beq b;
    private final defpackage.aso d;
    private final boolean e;
    private final boolean f;

    public ber(defpackage.aomy aomyVar, defpackage.beq beqVar, defpackage.aso asoVar, boolean z, boolean z2) {
        this.a = aomyVar;
        this.b = beqVar;
        this.d = asoVar;
        this.e = z;
        this.f = z2;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.bes(this.a, this.b, this.d, this.e, this.f);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.bes besVar = (defpackage.bes) cmvVar;
        besVar.a = this.a;
        besVar.b = this.b;
        defpackage.aso asoVar = besVar.c;
        defpackage.aso asoVar2 = this.d;
        if (asoVar != asoVar2) {
            besVar.c = asoVar2;
            defpackage.cfo.A(besVar).I();
        }
        boolean z = this.f;
        boolean z2 = this.e;
        if (besVar.d == z2 && besVar.e == z) {
            return;
        }
        besVar.d = z2;
        besVar.e = z;
        besVar.b();
        defpackage.cfo.A(besVar).I();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ber) {
            defpackage.ber berVar = (defpackage.ber) obj;
            if (this.a == berVar.a && defpackage.aooh.n(this.b, berVar.b) && this.d == berVar.d && this.e == berVar.e && this.f == berVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + (true == this.e ? 1231 : 1237)) * 31) + (true != this.f ? 1237 : 1231);
    }
}
