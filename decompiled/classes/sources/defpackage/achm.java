package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class achm implements defpackage.adui {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ achm(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [amwu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [amwu, java.lang.Object] */
    @Override // defpackage.adui
    public final java.lang.Object a(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation) {
        java.lang.String str;
        int i = this.$cid;
        int i2 = 17;
        if (i == 0) {
            return new defpackage.acgz(new defpackage.ache(this.a, "chime_versioned_identifiers", accountRepresentation, new defpackage.vkl(i2)));
        }
        if (i == 1) {
            j$.util.Objects.checkIndex(0, 3);
            if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Zwieback) {
                str = null;
            } else {
                if (!(accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Gaia)) {
                    throw new java.lang.IllegalStateException("Only Zwieback and Gaia are supported by GrowthKit");
                }
                str = ((com.google.android.libraries.notifications.platform.registration.Gaia) accountRepresentation).a;
            }
            return ((defpackage.tvn) this.a).L("ANDROID_GROWTH", str);
        }
        if (i == 2) {
            return new defpackage.acgz(new defpackage.ache(this.a, "presented_promos", accountRepresentation, new defpackage.vkl(16)));
        }
        if (i != 3) {
            return new defpackage.acgz(new defpackage.ache(this.a, "promotions", accountRepresentation, new defpackage.vkl(18)));
        }
        return new defpackage.acgz(new defpackage.ache(this.a, "eval_results", accountRepresentation, new defpackage.kuq(17)));
    }
}
