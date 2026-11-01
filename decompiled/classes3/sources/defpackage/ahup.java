package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahup extends java.lang.Exception {
    private final java.lang.String a;
    private final int b;

    public ahup(java.lang.String str, int i) {
        super(str, null);
        this.a = str;
        this.b = i;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.a);
        sb.append(" [errorCode=\"");
        int i = this.b;
        if (i == 1) {
            str = "CANCELED";
        } else if (i != 2) {
            str = i != 3 ? "null" : "UNIMPLEMENTED";
        } else {
            str = "ABORTED";
        }
        sb.append((java.lang.Object) str);
        sb.append("\"]");
        return sb.toString();
    }
}
