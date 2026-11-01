package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anzn extends defpackage.anot {
    private static final defpackage.aoag B;
    private static final defpackage.anmy C;
    private static final defpackage.anmk D;
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anzn.class.getName());
    static final long b;
    static final long c;
    static final java.util.regex.Pattern d;
    public static final java.lang.reflect.Method e;
    final defpackage.aooc A = new defpackage.aooc();
    defpackage.aoag f;
    public defpackage.aoag g;
    public final java.util.List h;
    public defpackage.anpy i;
    final java.util.List j;
    public final java.lang.String k;
    public java.util.IdentityHashMap l;
    public java.lang.String m;
    final java.lang.String n;
    public defpackage.anmy o;
    public defpackage.anmk p;
    long q;
    final defpackage.anno r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    final java.util.List x;
    public final defpackage.anzi y;
    public final defpackage.anzh z;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        b = 1800000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
        c = 1000L;
        B = new defpackage.aodg(defpackage.anxo.o, 0);
        C = defpackage.anmy.b;
        D = defpackage.anmk.a;
        d = java.util.regex.Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
        java.lang.reflect.Method declaredMethod = null;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("antz");
            java.lang.Class<?> cls2 = java.lang.Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (java.lang.ClassNotFoundException e2) {
            a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (java.lang.Throwable) e2);
        } catch (java.lang.NoSuchMethodException e3) {
            a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (java.lang.Throwable) e3);
        }
        e = declaredMethod;
    }

    public anzn(java.net.SocketAddress socketAddress, java.lang.String str, defpackage.anzi anziVar) {
        defpackage.aoag aoagVar = B;
        this.f = aoagVar;
        this.g = aoagVar;
        this.h = new java.util.ArrayList();
        this.i = defpackage.anpy.b();
        this.j = new java.util.ArrayList();
        this.n = "pick_first";
        this.o = C;
        this.p = D;
        this.q = b;
        this.r = defpackage.anno.b;
        this.s = true;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = new java.util.ArrayList();
        this.k = b(socketAddress);
        this.y = anziVar;
        defpackage.anpy anpyVar = new defpackage.anpy();
        anpyVar.e(new defpackage.anzk(socketAddress, str));
        this.i = anpyVar;
        this.z = new defpackage.anzm();
        defpackage.ajsz.dr();
    }

    static java.lang.String b(java.net.SocketAddress socketAddress) {
        try {
            return new java.net.URI("directaddress", "", "/" + java.lang.String.valueOf(socketAddress), null).toString();
        } catch (java.net.URISyntaxException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public static defpackage.apni h(java.lang.String str, defpackage.anpy anpyVar) {
        java.net.URI uri;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            uri = new java.net.URI(str);
        } catch (java.net.URISyntaxException e2) {
            sb.append(e2.getMessage());
            uri = null;
        }
        defpackage.anpw anpwVarA = uri != null ? anpyVar.a(uri.getScheme()) : null;
        if (anpwVarA == null && !d.matcher(str).matches()) {
            try {
                java.net.URI uri2 = new java.net.URI(anpyVar.c(), "", "/" + str, null);
                uri = uri2;
                anpwVarA = anpyVar.a(uri2.getScheme());
            } catch (java.net.URISyntaxException e3) {
                throw new java.lang.IllegalArgumentException(e3);
            }
        }
        if (anpwVarA == null) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Could not find a NameResolverProvider for %s%s", str, sb.length() > 0 ? defpackage.a.bG((byte) 41, sb, " (") : ""));
        }
        return new defpackage.apni(new aods(uri), anpwVarA);
    }

    public static defpackage.apni i(java.lang.String str, defpackage.anpy anpyVar) {
        char c2;
        defpackage.anrg anrgVarA;
        int i;
        int i2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char c3 = 0;
        try {
            try {
                java.util.BitSet bitSet = defpackage.anrg.a;
                try {
                    defpackage.anrf anrfVar = new defpackage.anrf();
                    int length = str.length();
                    int i3 = 0;
                    while (true) {
                        i = -1;
                        if (i3 < length) {
                            char cCharAt = str.charAt(i3);
                            if (cCharAt == ':') {
                                break;
                            }
                            if (cCharAt != '/' && cCharAt != '?' && cCharAt != '#') {
                                i3++;
                            }
                            throw new java.net.URISyntaxException(str, e.getMessage());
                        }
                        i3 = -1;
                        break;
                    }
                    try {
                        if (i3 < 0) {
                            throw new java.lang.IllegalArgumentException("Missing required scheme.");
                        }
                        anrfVar.e(str.substring(0, i3));
                        int i4 = i3 + 1;
                        int i5 = i3 + 2;
                        if (i5 < length) {
                            c2 = 1;
                            try {
                                if (str.charAt(i4) == '/' && str.charAt(i5) == '/') {
                                    int i6 = i3 + 3;
                                    i4 = i6;
                                    while (i4 < length) {
                                        char cCharAt2 = str.charAt(i4);
                                        if (cCharAt2 == '/' || cCharAt2 == '?' || cCharAt2 == '#') {
                                            break;
                                        }
                                        i4++;
                                    }
                                    java.lang.String strSubstring = str.substring(i6, i4);
                                    if (strSubstring == null) {
                                        anrfVar.f();
                                        anrfVar.b(null);
                                        anrfVar.c();
                                        c3 = 0;
                                    } else {
                                        int iIndexOf = strSubstring.indexOf(64);
                                        if (iIndexOf >= 0) {
                                            java.lang.String strSubstring2 = strSubstring.substring(0, iIndexOf);
                                            c3 = 0;
                                            defpackage.anrg.e(strSubstring2, "userInfo", defpackage.anrg.f, null);
                                            anrfVar.e = strSubstring2;
                                            i2 = iIndexOf + 1;
                                        } else {
                                            c3 = 0;
                                            anrfVar.f();
                                            i2 = 0;
                                        }
                                        for (int length2 = strSubstring.length() - 1; length2 >= i2; length2--) {
                                            char cCharAt3 = strSubstring.charAt(length2);
                                            if (cCharAt3 == ':') {
                                                i = length2;
                                                break;
                                            }
                                            if (cCharAt3 == ']' || !defpackage.anrg.a.get(cCharAt3)) {
                                                break;
                                            }
                                        }
                                        if (i < 0) {
                                            anrfVar.d(strSubstring.substring(i2));
                                            anrfVar.c();
                                        } else {
                                            anrfVar.d(strSubstring.substring(i2, i));
                                            java.lang.String strSubstring3 = strSubstring.substring(i + 1);
                                            if (strSubstring3 != null && !strSubstring3.isEmpty()) {
                                                try {
                                                    java.lang.Integer.parseInt(strSubstring3);
                                                } catch (java.lang.NumberFormatException e2) {
                                                    throw new java.lang.IllegalArgumentException("Invalid port", e2);
                                                }
                                            }
                                            anrfVar.g = strSubstring3;
                                        }
                                    }
                                } else {
                                    c3 = 0;
                                }
                            } catch (java.lang.IllegalArgumentException e3) {
                                e = e3;
                            } catch (java.net.URISyntaxException e4) {
                                e = e4;
                                sb.append(e.getMessage());
                                anrgVarA = null;
                            }
                        } else {
                            c3 = 0;
                            c2 = 1;
                        }
                        int i7 = i4;
                        while (i7 < length) {
                            char cCharAt4 = str.charAt(i7);
                            if (cCharAt4 == '?' || cCharAt4 == '#') {
                                break;
                            }
                            i7++;
                        }
                        java.lang.String strSubstring4 = str.substring(i4, i7);
                        if (strSubstring4 == null) {
                            throw new java.lang.IllegalArgumentException("Path can be empty but not null");
                        }
                        defpackage.anrg.d(strSubstring4, null);
                        anrfVar.b = strSubstring4;
                        if (i7 < length && str.charAt(i7) == '?') {
                            int i8 = i7 + 1;
                            int i9 = i8;
                            while (i9 < length && str.charAt(i9) != '#') {
                                i9++;
                            }
                            java.lang.String strSubstring5 = str.substring(i8, i9);
                            if (strSubstring5 != null) {
                                defpackage.anrg.e(strSubstring5, "query", defpackage.anrg.i, null);
                            }
                            anrfVar.c = strSubstring5;
                            i7 = i9;
                        }
                        if (i7 < length && str.charAt(i7) == '#') {
                            java.lang.String strSubstring6 = str.substring(i7 + 1);
                            if (strSubstring6 != null) {
                                defpackage.anrg.e(strSubstring6, "fragment", defpackage.anrg.j, null);
                            }
                            anrfVar.d = strSubstring6;
                        }
                        anrgVarA = anrfVar.a();
                        defpackage.anpw anpwVarA = anrgVarA != null ? anpyVar.a(anrgVarA.k) : null;
                        if (anpwVarA == null && !d.matcher(str).matches()) {
                            java.lang.String strC = anpyVar.c();
                            java.util.BitSet bitSet2 = defpackage.anrg.a;
                            defpackage.anrf anrfVar2 = new defpackage.anrf();
                            anrfVar2.e(strC.toLowerCase(java.util.Locale.ROOT));
                            anrfVar2.b("");
                            anrfVar2.b = defpackage.anrg.b("/".concat(java.lang.String.valueOf(str)), defpackage.anrg.h);
                            anrgVarA = anrfVar2.a();
                            anpwVarA = anpyVar.a(anrgVarA.k);
                        }
                        if (anpwVarA != null) {
                            return new defpackage.apni(new defpackage.aodr(anrgVarA), anpwVarA);
                        }
                        java.lang.String strBG = sb.length() > 0 ? defpackage.a.bG((byte) 41, sb, " (") : "";
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[c3] = str;
                        objArr[c2] = strBG;
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Could not find a NameResolverProvider for %s%s", objArr));
                    } catch (java.lang.IllegalArgumentException e5) {
                        e = e5;
                    }
                } catch (java.lang.IllegalArgumentException e6) {
                    e = e6;
                }
                throw new java.net.URISyntaxException(str, e.getMessage());
            } catch (java.net.URISyntaxException e7) {
                e = e7;
                c2 = 1;
            }
        } catch (java.net.URISyntaxException e8) {
            e = e8;
        }
    }

    @Override // defpackage.anot
    public final defpackage.anor a() {
        throw null;
    }

    public final void c(java.util.concurrent.Executor executor) {
        if (executor != null) {
            this.f = new defpackage.aodg(executor, 1);
        } else {
            this.f = B;
        }
    }

    public final void d(long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.ahvr.bQ(j > 0, "idle timeout is %s, but must be positive", j);
        if (timeUnit.toDays(j) >= 30) {
            this.q = -1L;
        } else {
            this.q = java.lang.Math.max(timeUnit.toMillis(j), c);
        }
    }

    @Override // defpackage.anot
    public final /* bridge */ /* synthetic */ void e(java.util.List list) {
        throw null;
    }

    @Override // defpackage.anot
    public final /* bridge */ /* synthetic */ void f(java.util.concurrent.Executor executor) {
        if (executor != null) {
            this.g = new defpackage.aodg(executor, 1);
        } else {
            this.g = B;
        }
    }

    public final void g(java.util.List list) {
        this.h.addAll(list);
    }

    public anzn(java.lang.String str, defpackage.anzi anziVar, defpackage.anzh anzhVar) {
        defpackage.aoag aoagVar = B;
        this.f = aoagVar;
        this.g = aoagVar;
        this.h = new java.util.ArrayList();
        this.i = defpackage.anpy.b();
        this.j = new java.util.ArrayList();
        this.n = "pick_first";
        this.o = C;
        this.p = D;
        this.q = b;
        this.r = defpackage.anno.b;
        this.s = true;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = new java.util.ArrayList();
        if (str != null) {
            this.k = str;
            this.y = anziVar;
            this.z = anzhVar;
            this.i = defpackage.anpy.b();
            defpackage.ajsz.dr();
            return;
        }
        throw new java.lang.NullPointerException("target");
    }
}
