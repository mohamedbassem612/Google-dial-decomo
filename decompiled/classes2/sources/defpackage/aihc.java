package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aihc implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.lang.Object[] a;

    public aihc(java.lang.Object[] objArr) {
        this.a = objArr;
    }

    java.lang.Object readResolve() {
        return aihd.p(this.a);
    }
}
