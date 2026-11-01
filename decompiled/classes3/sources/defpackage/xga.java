package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xga extends defpackage.xpv {
    public static final /* synthetic */ defpackage.xga a = new defpackage.xga();

    private xga() {
        super(defpackage.xgj.c);
    }

    public static final void d(java.lang.String str) {
        aooh.f(str, "name");
        if (str.length() <= 40) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Node name length (" + str.length() + ") exceeds maximum length of 40 characters");
    }
}
