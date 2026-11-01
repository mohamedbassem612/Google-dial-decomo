package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abfe implements defpackage.abfo {
    public final int a;
    public final int b;
    public final int c;

    public abfe(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abfe) {
            defpackage.abfe abfeVar = (defpackage.abfe) obj;
            if (this.a == abfeVar.a && this.b == abfeVar.b && this.c == abfeVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final java.lang.String toString() {
        return "Color(color=" + this.a + ", start=" + this.b + ", end=" + this.c + ')';
    }
}
