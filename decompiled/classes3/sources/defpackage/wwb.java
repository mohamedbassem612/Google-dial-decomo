package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wwb implements defpackage.wvs {
    public static final aimz a = aimz.i("com/android/incallui/atlas/detection/techniques/asr/AsrModelResultThrottledEmitFn");
    public final defpackage.wvs b;
    public final java.util.concurrent.Executor c;
    public j$.util.Optional d = j$.util.Optional.empty();
    public boolean e = false;
    private final ajcu f;
    private final aoin g;

    public wwb(defpackage.wvs wvsVar, ajcu ajcuVar, aoin aoinVar) {
        this.b = wvsVar;
        this.f = ajcuVar;
        this.g = aoinVar;
        this.c = new ajdc(ajcuVar);
    }

    @Override // defpackage.wvs
    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj) {
        agsm.i(1125, ahvr.E(new defpackage.wdm(this, obj, 3, null), this.c), "failed to emit result", new java.lang.Object[0]);
    }

    public final void b() {
        agsm.i(1126, ahvr.H(this.f.c(new defpackage.vnc(5), ((java.lang.Long) this.g.a()).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS), new defpackage.wrn(this, 4), this.c), "failed to emit throttled results", new java.lang.Object[0]);
    }
}
