package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xzt implements defpackage.xzp {
    public static final defpackage.xzt a = new defpackage.xzt(2, null);
    private final /* synthetic */ int $cid;

    public xzt(int i) {
        this.$cid = i;
    }

    @Override // defpackage.xzp
    public final boolean a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return false;
        }
        if (i == 1) {
            return obj.toString().startsWith("data:image");
        }
        return true;
    }

    @Override // defpackage.xzp
    public final ucm b(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        int i3 = this.$cid;
        if (i3 != 0) {
            return i3 != 1 ? new ucm(new defpackage.yfn(obj), new defpackage.xzx(obj, 0)) : new ucm(new defpackage.yfn(obj), new defpackage.xyw(obj.toString()));
        }
        return null;
    }

    @java.lang.Deprecated
    public xzt(int i, char[] cArr) {
        this.$cid = i;
    }
}
