package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class akfe implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final java.lang.String a;

    public akfe(akff akffVar) {
        this.a = akffVar.q;
    }

    private java.lang.Object readResolve() {
        return akff.a(this.a);
    }
}
