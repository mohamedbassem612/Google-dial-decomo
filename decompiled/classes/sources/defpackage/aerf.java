package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aerf {
    public float a;
    public int b;
    public byte c;
    public int d;
    private final defpackage.ahyn e = defpackage.ahwt.a;

    public final defpackage.aerg a() {
        int i;
        if (this.c == 3 && (i = this.d) != 0) {
            defpackage.aerg aergVar = new defpackage.aerg(i, this.a, this.b, this.e);
            float f = aergVar.a;
            defpackage.ahvr.bN(f > 0.0f && f <= 100.0f, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
            return aergVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" startupSamplePercentage");
        }
        if ((this.c & 2) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
