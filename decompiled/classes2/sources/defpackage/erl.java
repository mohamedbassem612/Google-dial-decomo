package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class erl {
    public static final java.lang.Object a = new java.lang.Object();
    private static final defpackage.eqt q;

    @java.lang.Deprecated
    public java.lang.Object c;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public defpackage.eqp j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public java.lang.Object b = a;
    public defpackage.eqt d = q;

    static {
        defpackage.eqk eqkVar = new defpackage.eqk();
        eqkVar.a = "androidx.media3.common.Timeline";
        eqkVar.b = android.net.Uri.EMPTY;
        q = eqkVar.a();
        java.lang.String str = eum.a;
    }

    public final long a() {
        return eum.C(0L);
    }

    public final long b() {
        return eum.C(this.m);
    }

    public final boolean c() {
        return this.j != null;
    }

    public final void d(java.lang.Object obj, defpackage.eqt eqtVar, boolean z, boolean z2, defpackage.eqp eqpVar, long j) {
        this.b = obj;
        if (eqtVar == null) {
            eqtVar = q;
        }
        this.d = eqtVar;
        this.c = null;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = z;
        this.i = z2;
        this.j = eqpVar;
        this.l = 0L;
        this.m = j;
        this.n = 0;
        this.o = 0;
        this.p = 0L;
        this.k = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            defpackage.erl erlVar = (defpackage.erl) obj;
            if (j$.util.Objects.equals(this.b, erlVar.b) && j$.util.Objects.equals(this.d, erlVar.d) && j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null) && j$.util.Objects.equals(this.j, erlVar.j) && this.e == erlVar.e && this.f == erlVar.f && this.g == erlVar.g && this.h == erlVar.h && this.i == erlVar.i && this.k == erlVar.k && this.m == erlVar.m && this.n == erlVar.n && this.o == erlVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.b.hashCode() + 217) * 31) + this.d.hashCode();
        defpackage.eqp eqpVar = this.j;
        return (((((((((((((((((((((((iHashCode * 961) + (eqpVar == null ? 0 : eqpVar.hashCode())) * 31) + anty.M(this.e)) * 31) + anty.M(this.f)) * 31) + anty.M(this.g)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + anty.M(0L)) * 31) + anty.M(this.m)) * 31) + this.n) * 31) + this.o) * 31) + anty.M(0L);
    }
}
