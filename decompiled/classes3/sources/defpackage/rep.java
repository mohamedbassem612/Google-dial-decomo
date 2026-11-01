package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rep {
    public final int a;
    public final int b;
    public final int c;

    public rep(byte[] bArr) {
        this.a = 2131623989;
        this.b = 2131427487;
        this.c = 2131427486;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rep) {
            defpackage.rep repVar = (defpackage.rep) obj;
            if (this.a == repVar.a && this.b == repVar.b && this.c == repVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final java.lang.String toString() {
        return "CustomSpec{layoutRes=" + this.a + ", positiveButtonId=" + this.b + ", negativeButtonId=" + this.c + '}';
    }

    public rep() {
        throw null;
    }
}
