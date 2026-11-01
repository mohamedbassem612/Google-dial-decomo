package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uar {
    public static final aimz a = aimz.i("com/android/dialer/sonic/impl/service/SonicVoiceAnimatorListener");
    public final ajct b;
    public final ajcu c;
    public final aoin d;
    public final mba e;
    public final defpackage.uaq f;
    public final defpackage.uae g;
    public final zpz j;
    private final agsm l;
    public final ahda k = new ahda();
    public int i = 1;
    public j$.util.Optional h = j$.util.Optional.empty();

    public uar(ajct ajctVar, ajcu ajcuVar, aoin aoinVar, zpz zpzVar, mba mbaVar, agsm agsmVar, defpackage.uaq uaqVar, defpackage.uae uaeVar) {
        this.b = ajctVar;
        this.c = ajcuVar;
        this.d = aoinVar;
        this.j = zpzVar;
        this.e = mbaVar;
        this.l = agsmVar;
        this.f = uaqVar;
        this.g = uaeVar;
    }

    public final void a(int i) {
        lqh lqhVar = new lqh(this, i, 6);
        ajct ajctVar = this.b;
        ajcq ajcqVarG = this.k.g(lqhVar, ajctVar);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        agsm agsmVar = this.l;
        agsmVar.g(ajcqVarG, 5L, timeUnit);
        agsmVar.g(ahrv.g(ajcqVarG).i(new defpackage.tct(this, 16), ajctVar).h(new defpackage.tcy(this, 14), ajctVar), 5L, java.util.concurrent.TimeUnit.SECONDS);
    }

    public final void b(int i, java.lang.String str) {
        this.l.g(this.k.g(new defpackage.upy(this, i, str, 1), this.b), 5L, java.util.concurrent.TimeUnit.SECONDS);
    }
}
