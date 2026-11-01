package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fpl implements defpackage.eqx {
    public final float a;
    public final defpackage.fpk b;
    public final defpackage.fpk c;

    public fpl(float f, defpackage.fpk fpkVar, defpackage.fpk fpkVar2) {
        this.a = f;
        this.b = fpkVar;
        this.c = fpkVar2;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ defpackage.eqg a() {
        return null;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.fpl)) {
            return false;
        }
        defpackage.fpl fplVar = (defpackage.fpl) obj;
        return java.lang.Float.compare(this.a, fplVar.a) == 0 && j$.util.Objects.equals(this.b, fplVar.b) && j$.util.Objects.equals(this.c, fplVar.c);
    }

    public final int hashCode() {
        int iFloatToIntBits = java.lang.Float.floatToIntBits(this.a) * 31;
        defpackage.fpk fpkVar = this.b;
        int iHashCode = (iFloatToIntBits + (fpkVar != null ? fpkVar.hashCode() : 0)) * 31;
        defpackage.fpk fpkVar2 = this.c;
        return iHashCode + (fpkVar2 != null ? fpkVar2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + java.lang.String.valueOf(this.b) + ", field 2=" + java.lang.String.valueOf(this.c);
    }

    @Override // defpackage.eqx
    public final /* synthetic */ void b(defpackage.eqv eqvVar) {
    }
}
