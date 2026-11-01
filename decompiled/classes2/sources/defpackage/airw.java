package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class airw implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.lang.String a;
    private final int b;

    public airw(java.lang.String str, int i) {
        this.a = str;
        this.b = i;
    }

    private java.lang.Object readResolve() {
        return new defpackage.airx(this.a, this.b);
    }
}
