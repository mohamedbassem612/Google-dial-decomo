package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class til {
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public java.lang.String e;
    public java.lang.String f;
    public java.lang.String g;
    public java.lang.String h;
    public java.lang.String i;
    public int j;
    private long k;
    private int l;
    private j$.util.Optional m;
    private long n;
    private int o;
    private long p;
    private j$.util.Optional q;
    private wgi r;
    private boolean s;
    private nwx t;
    private byte u;

    public til(defpackage.tin tinVar) {
        this.m = j$.util.Optional.empty();
        this.q = j$.util.Optional.empty();
        this.k = tinVar.a;
        this.l = tinVar.b;
        this.a = tinVar.c;
        this.b = tinVar.d;
        this.m = tinVar.e;
        this.c = tinVar.f;
        this.d = tinVar.g;
        this.n = tinVar.h;
        this.e = tinVar.i;
        this.f = tinVar.j;
        this.o = tinVar.k;
        this.p = tinVar.l;
        this.g = tinVar.m;
        this.h = tinVar.n;
        this.q = tinVar.o;
        this.j = tinVar.t;
        this.r = tinVar.p;
        this.s = tinVar.q;
        this.t = tinVar.r;
        this.i = tinVar.s;
        this.u = (byte) 63;
    }

    public final defpackage.tin a() {
        int i;
        wgi wgiVar;
        nwx nwxVar;
        if (this.u == 63 && (i = this.j) != 0 && (wgiVar = this.r) != null && (nwxVar = this.t) != null) {
            return new defpackage.tin(this.k, this.l, this.a, this.b, this.m, this.c, this.d, this.n, this.e, this.f, this.o, this.p, this.g, this.h, this.q, i, wgiVar, this.s, nwxVar, this.i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.u & 1) == 0) {
            sb.append(" id");
        }
        if ((this.u & 2) == 0) {
            sb.append(" type");
        }
        if ((this.u & 4) == 0) {
            sb.append(" photoId");
        }
        if ((this.u & 8) == 0) {
            sb.append(" carrierPresence");
        }
        if ((this.u & 16) == 0) {
            sb.append(" contactId");
        }
        if (this.j == 0) {
            sb.append(" matchType");
        }
        if (this.r == null) {
            sb.append(" wifiCallingIconsConfig");
        }
        if ((this.u & 32) == 0) {
            sb.append(" isStarred");
        }
        if (this.t == null) {
            sb.append(" meetReachability");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.o = i;
        this.u = (byte) (this.u | 8);
    }

    public final void c(long j) {
        this.p = j;
        this.u = (byte) (this.u | 16);
    }

    public final void d(long j) {
        this.k = j;
        this.u = (byte) (this.u | 1);
    }

    public final void e(boolean z) {
        this.s = z;
        this.u = (byte) (this.u | 32);
    }

    public final void f(nwx nwxVar) {
        if (nwxVar == null) {
            throw new java.lang.NullPointerException("Null meetReachability");
        }
        this.t = nwxVar;
    }

    public final void g(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null normalizedNumber");
        }
        this.m = optional;
    }

    public final void h(long j) {
        this.n = j;
        this.u = (byte) (this.u | 4);
    }

    public final void i(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null snippet");
        }
        this.q = optional;
    }

    public final void j(int i) {
        this.l = i;
        this.u = (byte) (this.u | 2);
    }

    public final void k(wgi wgiVar) {
        if (wgiVar == null) {
            throw new java.lang.NullPointerException("Null wifiCallingIconsConfig");
        }
        this.r = wgiVar;
    }

    public til() {
        this.m = j$.util.Optional.empty();
        this.q = j$.util.Optional.empty();
    }
}
