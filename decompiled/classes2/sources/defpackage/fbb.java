package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fbb extends java.lang.Exception {
    public final boolean a;

    public fbb(int i, int i2, int i3, int i4, defpackage.eqg eqgVar, boolean z, java.lang.Exception exc) {
        java.lang.String strValueOf = java.lang.String.valueOf(eqgVar);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioTrack init failed 0 Config(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(true != z ? "" : " (recoverable)");
        super(sb.toString(), exc);
        this.a = z;
    }
}
