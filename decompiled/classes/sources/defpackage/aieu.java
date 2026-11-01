package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aieu implements java.lang.Iterable {
    private final java.lang.Iterable a;

    public aieu(java.lang.Iterable iterable) {
        defpackage.ahvr.ci(iterable);
        this.a = iterable;
    }

    public static defpackage.aieu a(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        return b(iterable, iterable2);
    }

    public static defpackage.aieu b(java.lang.Iterable... iterableArr) {
        for (java.lang.Iterable iterable : iterableArr) {
            iterable.getClass();
        }
        return new defpackage.aiet(iterableArr);
    }

    public static defpackage.aieu c(java.lang.Iterable iterable) {
        return iterable instanceof defpackage.aieu ? (defpackage.aieu) iterable : new aieq(iterable, iterable);
    }

    public final java.lang.Iterable d() {
        java.lang.Iterable iterable = this.a;
        return iterable != null ? iterable : this;
    }

    public final java.lang.String toString() {
        return defpackage.ahvr.bn(d());
    }

    protected aieu() {
        this.a = null;
    }
}
