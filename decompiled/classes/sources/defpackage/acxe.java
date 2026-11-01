package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acxe {
    public java.lang.String a;
    public defpackage.ahyn b;
    private long c;
    private defpackage.ahyn d;
    private long e;
    private byte f;
    private int g;

    public acxe() {
        defpackage.ahwt ahwtVar = defpackage.ahwt.a;
        this.b = ahwtVar;
        this.d = ahwtVar;
    }

    public final defpackage.acxf a() {
        java.lang.String str;
        int i;
        if (this.f == 3 && (str = this.a) != null && (i = this.g) != 0) {
            return new defpackage.acxf(str, this.c, i, this.b, this.d, this.e);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" tag");
        }
        if ((this.f & 1) == 0) {
            sb.append(" periodSeconds");
        }
        if (this.g == 0) {
            sb.append(" networkState");
        }
        if ((this.f & 2) == 0) {
            sb.append(" nextScheduleTimeOverride");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(defpackage.ahyn ahynVar) {
        if (ahynVar == null) {
            throw new java.lang.NullPointerException("Null flexIntervalOptional");
        }
        this.d = ahynVar;
    }

    public final void c(int i) {
        if (i == 0) {
            throw new java.lang.NullPointerException("Null networkState");
        }
        this.g = i;
    }

    public final void d(long j) {
        this.e = j;
        this.f = (byte) (this.f | 2);
    }

    public final void e(long j) {
        this.c = j;
        this.f = (byte) (this.f | 1);
    }
}
