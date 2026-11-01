package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apol extends java.net.HttpURLConnection {
    defpackage.apje a;
    final defpackage.apok b;
    defpackage.apiu c;
    boolean d;
    defpackage.apif e;
    long f;
    public final java.lang.Object g;
    defpackage.apjm h;
    boolean i;
    java.net.Proxy j;
    defpackage.apit k;
    final defpackage.zzx l;
    private defpackage.apjm m;
    private java.lang.Throwable n;

    public apol(java.net.URL url, defpackage.apje apjeVar) {
        super(url);
        this.b = new defpackage.apok(this);
        this.l = new defpackage.zzx((byte[]) null, (short[]) null);
        this.f = -1L;
        this.g = new java.lang.Object();
        this.i = true;
        this.a = apjeVar;
    }

    private final defpackage.apif e() throws java.net.ProtocolException, java.net.MalformedURLException {
        apoo apooVar;
        defpackage.apif apifVar = this.e;
        if (apifVar != null) {
            return apifVar;
        }
        boolean z = true;
        this.connected = true;
        if (this.doOutput) {
            if (this.method.equals("GET")) {
                this.method = "POST";
            } else if (!defpackage.apor.f(this.method)) {
                throw new java.net.ProtocolException(java.lang.String.valueOf(this.method).concat(" does not support writing"));
            }
        }
        defpackage.zzx zzxVar = this.l;
        if (zzxVar.R("User-Agent") == null) {
            java.lang.String strG = defpackage.apor.g();
            if (strG != null) {
                int iCharCount = 0;
                while (true) {
                    int length = strG.length();
                    if (iCharCount >= length) {
                        break;
                    }
                    int iCodePointAt = strG.codePointAt(iCharCount);
                    if (iCodePointAt <= 31 || iCodePointAt >= 127) {
                        defpackage.apoy apoyVar = new defpackage.apoy();
                        apoyVar.U(strG, 0, iCharCount);
                        apoyVar.V(63);
                        while (true) {
                            iCharCount += java.lang.Character.charCount(iCodePointAt);
                            if (iCharCount >= length) {
                                break;
                            }
                            iCodePointAt = strG.codePointAt(iCharCount);
                            apoyVar.V((iCodePointAt <= 31 || iCodePointAt >= 127) ? 63 : iCodePointAt);
                        }
                        strG = apoyVar.o();
                        break;
                    }
                    iCharCount += java.lang.Character.charCount(iCodePointAt);
                }
            } else {
                strG = "ObsoleteUrlFactory";
            }
            zzxVar.U("User-Agent", strG);
        }
        if (defpackage.apor.f(this.method)) {
            if (zzxVar.R("Content-Type") == null) {
                zzxVar.U("Content-Type", "application/x-www-form-urlencoded");
            }
            long j = -1;
            if (this.f == -1 && this.chunkLength <= 0) {
                z = false;
            }
            java.lang.String strR = zzxVar.R("Content-Length");
            long j2 = this.f;
            if (j2 != -1) {
                j = j2;
            } else if (strR != null) {
                j = java.lang.Long.parseLong(strR);
            }
            apooVar = z ? new apoo(j) : new apoi(j);
            apooVar.c.f(this.a.x, java.util.concurrent.TimeUnit.MILLISECONDS);
        } else {
            apooVar = null;
        }
        try {
            java.lang.String string = getURL().toString();
            if (string == null) {
                defpackage.aooh.i("<this>");
            }
            defpackage.apiv apivVar = new defpackage.apiv();
            apivVar.c(null, string);
            defpackage.apiw apiwVarA = apivVar.a();
            defpackage.apjg apjgVar = new defpackage.apjg();
            apjgVar.a = apiwVarA;
            apjgVar.c = defpackage.aoov.bk(defpackage.aoov.bl(this.l));
            apjgVar.b(this.method, apooVar);
            defpackage.apjh apjhVar = new defpackage.apjh(apjgVar);
            defpackage.apjd apjdVar = new defpackage.apjd(this.a);
            java.util.List list = apjdVar.b;
            list.clear();
            list.add(defpackage.apoq.a);
            java.util.List list2 = apjdVar.c;
            list2.clear();
            list2.add(this.b);
            apjdVar.a = new defpackage.apio(this.a.c.a());
            getUseCaches();
            defpackage.apks apksVar = new defpackage.apks(new defpackage.apje(apjdVar), apjhVar);
            this.e = apksVar;
            return apksVar;
        } catch (java.lang.IllegalArgumentException e) {
            java.net.MalformedURLException malformedURLException = new java.net.MalformedURLException();
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    private final defpackage.apjm f(boolean z) throws java.io.IOException {
        defpackage.apjm apjmVar;
        synchronized (this.g) {
            defpackage.apjm apjmVar2 = this.m;
            if (apjmVar2 != null) {
                return apjmVar2;
            }
            java.lang.Throwable th = this.n;
            if (th != null) {
                if (!z || (apjmVar = this.h) == null) {
                    throw defpackage.apor.a(th);
                }
                return apjmVar;
            }
            defpackage.apif apifVarE = e();
            this.b.b();
            defpackage.apjk apjkVar = ((defpackage.apks) apifVarE).b.d;
            if (apjkVar != null) {
                ((defpackage.apon) apjkVar).e.close();
            }
            if (this.d) {
                java.lang.Object obj = this.g;
                synchronized (obj) {
                    while (this.m == null && this.n == null) {
                        try {
                            obj.wait();
                        } catch (java.lang.InterruptedException unused) {
                            java.lang.Thread.currentThread().interrupt();
                            throw new java.io.InterruptedIOException();
                        }
                    }
                }
            } else {
                this.d = true;
                try {
                    if (!((defpackage.apks) apifVarE).e.compareAndSet(false, true)) {
                        throw new java.lang.IllegalStateException("Already Executed");
                    }
                    ((defpackage.apks) apifVarE).d.d();
                    ((defpackage.apks) apifVarE).h();
                    try {
                        ((defpackage.apks) apifVarE).a.c.c((defpackage.apks) apifVarE);
                        defpackage.apjm apjmVarF = ((defpackage.apks) apifVarE).f();
                        ((defpackage.apks) apifVarE).a.c.b(null, (defpackage.apks) apifVarE, null);
                        d(apjmVarF);
                    } catch (java.lang.Throwable th2) {
                        ((defpackage.apks) apifVarE).a.c.b(null, (defpackage.apks) apifVarE, null);
                        throw th2;
                    }
                } catch (java.io.IOException e) {
                    c(e);
                }
            }
            synchronized (this.g) {
                java.lang.Throwable th3 = this.n;
                if (th3 != null) {
                    throw defpackage.apor.a(th3);
                }
                defpackage.apjm apjmVar3 = this.m;
                if (apjmVar3 != null) {
                    return apjmVar3;
                }
                throw new java.lang.AssertionError();
            }
        }
    }

    final defpackage.apiu a() throws java.io.IOException {
        java.lang.String str;
        defpackage.apiu apiuVar = this.c;
        if (apiuVar != null) {
            return apiuVar;
        }
        defpackage.apjm apjmVarF = f(true);
        defpackage.apiu apiuVar2 = apjmVarF.f;
        defpackage.apjf apjfVar = apjmVarF.b;
        defpackage.zzx zzxVarBk = defpackage.aoov.bk(apiuVar2);
        zzxVarBk.U("ObsoleteUrlFactory-Selected-Protocol", apjfVar.h);
        defpackage.apjm apjmVar = apjmVarF.i;
        int i = defpackage.apor.e;
        if (apjmVar == null) {
            str = "NONE";
        } else {
            str = "NETWORK " + apjmVarF.d;
        }
        zzxVarBk.U("ObsoleteUrlFactory-Response-Source", str);
        defpackage.apiu apiuVarBl = defpackage.aoov.bl(zzxVarBk);
        this.c = apiuVarBl;
        return apiuVarBl;
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(java.lang.String str, java.lang.String str2) {
        if (this.connected) {
            throw new java.lang.IllegalStateException("Cannot add request property after connection is made");
        }
        if (str == null) {
            throw new java.lang.NullPointerException("field == null");
        }
        if (str2 != null) {
            this.l.U(str, str2);
        }
    }

    public final void c(java.io.IOException iOException) {
        java.lang.Object obj = this.g;
        synchronized (obj) {
            boolean z = iOException instanceof defpackage.apoq;
            java.io.IOException cause = iOException;
            if (z) {
                cause = iOException.getCause();
            }
            this.n = cause;
            obj.notifyAll();
        }
    }

    @Override // java.net.URLConnection
    public final void connect() throws java.net.ProtocolException, java.net.MalformedURLException {
        if (this.d) {
            return;
        }
        defpackage.apif apifVarE = e();
        this.d = true;
        defpackage.apks apksVar = (defpackage.apks) apifVarE;
        if (!apksVar.e.compareAndSet(false, true)) {
            throw new java.lang.IllegalStateException("Already Executed");
        }
        apksVar.h();
        defpackage.apje apjeVar = apksVar.a;
        apjeVar.c.b(new defpackage.apkp(apksVar, this), null, null);
        java.lang.Object obj = this.g;
        synchronized (obj) {
            while (this.i && this.m == null && this.n == null) {
                try {
                    obj.wait();
                } catch (java.lang.InterruptedException unused) {
                    java.lang.Thread.currentThread().interrupt();
                    throw new java.io.InterruptedIOException();
                }
            }
            java.lang.Throwable th = this.n;
            if (th != null) {
                throw defpackage.apor.a(th);
            }
        }
    }

    public final void d(defpackage.apjm apjmVar) {
        java.lang.Object obj = this.g;
        synchronized (obj) {
            this.m = apjmVar;
            this.k = apjmVar.e;
            this.url = apjmVar.a.a.g();
            obj.notifyAll();
        }
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        if (this.e != null) {
            this.b.b();
            this.e.a();
        }
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.a.v;
    }

    @Override // java.net.HttpURLConnection
    public final java.io.InputStream getErrorStream() {
        long j;
        try {
            defpackage.apjm apjmVarF = f(true);
            int i = defpackage.apor.e;
            if (apjmVarF.a.b.equals("HEAD")) {
                return null;
            }
            int i2 = apjmVarF.d;
            if ((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) {
                java.lang.String strB = apjmVarF.f.b("Content-Length");
                if (strB != null) {
                    try {
                        j = java.lang.Long.parseLong(strB);
                    } catch (java.lang.NumberFormatException unused) {
                        j = -1;
                    }
                } else {
                    j = -1;
                }
                if (j == -1 && !"chunked".equalsIgnoreCase(apjmVarF.a("Transfer-Encoding"))) {
                    return null;
                }
            }
            if (apjmVarF.d >= 400) {
                return apjmVarF.g.d();
            }
            return null;
        } catch (java.io.IOException unused2) {
            return null;
        }
    }

    @Override // java.net.URLConnection
    public final java.lang.String getHeaderField(java.lang.String str) {
        try {
            return str == null ? defpackage.apor.b(f(true)) : a().b(str);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final java.lang.String getHeaderFieldKey(int i) {
        try {
            defpackage.apiu apiuVarA = a();
            if (i < 0 || i >= apiuVarA.a()) {
                return null;
            }
            return defpackage.aoov.be(apiuVarA, i);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.net.URLConnection
    public final java.util.Map getHeaderFields() {
        try {
            return defpackage.apor.e(a(), defpackage.apor.b(f(true)));
        } catch (java.io.IOException unused) {
            return java.util.Collections.EMPTY_MAP;
        }
    }

    @Override // java.net.URLConnection
    public final java.io.InputStream getInputStream() throws java.io.IOException {
        if (!this.doInput) {
            throw new java.net.ProtocolException("This protocol does not support input");
        }
        defpackage.apjm apjmVarF = f(false);
        if (apjmVarF.d < 400) {
            return apjmVarF.g.d();
        }
        throw new java.io.FileNotFoundException(this.url.toString());
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.a.h;
    }

    @Override // java.net.URLConnection
    public final java.io.OutputStream getOutputStream() throws java.net.ProtocolException, java.net.MalformedURLException {
        defpackage.apjk apjkVar = ((defpackage.apks) e()).b.d;
        if (apjkVar == null) {
            throw new java.net.ProtocolException("method does not support a request body: ".concat(java.lang.String.valueOf(this.method)));
        }
        if (apjkVar instanceof apoo) {
            connect();
            this.b.b();
        }
        defpackage.apon aponVar = (defpackage.apon) apjkVar;
        if (aponVar.f) {
            throw new java.net.ProtocolException("cannot write request body after response has been read");
        }
        return aponVar.e;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final java.security.Permission getPermission() {
        java.net.URL url = getURL();
        java.lang.String host = url.getHost();
        int port = url.getPort() != -1 ? url.getPort() : defpackage.aooh.T(url.getProtocol());
        if (usingProxy()) {
            java.net.InetSocketAddress inetSocketAddress = (java.net.InetSocketAddress) this.a.k.address();
            host = inetSocketAddress.getHostName();
            port = inetSocketAddress.getPort();
        }
        return new java.net.SocketPermission(host + ':' + port, "connect, resolve");
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.a.w;
    }

    @Override // java.net.URLConnection
    public final java.util.Map getRequestProperties() {
        if (this.connected) {
            throw new java.lang.IllegalStateException("Cannot access request header fields after connection is set");
        }
        return defpackage.apor.e(defpackage.aoov.bl(this.l), null);
    }

    @Override // java.net.URLConnection
    public final java.lang.String getRequestProperty(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return this.l.R(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return f(true).d;
    }

    @Override // java.net.HttpURLConnection
    public final java.lang.String getResponseMessage() {
        return f(true).c;
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        defpackage.apjd apjdVar = new defpackage.apjd(this.a);
        apjdVar.a(i, java.util.concurrent.TimeUnit.MILLISECONDS);
        this.a = new defpackage.apje(apjdVar);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        if (((java.net.HttpURLConnection) this).connected) {
            throw new java.lang.IllegalStateException("Already connected");
        }
        if (this.chunkLength > 0) {
            throw new java.lang.IllegalStateException("Already in chunked mode");
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("contentLength < 0");
        }
        this.f = j;
        ((java.net.HttpURLConnection) this).fixedContentLength = (int) java.lang.Math.min(j, 2147483647L);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        super.setIfModifiedSince(j);
        long j2 = this.ifModifiedSince;
        defpackage.zzx zzxVar = this.l;
        if (j2 == 0) {
            zzxVar.V("If-Modified-Since");
        } else {
            zzxVar.T("If-Modified-Since", ((java.text.DateFormat) defpackage.apor.c.get()).format(new java.util.Date(this.ifModifiedSince)));
        }
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        defpackage.apjd apjdVar = new defpackage.apjd(this.a);
        apjdVar.f = z;
        this.a = new defpackage.apje(apjdVar);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        defpackage.apjd apjdVar = new defpackage.apjd(this.a);
        apjdVar.b(i, java.util.concurrent.TimeUnit.MILLISECONDS);
        this.a = new defpackage.apje(apjdVar);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(java.lang.String str) throws java.net.ProtocolException {
        java.util.Set set = defpackage.apor.a;
        if (set.contains(str)) {
            this.method = str;
            return;
        }
        throw new java.net.ProtocolException("Expected one of " + java.lang.String.valueOf(set) + " but was " + str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(java.lang.String str, java.lang.String str2) {
        if (this.connected) {
            throw new java.lang.IllegalStateException("Cannot set request property after connection is made");
        }
        if (str == null) {
            throw new java.lang.NullPointerException("field == null");
        }
        if (str2 != null) {
            this.l.T(str, str2);
        }
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        if (this.j != null) {
            return true;
        }
        java.net.Proxy proxy = this.a.k;
        return (proxy == null || proxy.type() == java.net.Proxy.Type.DIRECT) ? false : true;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final java.lang.String getHeaderField(int i) {
        try {
            defpackage.apiu apiuVarA = a();
            if (i < 0 || i >= apiuVarA.a()) {
                return null;
            }
            return defpackage.aoov.bf(apiuVarA, i);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        setFixedLengthStreamingMode(i);
    }
}
