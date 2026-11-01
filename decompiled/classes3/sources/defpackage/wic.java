package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wic {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public wic(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.wic) {
            defpackage.wic wicVar = (defpackage.wic) obj;
            if (this.a == wicVar.a && this.b == wicVar.b && this.c == wicVar.c && this.d == wicVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final java.lang.String toString() {
        return "Padding{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }

    public wic() {
        throw null;
    }
}
