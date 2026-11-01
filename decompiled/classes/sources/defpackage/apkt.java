package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apkt extends defpackage.apmp implements defpackage.aplo {
    public final defpackage.apkc a;
    public final defpackage.apjp b;
    public final java.net.Socket c;
    public final defpackage.apit d;
    public final defpackage.apjf e;
    public final defpackage.apkh f;
    public defpackage.apms g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public final java.util.List m;
    public long n;
    public final defpackage.apkd o;
    private final java.net.Socket q;
    private int r;

    public apkt(defpackage.apkc apkcVar, defpackage.apjp apjpVar, java.net.Socket socket, java.net.Socket socket2, defpackage.apit apitVar, defpackage.apjf apjfVar, defpackage.apkd apkdVar, defpackage.apkh apkhVar) {
        if (apkcVar == null) {
            defpackage.aooh.i("taskRunner");
        }
        if (apjpVar == null) {
            defpackage.aooh.i("route");
        }
        if (socket2 == null) {
            defpackage.aooh.i("javaNetSocket");
        }
        if (apjfVar == null) {
            defpackage.aooh.i("protocol");
        }
        if (apkdVar == null) {
            defpackage.aooh.i("socket");
        }
        this.a = apkcVar;
        this.b = apjpVar;
        this.q = socket;
        this.c = socket2;
        this.d = apitVar;
        this.e = apjfVar;
        this.o = apkdVar;
        this.f = apkhVar;
        this.l = 1;
        this.m = new java.util.ArrayList();
        this.n = Long.MAX_VALUE;
    }

    @Override // defpackage.aplo
    public final defpackage.apjp a() {
        return this.b;
    }

    @Override // defpackage.apmp
    public final void b(defpackage.apmz apmzVar) {
        apmzVar.g(defpackage.apme.REFUSED_STREAM, null);
    }

    public final boolean c(defpackage.apib apibVar, java.util.List list) {
        defpackage.apit apitVar;
        java.util.TimeZone timeZone = defpackage.apjx.a;
        if (this.m.size() >= this.l || this.h) {
            return false;
        }
        defpackage.apjp apjpVar = this.b;
        defpackage.apib apibVar2 = apjpVar.a;
        if (!apibVar2.a(apibVar)) {
            return false;
        }
        defpackage.apiw apiwVar = apibVar.i;
        defpackage.apiw apiwVar2 = apibVar2.i;
        java.lang.String str = apiwVar.b;
        java.lang.String str2 = apiwVar2.b;
        if (!defpackage.aooh.n(str, str2)) {
            if (this.g == null || list == null || list.isEmpty()) {
                return false;
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                defpackage.apjp apjpVar2 = (defpackage.apjp) it.next();
                if (apjpVar2.b.type() == java.net.Proxy.Type.DIRECT && apjpVar.b.type() == java.net.Proxy.Type.DIRECT) {
                    if (defpackage.aooh.n(apjpVar.c, apjpVar2.c)) {
                        if (apibVar.d != defpackage.apoe.a || apiwVar.c != apiwVar2.c) {
                            return false;
                        }
                        if (!defpackage.aooh.n(str, str2)) {
                            if (this.i || (apitVar = this.d) == null) {
                                return false;
                            }
                            java.util.List listA = apitVar.a();
                            if (listA.isEmpty()) {
                                return false;
                            }
                            java.lang.Object obj = listA.get(0);
                            if (obj == null) {
                                defpackage.aooh.h("null cannot be cast to non-null type java.security.cert.X509Certificate");
                            }
                            if (!defpackage.apoe.b(str, (java.security.cert.X509Certificate) obj)) {
                                return false;
                            }
                        }
                        try {
                            defpackage.apih apihVar = apibVar.e;
                            if (apihVar == null) {
                                defpackage.aooh.g();
                            }
                            defpackage.apit apitVar2 = this.d;
                            if (apitVar2 == null) {
                                defpackage.aooh.g();
                            }
                            if (apitVar2.a() == null) {
                                defpackage.aooh.i("peerCertificates");
                            }
                            apihVar.b();
                        } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean d(boolean z) {
        long j;
        java.util.TimeZone timeZone = defpackage.apjx.a;
        long jNanoTime = java.lang.System.nanoTime();
        boolean z2 = false;
        if (this.q.isClosed()) {
            return false;
        }
        java.net.Socket socket = this.c;
        if (socket.isClosed() || socket.isInputShutdown() || socket.isOutputShutdown()) {
            return false;
        }
        defpackage.apms apmsVar = this.g;
        if (apmsVar != null) {
            synchronized (apmsVar) {
                if (!apmsVar.g && (apmsVar.n >= apmsVar.m || jNanoTime < apmsVar.p)) {
                    z2 = true;
                }
            }
            return z2;
        }
        synchronized (this) {
            j = jNanoTime - this.n;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        return defpackage.apjx.j(this.c, this.o.b);
    }

    public final boolean e() {
        return this.g != null;
    }

    @Override // defpackage.aplo
    public final void f() {
        defpackage.apjx.h(this.q);
    }

    @Override // defpackage.aplo
    public final void g() {
        synchronized (this) {
            this.h = true;
        }
    }

    @Override // defpackage.aplo
    public final void h(defpackage.apks apksVar, java.io.IOException iOException) {
        synchronized (this) {
            if (iOException instanceof apng) {
                defpackage.apme apmeVar = ((apng) iOException).a;
                if (apmeVar == defpackage.apme.REFUSED_STREAM) {
                    int i = this.r + 1;
                    this.r = i;
                    if (i > 1) {
                        this.h = true;
                        this.j++;
                    }
                } else if (apmeVar != defpackage.apme.CANCEL || !apksVar.n) {
                    this.h = true;
                    this.j++;
                }
            } else if (!e() || (iOException instanceof apmd)) {
                this.h = true;
                if (this.k == 0) {
                    defpackage.apje apjeVar = apksVar.a;
                    defpackage.apjp apjpVar = this.b;
                    defpackage.aooh.f(apjpVar, "failedRoute");
                    java.net.Proxy proxy = apjpVar.b;
                    if (proxy.type() != java.net.Proxy.Type.DIRECT) {
                        defpackage.apib apibVar = apjpVar.a;
                        apibVar.h.connectFailed(apibVar.i.f(), proxy.address(), iOException);
                    }
                    apjeVar.A.P(apjpVar);
                    this.j++;
                }
            }
        }
    }

    public final void i() {
        this.h = true;
    }

    @Override // defpackage.apmp
    public final void j(defpackage.apnf apnfVar) {
        if (apnfVar == null) {
            defpackage.aooh.i("settings");
        }
        synchronized (this) {
            this.l = apnfVar.d();
        }
    }

    public final java.lang.String toString() {
        defpackage.apjp apjpVar = this.b;
        defpackage.apiw apiwVar = apjpVar.a.i;
        defpackage.apit apitVar = this.d;
        java.lang.Object obj = apitVar != null ? apitVar.b : "none";
        int i = apiwVar.c;
        return "Connection{" + apiwVar.b + ':' + i + ", proxy=" + apjpVar.b + " hostAddress=" + apjpVar.c + " cipherSuite=" + obj + " protocol=" + this.e + '}';
    }
}
