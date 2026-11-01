package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahxs extends defpackage.ahxt implements java.io.Serializable {
    public static final defpackage.ahxs a = new defpackage.ahxs();
    private static final long serialVersionUID = 1;

    private java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.ahxt
    protected final int a(java.lang.Object obj) {
        return java.lang.System.identityHashCode(obj);
    }

    @Override // defpackage.ahxt
    protected final boolean b(java.lang.Object obj, java.lang.Object obj2) {
        return false;
    }
}
