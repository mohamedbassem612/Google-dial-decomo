package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aopq extends defpackage.aopo implements defpackage.aopn {
    public static final defpackage.aopq d = new defpackage.aopq(1, 0);

    public aopq(int i, int i2) {
        super(i, i2, 1);
    }

    public final java.lang.Integer b() {
        return java.lang.Integer.valueOf(this.b);
    }

    public final java.lang.Integer c() {
        return java.lang.Integer.valueOf(this.a);
    }

    @Override // defpackage.aopo, defpackage.aopn
    public final boolean d() {
        return this.a > this.b;
    }

    public final boolean e(int i) {
        return this.a <= i && i <= this.b;
    }

    @Override // defpackage.aopo
    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aopq)) {
            return false;
        }
        if (!d() || !((defpackage.aopq) obj).d()) {
            defpackage.aopq aopqVar = (defpackage.aopq) obj;
            if (this.a != aopqVar.a || this.b != aopqVar.b) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aopo
    public final int hashCode() {
        if (d()) {
            return -1;
        }
        return this.b + (this.a * 31);
    }

    @Override // defpackage.aopo
    public final java.lang.String toString() {
        return this.a + ".." + this.b;
    }
}
