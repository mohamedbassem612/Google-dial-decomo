package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uae {
    public static final aimz a = aimz.i("com/android/dialer/sonic/impl/service/SonicPreconditions");
    public final uav b;
    public final defpackage.tzl c;
    public final ajct d;
    public final defpackage.uss e;
    private final defpackage.afpl f;

    public uae(defpackage.afpl afplVar, uav uavVar, defpackage.uss ussVar, defpackage.tzl tzlVar, ajct ajctVar) {
        this.f = afplVar;
        this.b = uavVar;
        this.e = ussVar;
        this.c = tzlVar;
        this.d = ajctVar;
    }

    public final ajcq a() {
        hgb.c(a.b(), "evaluating preconditions", "com/android/dialer/sonic/impl/service/SonicPreconditions", "arePreconditionsSatisfied", 'G', "SonicPreconditions.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
        ajcq ajcqVarX = this.f.X();
        defpackage.tbp tbpVar = new defpackage.tbp(20);
        ajct ajctVar = this.d;
        return ahvr.I(ahvr.H(ajcqVarX, tbpVar, ajctVar), new defpackage.tct(this, 15), ajctVar);
    }
}
