package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aoze implements defpackage.aozc {
    private final /* synthetic */ int $cid;

    public aoze(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aozc
    public final defpackage.aoxh a(defpackage.aozh aozhVar) {
        return this.$cid != 0 ? new defpackage.edg(defpackage.aoyz.a, 13) : new defpackage.edg(aozhVar, 14);
    }

    public final java.lang.String toString() {
        return this.$cid != 0 ? "SharingStarted.Eagerly" : "SharingStarted.Lazily";
    }
}
