package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qnx implements defpackage.pzs {
    final /* synthetic */ aoin a;

    public qnx(aoin aoinVar) {
        this.a = aoinVar;
    }

    @Override // defpackage.pzs
    public final aw a() {
        defpackage.qnr qnrVar = new defpackage.qnr();
        amxr.g(qnrVar);
        return qnrVar;
    }

    @Override // defpackage.pzs
    public final defpackage.pzp b() {
        return ((java.lang.Boolean) this.a.a()).booleanValue() ? defpackage.pzp.VIDEO_ANSWER_SCREEN : defpackage.pzp.ANSWER_SCREEN;
    }

    @Override // defpackage.pzs
    public final /* synthetic */ j$.util.Optional c(defpackage.abvz abvzVar, long j) {
        return j$.util.Optional.empty();
    }

    @Override // defpackage.pzs
    public final boolean d() {
        return false;
    }

    @Override // defpackage.pzs
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // defpackage.pzs
    public final boolean f() {
        return ((java.lang.Boolean) this.a.a()).booleanValue();
    }
}
