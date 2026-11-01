package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adis {
    public com.google.android.libraries.micore.superpacks.base.VersionedName a;
    public java.lang.String b;
    public java.lang.String c;
    private java.lang.String d;
    private long e;
    private long f;
    private int g;
    private int h;
    private defpackage.aift i;
    private defpackage.aify j;
    private defpackage.aift k;
    private defpackage.aify l;
    private boolean m;
    private java.util.Date n;
    private defpackage.aigb o;
    private defpackage.aigf p;
    private byte q;

    public adis(com.google.android.libraries.micore.superpacks.common.PackManifest packManifest) {
        this.a = packManifest.e();
        this.d = packManifest.k();
        this.b = packManifest.j();
        this.e = packManifest.d();
        this.f = packManifest.c();
        this.g = packManifest.b();
        this.h = packManifest.a();
        this.j = packManifest.g();
        this.l = packManifest.h();
        this.c = packManifest.l();
        this.m = packManifest.n();
        this.n = packManifest.m();
        this.p = packManifest.i();
        this.q = (byte) 31;
    }

    public final com.google.android.libraries.micore.superpacks.common.PackManifest a() {
        defpackage.aift aiftVar = this.i;
        if (aiftVar != null) {
            this.j = aiftVar.g();
        } else if (this.j == null) {
            this.j = defpackage.aike.a;
        }
        defpackage.aift aiftVar2 = this.k;
        if (aiftVar2 != null) {
            this.l = aiftVar2.g();
        } else if (this.l == null) {
            this.l = defpackage.aike.a;
        }
        defpackage.aigb aigbVar = this.o;
        if (aigbVar != null) {
            this.p = aigbVar.e(true);
        } else if (this.p == null) {
            this.p = defpackage.aikj.b;
        }
        if (this.q == 31 && this.d != null && this.b != null && this.n != null) {
            com.google.android.libraries.micore.superpacks.common.AutoValue_PackManifest autoValue_PackManifest = new com.google.android.libraries.micore.superpacks.common.AutoValue_PackManifest(this.a, this.d, this.b, this.e, this.f, this.g, this.h, this.j, this.l, this.c, this.m, this.n, this.p);
            com.google.android.libraries.micore.superpacks.base.BasePriority.d(autoValue_PackManifest.f);
            com.google.android.libraries.micore.superpacks.base.BasePriority.d(autoValue_PackManifest.e);
            defpackage.adho.e(autoValue_PackManifest.a);
            defpackage.adho.e(autoValue_PackManifest.b);
            java.lang.String str = autoValue_PackManifest.h;
            if (str != null) {
                defpackage.adho.e(str);
            }
            defpackage.adik.k("compressedSize", autoValue_PackManifest.d);
            defpackage.adik.k("size", autoValue_PackManifest.c);
            return autoValue_PackManifest;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == null) {
            sb.append(" namespace");
        }
        if (this.b == null) {
            sb.append(" name");
        }
        if ((this.q & 1) == 0) {
            sb.append(" size");
        }
        if ((this.q & 2) == 0) {
            sb.append(" compressedSize");
        }
        if ((this.q & 4) == 0) {
            sb.append(" gcPriority");
        }
        if ((this.q & 8) == 0) {
            sb.append(" downloadPriority");
        }
        if ((this.q & 16) == 0) {
            sb.append(" verifySizes");
        }
        if (this.n == null) {
            sb.append(" expiryDate");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final defpackage.aift b() {
        if (this.k == null) {
            if (this.l == null) {
                this.k = new defpackage.aift(4);
            } else {
                defpackage.aift aiftVar = new defpackage.aift(4);
                this.k = aiftVar;
                aiftVar.k(this.l);
                this.l = null;
            }
        }
        return this.k;
    }

    public final defpackage.aigb c() {
        if (this.o == null) {
            if (this.p == null) {
                this.o = new defpackage.aigb(4);
            } else {
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                this.o = aigbVar;
                aigbVar.l(this.p);
                this.p = null;
            }
        }
        return this.o;
    }

    public final void d(java.lang.String str) {
        if (this.i == null) {
            if (this.j == null) {
                this.i = new defpackage.aift(4);
            } else {
                defpackage.aift aiftVar = new defpackage.aift(4);
                this.i = aiftVar;
                aiftVar.k(this.j);
                this.j = null;
            }
        }
        this.i.i(str);
    }

    public final void e(java.lang.String str, java.lang.Object obj) {
        c().i(str, obj);
    }

    public final void f(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            int i = defpackage.adho.a;
            if (str != null) {
                defpackage.adho.e(str);
            }
        }
        b().k(list);
    }

    public final void g(long j) {
        this.f = j;
        this.q = (byte) (this.q | 2);
    }

    public final void h(int i) {
        this.h = i;
        this.q = (byte) (this.q | 8);
    }

    public final void i(java.util.Date date) {
        if (date == null) {
            throw new java.lang.NullPointerException("Null expiryDate");
        }
        this.n = date;
    }

    public final void j(int i) {
        this.g = i;
        this.q = (byte) (this.q | 4);
    }

    public final void k(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null name");
        }
        this.b = str;
    }

    public final void l(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null namespace");
        }
        this.d = str;
    }

    public final void m(long j) {
        this.e = j;
        this.q = (byte) (this.q | 1);
    }

    public final void n(boolean z) {
        this.m = z;
        this.q = (byte) (this.q | 16);
    }

    public adis() {
    }
}
