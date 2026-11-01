package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fos implements defpackage.eqx {
    public final float a;
    public final int b;

    public fos(float f, int i) {
        this.a = f;
        this.b = i;
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
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fos fosVar = (defpackage.fos) obj;
            if (this.a == fosVar.a && this.b == fosVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((java.lang.Float.floatToIntBits(this.a) + 527) * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ void b(defpackage.eqv eqvVar) {
    }
}
