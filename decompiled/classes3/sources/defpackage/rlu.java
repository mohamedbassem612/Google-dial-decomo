package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rlu {
    public final int a;
    public final int b;
    public final int c;

    public rlu(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rlu) {
            defpackage.rlu rluVar = (defpackage.rlu) obj;
            if (this.a == rluVar.a && this.b == rluVar.b && this.c == rluVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final java.lang.String toString() {
        return "AnnotatedCallLogPopMetrics{numberRowsThatDidPop=" + this.a + ", numberRowsThatDidNotPop=" + this.b + ", maxBindPosition=" + this.c + '}';
    }

    public rlu() {
        throw null;
    }
}
