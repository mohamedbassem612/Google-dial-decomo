package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qif {
    public java.lang.Integer a;
    public java.lang.Integer b;
    public byte c;
    private defpackage.qid d;
    private defpackage.qic e;
    private java.lang.String f;
    private int g;
    private boolean h;

    public final defpackage.qib a() {
        int i = ~this.c;
        if ((i & 103) == 0) {
            defpackage.qid qidVar = this.d;
            defpackage.qic qicVar = this.e;
            java.lang.String str = this.f;
            java.lang.Integer num = this.a;
            java.lang.Integer num2 = this.b;
            int i2 = this.g;
            boolean z = this.h;
            if ((i & 8) != 0) {
                num = null;
            }
            return new defpackage.qib(qidVar, qicVar, str, num, (i & 16) == 0 ? num2 : null, i2, z, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" priority");
        }
        if ((this.c & 2) == 0) {
            sb.append(" position");
        }
        if ((this.c & 4) == 0) {
            sb.append(" label");
        }
        if ((this.c & 32) == 0) {
            sb.append(" iconResId");
        }
        if ((this.c & 64) == 0) {
            sb.append(" shouldStartInCallActivity");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.g = i;
        this.c = (byte) (this.c | 32);
    }

    public final void c(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null label");
        }
        this.f = str;
        this.c = (byte) (this.c | 4);
    }

    public final void d(defpackage.qic qicVar) {
        this.e = qicVar;
        this.c = (byte) (this.c | 2);
    }

    public final void e(defpackage.qid qidVar) {
        this.d = qidVar;
        this.c = (byte) (this.c | 1);
    }

    public final void f(boolean z) {
        this.h = z;
        this.c = (byte) (this.c | 64);
    }

    public final /* synthetic */ void g(j$.util.Optional optional) {
        aooh.f(optional, "color");
        this.b = (java.lang.Integer) aooh.q(optional);
        this.c = (byte) (this.c | 16);
    }

    public final /* synthetic */ void h(j$.util.Optional optional) {
        aooh.f(optional, "color");
        this.a = (java.lang.Integer) aooh.q(optional);
        this.c = (byte) (this.c | 8);
    }
}
