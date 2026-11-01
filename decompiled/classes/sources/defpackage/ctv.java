package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ctv {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public ctv(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ctv) {
            defpackage.ctv ctvVar = (defpackage.ctv) obj;
            if (this.a == ctvVar.a && this.b == ctvVar.b && this.c == ctvVar.c && this.d == ctvVar.d && this.e == ctvVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }
}
