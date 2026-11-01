package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tdp implements rvd {
    private final /* synthetic */ int $cid;

    public tdp(int i) {
        this.$cid = i;
    }

    public final android.content.Intent a() {
        if (this.$cid != 0) {
            throw new java.lang.IllegalStateException("createIntent() should not be called.");
        }
        throw new java.lang.IllegalStateException("createIntent() should not be called.");
    }

    public final aw b() {
        return this.$cid != 0 ? defpackage.tav.bd() : defpackage.tdl.bd();
    }

    public final /* synthetic */ aw c(defpackage.rvq rvqVar) {
        return this.$cid != 0 ? defpackage.tav.bd() : defpackage.tdl.bd();
    }

    public final ajcq d() {
        if (this.$cid != 0) {
            throw new java.lang.IllegalStateException("getPrefActionType() should not be called.");
        }
        throw new java.lang.IllegalStateException("getPrefActionType() should not be called.");
    }

    public final ajcq e() {
        return this.$cid != 0 ? aiql.z(j$.util.Optional.empty()) : aiql.z(j$.util.Optional.empty());
    }
}
