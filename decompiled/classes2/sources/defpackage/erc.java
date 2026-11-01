package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class erc {
    public static final defpackage.erc a = new defpackage.erc(1.0f, 1.0f);
    public final float b;
    public final float c;
    public final int d;

    static {
        java.lang.String str = eum.a;
    }

    public erc(float f, float f2) {
        ahvr.bM(f > 0.0f);
        ahvr.bM(f2 > 0.0f);
        this.b = f;
        this.c = f2;
        this.d = java.lang.Math.round(f * 1000.0f);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.erc ercVar = (defpackage.erc) obj;
            if (this.b == ercVar.b && this.c == ercVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((java.lang.Float.floatToIntBits(this.b) + 527) * 31) + java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        return eum.G("PlaybackParameters(speed=%.2f, pitch=%.2f)", new java.lang.Object[]{java.lang.Float.valueOf(this.b), java.lang.Float.valueOf(this.c)});
    }
}
