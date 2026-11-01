package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uqn {
    private boolean a;
    private boolean b;
    private double c;
    private byte d;

    public final defpackage.uqo a() {
        if (this.d == 7) {
            return new defpackage.uqo(this.a, this.b, this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" timeOfDayEffectEnabled");
        }
        if ((this.d & 2) == 0) {
            sb.append(" missedCallEffectEnabled");
        }
        if ((this.d & 4) == 0) {
            sb.append(" recencyDecay");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 2);
    }

    public final void c(double d) {
        this.c = d;
        this.d = (byte) (this.d | 4);
    }

    public final void d(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }
}
