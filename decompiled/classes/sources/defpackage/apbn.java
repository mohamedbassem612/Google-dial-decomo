package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apbn extends defpackage.aotf implements defpackage.aome, defpackage.aoln {
    public final defpackage.aosp a;
    public final defpackage.aoln b;
    public java.lang.Object c;
    public final java.lang.Object d;
    public final defpackage.aorq f;

    public apbn(defpackage.aosp aospVar, defpackage.aoln aolnVar) {
        super(-1);
        this.a = aospVar;
        this.b = aolnVar;
        this.c = defpackage.apbo.a;
        this.d = defpackage.apcp.a(u());
        this.f = new defpackage.aorq(null, defpackage.aorr.a);
    }

    public final void c(defpackage.aolr aolrVar, java.lang.Object obj) {
        this.c = obj;
        this.e = 1;
        this.a.i(aolrVar, this);
    }

    @Override // defpackage.aome
    public final java.lang.StackTraceElement cJ() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoln, aome] */
    @Override // defpackage.aome
    public final defpackage.aome cK() {
        return this.b;
    }

    @Override // defpackage.aotf
    public final java.lang.Object n() {
        java.lang.Object obj = this.c;
        boolean z = defpackage.aosu.a;
        this.c = defpackage.apbo.a;
        return obj;
    }

    public final java.lang.String toString() {
        return "DispatchedContinuation[" + this.a + ", " + defpackage.aosv.c(this.b) + ']';
    }

    @Override // defpackage.aoln
    public final defpackage.aolr u() {
        return this.b.u();
    }

    @Override // defpackage.aoln
    public final void w(java.lang.Object obj) throws defpackage.aotd {
        defpackage.aosp aospVar = this.a;
        java.lang.Object objV = defpackage.aosv.v(obj);
        defpackage.aolr aolrVarU = u();
        try {
            if (aospVar.dB(aolrVarU)) {
                this.c = objV;
                this.e = 0;
                defpackage.aosp aospVar2 = this.a;
                defpackage.aolr aolrVarU2 = u();
                try {
                    aospVar2.a(aolrVarU2, this);
                    return;
                } catch (java.lang.Throwable th) {
                    throw new defpackage.aotd(th, aospVar2, aolrVarU2);
                }
            }
            boolean z = defpackage.aosu.a;
            java.lang.ThreadLocal threadLocal = defpackage.aovj.a;
            defpackage.aotm aotmVarA = defpackage.aovj.a();
            if (aotmVarA.q()) {
                this.c = objV;
                this.e = 0;
                aotmVarA.o(this);
                return;
            }
            aotmVarA.p(true);
            try {
                defpackage.aolr aolrVarU3 = u();
                java.lang.Object objB = defpackage.apcp.b(aolrVarU3, this.d);
                try {
                    this.b.w(obj);
                    defpackage.apcp.c(aolrVarU3, objB);
                    while (aotmVarA.s()) {
                    }
                } catch (java.lang.Throwable th2) {
                    defpackage.apcp.c(aolrVarU3, objB);
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    H(th3);
                } finally {
                    aotmVarA.n(true);
                }
            }
        } catch (java.lang.Throwable th4) {
            throw new defpackage.aotd(th4, aospVar, aolrVarU);
        }
    }

    @Override // defpackage.aotf
    public final defpackage.aoln r() {
        return this;
    }
}
