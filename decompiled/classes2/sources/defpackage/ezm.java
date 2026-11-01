package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ezm {
    public final long a;
    public final defpackage.erm b;
    public final int c;
    public final defpackage.ffu d;
    public final long e;
    public final defpackage.erm f;
    public final int g;
    public final defpackage.ffu h;
    public final long i;
    public final long j;

    public ezm(long j, defpackage.erm ermVar, int i, defpackage.ffu ffuVar, long j2, defpackage.erm ermVar2, int i2, defpackage.ffu ffuVar2, long j3, long j4) {
        this.a = j;
        this.b = ermVar;
        this.c = i;
        this.d = ffuVar;
        this.e = j2;
        this.f = ermVar2;
        this.g = i2;
        this.h = ffuVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.ezm ezmVar = (defpackage.ezm) obj;
            if (this.a == ezmVar.a && this.c == ezmVar.c && this.e == ezmVar.e && this.g == ezmVar.g && this.i == ezmVar.i && this.j == ezmVar.j && j$.util.Objects.equals(this.b, ezmVar.b) && j$.util.Objects.equals(this.d, ezmVar.d) && j$.util.Objects.equals(this.f, ezmVar.f) && j$.util.Objects.equals(this.h, ezmVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Long.valueOf(this.a), this.b, java.lang.Integer.valueOf(this.c), this.d, java.lang.Long.valueOf(this.e), this.f, java.lang.Integer.valueOf(this.g), this.h, java.lang.Long.valueOf(this.i), java.lang.Long.valueOf(this.j)});
    }
}
