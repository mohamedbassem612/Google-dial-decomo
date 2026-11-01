package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pfg {
    private boolean b;
    private boolean c;
    private byte e;
    private j$.util.Optional a = j$.util.Optional.empty();
    private j$.util.Optional d = j$.util.Optional.empty();

    public final defpackage.pfh a() {
        if (this.e == 3) {
            return new defpackage.pfh(this.a, this.b, this.c, this.d);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" showCallEndedMessage");
        }
        if ((this.e & 2) == 0) {
            sb.append(" shouldShow");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null bubbleInfo");
        }
        this.d = optional;
    }

    public final void c(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null callId");
        }
        this.a = optional;
    }

    public final void d(boolean z) {
        this.c = z;
        this.e = (byte) (this.e | 2);
    }

    public final void e(boolean z) {
        this.b = z;
        this.e = (byte) (this.e | 1);
    }
}
