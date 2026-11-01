package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class axg extends defpackage.dca {
    private final float a;
    private final int b;

    public axg(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.axh(this.b, this.a);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.axh axhVar = (defpackage.axh) cmvVar;
        axhVar.b = this.b;
        axhVar.a = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.axg) {
            defpackage.axg axgVar = (defpackage.axg) obj;
            if (this.b == axgVar.b && this.a == axgVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + java.lang.Float.floatToIntBits(this.a);
    }
}
