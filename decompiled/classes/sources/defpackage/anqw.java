package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anqw {
    public static final java.util.List a;
    public static final defpackage.anqw b;
    public static final defpackage.anqw c;
    public static final defpackage.anqw d;
    public static final defpackage.anqw e;
    public static final defpackage.anqw f;
    public static final defpackage.anqw g;
    public static final defpackage.anqw h;
    public static final defpackage.anqw i;
    public static final defpackage.anqw j;
    public static final defpackage.anqw k;
    public static final defpackage.anqw l;
    static final defpackage.anpc m;
    static final defpackage.anpc n;
    private static final defpackage.anpg r;
    public final defpackage.anqt o;
    public final java.lang.String p;
    public final java.lang.Throwable q;

    static {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        for (defpackage.anqt anqtVar : defpackage.anqt.values()) {
            defpackage.anqw anqwVar = (defpackage.anqw) treeMap.put(java.lang.Integer.valueOf(anqtVar.r), new defpackage.anqw(anqtVar, null, null));
            if (anqwVar != null) {
                throw new java.lang.IllegalStateException("Code value duplication between " + anqwVar.o.name() + " & " + anqtVar.name());
            }
        }
        a = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(treeMap.values()));
        b = defpackage.anqt.OK.a();
        c = defpackage.anqt.CANCELLED.a();
        d = defpackage.anqt.UNKNOWN.a();
        defpackage.anqt.INVALID_ARGUMENT.a();
        e = defpackage.anqt.DEADLINE_EXCEEDED.a();
        defpackage.anqt.NOT_FOUND.a();
        defpackage.anqt.ALREADY_EXISTS.a();
        f = defpackage.anqt.PERMISSION_DENIED.a();
        g = defpackage.anqt.UNAUTHENTICATED.a();
        h = defpackage.anqt.RESOURCE_EXHAUSTED.a();
        i = defpackage.anqt.FAILED_PRECONDITION.a();
        defpackage.anqt.ABORTED.a();
        defpackage.anqt.OUT_OF_RANGE.a();
        j = defpackage.anqt.UNIMPLEMENTED.a();
        k = defpackage.anqt.INTERNAL.a();
        l = defpackage.anqt.UNAVAILABLE.a();
        defpackage.anqt.DATA_LOSS.a();
        defpackage.anqu anquVar = new defpackage.anqu();
        int i2 = defpackage.anpc.d;
        m = new defpackage.anpf("grpc-status", false, anquVar);
        defpackage.anqv anqvVar = new defpackage.anqv();
        r = anqvVar;
        n = new defpackage.anpf("grpc-message", false, anqvVar);
    }

    private anqw(defpackage.anqt anqtVar, java.lang.String str, java.lang.Throwable th) {
        if (anqtVar == null) {
            throw new java.lang.NullPointerException("code");
        }
        this.o = anqtVar;
        this.p = str;
        this.q = th;
    }

    public static defpackage.anph a(java.lang.Throwable th) {
        while (th != null) {
            if (th instanceof defpackage.anqx) {
                return ((defpackage.anqx) th).b;
            }
            if (th instanceof anqz) {
                return ((anqz) th).b;
            }
            th = th.getCause();
        }
        return null;
    }

    public static defpackage.anqw c(int i2) {
        if (i2 >= 0) {
            java.util.List list = a;
            if (i2 < list.size()) {
                return (defpackage.anqw) list.get(i2);
            }
        }
        return d.f(defpackage.a.bj(i2, "Unknown code "));
    }

    public static defpackage.anqw d(java.lang.Throwable th) {
        defpackage.ahvr.cj(th, "t");
        for (java.lang.Throwable cause = th; cause != null; cause = cause.getCause()) {
            if (cause instanceof defpackage.anqx) {
                return ((defpackage.anqx) cause).a;
            }
            if (cause instanceof anqz) {
                return ((anqz) cause).a;
            }
        }
        return d.e(th);
    }

    static java.lang.String g(defpackage.anqw anqwVar) {
        java.lang.String str = anqwVar.p;
        defpackage.anqt anqtVar = anqwVar.o;
        if (str == null) {
            return anqtVar.toString();
        }
        return anqtVar.toString() + ": " + str;
    }

    public final defpackage.anqw b(java.lang.String str) {
        java.lang.String str2 = this.p;
        defpackage.anqt anqtVar = this.o;
        return str2 == null ? new defpackage.anqw(anqtVar, str, this.q) : new defpackage.anqw(anqtVar, defpackage.a.bE(str, (byte) 10, str2), this.q);
    }

    public final defpackage.anqw e(java.lang.Throwable th) {
        return !j$.util.Objects.equals(this.q, th) ? new defpackage.anqw(this.o, this.p, th) : this;
    }

    public final defpackage.anqw f(java.lang.String str) {
        return !j$.util.Objects.equals(this.p, str) ? new defpackage.anqw(this.o, str, this.q) : this;
    }

    public final boolean h() {
        return defpackage.anqt.OK == this.o;
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
        ahymVarL.b("code", this.o.name());
        ahymVarL.b("description", this.p);
        java.lang.Throwable th = this.q;
        java.lang.Object objA = th;
        if (th != null) {
            objA = ahzn.a(th);
        }
        ahymVarL.b("cause", objA);
        return ahymVarL.toString();
    }
}
