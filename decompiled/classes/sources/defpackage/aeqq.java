package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeqq {
    public java.lang.String a;
    public defpackage.apev b;
    public java.lang.String c;
    public defpackage.aevn d;
    public aerz e;
    public java.util.function.Predicate f;
    public aeox g;
    public int h;
    private boolean i;
    private defpackage.apgu j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private byte o;

    public final defpackage.aeqr a() {
        defpackage.apgu apguVar;
        java.util.function.Predicate predicate;
        if (this.o == 31 && (apguVar = this.j) != null && (predicate = this.f) != null) {
            return new defpackage.aeqr(this.a, this.i, apguVar, this.b, this.c, this.d, this.k, this.h, this.e, this.l, this.m, predicate, this.g, this.n);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.o & 1) == 0) {
            sb.append(" isEventNameConstant");
        }
        if (this.j == null) {
            sb.append(" metric");
        }
        if ((this.o & 2) == 0) {
            sb.append(" isUnsampled");
        }
        if ((this.o & 4) == 0) {
            sb.append(" shouldAttachActiveTraces");
        }
        if ((this.o & 8) == 0) {
            sb.append(" maxActiveTraces");
        }
        if (this.f == null) {
            sb.append(" activeTracePredicate");
        }
        if ((this.o & 16) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.n = i;
        this.o = (byte) (this.o | 16);
    }

    public final void c(boolean z) {
        this.i = z;
        this.o = (byte) (this.o | 1);
    }

    public final void d(boolean z) {
        this.k = z;
        this.o = (byte) (this.o | 2);
    }

    public final void e(int i) {
        this.m = i;
        this.o = (byte) (this.o | 8);
    }

    public final void f(defpackage.apgu apguVar) {
        if (apguVar == null) {
            throw new java.lang.NullPointerException("Null metric");
        }
        this.j = apguVar;
    }

    public final void g(boolean z) {
        this.l = z;
        this.o = (byte) (this.o | 4);
    }
}
