package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rrv implements defpackage.rns {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/main/impl/ui/searchcontainer/SearchDialIntentListener");
    private final defpackage.aiyy b;
    private final defpackage.aogc c;

    public rrv(defpackage.aiyy aiyyVar, defpackage.aogc aogcVar, defpackage.aazc aazcVar) {
        if (aiyyVar == null) {
            defpackage.aooh.i("stateHolder");
        }
        if (aogcVar == null) {
            defpackage.aooh.i("resultPropagator");
        }
        if (aazcVar == null) {
            defpackage.aooh.i("clock");
        }
        this.b = aiyyVar;
        this.c = aogcVar;
    }

    @Override // defpackage.rns
    public final void a(android.content.Intent intent) {
        if (intent == null) {
            ((defpackage.aimw) a.b().l("com/android/dialer/main/impl/ui/searchcontainer/SearchDialIntentListener", "handleIntent", 26, "SearchDialIntentListener.kt")).v("null intent");
            return;
        }
        if (!defpackage.ttj.S(intent)) {
            ((defpackage.aimw) a.b().l("com/android/dialer/main/impl/ui/searchcontainer/SearchDialIntentListener", "handleIntent", 31, "SearchDialIntentListener.kt")).v("not dial or call intent");
            return;
        }
        hgw hgwVarBw = defpackage.pez.bw(rqv.a.m());
        hgwVarBw.F(defpackage.ttj.R(intent));
        defpackage.alcf alcfVarE = defpackage.aldi.e(j$.time.Instant.now().toEpochMilli());
        defpackage.aooh.e(alcfVarE, "fromMillis(...)");
        hgwVarBw.G(alcfVarE);
        rqv rqvVarE = hgwVarBw.E();
        defpackage.aiyy aiyyVar = this.b;
        if (rqvVarE == null) {
            defpackage.aooh.i("searchArgs");
        }
        java.lang.Object obj = aiyyVar.a;
        aiyyVar.a = new defpackage.rrw(rqvVarE);
        ((defpackage.aimw) a.b().l("com/android/dialer/main/impl/ui/searchcontainer/SearchDialIntentListener", "handleIntent", 41, "SearchDialIntentListener.kt")).v("set dialpad input string from the intent");
        this.c.s(defpackage.ajcm.a, rqw.a);
    }
}
