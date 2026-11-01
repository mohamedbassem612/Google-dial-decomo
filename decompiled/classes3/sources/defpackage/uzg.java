package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uzg implements defpackage.otf {
    private final /* synthetic */ int $cid;

    public uzg(int i) {
        this.$cid = i;
    }

    @Override // defpackage.otf
    public final aw a() {
        if (this.$cid != 0) {
            defpackage.pxv pxvVar = new defpackage.pxv();
            amxr.g(pxvVar);
            return pxvVar;
        }
        defpackage.uzd uzdVar = new defpackage.uzd();
        amxr.g(uzdVar);
        return uzdVar;
    }

    @Override // defpackage.otf
    public final java.lang.String b() {
        return this.$cid != 0 ? "InCallDialogHostFragment" : "VideoHandoverDialogHeadlessFragment";
    }
}
