package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lhh {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/settings/CallScreenSettingsFragmentPeer");
    public final android.content.Context b;
    public final defpackage.lhf c;
    public final defpackage.lhe d;
    public final rlv e;
    public final defpackage.ljg f;
    public final aoin h;
    public ok i;
    public final ajwr k;
    public final defpackage.oq l;
    private final ahey m;
    public final defpackage.ljj g = new defpackage.ljj();
    public j$.util.Optional j = j$.util.Optional.empty();

    public lhh(android.content.Context context, ahey aheyVar, defpackage.lhf lhfVar, defpackage.lhe lheVar, defpackage.oq oqVar, rlv rlvVar, ajwr ajwrVar, defpackage.ljg ljgVar, aoin aoinVar) {
        this.b = context;
        this.m = aheyVar;
        this.c = lhfVar;
        this.d = lheVar;
        this.l = oqVar;
        this.e = rlvVar;
        this.k = ajwrVar;
        this.f = ljgVar;
        this.h = aoinVar;
    }

    public final void a(defpackage.liq liqVar) {
        this.j = j$.util.Optional.of(liqVar);
        defpackage.lhf lhfVar = this.c;
        defpackage.liv livVar = (defpackage.liv) lhfVar.N().findViewById(2131427691);
        if (livVar != null) {
            livVar.y().a(liqVar);
            return;
        }
        defpackage.liv livVar2 = new defpackage.liv(this.m);
        livVar2.y().a(liqVar);
        livVar2.setId(2131427691);
        ((android.view.ViewGroup) lhfVar.N()).addView(livVar2, 0);
    }

    public final void b(java.lang.String str) {
        this.i.b(akff.a(str));
    }
}
