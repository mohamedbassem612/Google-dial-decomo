package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gxl {
    public static final java.lang.String a = defpackage.gsh.b("WorkSpec");
    public final java.lang.String b;
    public defpackage.gsw c;
    public java.lang.String d;
    public java.lang.String e;
    public defpackage.grp f;
    public defpackage.grp g;
    public long h;
    public long i;
    public long j;
    public defpackage.grn k;
    public int l;
    public defpackage.grj m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public defpackage.gss s;
    public int t;
    public final int u;
    public long v;
    public int w;
    public final int x;
    public java.lang.String y;
    public java.lang.Boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ gxl(java.lang.String str, defpackage.gsw gswVar, java.lang.String str2, java.lang.String str3, defpackage.grp grpVar, defpackage.grp grpVar2, long j, long j2, long j3, defpackage.grn grnVar, int i, defpackage.grj grjVar, long j4, long j5, long j6, long j7, boolean z, defpackage.gss gssVar, int i2, long j8, int i3, int i4, java.lang.String str4, java.lang.Boolean bool, int i5) {
        java.lang.String str5;
        defpackage.gsw gswVar2 = (i5 & 2) != 0 ? defpackage.gsw.a : gswVar;
        if ((i5 & 8) != 0) {
            java.lang.String name = androidx.work.OverwritingInputMerger.class.getName();
            defpackage.aooh.e(name, "getName(...)");
            str5 = name;
        } else {
            str5 = str3;
        }
        defpackage.grp grpVar3 = (i5 & 16) != 0 ? defpackage.grp.a : grpVar;
        defpackage.grp grpVar4 = (i5 & 32) != 0 ? defpackage.grp.a : grpVar2;
        long j9 = (i5 & 64) != 0 ? 0L : j;
        long j10 = (i5 & 128) != 0 ? 0L : j2;
        long j11 = (i5 & 256) != 0 ? 0L : j3;
        defpackage.grn grnVar2 = (i5 & 512) != 0 ? defpackage.grn.a : grnVar;
        int i6 = (i5 & 1024) != 0 ? 0 : i;
        this(str, gswVar2, str2, str5, grpVar3, grpVar4, j9, j10, j11, grnVar2, i6, (i5 & 2048) != 0 ? defpackage.grj.a : grjVar, (i5 & 4096) != 0 ? 30000L : j4, (i5 & 8192) != 0 ? -1L : j5, (i5 & 16384) != 0 ? 0L : j6, (32768 & i5) == 0 ? j7 : -1L, ((65536 & i5) == 0) & z, (131072 & i5) != 0 ? defpackage.gss.a : gssVar, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? java.lang.Boolean.FALSE : bool);
    }

    public static /* synthetic */ defpackage.gxl e(defpackage.gxl gxlVar, java.lang.String str, defpackage.gsw gswVar, java.lang.String str2, defpackage.grp grpVar, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        java.lang.String str3 = (i5 & 1) != 0 ? gxlVar.b : str;
        defpackage.gsw gswVar2 = (i5 & 2) != 0 ? gxlVar.c : gswVar;
        java.lang.String str4 = (i5 & 4) != 0 ? gxlVar.d : str2;
        java.lang.String str5 = (i5 & 8) != 0 ? gxlVar.e : null;
        defpackage.grp grpVar2 = (i5 & 16) != 0 ? gxlVar.f : grpVar;
        defpackage.grp grpVar3 = (i5 & 32) != 0 ? gxlVar.g : null;
        long j3 = (i5 & 64) != 0 ? gxlVar.h : 0L;
        long j4 = (i5 & 128) != 0 ? gxlVar.i : 0L;
        long j5 = (i5 & 256) != 0 ? gxlVar.j : 0L;
        defpackage.grn grnVar = (i5 & 512) != 0 ? gxlVar.k : null;
        int i6 = (i5 & 1024) != 0 ? gxlVar.l : i;
        defpackage.grj grjVar = (i5 & 2048) != 0 ? gxlVar.m : null;
        long j6 = j5;
        long j7 = (i5 & 4096) != 0 ? gxlVar.n : 0L;
        long j8 = (i5 & 8192) != 0 ? gxlVar.o : j;
        long j9 = (i5 & 16384) != 0 ? gxlVar.p : 0L;
        long j10 = (32768 & i5) != 0 ? gxlVar.q : 0L;
        boolean z = (65536 & i5) != 0 ? gxlVar.r : false;
        defpackage.gss gssVar = (131072 & i5) != 0 ? gxlVar.s : null;
        int i7 = (262144 & i5) != 0 ? gxlVar.t : i2;
        int i8 = (524288 & i5) != 0 ? gxlVar.u : i3;
        long j11 = j3;
        long j12 = (1048576 & i5) != 0 ? gxlVar.v : j2;
        int i9 = (i5 & 2097152) != 0 ? gxlVar.w : i4;
        int i10 = gxlVar.x;
        java.lang.String str6 = gxlVar.y;
        java.lang.Boolean bool = gxlVar.z;
        defpackage.aooh.f(str3, "id");
        defpackage.aooh.f(gswVar2, "state");
        defpackage.aooh.f(str4, "workerClassName");
        defpackage.aooh.f(str5, "inputMergerClassName");
        defpackage.aooh.f(grpVar2, "input");
        defpackage.aooh.f(grpVar3, "output");
        defpackage.aooh.f(grnVar, "constraints");
        defpackage.aooh.f(grjVar, "backoffPolicy");
        defpackage.aooh.f(gssVar, "outOfQuotaPolicy");
        return new defpackage.gxl(str3, gswVar2, str4, str5, grpVar2, grpVar3, j11, j4, j6, grnVar, i6, grjVar, j7, j8, j9, j10, z, gssVar, i7, i8, j12, i9, i10, str6, bool);
    }

    public final long a() {
        return defpackage.gus.b(c(), this.l, this.m, this.n, this.o, this.t, d(), this.h, this.j, this.i, this.v);
    }

    public final boolean b() {
        return !defpackage.aooh.n(defpackage.grn.a, this.k);
    }

    public final boolean c() {
        return this.c == defpackage.gsw.a && this.l > 0;
    }

    public final boolean d() {
        return this.i != 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gxl) {
            defpackage.gxl gxlVar = (defpackage.gxl) obj;
            if (defpackage.aooh.n(this.b, gxlVar.b) && this.c == gxlVar.c && defpackage.aooh.n(this.d, gxlVar.d) && defpackage.aooh.n(this.e, gxlVar.e) && defpackage.aooh.n(this.f, gxlVar.f) && defpackage.aooh.n(this.g, gxlVar.g) && this.h == gxlVar.h && this.i == gxlVar.i && this.j == gxlVar.j && defpackage.aooh.n(this.k, gxlVar.k) && this.l == gxlVar.l && this.m == gxlVar.m && this.n == gxlVar.n && this.o == gxlVar.o && this.p == gxlVar.p && this.q == gxlVar.q && this.r == gxlVar.r && this.s == gxlVar.s && this.t == gxlVar.t && this.u == gxlVar.u && this.v == gxlVar.v && this.w == gxlVar.w && this.x == gxlVar.x && defpackage.aooh.n(this.y, gxlVar.y) && defpackage.aooh.n(this.z, gxlVar.z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
        int iM = defpackage.anty.M(this.h);
        int iM2 = (((((((((((iHashCode * 31) + iM) * 31) + defpackage.anty.M(this.i)) * 31) + defpackage.anty.M(this.j)) * 31) + this.k.hashCode()) * 31) + this.l) * 31) + this.m.hashCode();
        int iM3 = defpackage.anty.M(this.n);
        int iM4 = defpackage.anty.M(this.o);
        int iM5 = defpackage.anty.M(this.p);
        int iM6 = (((((((((((((((((((iM2 * 31) + iM3) * 31) + iM4) * 31) + iM5) * 31) + defpackage.anty.M(this.q)) * 31) + defpackage.anty.L(this.r)) * 31) + this.s.hashCode()) * 31) + this.t) * 31) + this.u) * 31) + defpackage.anty.M(this.v)) * 31) + this.w;
        java.lang.String str = this.y;
        int iHashCode2 = ((((iM6 * 31) + this.x) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.z;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "{WorkSpec: " + this.b + '}';
    }

    public gxl(java.lang.String str, defpackage.gsw gswVar, java.lang.String str2, java.lang.String str3, defpackage.grp grpVar, defpackage.grp grpVar2, long j, long j2, long j3, defpackage.grn grnVar, int i, defpackage.grj grjVar, long j4, long j5, long j6, long j7, boolean z, defpackage.gss gssVar, int i2, int i3, long j8, int i4, int i5, java.lang.String str4, java.lang.Boolean bool) {
        if (str == null) {
            defpackage.aooh.i("id");
        }
        if (gswVar == null) {
            defpackage.aooh.i("state");
        }
        if (str2 == null) {
            defpackage.aooh.i("workerClassName");
        }
        if (str3 == null) {
            defpackage.aooh.i("inputMergerClassName");
        }
        if (grpVar == null) {
            defpackage.aooh.i("input");
        }
        if (grpVar2 == null) {
            defpackage.aooh.i("output");
        }
        if (grnVar == null) {
            defpackage.aooh.i("constraints");
        }
        if (grjVar == null) {
            defpackage.aooh.i("backoffPolicy");
        }
        if (gssVar == null) {
            defpackage.aooh.i("outOfQuotaPolicy");
        }
        this.b = str;
        this.c = gswVar;
        this.d = str2;
        this.e = str3;
        this.f = grpVar;
        this.g = grpVar2;
        this.h = j;
        this.i = j2;
        this.j = j3;
        this.k = grnVar;
        this.l = i;
        this.m = grjVar;
        this.n = j4;
        this.o = j5;
        this.p = j6;
        this.q = j7;
        this.r = z;
        this.s = gssVar;
        this.t = i2;
        this.u = i3;
        this.v = j8;
        this.w = i4;
        this.x = i5;
        this.y = str4;
        this.z = bool;
    }
}
