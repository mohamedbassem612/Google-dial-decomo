package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apij {
    private final boolean a;
    private java.lang.String[] b;
    private java.lang.String[] c;
    private boolean d;

    public apij(defpackage.apik apikVar) {
        this.a = apikVar.c;
        this.b = apikVar.e;
        this.c = apikVar.f;
        this.d = apikVar.d;
    }

    public final defpackage.apik a() {
        return new defpackage.apik(this.a, this.d, this.b, this.c);
    }

    public final void b(java.lang.String... strArr) {
        if (strArr == null) {
            defpackage.aooh.i("cipherSuites");
        }
        if (!this.a) {
            throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections");
        }
        int length = strArr.length;
        if (length == 0) {
            throw new java.lang.IllegalArgumentException("At least one cipher suite is required");
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, length);
        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
        this.b = (java.lang.String[]) objArrCopyOf;
    }

    public final void c() {
        if (!this.a) {
            throw new java.lang.IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        this.d = true;
    }

    public final void d(java.lang.String... strArr) {
        if (strArr == null) {
            defpackage.aooh.i("tlsVersions");
        }
        if (!this.a) {
            throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections");
        }
        int length = strArr.length;
        if (length == 0) {
            throw new java.lang.IllegalArgumentException("At least one TLS version is required");
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, length);
        defpackage.aooh.e(objArrCopyOf, "copyOf(...)");
        this.c = (java.lang.String[]) objArrCopyOf;
    }

    public final void e(defpackage.apii... apiiVarArr) {
        if (apiiVarArr == null) {
            defpackage.aooh.i("cipherSuites");
        }
        if (!this.a) {
            throw new java.lang.IllegalArgumentException("no cipher suites for cleartext connections");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(apiiVarArr.length);
        for (defpackage.apii apiiVar : apiiVarArr) {
            arrayList.add(apiiVar.s);
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        b((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final void f(defpackage.apjq... apjqVarArr) {
        if (!this.a) {
            throw new java.lang.IllegalArgumentException("no TLS versions for cleartext connections");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(apjqVarArr.length);
        for (defpackage.apjq apjqVar : apjqVarArr) {
            arrayList.add(apjqVar.f);
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        d((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public apij(boolean z) {
        this.a = z;
    }
}
