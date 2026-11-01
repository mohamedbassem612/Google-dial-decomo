package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yoo {
    public aify a;
    public int b;
    public int c;
    public defpackage.yom d;
    public defpackage.ymm e;
    public byte f;
    private int g;
    private int h;
    private int i;

    public final defpackage.yop a() {
        aify aifyVar;
        defpackage.yom yomVar;
        defpackage.ymm ymmVar;
        if (this.f == 127 && (aifyVar = this.a) != null && (yomVar = this.d) != null && (ymmVar = this.e) != null) {
            return new defpackage.yop(aifyVar, this.g, this.h, this.i, this.b, this.c, yomVar, ymmVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" messages");
        }
        if ((this.f & 1) == 0) {
            sb.append(" temperature");
        }
        if ((this.f & 2) == 0) {
            sb.append(" topK");
        }
        if ((this.f & 4) == 0) {
            sb.append(" targetReplyLengthMin");
        }
        if ((this.f & 8) == 0) {
            sb.append(" targetReplyLengthMax");
        }
        if ((this.f & 16) == 0) {
            sb.append(" bulletPointNum");
        }
        if ((this.f & 32) == 0) {
            sb.append(" rngSeed");
        }
        if (this.d == null) {
            sb.append(" promptArguments");
        }
        if ((this.f & 64) == 0) {
            sb.append(" overrideRequestKind");
        }
        if (this.e == null) {
            sb.append(" userProperties");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.i = 256;
        this.f = (byte) (this.f | 8);
    }

    public final void c() {
        this.h = 3;
        this.f = (byte) (this.f | 4);
    }

    public final void d() {
        this.f = (byte) (this.f | 1);
    }

    public final void e(int i) {
        this.g = i;
        this.f = (byte) (this.f | 2);
    }
}
