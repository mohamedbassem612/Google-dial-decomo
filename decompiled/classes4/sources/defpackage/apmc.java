package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apmc implements aplp {
    public static final apiu a;
    public final apje b;
    public final aplo c;
    public int d;
    public final defpackage.aplv e;
    public final apkd f;

    static {
        apiu apiuVar = apiu.a;
        a = aooh.U(new java.lang.String[]{"OkHttp-Response-Body", "Truncated"});
    }

    public apmc(apje apjeVar, aplo aploVar, apkd apkdVar) {
        aooh.f(apkdVar, "socket");
        this.b = apjeVar;
        this.c = aploVar;
        this.f = apkdVar;
        this.e = new defpackage.aplv(apkdVar.b);
    }

    public static final void n(defpackage.apph apphVar) {
        apqf apqfVar = apphVar.a;
        apphVar.a = apqf.k;
        apqfVar.k();
        apqfVar.l();
    }

    private static final boolean o(apjm apjmVar) {
        return aoov.s("chunked", apjmVar.a("Transfer-Encoding"), true);
    }

    public final long a(apjm apjmVar) {
        if (!aplq.b(apjmVar)) {
            return 0L;
        }
        if (o(apjmVar)) {
            return -1L;
        }
        return apjx.a(apjmVar);
    }

    public final apjl b(boolean z) throws java.io.IOException {
        int i = this.d;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new java.lang.IllegalStateException(a.bj(i, "state: "));
        }
        try {
            defpackage.aplv aplvVar = this.e;
            aplu apluVarBb = aoov.bb(aplvVar.a());
            apjl apjlVar = new apjl();
            apjlVar.a = apluVarBb.a;
            int i2 = apluVarBb.b;
            apjlVar.b = i2;
            apjlVar.c(apluVarBb.c);
            apjlVar.b(aplvVar.b());
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100 || (i2 >= 102 && i2 < 200)) {
                this.d = 3;
                return apjlVar;
            }
            this.d = 4;
            return apjlVar;
        } catch (java.io.EOFException e) {
            throw new java.io.IOException("unexpected end of stream on ".concat(this.c.a().a.i.e()), e);
        }
    }

    public final aplo c() {
        return this.c;
    }

    public final apqb d(apjh apjhVar, long j) {
        aooh.f(apjhVar, "request");
        apjk apjkVar = apjhVar.d;
        if (aoov.s("chunked", apjhVar.a("Transfer-Encoding"), true)) {
            int i = this.d;
            if (i != 1) {
                throw new java.lang.IllegalStateException(a.bj(i, "state: "));
            }
            this.d = 2;
            return new defpackage.aplx(this);
        }
        if (j == -1) {
            throw new java.lang.IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i2 = this.d;
        if (i2 != 1) {
            throw new java.lang.IllegalStateException(a.bj(i2, "state: "));
        }
        this.d = 2;
        return new defpackage.apma(this);
    }

    public final /* synthetic */ apqc e() {
        return this.f;
    }

    public final apqd f(apjm apjmVar) {
        apqd apmbVar;
        if (!aplq.b(apjmVar)) {
            return l(apjmVar.a.a, 0L);
        }
        if (o(apjmVar)) {
            apjh apjhVar = apjmVar.a;
            int i = this.d;
            if (i != 4) {
                throw new java.lang.IllegalStateException(a.bj(i, "state: "));
            }
            apiw apiwVar = apjhVar.a;
            this.d = 5;
            apmbVar = new defpackage.aply(this, apiwVar);
        } else {
            long jA = apjx.a(apjmVar);
            if (jA != -1) {
                return l(apjmVar.a.a, jA);
            }
            apjh apjhVar2 = apjmVar.a;
            int i2 = this.d;
            if (i2 != 4) {
                throw new java.lang.IllegalStateException(a.bj(i2, "state: "));
            }
            apiw apiwVar2 = apjhVar2.a;
            this.d = 5;
            this.c.g();
            apmbVar = new defpackage.apmb(this, apiwVar2);
        }
        return apmbVar;
    }

    public final void g() {
        this.c.f();
    }

    public final void h() {
        this.f.c.flush();
    }

    public final void i() {
        this.f.c.flush();
    }

    public final void j(apjh apjhVar) {
        aooh.f(apjhVar, "request");
        java.net.Proxy.Type type = this.c.a().b.type();
        aooh.e(type, "type(...)");
        aooh.f(apjhVar, "request");
        aooh.f(type, "proxyType");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(apjhVar.b);
        sb.append(' ');
        apiw apiwVar = apjhVar.a;
        if (apiwVar.j() || type != java.net.Proxy.Type.HTTP) {
            sb.append(aoov.bc(apiwVar));
        } else {
            sb.append(apiwVar);
        }
        sb.append(" HTTP/1.1");
        m(apjhVar.c, sb.toString());
    }

    public final boolean k() {
        return this.d == 6;
    }

    public final apqd l(apiw apiwVar, long j) {
        int i = this.d;
        if (i != 4) {
            throw new java.lang.IllegalStateException(a.bj(i, "state: "));
        }
        this.d = 5;
        return new defpackage.aplz(this, apiwVar, j);
    }

    public final void m(apiu apiuVar, java.lang.String str) {
        int i = this.d;
        if (i != 0) {
            throw new java.lang.IllegalStateException(a.bj(i, "state: "));
        }
        apoz apozVar = this.f.c;
        apozVar.ab(str);
        apozVar.ab("\r\n");
        int iA = apiuVar.a();
        for (int i2 = 0; i2 < iA; i2++) {
            apozVar.ab(aoov.be(apiuVar, i2));
            apozVar.ab(": ");
            apozVar.ab(aoov.bf(apiuVar, i2));
            apozVar.ab("\r\n");
        }
        apozVar.ab("\r\n");
        this.d = 1;
    }
}
