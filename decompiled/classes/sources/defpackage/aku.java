package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aku implements defpackage.ajl {
    public final float a;
    public final float b;
    public final java.lang.Object c;

    public aku(float f, float f2, java.lang.Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aonj, java.lang.Object] */
    @Override // defpackage.aiq
    public final /* synthetic */ alp a(defpackage.nf nfVar) {
        java.lang.Object obj = this.c;
        return new amb(this.a, this.b, obj == null ? null : (defpackage.aiw) nfVar.a.a(obj));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aku) {
            defpackage.aku akuVar = (defpackage.aku) obj;
            if (akuVar.a == this.a && akuVar.b == this.b && defpackage.aooh.n(akuVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + java.lang.Float.floatToIntBits(this.a)) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public aku() {
        this(1.0f, 1500.0f, null);
    }
}
