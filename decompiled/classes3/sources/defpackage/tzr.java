package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tzr {
    public static final aimz a = aimz.i("com/android/dialer/sonic/impl/service/SonicAnimationPlayer");
    public final ajct b;
    public final defpackage.uar c;
    public final odp d;
    public final mba e;
    public final zdl f;
    public final defpackage.rak g;
    private final defpackage.tzl h;

    static {
        j$.time.Duration.ofSeconds(1L);
    }

    public tzr(ajct ajctVar, defpackage.rak rakVar, defpackage.uar uarVar, odp odpVar, mba mbaVar, defpackage.tzl tzlVar, zdl zdlVar) {
        this.b = ajctVar;
        this.g = rakVar;
        this.c = uarVar;
        this.d = odpVar;
        this.e = mbaVar;
        this.h = tzlVar;
        this.f = zdlVar;
    }

    final ajcq a() {
        defpackage.uar uarVar = this.c;
        return uarVar.k.g(new defpackage.tvg(uarVar, 11), uarVar.b);
    }

    public final ajcq b(defpackage.uab uabVar, int i) {
        ahrv ahrvVarG = ahrv.g(this.h.a(uabVar, i));
        defpackage.tct tctVar = new defpackage.tct(this, 10);
        ajct ajctVar = this.b;
        return ahrvVarG.i(tctVar, ajctVar).h(new defpackage.tbp(15), ajctVar);
    }
}
