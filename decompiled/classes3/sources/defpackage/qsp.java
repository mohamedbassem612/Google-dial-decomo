package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qsp implements defpackage.pzs {
    private final aoin a;

    public qsp(aoin aoinVar) {
        this.a = aoinVar;
    }

    @Override // defpackage.pzs
    public final aw a() {
        defpackage.qsr qsrVar = new defpackage.qsr();
        amxr.g(qsrVar);
        return qsrVar;
    }

    @Override // defpackage.pzs
    public final defpackage.pzp b() {
        return ((java.lang.Boolean) this.a.a()).booleanValue() ? defpackage.pzp.VIDEO_SCREEN : defpackage.pzp.VOICE_SCREEN;
    }

    @Override // defpackage.pzs
    public final /* synthetic */ j$.util.Optional c(defpackage.abvz abvzVar, long j) {
        return j$.util.Optional.empty();
    }

    @Override // defpackage.pzs
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // defpackage.pzs
    public final boolean e() {
        return true;
    }

    @Override // defpackage.pzs
    public final boolean f() {
        return true;
    }
}
