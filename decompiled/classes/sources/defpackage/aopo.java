package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aopo implements java.lang.Iterable, defpackage.aoow {
    public final int a;
    public final int b;
    public final int c;

    public aopo(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        this.a = i;
        this.b = defpackage.ajsz.al(i, i2, i3);
        this.c = i3;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aokj iterator() {
        return new aopp(this.a, this.b, this.c);
    }

    public boolean d() {
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        if (i > 0) {
            if (i2 > i3) {
                return true;
            }
        } else if (i2 < i3) {
            return true;
        }
        return false;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aopo)) {
            return false;
        }
        if (!d() || !((defpackage.aopo) obj).d()) {
            defpackage.aopo aopoVar = (defpackage.aopo) obj;
            if (this.a != aopoVar.a || this.b != aopoVar.b || this.c != aopoVar.c) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (d()) {
            return -1;
        }
        return this.c + (((this.a * 31) + this.b) * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb;
        java.lang.String str;
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        if (i > 0) {
            sb = new java.lang.StringBuilder();
            sb.append(i2);
            str = "..";
        } else {
            i = -i;
            sb = new java.lang.StringBuilder();
            sb.append(i2);
            str = " downTo ";
        }
        sb.append(str);
        sb.append(i3);
        sb.append(" step ");
        sb.append(i);
        return sb.toString();
    }
}
