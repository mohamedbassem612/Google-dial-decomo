package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aifp implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.EnumMap a;

    public aifp(java.util.EnumMap enumMap) {
        this.a = enumMap;
    }

    java.lang.Object readResolve() {
        return new defpackage.aifq(this.a);
    }
}
