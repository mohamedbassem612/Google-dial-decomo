package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeiw extends ld {
    public final com.google.android.libraries.onegoogle.account.particle.AccountParticle s;
    public final ahyn t;
    public final ahyn u;
    public final defpackage.aelt v;
    public java.lang.Object w;

    /* JADX WARN: Type inference failed for: r4v5, types: [aeir, android.view.View, com.google.android.libraries.onegoogle.account.particle.AccountParticle] */
    public aeiw(android.view.ViewGroup viewGroup, defpackage.aehm aehmVar, defpackage.wsk wskVar, ahyn ahynVar, aeis aeisVar, int i, defpackage.aelt aeltVar) {
        super(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(2131623967, viewGroup, false));
        C(this.a, i, i);
        ?? r4 = (com.google.android.libraries.onegoogle.account.particle.AccountParticle) this.a.findViewById(2131427386);
        this.s = r4;
        this.t = ahynVar;
        this.u = aeisVar.a;
        this.v = aeltVar;
        C(r4, r4.getResources().getDimensionPixelSize(2131165287), 0);
        com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc accountParticleDisc = r4.j;
        if (!accountParticleDisc.i) {
            ahvr.bZ(!accountParticleDisc.c(), "setAllowRings is only allowed before calling initialize.");
            accountParticleDisc.i = true;
        }
        com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc accountParticleDisc2 = r4.j;
        if (!accountParticleDisc2.h) {
            ahvr.bZ(!accountParticleDisc2.c(), "enableBadges is only allowed before calling initialize.");
            accountParticleDisc2.h = true;
        }
        r4.j.d(wskVar, aehmVar);
        r4.n = new defpackage.alln(r4, aehmVar, aeisVar);
        ahyn ahynVar2 = aeisVar.a;
    }

    private static void C(android.view.View view, int i, int i2) {
        int i3 = dzs.a;
        view.setPaddingRelative(view.getPaddingStart() + i, view.getPaddingTop(), view.getPaddingEnd() + i2, view.getPaddingBottom());
    }
}
