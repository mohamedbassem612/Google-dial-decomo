package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bns {
    public float a;
    public aii b;
    public float c;
    private cmn d;

    public bns(float f, aii aiiVar, float f2) {
        this.a = f;
        this.b = aiiVar;
        this.d = null;
        this.c = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bns) {
            defpackage.bns bnsVar = (defpackage.bns) obj;
            if (java.lang.Float.compare(this.a, bnsVar.a) == 0 && aooh.n(this.b, bnsVar.b)) {
                cmn cmnVar = bnsVar.d;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null) && dpi.c(this.c, bnsVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((java.lang.Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 961) + java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        return "ButtonGroupParentData(weight=" + this.a + ", pressedAnimatable=" + this.b + ", alignment=null, compressionLimit=" + dpi.b(this.c) + ')';
    }

    public bns() {
        this(null);
    }

    public /* synthetic */ bns(byte[] bArr) {
        this(0.0f, aij.a(0.0f), 0.0f);
    }
}
