package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class mgh implements defpackage.mfx {
    private final /* synthetic */ int $cid;

    public /* synthetic */ mgh(int i) {
        this.$cid = i;
    }

    @Override // defpackage.mfx
    public final j$.util.Optional a(java.lang.Object obj) {
        if (this.$cid != 0) {
            return ((java.lang.Boolean) obj).booleanValue() ? j$.util.Optional.of(new defpackage.kaw(defpackage.mhc.a)) : j$.util.Optional.empty();
        }
        return j$.util.Optional.of(new defpackage.kaw(defpackage.gus.au(((java.lang.Integer) obj).intValue())));
    }
}
