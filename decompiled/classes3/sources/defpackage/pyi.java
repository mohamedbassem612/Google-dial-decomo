package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pyi {
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final j$.util.Optional h;
    public final int i;

    public pyi(boolean z, int i, int i2, boolean z2, int i3, boolean z3, boolean z4, boolean z5, j$.util.Optional optional) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
        this.i = i3;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = optional;
    }

    public static defpackage.pyh a() {
        defpackage.pyh pyhVar = new defpackage.pyh();
        pyhVar.b(-1);
        pyhVar.g(false);
        pyhVar.f(false);
        pyhVar.h(false);
        pyhVar.e(false);
        pyhVar.a = 2;
        pyhVar.c(j$.util.Optional.empty());
        return pyhVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pyi) {
            defpackage.pyi pyiVar = (defpackage.pyi) obj;
            if (this.a == pyiVar.a && this.b == pyiVar.b && this.c == pyiVar.c && this.d == pyiVar.d) {
                int i = this.i;
                int i2 = pyiVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.e == pyiVar.e && this.f == pyiVar.f && this.g == pyiVar.g && this.h.equals(pyiVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.i;
        a.aY(i);
        return (((((((((((((((((true == this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ i) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.h.hashCode();
    }

    public final java.lang.String toString() {
        int i = this.i;
        return "DialpadAnimatorConfig{shouldShow=" + this.a + ", containerResId=" + this.b + ", bottomSpace=" + this.c + ", hideShadow=" + this.d + ", roundedCornerMode=" + (i != 0 ? java.lang.Integer.toString(i - 1) : "null") + ", hideCloseButton=" + this.e + ", scalableDialpad=" + this.f + ", expressiveStyle=" + this.g + ", callId=" + java.lang.String.valueOf(this.h) + '}';
    }

    public pyi() {
        throw null;
    }
}
