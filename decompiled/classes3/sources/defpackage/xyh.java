package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xyh implements defpackage.ygf {
    private final /* synthetic */ int $cid;

    public xyh(defpackage.uyg uygVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(uygVar);
    }

    public static final defpackage.xyi b() {
        try {
            return new defpackage.xyi(java.security.MessageDigest.getInstance("SHA-256"));
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // defpackage.ygf
    public final /* synthetic */ java.lang.Object a() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? new java.util.ArrayList() : new defpackage.xxd();
        }
        return b();
    }

    public xyh(int i) {
        this.$cid = i;
    }
}
