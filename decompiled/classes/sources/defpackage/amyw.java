package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amyw implements defpackage.amyv, defpackage.amwu {
    public static final defpackage.amyw a = new defpackage.amyw(null);
    public final java.lang.Object b;

    public amyw(java.lang.Object obj) {
        this.b = obj;
    }

    public static defpackage.amyv b(java.lang.Object obj) {
        if (obj != null) {
            return new defpackage.amyw(obj);
        }
        throw new java.lang.NullPointerException("instance cannot be null");
    }

    @Override // defpackage.aoin, defpackage.aoim
    public final java.lang.Object a() {
        return this.b;
    }
}
