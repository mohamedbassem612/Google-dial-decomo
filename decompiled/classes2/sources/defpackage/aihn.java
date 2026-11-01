package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aihn implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final java.util.Comparator a;
    final java.lang.Object[] b;

    public aihn(java.util.Comparator comparator, java.lang.Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    java.lang.Object readResolve() {
        aihm aihmVar = new aihm(this.a);
        aihmVar.o(this.b);
        return aihmVar.m();
    }
}
