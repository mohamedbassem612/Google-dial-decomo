package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class drs {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final float f;
    private final boolean g;
    private final boolean h;
    private final android.os.IBinder i;
    private final float j;

    public /* synthetic */ drs(boolean z, boolean z2, int i, int i2) {
        cbd cbdVar = defpackage.dra.a;
        int i3 = 1 != (((i2 & 1) ^ 1) & (z ? 1 : 0)) ? 262152 : 262144;
        i3 = ((((i2 & 32) == 0) ^ true) || z2) ? i3 : i3 | 512;
        i = (i2 & 128) != 0 ? 1002 : i;
        this.a = i3;
        this.b = true;
        this.c = true;
        this.d = true;
        this.g = true;
        this.h = false;
        this.e = i;
        this.i = null;
        this.f = Float.NaN;
        this.j = Float.NaN;
    }

    public final boolean a() {
        return (this.a & 8) == 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.drs) {
            defpackage.drs drsVar = (defpackage.drs) obj;
            if (this.a == drsVar.a) {
                boolean z = drsVar.b;
                boolean z2 = drsVar.c;
                boolean z3 = drsVar.d;
                boolean z4 = drsVar.g;
                boolean z5 = drsVar.h;
                if (this.e == drsVar.e) {
                    android.os.IBinder iBinder = drsVar.i;
                    if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                        float f = drsVar.f;
                        if (dpi.c(Float.NaN, Float.NaN)) {
                            float f2 = drsVar.j;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((this.a * 31) + anty.L(true)) * 31) + anty.L(true)) * 31) + anty.L(true)) * 31) + anty.L(true)) * 31) + anty.L(false)) * 31) + this.e) * 961) + 2143289344) * 31) + 2143289344;
    }
}
