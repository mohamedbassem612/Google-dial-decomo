package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aevn {
    public static final defpackage.aevn a;
    public static final defpackage.aevn b = new defpackage.aevn(-1, 3);
    private static final int[] e;
    public final int c;
    public final int d;

    static {
        int[] iArr = {1, 10, 100, 1000, 10000, 100000, 1000000};
        e = iArr;
        a = new defpackage.aevn(iArr[3], 3);
    }

    public aevn(int i, int i2) {
        if (i < -1) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.c = i;
        this.d = i2;
    }

    public static defpackage.aevn c(defpackage.apga apgaVar) {
        int i;
        int i2 = apgaVar.c;
        if (i2 == 0) {
            i = 3;
        } else if (i2 != 2) {
            i = i2 != 4 ? 0 : 2;
        } else {
            i = 1;
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 == 1) {
                return new defpackage.aevn((i2 == 4 ? (defpackage.apfz) apgaVar.d : defpackage.apfz.a).c, (apgaVar.c == 4 ? (defpackage.apfz) apgaVar.d : defpackage.apfz.a).d);
            }
            if (i3 != 2) {
                throw new java.lang.RuntimeException(null, null);
            }
        }
        return new defpackage.aevn(i2 == 2 ? ((java.lang.Integer) apgaVar.d).intValue() : 0, 3);
    }

    public final float a() {
        return this.c / b();
    }

    public final int b() {
        int i = this.d;
        return i < 7 ? e[i] : (int) java.lang.Math.pow(10.0d, i);
    }

    public final boolean d(double d) {
        return d * ((double) b()) < ((double) this.c);
    }

    public final boolean e() {
        return this.c == b();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aevn) {
            defpackage.aevn aevnVar = (defpackage.aevn) obj;
            if (this.c == aevnVar.c && this.d == aevnVar.d) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.d == 3;
    }

    public final boolean g() {
        return this.c == -1;
    }

    final void h(defpackage.akzx akzxVar) {
        if (f()) {
            int i = this.c;
            akzxVar.u();
            defpackage.apga apgaVar = (defpackage.apga) akzxVar.b;
            defpackage.apga apgaVar2 = defpackage.apga.a;
            apgaVar.c = 2;
            apgaVar.d = java.lang.Integer.valueOf(i);
            return;
        }
        defpackage.akzx akzxVarM = defpackage.apfz.a.m();
        int i2 = this.c;
        akzxVarM.u();
        defpackage.apfz apfzVar = (defpackage.apfz) akzxVarM.b;
        apfzVar.b |= 1;
        apfzVar.c = i2;
        int i3 = this.d;
        akzxVarM.u();
        defpackage.apfz apfzVar2 = (defpackage.apfz) akzxVarM.b;
        apfzVar2.b |= 2;
        apfzVar2.d = i3;
        akzxVar.u();
        defpackage.apga apgaVar3 = (defpackage.apga) akzxVar.b;
        defpackage.apfz apfzVar3 = (defpackage.apfz) akzxVarM.r();
        defpackage.apga apgaVar4 = defpackage.apga.a;
        j$.util.Objects.requireNonNull(apfzVar3);
        apgaVar3.d = apfzVar3;
        apgaVar3.c = 4;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.d)});
    }
}
