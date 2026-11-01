package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cqr {
    public static final defpackage.cqr a = new defpackage.cqr(null);
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    private cqr(byte[] bArr) {
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        if (defpackage.dpi.a(0.0f, 0.0f) < 0 || defpackage.dpi.a(0.0f, 0.0f) < 0 || defpackage.dpi.a(0.0f, 0.0f) < 0 || defpackage.dpi.a(0.0f, 0.0f) < 0) {
            defpackage.cqp.a("Layer outsets must be non-negative");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cqr)) {
            return false;
        }
        defpackage.cqr cqrVar = (defpackage.cqr) obj;
        float f = cqrVar.b;
        float f2 = cqrVar.c;
        float f3 = cqrVar.d;
        float f4 = cqrVar.e;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final java.lang.String toString() {
        return defpackage.a.bB(0.0f, new java.lang.StringBuilder(), "LayerOutsets(left=");
    }

    public cqr() {
        this(null);
    }
}
