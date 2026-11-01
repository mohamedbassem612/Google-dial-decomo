package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class obk implements pzs {
    private final /* synthetic */ int $cid;

    public obk(int i) {
        this.$cid = i;
    }

    public final aw a() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.obs obsVar = new defpackage.obs();
            amxr.g(obsVar);
            return obsVar;
        }
        if (i != 1) {
            qgw qgwVar = new qgw();
            amxr.g(qgwVar);
            return qgwVar;
        }
        defpackage.lmc lmcVar = new defpackage.lmc();
        amxr.g(lmcVar);
        return lmcVar;
    }

    public final /* synthetic */ pzp b() {
        if (this.$cid != 0) {
        }
        return pzp.p;
    }

    public final /* synthetic */ j$.util.Optional c(abvz abvzVar, long j) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.Optional.empty() : j$.util.Optional.empty();
        }
        return j$.util.Optional.empty();
    }

    public final /* synthetic */ boolean d() {
        return true;
    }

    public final /* synthetic */ boolean e() {
        return false;
    }

    public final /* synthetic */ boolean f() {
        return false;
    }
}
