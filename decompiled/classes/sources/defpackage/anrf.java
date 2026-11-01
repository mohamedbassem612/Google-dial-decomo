package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anrf {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;
    public java.lang.Object g;

    public anrf() {
        this.b = "";
    }

    public static /* synthetic */ void g(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, defpackage.dsd dsdVar, defpackage.aomy aomyVar) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            dsdVar.b(aomyVar.a());
        } catch (java.lang.Throwable th) {
            dsdVar.d(th);
        }
    }

    public final defpackage.anrg a() {
        defpackage.ahvr.bZ(this.a != null, "Missing required scheme.");
        if (this.f == null) {
            defpackage.ahvr.bZ(this.g == null, "Cannot set port without host.");
            defpackage.ahvr.bZ(this.e == null, "Cannot set userInfo without host.");
        }
        return new defpackage.anrg(this);
    }

    public final void b(java.lang.String str) {
        if (str != null) {
            str = defpackage.anrg.b(str.toLowerCase(java.util.Locale.ROOT), defpackage.anrg.e);
        }
        this.f = str;
    }

    public final void c() {
        this.g = null;
    }

    public final void d(java.lang.String str) {
        java.lang.String strSubstring;
        int iIndexOf;
        if (str.startsWith("[") && str.endsWith("]") && (iIndexOf = str.indexOf(37)) > 0) {
            defpackage.anrg.e(str.substring(iIndexOf, str.length() - 1), "scope", defpackage.anrg.d, null);
        }
        int i = defpackage.aiyz.a;
        str.getClass();
        int i2 = 4;
        if (str.startsWith("[") && str.endsWith("]")) {
            strSubstring = str.substring(1, str.length() - 1);
            i2 = 16;
        } else {
            strSubstring = str;
        }
        byte[] bArrC = defpackage.aiyz.c(strSubstring, null);
        if (((bArrC == null || bArrC.length != i2) ? null : defpackage.aiyz.a(bArrC, null)) == null) {
            defpackage.anrg.e(str, "host", defpackage.anrg.e, null);
        }
        this.f = str;
    }

    public final void e(java.lang.String str) {
        if (!str.isEmpty()) {
            if (defpackage.anrg.b.get(str.charAt(0))) {
                for (int i = 0; i < str.length(); i++) {
                    if (!defpackage.anrg.c.get(str.charAt(i))) {
                        throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "Invalid character in scheme at index "));
                    }
                }
                this.a = str;
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Scheme must start with an alphabetic char");
    }

    public final void f() {
        this.e = defpackage.anrg.b(null, defpackage.anrg.f);
    }

    public anrf(char[] cArr) {
    }

    public anrf(byte[] bArr) {
        this.g = defpackage.admy.a;
    }
}
