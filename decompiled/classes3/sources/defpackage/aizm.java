package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aizm extends java.lang.RuntimeException {
    private static final long serialVersionUID = 1;
    public final java.util.List a;

    public aizm(java.util.List list) {
        super("Cyclical graphs can not be topologically sorted.");
        this.a = list;
    }
}
