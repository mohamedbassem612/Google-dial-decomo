package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fmj {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public fmj(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.fmj fmjVar = (defpackage.fmj) obj;
            if (this.a == fmjVar.a && this.c == fmjVar.c && this.d == fmjVar.d && java.util.Arrays.equals(this.b, fmjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + java.util.Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }
}
