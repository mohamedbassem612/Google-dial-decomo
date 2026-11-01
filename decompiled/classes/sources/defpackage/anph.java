package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anph {
    public java.lang.Object[] d;
    public int e;
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anph.class.getName());
    public static final defpackage.ajsz f = new defpackage.ajsz((float[]) null);
    public static final defpackage.anoz b = new defpackage.anxn(1);
    static final defpackage.aish c = defpackage.aish.e.g();

    public anph(int i, java.lang.Object[] objArr) {
        this.e = i;
        this.d = objArr;
    }

    public static byte[] k(java.io.InputStream inputStream) {
        try {
            return defpackage.aisk.b(inputStream);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("failure reading serialized stream", e);
        }
    }

    private final int m() {
        java.lang.Object[] objArr = this.d;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    private final void n(int i) {
        java.lang.Object[] objArr = new java.lang.Object[i];
        if (!q()) {
            java.lang.System.arraycopy(this.d, 0, objArr, 0, a());
        }
        this.d = objArr;
    }

    private final void o(int i, byte[] bArr) {
        this.d[i << 1] = bArr;
    }

    private final void p(int i, java.lang.Object obj) {
        if (this.d instanceof byte[][]) {
            n(m());
        }
        this.d[(i << 1) + 1] = obj;
    }

    private final boolean q() {
        return this.e == 0;
    }

    public final int a() {
        return this.e << 1;
    }

    public final java.lang.Iterable b(defpackage.anpc anpcVar) {
        if (q()) {
            return null;
        }
        int i = 0;
        java.util.ArrayList arrayList = null;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (java.util.Arrays.equals(anpcVar.b, j(i2))) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(e(i2, anpcVar));
            } else {
                o(i, j(i2));
                p(i, d(i2));
                i++;
            }
        }
        java.util.Arrays.fill(this.d, i << 1, a(), (java.lang.Object) null);
        this.e = i;
        return arrayList;
    }

    public final java.lang.Object c(defpackage.anpc anpcVar) {
        int i = this.e;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!java.util.Arrays.equals(anpcVar.b, j(i)));
        return e(i, anpcVar);
    }

    public final java.lang.Object d(int i) {
        return this.d[(i << 1) + 1];
    }

    public final java.lang.Object e(int i, defpackage.anpc anpcVar) {
        anpb anpbVarA;
        java.lang.Object objD = d(i);
        if (objD instanceof byte[]) {
            return anpcVar.a((byte[]) objD);
        }
        anpe anpeVar = (anpe) objD;
        return (!anpcVar.c() || (anpbVarA = anpe.a(anpcVar)) == null) ? anpcVar.a(anpeVar.c()) : anpbVarA.b(anpeVar.b());
    }

    public final void f(defpackage.anpc anpcVar) {
        if (q()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.e; i2++) {
            if (!java.util.Arrays.equals(anpcVar.b, j(i2))) {
                o(i, j(i2));
                p(i, d(i2));
                i++;
            }
        }
        java.util.Arrays.fill(this.d, i << 1, a(), (java.lang.Object) null);
        this.e = i;
    }

    public final void g(defpackage.anph anphVar) {
        if (anphVar.q()) {
            return;
        }
        int iM = m() - a();
        if (q() || iM < anphVar.a()) {
            n(a() + anphVar.a());
        }
        java.lang.System.arraycopy(anphVar.d, 0, this.d, a(), anphVar.a());
        this.e += anphVar.e;
    }

    public final void h(defpackage.anpc anpcVar, java.lang.Object obj) {
        if (anpcVar == null) {
            throw new java.lang.NullPointerException("key");
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("value");
        }
        if (a() == 0 || a() == m()) {
            n(java.lang.Math.max(a() << 1, 8));
        }
        o(this.e, anpcVar.b);
        boolean zC = anpcVar.c();
        int i = this.e;
        if (zC) {
            anpb anpbVarA = anpe.a(anpcVar);
            anpbVarA.getClass();
            p(i, new anpe(anpbVarA, obj));
        } else {
            this.d[(i << 1) + 1] = anpcVar.b(obj);
        }
        this.e++;
    }

    public final boolean i(defpackage.anpc anpcVar) {
        for (int i = 0; i < this.e; i++) {
            if (java.util.Arrays.equals(anpcVar.b, j(i))) {
                return true;
            }
        }
        return false;
    }

    public final byte[] j(int i) {
        return (byte[]) this.d[i << 1];
    }

    public final byte[] l(int i) {
        java.lang.Object objD = d(i);
        return objD instanceof byte[] ? (byte[]) objD : ((anpe) objD).c();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Metadata(");
        for (int i = 0; i < this.e; i++) {
            if (i != 0) {
                sb.append(',');
            }
            java.lang.String str = new java.lang.String(j(i), java.nio.charset.StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(c.k(l(i)));
            } else {
                sb.append(new java.lang.String(l(i), java.nio.charset.StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public anph() {
    }

    public anph(byte[]... bArr) {
        this(bArr.length >> 1, bArr);
    }
}
