package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alib {
    public java.lang.String a;
    public java.lang.Object b;
    private boolean c;
    private int d;
    private byte e;
    private java.lang.Object f;
    private java.lang.Object g;

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Map] */
    public final defpackage.alic a() {
        ?? r1;
        java.lang.Object obj;
        java.lang.String str;
        java.lang.Object obj2;
        if (this.e == 3 && (r1 = this.b) != 0 && (obj = this.f) != null && (str = this.a) != null && (obj2 = this.g) != null) {
            return new defpackage.alic(r1, this.c, this.d, (aigf) obj, str, (java.lang.String) obj2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" inputDic");
        }
        if ((this.e & 1) == 0) {
            sb.append(" doLowerCase");
        }
        if ((this.e & 2) == 0) {
            sb.append(" maxSeqLen");
        }
        if (this.f == null) {
            sb.append(" tokenNormalizationMap");
        }
        if (this.a == null) {
            sb.append(" sepToken");
        }
        if (this.g == null) {
            sb.append(" clsToken");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null clsToken");
        }
        this.g = str;
    }

    public final void c() {
        this.c = true;
        this.e = (byte) (this.e | 1);
    }

    public final void d(int i) {
        this.d = i;
        this.e = (byte) (this.e | 2);
    }

    public final void e(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null sepToken");
        }
        this.a = str;
    }

    public final void f(aigf aigfVar) {
        if (aigfVar == null) {
            throw new java.lang.NullPointerException("Null tokenNormalizationMap");
        }
        this.f = aigfVar;
    }

    public final defpackage.tiw g() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        if (this.e == 3 && (obj = this.f) != null && (obj2 = this.b) != null && (obj3 = this.g) != null) {
            return new defpackage.tiw((defpackage.tkd) obj, (java.lang.String) obj2, this.d, (defpackage.abvz) obj3, this.a, this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.f == null) {
            sb.append(" rowClickListener");
        }
        if (this.b == null) {
            sb.append(" phoneNumber");
        }
        if ((this.e & 1) == 0) {
            sb.append(" ranking");
        }
        if (this.g == null) {
            sb.append(" calleeId");
        }
        if ((this.e & 2) == 0) {
            sb.append(" callLogSearchContact");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void h(boolean z) {
        this.c = z;
        this.e = (byte) (this.e | 2);
    }

    public final void i(defpackage.abvz abvzVar) {
        if (abvzVar == null) {
            throw new java.lang.NullPointerException("Null calleeId");
        }
        this.g = abvzVar;
    }

    public final void j(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null phoneNumber");
        }
        this.b = str;
    }

    public final void k(int i) {
        this.d = i;
        this.e = (byte) (this.e | 1);
    }

    public final void l(defpackage.tkd tkdVar) {
        if (tkdVar == null) {
            throw new java.lang.NullPointerException("Null rowClickListener");
        }
        this.f = tkdVar;
    }
}
