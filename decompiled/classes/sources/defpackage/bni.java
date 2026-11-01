package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bni {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public bni(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final long a(boolean z) {
        return z ? this.a : this.c;
    }

    public final long b(boolean z) {
        return z ? this.b : this.d;
    }

    public final defpackage.bni c(long j, long j2, long j3, long j4) {
        if (j == 16) {
            j = this.a;
        }
        if (j2 == 16) {
            j2 = this.b;
        }
        if (j3 == 16) {
            j3 = this.c;
        }
        if (j4 == 16) {
            j4 = this.d;
        }
        return new defpackage.bni(j, j2, j3, j4);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.bni)) {
            defpackage.bni bniVar = (defpackage.bni) obj;
            if (defpackage.anty.ah(this.a, bniVar.a) && defpackage.anty.ah(this.b, bniVar.b) && defpackage.anty.ah(this.c, bniVar.c) && defpackage.anty.ah(this.d, bniVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = defpackage.anty.M(this.a) * 31;
        long j = this.d;
        return ((((iM + defpackage.anty.M(this.b)) * 31) + defpackage.anty.M(this.c)) * 31) + defpackage.anty.M(j);
    }
}
