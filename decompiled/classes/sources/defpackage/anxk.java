package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anxk implements defpackage.ahzi {
    private final /* synthetic */ int $cid;

    public anxk(int i) {
        this.$cid = i;
    }

    @Override // defpackage.ahzi
    public final /* synthetic */ java.lang.Object eZ() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? java.net.ProxySelector.getDefault() : defpackage.ahyn.g(defpackage.agab.ap());
        }
        return new defpackage.ahzh();
    }
}
