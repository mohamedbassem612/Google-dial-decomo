package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kxj implements defpackage.olu {
    public static final aimz a = aimz.i("com/android/dialer/callrecording/impl/psd/CallNetworkPsdIntegration");
    private final ajct b;
    private final afpl c;

    public kxj(afpl afplVar, ajct ajctVar) {
        this.c = afplVar;
        this.b = ajctVar;
    }

    @Override // defpackage.olu
    public final ajcq a() {
        ajcq ajcqVarT = ((defpackage.kxi) aooc.ar(this.c.Y(), defpackage.kxi.class)).t();
        defpackage.kwz kwzVar = new defpackage.kwz(9);
        ajct ajctVar = this.b;
        return ahvr.H(ahvr.H(ajcqVarT, kwzVar, ajctVar), new defpackage.kwz(10), ajctVar);
    }
}
