package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anxo {
    public static final defpackage.anpc b;
    public static final defpackage.anpc c;
    public static final defpackage.anpc d;
    public static final defpackage.anpc e;
    public static final defpackage.anpc f;
    static final defpackage.anpc g;
    public static final defpackage.anpc h;
    public static final defpackage.anpc i;
    public static final defpackage.anpc j;
    public static final defpackage.ahzf k;
    public static final long l;
    public static final defpackage.anqi m;
    public static final defpackage.anma n;
    public static final defpackage.aode o;
    public static final defpackage.aode p;
    public static final defpackage.ahzi q;
    private static final defpackage.anmg t;
    private static final java.util.logging.Logger r = java.util.logging.Logger.getLogger(defpackage.anxo.class.getName());
    private static final java.util.Set s = j$.util.DesugarCollections.unmodifiableSet(java.util.EnumSet.of(defpackage.anqt.OK, defpackage.anqt.INVALID_ARGUMENT, defpackage.anqt.NOT_FOUND, defpackage.anqt.ALREADY_EXISTS, defpackage.anqt.FAILED_PRECONDITION, defpackage.anqt.ABORTED, defpackage.anqt.OUT_OF_RANGE, defpackage.anqt.DATA_LOSS));
    public static final java.nio.charset.Charset a = java.nio.charset.Charset.forName("US-ASCII");

    static {
        defpackage.anxn anxnVar = new defpackage.anxn(0);
        int i2 = defpackage.anpc.d;
        b = new defpackage.anoy("grpc-timeout", anxnVar);
        c = new defpackage.anoy("grpc-encoding", defpackage.anph.b);
        d = defpackage.annu.a("grpc-accept-encoding", new defpackage.anxl());
        e = new defpackage.anoy("content-encoding", defpackage.anph.b);
        f = defpackage.annu.a("accept-encoding", new defpackage.anxl());
        g = new defpackage.anoy("content-length", defpackage.anph.b);
        h = new defpackage.anoy("content-type", defpackage.anph.b);
        i = new defpackage.anoy("te", defpackage.anph.b);
        j = new defpackage.anoy("user-agent", defpackage.anph.b);
        k = defpackage.ahzf.b(',').f();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        l = 20000000000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.HOURS;
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.SECONDS;
        java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.MINUTES;
        m = new defpackage.aoav();
        n = new defpackage.anma("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        t = new defpackage.anmg();
        o = new defpackage.anxj();
        p = new defpackage.aoew(1);
        q = new defpackage.anxk(0);
    }

    private anxo() {
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0029  */
    /* JADX WARN: Code duplicated, block: B:25:0x0035  */
    public static defpackage.anqw a(int i2) {
        defpackage.anqt anqtVar;
        if ((i2 >= 100 && i2 < 200) || i2 == 400) {
            anqtVar = defpackage.anqt.INTERNAL;
        } else if (i2 == 401) {
            anqtVar = defpackage.anqt.UNAUTHENTICATED;
        } else if (i2 == 403) {
            anqtVar = defpackage.anqt.PERMISSION_DENIED;
        } else if (i2 == 404) {
            anqtVar = defpackage.anqt.UNIMPLEMENTED;
        } else if (i2 == 429) {
            anqtVar = defpackage.anqt.UNAVAILABLE;
        } else if (i2 != 431) {
            switch (i2) {
                case 502:
                case 503:
                case 504:
                    anqtVar = defpackage.anqt.UNAVAILABLE;
                    break;
                default:
                    anqtVar = defpackage.anqt.UNKNOWN;
                    break;
            }
        } else {
            anqtVar = defpackage.anqt.INTERNAL;
        }
        return anqtVar.a().f(defpackage.a.bj(i2, "HTTP status code "));
    }

    public static defpackage.anqw b(defpackage.anqw anqwVar) {
        defpackage.ahvr.bM(anqwVar != null);
        java.util.Set set = s;
        defpackage.anqt anqtVar = anqwVar.o;
        if (!set.contains(anqtVar)) {
            return anqwVar;
        }
        return defpackage.anqw.k.f("Inappropriate status code from control plane: " + anqtVar.toString() + ' ' + anqwVar.p).e(anqwVar.q);
    }

    static defpackage.anvs c(anoh anohVar, boolean z) {
        defpackage.anvs anvsVarA;
        anut anutVar = anohVar.b;
        if (anutVar != null) {
            anut anutVar2 = anutVar;
            defpackage.ahvr.bZ(anutVar2.g, "Subchannel is not started");
            anvsVarA = anutVar2.f.a();
        } else {
            anvsVarA = null;
        }
        if (anvsVarA != null) {
            return anvsVarA;
        }
        defpackage.anqw anqwVar = anohVar.c;
        if (anqwVar.h()) {
            return null;
        }
        if (anohVar.d) {
            return new anwz(b(anqwVar), anvq.c);
        }
        if (z) {
            return null;
        }
        return new anwz(b(anqwVar), anvq.a);
    }

    public static java.lang.String d(java.lang.String str, int i2) {
        java.lang.String str2;
        int i3;
        try {
            str2 = str;
            i3 = i2;
            try {
                return new java.net.URI(null, null, str2, i3, null, null, null).getAuthority();
            } catch (java.net.URISyntaxException e2) {
                e = e2;
                throw new java.lang.IllegalArgumentException("Invalid host or port: " + str2 + ' ' + i3, e);
            }
        } catch (java.net.URISyntaxException e3) {
            e = e3;
            str2 = str;
            i3 = i2;
        }
    }

    public static java.lang.String e(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append("/1.86.0-SNAPSHOT");
        return sb.toString();
    }

    public static java.net.URI f(java.lang.String str) {
        java.lang.String str2;
        defpackage.ahvr.cj(str, "authority");
        try {
            str2 = str;
            try {
                return new java.net.URI(null, str2, null, null, null);
            } catch (java.net.URISyntaxException e2) {
                e = e2;
                throw new java.lang.IllegalArgumentException("Invalid authority: ".concat(java.lang.String.valueOf(str2)), e);
            }
        } catch (java.net.URISyntaxException e3) {
            e = e3;
            str2 = str;
        }
    }

    static void g(aodl aodlVar) {
        while (true) {
            java.io.InputStream inputStreamG = aodlVar.g();
            if (inputStreamG == null) {
                return;
            } else {
                h(inputStreamG);
            }
        }
    }

    public static void h(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException e2) {
                r.logp(java.util.logging.Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (java.lang.Throwable) e2);
            }
        }
    }

    public static boolean i(defpackage.anmb anmbVar) {
        return !java.lang.Boolean.TRUE.equals(anmbVar.f(n));
    }

    public static java.util.concurrent.ThreadFactory j(java.lang.String str) {
        defpackage.annk annkVar = new defpackage.annk(null, null, null);
        annkVar.n(true);
        annkVar.o(str);
        return defpackage.annk.p(annkVar);
    }

    public static defpackage.anmg[] k(defpackage.anmb anmbVar, int i2, boolean z, boolean z2) {
        java.util.List list = anmbVar.d;
        int size = list.size();
        defpackage.anmg[] anmgVarArr = new defpackage.anmg[size + 1];
        defpackage.ahvr.cj(anmbVar, "callOptions cannot be null");
        for (int i3 = 0; i3 < list.size(); i3++) {
            anmgVarArr[i3] = ((defpackage.anty) list.get(i3)).b();
        }
        anmgVarArr[size] = t;
        return anmgVarArr;
    }
}
