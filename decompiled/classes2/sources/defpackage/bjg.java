package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bjg extends dca {
    private final long a;
    private final aomy b;
    private final defpackage.blz d;

    public bjg(defpackage.blz blzVar, long j, aomy aomyVar) {
        this.d = blzVar;
        this.a = j;
        this.b = aomyVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.bjh(this.d, this.a, this.b);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.bjh bjhVar = (defpackage.bjh) cmvVar;
        defpackage.blz blzVar = bjhVar.e;
        defpackage.blz blzVar2 = this.d;
        boolean zN = aooh.n(blzVar2, blzVar);
        bjhVar.e = blzVar2;
        bjhVar.a = this.a;
        bjhVar.b = this.b;
        if (!zN) {
            bjhVar.c = bjhVar.b();
            bjhVar.f = bjhVar.d();
        }
        bjhVar.d.v();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bjg) {
            defpackage.bjg bjgVar = (defpackage.bjg) obj;
            if (aooh.n(this.d, bjgVar.d) && this.a == bjgVar.a && this.b == bjgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.d.hashCode()) * 31) + this.b.hashCode();
    }
}
