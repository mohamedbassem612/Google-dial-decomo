package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vkc implements defpackage.zcs {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vkc(int i) {
        this.$cid = i;
    }

    @Override // defpackage.zcs
    public final boolean a() {
        return this.$cid != 0 || defpackage.vkf.a.contains(android.os.Build.DEVICE) || android.os.Build.BRAND.equals("google") || defpackage.vkf.b.contains(android.os.Build.DEVICE);
    }
}
