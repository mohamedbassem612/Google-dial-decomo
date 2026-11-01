package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahxr extends defpackage.ahxt implements java.io.Serializable {
    public static final defpackage.ahxr a = new defpackage.ahxr();
    private static final long serialVersionUID = 1;

    private java.lang.Object readResolve() {
        return a;
    }

    @Override // defpackage.ahxt
    protected final int a(java.lang.Object obj) {
        return obj.hashCode();
    }

    @Override // defpackage.ahxt
    protected final boolean b(java.lang.Object obj, java.lang.Object obj2) {
        return obj.equals(obj2);
    }
}
