package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adia {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private byte e;

    public final defpackage.adib a() {
        if (this.e == 15) {
            return new defpackage.adhd(this.a, this.b, this.c, this.d);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" requiresUnmeteredNetwork");
        }
        if ((this.e & 2) == 0) {
            sb.append(" requiresCharging");
        }
        if ((this.e & 4) == 0) {
            sb.append(" requiresIdle");
        }
        if ((this.e & 8) == 0) {
            sb.append(" requiresBatteryNotLow");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.d = z;
        this.e = (byte) (this.e | 8);
    }

    public final void c(boolean z) {
        this.b = z;
        this.e = (byte) (this.e | 2);
    }

    public final void d(boolean z) {
        this.c = z;
        this.e = (byte) (this.e | 4);
    }

    public final void e(boolean z) {
        this.a = z;
        this.e = (byte) (this.e | 1);
    }
}
