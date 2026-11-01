package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fxx {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public fxx(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fxx fxxVar = (defpackage.fxx) obj;
            if (this.c == fxxVar.c && this.d == fxxVar.d && this.b == fxxVar.b && this.a == fxxVar.a && this.e == fxxVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((java.lang.Float.floatToIntBits(this.c) * 31) + java.lang.Float.floatToIntBits(this.d)) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + this.a) * 31) + anty.M(this.e);
    }

    public final java.lang.String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }

    public fxx() {
        this(2, 0.0f, 0.0f, 0.0f, 0L);
    }
}
