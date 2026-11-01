package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qmw {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public qmw(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static defpackage.qmv a() {
        defpackage.qmv qmvVar = new defpackage.qmv();
        qmvVar.c(true);
        qmvVar.b(false);
        qmvVar.e(false);
        qmvVar.d(false);
        return qmvVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.qmw) {
            defpackage.qmw qmwVar = (defpackage.qmw) obj;
            if (this.a == qmwVar.a && this.b == qmwVar.b && this.c == qmwVar.c && this.d == qmwVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true == this.d ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "ButtonState{isEnabled=" + this.a + ", isChecked=" + this.b + ", shouldShowMoreIndicator=" + this.c + ", shouldShowDialog=" + this.d + '}';
    }

    public qmw() {
        throw null;
    }
}
