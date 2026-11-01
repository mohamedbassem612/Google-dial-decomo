package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aifr implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.EnumSet a;

    public aifr(java.util.EnumSet enumSet) {
        this.a = enumSet;
    }

    java.lang.Object readResolve() {
        return new aifs(this.a.clone());
    }
}
