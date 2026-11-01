package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acxc {
    private boolean a;
    private boolean b;
    private boolean c;
    private byte d;

    public final defpackage.acxd a() {
        if (this.d == 7) {
            return new defpackage.acxd(this.a, this.b, this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" requiresDeviceIdle");
        }
        if ((this.d & 2) == 0) {
            sb.append(" requiresCharging");
        }
        if ((this.d & 4) == 0) {
            sb.append(" requiresBatteryNotLow");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }

    public final void c(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 2);
    }

    public final void d(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }
}
