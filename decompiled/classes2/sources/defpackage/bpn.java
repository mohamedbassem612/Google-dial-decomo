package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bpn {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public bpn(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bpn)) {
            defpackage.bpn bpnVar = (defpackage.bpn) obj;
            if (dpi.c(this.a, bpnVar.a) && dpi.c(this.b, bpnVar.b) && dpi.c(this.c, bpnVar.c)) {
                return dpi.c(this.d, bpnVar.d);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.c)) * 31) + java.lang.Float.floatToIntBits(this.d);
    }
}
