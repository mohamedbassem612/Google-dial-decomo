package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apkw {
    public final defpackage.apib a;
    public final defpackage.apks b;
    public final boolean c;
    public defpackage.apla d;
    public defpackage.apjp e;
    public final defpackage.aojw f;
    public defpackage.aaaj g;
    public final defpackage.zzx h;
    private final defpackage.apkc i;
    private final defpackage.apkv j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final boolean o;

    public apkw(defpackage.apkc apkcVar, defpackage.apkv apkvVar, int i, int i2, int i3, int i4, boolean z, defpackage.apib apibVar, defpackage.zzx zzxVar, defpackage.apks apksVar, defpackage.apjh apjhVar) {
        if (apkcVar == null) {
            defpackage.aooh.i("taskRunner");
        }
        if (apjhVar == null) {
            defpackage.aooh.i("request");
        }
        this.i = apkcVar;
        this.j = apkvVar;
        this.k = i;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = z;
        this.a = apibVar;
        this.h = zzxVar;
        this.b = apksVar;
        this.c = !defpackage.aooh.n(apjhVar.b, "GET");
        this.f = new defpackage.aojw();
    }

    public final defpackage.apkg a(defpackage.apjp apjpVar, java.util.List list) throws java.net.UnknownServiceException {
        if (apjpVar == null) {
            defpackage.aooh.i("route");
        }
        defpackage.apib apibVar = apjpVar.a;
        javax.net.ssl.SSLSocketFactory sSLSocketFactory = apibVar.c;
        if (sSLSocketFactory == null) {
            if (!apibVar.k.contains(defpackage.apik.b)) {
                throw new java.net.UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            defpackage.apiw apiwVar = apibVar.i;
            defpackage.apnn apnnVar = defpackage.apnn.b;
            android.security.NetworkSecurityPolicy networkSecurityPolicy = android.security.NetworkSecurityPolicy.getInstance();
            java.lang.String str = apiwVar.b;
            if (!aa$.ExternalSyntheticApiModelOutline1.m(networkSecurityPolicy, str)) {
                throw new java.net.UnknownServiceException(defpackage.a.bk(str, "CLEARTEXT communication to ", " not permitted by network security policy"));
            }
        } else if (apibVar.j.contains(defpackage.apjf.H2_PRIOR_KNOWLEDGE)) {
            throw new java.net.UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        defpackage.apjh apjhVar = null;
        if (apjpVar.b.type() == java.net.Proxy.Type.HTTP && (sSLSocketFactory != null || apibVar.j.contains(defpackage.apjf.H2_PRIOR_KNOWLEDGE))) {
            defpackage.apjg apjgVar = new defpackage.apjg();
            defpackage.apiw apiwVar2 = apibVar.i;
            apjgVar.a = apiwVar2;
            apjgVar.b("CONNECT", null);
            apjgVar.a("Host", defpackage.apjx.d(apiwVar2, true));
            apjgVar.a("Proxy-Connection", "Keep-Alive");
            apjgVar.a("User-Agent", "okhttp/5.5.0");
            apjhVar = new defpackage.apjh(apjgVar);
            defpackage.apjl apjlVar = new defpackage.apjl();
            apjlVar.d(apjhVar);
            apjlVar.a = defpackage.apjf.HTTP_1_1;
            apjlVar.b = 407;
            apjlVar.c("Preemptive Authenticate");
            apjlVar.h = -1L;
            apjlVar.i = -1L;
            apjlVar.l.T("Proxy-Authenticate", "OkHttp-Preemptive");
            apjlVar.a();
        }
        return new defpackage.apkg(this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.b, this, apjpVar, list, apjhVar, -1, false, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b A[Catch: all -> 0x0077, TryCatch #1 {, blocks: (B:17:0x0035, B:19:0x003b, B:22:0x0043), top: B:54:0x0035 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #1 {, blocks: (B:17:0x0035, B:19:0x003b, B:22:0x0043), top: B:54:0x0035 }] */
    public final defpackage.apkx b(defpackage.apkg apkgVar, java.util.List list) {
        defpackage.apkt apktVar;
        boolean z;
        boolean z2;
        java.net.Socket socketE;
        defpackage.apib apibVar = this.a;
        boolean z3 = apkgVar != null && apkgVar.i();
        java.util.Iterator it = ((j$.util.concurrent.ConcurrentLinkedQueue) this.j.d).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                apktVar = null;
                break;
            }
            apktVar = (defpackage.apkt) it.next();
            if (apktVar == null) {
                defpackage.aooh.g();
            }
            defpackage.apks apksVar = this.b;
            synchronized (apktVar) {
                if (z3) {
                    if (!apktVar.e()) {
                        z = false;
                    } else if (apktVar.c(apibVar, list)) {
                        apksVar.g(apktVar);
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (apktVar.c(apibVar, list)) {
                    z = false;
                } else {
                    apksVar.g(apktVar);
                    z = true;
                }
            }
            if (z) {
                if (apktVar.d(this.c)) {
                    break;
                }
                synchronized (apktVar) {
                    z2 = apktVar.h;
                    apktVar.i();
                    socketE = apksVar.e();
                }
                if (socketE != null) {
                    defpackage.apjx.h(socketE);
                    if (apktVar == null) {
                        defpackage.aooh.i("connection");
                    }
                } else if (!z2 && apktVar == null) {
                    defpackage.aooh.i("connection");
                }
            }
        }
        if (apktVar == null) {
            return null;
        }
        if (apkgVar != null) {
            this.e = apkgVar.a;
            java.net.Socket socket = apkgVar.c;
            if (socket != null) {
                defpackage.apjx.h(socket);
            }
        }
        defpackage.apis apisVar = this.b.c;
        return new defpackage.apkx(apktVar);
    }

    public final boolean c(defpackage.apkt apktVar) {
        defpackage.apla aplaVar;
        defpackage.apjp apjpVar;
        if (!this.f.isEmpty() || this.e != null) {
            return true;
        }
        if (apktVar != null) {
            synchronized (apktVar) {
                apjpVar = null;
                if (apktVar.j == 0 && apktVar.h) {
                    defpackage.apjp apjpVar2 = apktVar.b;
                    if (defpackage.apjx.i(apjpVar2.a.i, this.a.i)) {
                        apjpVar = apjpVar2;
                    }
                }
            }
            if (apjpVar != null) {
                this.e = apjpVar;
                return true;
            }
        }
        defpackage.aaaj aaajVar = this.g;
        if ((aaajVar == null || !aaajVar.g()) && (aplaVar = this.d) != null) {
            return aplaVar.a();
        }
        return true;
    }

    public final boolean d() {
        return this.b.n;
    }

    public final boolean e(defpackage.apiw apiwVar) {
        int i = apiwVar.c;
        defpackage.apiw apiwVar2 = this.a.i;
        return i == apiwVar2.c && defpackage.aooh.n(apiwVar.b, apiwVar2.b);
    }
}
