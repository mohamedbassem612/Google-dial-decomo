package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qqp {
    public final int a;
    public final int b;

    public qqp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static defpackage.qqo a() {
        defpackage.qqo qqoVar = new defpackage.qqo();
        qqoVar.a = 1;
        qqoVar.b = 2;
        return qqoVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.qqp) {
            defpackage.qqp qqpVar = (defpackage.qqp) obj;
            int i = this.a;
            int i2 = qqpVar.a;
            if (i == 0) {
                throw null;
            }
            if (i == i2) {
                int i3 = this.b;
                int i4 = qqpVar.b;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 == i4) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        anty.aJ(i);
        int i2 = this.b;
        anty.aJ(i2);
        return ((i ^ 1000003) * 1000003) ^ i2;
    }

    public final java.lang.String toString() {
        return "PreviewPosition{horizontalPosition=" + pez.ce(this.a) + ", verticalPosition=" + pez.cd(this.b) + '}';
    }

    public qqp() {
        throw null;
    }
}
