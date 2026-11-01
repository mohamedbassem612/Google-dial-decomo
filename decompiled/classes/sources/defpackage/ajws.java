package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajws {
    public java.lang.String a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    private long e;
    private long f;
    private byte g = 3;
    private int h;

    public ajws(defpackage.ajwt ajwtVar) {
        this.a = ajwtVar.a;
        this.h = ajwtVar.g;
        this.b = ajwtVar.b;
        this.c = ajwtVar.c;
        this.e = ajwtVar.d;
        this.f = ajwtVar.e;
        this.d = ajwtVar.f;
    }

    public final defpackage.ajwt a() {
        if (this.g == 3 && this.h != 0) {
            return new defpackage.ajwt(this.a, this.h, this.b, this.c, this.e, this.f, this.d);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.h == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.g & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.g & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.e = j;
        this.g = (byte) (this.g | 1);
    }

    public final void c(int i) {
        if (i == 0) {
            throw new java.lang.NullPointerException("Null registrationStatus");
        }
        this.h = i;
    }

    public final void d(long j) {
        this.f = j;
        this.g = (byte) (this.g | 2);
    }
}
