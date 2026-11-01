package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eqp {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        eum.a;
    }

    public eqp(defpackage.eqo eqoVar) {
        long j = eqoVar.a;
        long j2 = eqoVar.b;
        long j3 = eqoVar.c;
        float f = eqoVar.d;
        float f2 = eqoVar.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.eqp) {
            defpackage.eqp eqpVar = (defpackage.eqp) obj;
            if (this.a == eqpVar.a && this.b == eqpVar.b && this.c == eqpVar.c && this.d == eqpVar.d && this.e == eqpVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f = this.d;
        int iFloatToIntBits = f != 0.0f ? java.lang.Float.floatToIntBits(f) : 0;
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        float f2 = this.e;
        return (((((((anty.M(j) * 31) + anty.M(j2)) * 31) + anty.M(j3)) * 31) + iFloatToIntBits) * 31) + (f2 != 0.0f ? java.lang.Float.floatToIntBits(f2) : 0);
    }
}
