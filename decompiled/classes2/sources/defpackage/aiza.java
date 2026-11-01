package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiza {
    private static final ahxn b = ahxn.m(".。．｡");
    private static final ahzf c = ahzf.b('.');
    private static final ahxn d;
    private static final ahxn e;
    private static final ahxn f;
    private static final ahxn g;
    public final java.lang.String a;
    private final aify h;

    static {
        ahxn ahxnVarM = ahxn.m("-_");
        d = ahxnVarM;
        ahxc ahxcVar = new ahxc('0', '9');
        e = ahxcVar;
        ahxl ahxlVar = new ahxl(new ahxc('a', 'z'), new ahxc('A', 'Z'));
        f = ahxlVar;
        g = new ahxl(new ahxl(ahxcVar, ahxlVar), ahxnVarM);
    }

    public aiza(java.lang.String str) {
        java.lang.String strP = ahvr.p(b.j(str));
        boolean z = false;
        strP = strP.endsWith(".") ? strP.substring(0, strP.length() - 1) : strP;
        ahvr.bR(strP.length() <= 253, "Domain name too long: '%s':", strP);
        this.a = strP;
        aify aifyVarJ = aify.j(c.h(strP));
        this.h = aifyVarJ;
        ahvr.bR(aifyVarJ.size() <= 127, "Domain has too many parts: '%s'", strP);
        int size = aifyVarJ.size() - 1;
        if (a((java.lang.String) aifyVarJ.get(size), true)) {
            for (int i = 0; i < size; i++) {
                if (a((java.lang.String) aifyVarJ.get(i), false)) {
                }
            }
            z = true;
        }
        ahvr.bR(z, "Not a valid domain name: '%s'", strP);
    }

    private static boolean a(java.lang.String str, boolean z) {
        if (str.length() <= 0 || str.length() > 63) {
            return false;
        }
        if (!g.h(new defpackage.ahxj(ahwz.a).g(str))) {
            return false;
        }
        ahxn ahxnVar = d;
        if (ahxnVar.c(str.charAt(0)) || ahxnVar.c(str.charAt(str.length() - 1))) {
            return false;
        }
        return (z && e.c(str.charAt(0))) ? false : true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aiza) {
            return this.a.equals(((defpackage.aiza) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a;
    }
}
