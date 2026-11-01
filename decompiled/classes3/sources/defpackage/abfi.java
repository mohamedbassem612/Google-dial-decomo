package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abfi implements defpackage.abfo {
    public final int a;
    public final int b;

    public abfi(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abfi) {
            defpackage.abfi abfiVar = (defpackage.abfi) obj;
            if (this.a == abfiVar.a && this.b == abfiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final java.lang.String toString() {
        return "Italic(start=" + this.a + ", end=" + this.b + ')';
    }
}
