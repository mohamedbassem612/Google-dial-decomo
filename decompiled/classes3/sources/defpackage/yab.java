package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yab implements defpackage.xzq {
    public static final defpackage.yab a = new defpackage.yab(1, null);
    private final /* synthetic */ int $cid;

    public yab(int i) {
        this.$cid = i;
    }

    @Override // defpackage.xzq
    public final defpackage.xzp b(defpackage.xzu xzuVar) {
        defpackage.xzp yacVar;
        int i = this.$cid;
        if (i == 0) {
            yacVar = new defpackage.yac(xzuVar.a(defpackage.xzg.class, java.io.InputStream.class));
        } else {
            if (i == 1) {
                return defpackage.xzt.a;
            }
            if (i != 2) {
                return i != 3 ? new defpackage.aekz(xzuVar, 2) : new defpackage.aekz(xzuVar, 1);
            }
            yacVar = new defpackage.xzf(xzuVar.a(defpackage.xzg.class, java.io.InputStream.class), 6);
        }
        return yacVar;
    }

    @java.lang.Deprecated
    public yab(int i, byte[] bArr) {
        this.$cid = i;
    }
}
