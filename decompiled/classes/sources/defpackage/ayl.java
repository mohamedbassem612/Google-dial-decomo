package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ayl extends defpackage.dca {
    private final float a;
    private final boolean b;

    public ayl(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.aym(this.a, this.b);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.aym aymVar = (defpackage.aym) cmvVar;
        aymVar.a = this.a;
        aymVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.ayl aylVar = obj instanceof defpackage.ayl ? (defpackage.ayl) obj : null;
        return aylVar != null && this.a == aylVar.a && this.b == aylVar.b;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + (true != this.b ? 1237 : 1231);
    }
}
