package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class baf extends defpackage.dca {
    private final defpackage.aonn a;
    private final java.lang.Object b;
    private final int d;

    public baf(int i, defpackage.aonn aonnVar, java.lang.Object obj) {
        this.d = i;
        this.a = aonnVar;
        this.b = obj;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new bah(this.d, this.a);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        bah bahVar = (bah) cmvVar;
        bahVar.b = this.d;
        bahVar.a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.baf bafVar = (defpackage.baf) obj;
            if (this.d == bafVar.d && defpackage.aooh.n(this.b, bafVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.d * 31) + 1237) * 31) + this.b.hashCode();
    }
}
