package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class csf {
    public defpackage.dpf a;
    public defpackage.dpq b;
    public defpackage.cqf c;
    public long d;

    public /* synthetic */ csf(byte[] bArr) {
        defpackage.dpf dpfVar = defpackage.csi.a;
        defpackage.dpq dpqVar = defpackage.dpq.a;
        defpackage.csk cskVar = defpackage.csk.a;
        this.a = dpfVar;
        this.b = dpqVar;
        this.c = cskVar;
        this.d = 0L;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.csf) {
            defpackage.csf csfVar = (defpackage.csf) obj;
            if (defpackage.aooh.n(this.a, csfVar.a) && this.b == csfVar.b && defpackage.aooh.n(this.c, csfVar.c) && this.d == csfVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        long j = this.d;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + defpackage.cpp.b(this.d) + ')';
    }

    public csf() {
        this(null);
    }
}
