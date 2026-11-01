package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hch {
    public final float a;
    private final float b;

    public hch(byte[] bArr) {
        this.a = 1.0f;
        this.b = 1.0f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.hch) {
            defpackage.hch hchVar = (defpackage.hch) obj;
            if (java.lang.Float.compare(this.a, hchVar.a) == 0) {
                float f = hchVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + 1065353216;
    }

    public final java.lang.String toString() {
        return "Progress(min=" + this.a + ", max=1.0)";
    }

    public hch() {
        throw null;
    }
}
