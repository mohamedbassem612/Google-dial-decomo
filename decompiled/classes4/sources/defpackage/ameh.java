package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ameh {
    public defpackage.amel a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private byte g = 31;

    public ameh(defpackage.amen amenVar) {
        this.b = amenVar.b;
        this.c = amenVar.c;
        this.a = amenVar.d;
        this.d = amenVar.e;
        this.e = amenVar.f;
        this.f = amenVar.g;
    }

    public final defpackage.amen a() {
        if (this.g == 31 && this.a != null) {
            return new defpackage.amen(this.b, this.c, this.a, this.d, this.e, this.f);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" minimalCharacters");
        }
        if ((this.g & 2) == 0) {
            sb.append(" minimalTokens");
        }
        if (this.a == null) {
            sb.append(" infoEndpointer");
        }
        if ((this.g & 4) == 0) {
            sb.append(" commaHintThreshold");
        }
        if ((this.g & 8) == 0) {
            sb.append(" dotHintThreshold");
        }
        if ((this.g & 16) == 0) {
            sb.append(" segmentHintThreshold");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.g = (byte) (this.g | 4);
    }

    public final void c(int i) {
        this.e = i;
        this.g = (byte) (this.g | 8);
    }

    public final void d(int i) {
        this.b = i;
        this.g = (byte) (this.g | 1);
    }

    public final void e(int i) {
        this.c = i;
        this.g = (byte) (this.g | 2);
    }

    public final void f(int i) {
        this.f = i;
        this.g = (byte) (this.g | 16);
    }
}
