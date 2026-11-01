package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qih {
    private boolean a;
    private byte b;

    public final defpackage.qiv a() {
        if (this.b == 7) {
            return new defpackage.qiv(this.a);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" maxProgress");
        }
        if ((this.b & 2) == 0) {
            sb.append(" progress");
        }
        if ((this.b & 4) == 0) {
            sb.append(" indeterminate");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.a = true;
        this.b = (byte) (this.b | 4);
    }

    public final void c() {
        this.b = (byte) (this.b | 2);
    }

    public final void d() {
        this.b = (byte) (this.b | 1);
    }
}
