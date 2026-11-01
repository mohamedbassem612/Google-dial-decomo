package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xyp implements defpackage.xzq, defpackage.xyo {
    private final /* synthetic */ int $cid;
    private final android.content.res.AssetManager a;

    public xyp(android.content.res.AssetManager assetManager, int i) {
        this.$cid = i;
        this.a = assetManager;
    }

    @Override // defpackage.xyo
    public final defpackage.xvb a(android.content.res.AssetManager assetManager, java.lang.String str) {
        return this.$cid != 0 ? new defpackage.xvi(assetManager, str) : new defpackage.xvq(assetManager, str);
    }

    @Override // defpackage.xzq
    public final defpackage.xzp b(defpackage.xzu xzuVar) {
        return this.$cid != 0 ? new defpackage.xzb(this.a, this, 1) : new defpackage.xzb(this.a, this, 1);
    }
}
