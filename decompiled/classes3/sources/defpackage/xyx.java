package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xyx implements defpackage.xzq {
    private final /* synthetic */ int $cid;
    public final java.lang.Object a;

    public xyx(android.content.Context context, int i) {
        this.$cid = i;
        aooh.f(context, "appContext");
        this.a = context;
    }

    @Override // defpackage.xzq
    public final defpackage.xzp b(defpackage.xzu xzuVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.xzt(1);
        }
        if (i == 1) {
            return new opj(this);
        }
        if (i == 2) {
            return new defpackage.xzf(this.a, 0);
        }
        java.lang.Object obj = this.a;
        if (i != 3) {
            return new defpackage.xzb((android.content.Context) obj, xzuVar.a(java.lang.Integer.class, java.io.InputStream.class), 3);
        }
        return new defpackage.xzb((android.content.Context) obj, xzuVar.a(java.lang.Integer.class, android.content.res.AssetFileDescriptor.class), 3);
    }

    public xyx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public xyx(int i) {
        this.$cid = i;
        this.a = new defpackage.xff(this);
    }
}
