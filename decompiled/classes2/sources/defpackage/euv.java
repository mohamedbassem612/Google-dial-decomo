package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class euv implements defpackage.eqx {
    public final float a;
    public final float b;
    public final float c;

    public euv(float f, float f2, float f3) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        ahvr.bN(z, "Invalid latitude or longitude");
        this.a = f;
        this.b = f2;
        this.c = f3;
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
            defpackage.euv euvVar = (defpackage.euv) obj;
            if (java.lang.Float.compare(this.a, euvVar.a) == 0 && java.lang.Float.compare(this.b, euvVar.b) == 0 && java.lang.Float.compare(this.c, euvVar.c) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((java.lang.Float.floatToIntBits(this.a) + 527) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        float f = this.c;
        if (f != -3.4028235E38f) {
            str = ", altitude=" + f;
        } else {
            str = "";
        }
        float f2 = this.b;
        return "xyz: latitude=" + this.a + ", longitude=" + f2 + str;
    }

    @Override // defpackage.eqx
    public final /* synthetic */ void b(defpackage.eqv eqvVar) {
    }
}
