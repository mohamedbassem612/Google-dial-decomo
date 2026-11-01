package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeqb {
    public byte a;
    public int b;
    public defpackage.agab c;

    public final defpackage.aeqc a() {
        int i;
        defpackage.agab agabVar;
        if (this.a == 1 && (i = this.b) != 0 && (agabVar = this.c) != null) {
            return new defpackage.aeqc(i, agabVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if (this.a == 0) {
            sb.append(" chargeCounterEnabled");
        }
        if (this.c == null) {
            sb.append(" metricExtensionProvider");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
