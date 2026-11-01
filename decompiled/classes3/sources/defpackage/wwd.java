package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wwd implements defpackage.wvt {
    public static final aimz a = aimz.i("com/android/incallui/atlas/detection/techniques/asr/SodaModelRunner");
    public final android.content.Context b;
    public final ajct c;
    public final aoin d;
    public final txc h;
    public final twp i;
    public final defpackage.taq k;
    public final ajwr j = new ajwr();
    public j$.util.Optional e = j$.util.Optional.empty();
    public j$.util.Optional f = j$.util.Optional.empty();
    public j$.util.Optional g = j$.util.Optional.empty();

    public wwd(android.content.Context context, ajct ajctVar, txc txcVar, twp twpVar, defpackage.taq taqVar, aoin aoinVar) {
        this.b = context;
        this.c = ajctVar;
        this.i = twpVar;
        this.h = txcVar;
        this.k = taqVar;
        this.d = aoinVar;
    }

    public final void a() {
        ajas ajasVarB = ahqx.b(new defpackage.viv(this, 12));
        ajct ajctVar = this.c;
        agsm.i(1127, ahrv.g(this.j.e(ajasVarB, ajctVar)).i(new defpackage.wkv(this, 13), ajctVar).h(new defpackage.wrn(this, 5), ajctVar), "Failed to close SODA resources.", new java.lang.Object[0]);
    }
}
