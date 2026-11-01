package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kzi implements rvd {
    private static final aimz a = aimz.i("com/android/dialer/callrecording/impl/settings/CallRecordingSettingsIntegration");
    private final android.content.Context b;
    private final ajct c;
    private final zjm d;

    public kzi(android.content.Context context, ajct ajctVar, zjm zjmVar) {
        this.b = context;
        this.d = zjmVar;
        this.c = ajctVar;
    }

    public final android.content.Intent a() {
        return afsq.bP();
    }

    public final aw b() {
        return defpackage.kzk.aW();
    }

    public final /* synthetic */ aw c(rvq rvqVar) {
        return defpackage.kzk.aW();
    }

    public final ajcq d() {
        return afsq.bQ();
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq e() {
        ajcq ajcqVarO;
        j$.util.Optional optionalG = this.d.g();
        boolean zIsPresent = optionalG.isPresent();
        aimz aimzVar = a;
        if (!zIsPresent) {
            aimzVar.b().l("com/android/dialer/callrecording/impl/settings/CallRecordingSettingsIntegration", "getPrefData", 74, "CallRecordingSettingsIntegration.java").v("call recording not present");
            return aiql.z(j$.util.Optional.empty());
        }
        aimzVar.b().l("com/android/dialer/callrecording/impl/settings/CallRecordingSettingsIntegration", "getPrefData", 59, "CallRecordingSettingsIntegration.java").v("getting pref data for tidepods call recording");
        kva kvaVar = (kva) optionalG.orElseThrow();
        if (kvaVar.a()) {
            return aiql.z(f());
        }
        if (kvaVar.a()) {
            kva.a.b().l("com/android/dialer/callrecording/impl/CallRecordingImpl", "canShowMenu", 81, "CallRecordingImpl.java").v("menu can be shown as recording is supported");
            ajcqVarO = aiql.z(java.lang.Boolean.TRUE);
        } else {
            aogc aogcVar = kvaVar.b.n;
            aogc aogcVar2 = (aogc) aogcVar.b;
            ajcq ajcqVarBk = aogcVar2.bk();
            defpackage.kwz kwzVar = new defpackage.kwz(8);
            ?? r1 = aogcVar.a;
            ajcq ajcqVarH = ahvr.H(ajcqVarBk, kwzVar, (java.util.concurrent.Executor) r1);
            ajcq ajcqVarH2 = ahvr.H(aogcVar2.bk(), new defpackage.kwz(6), (java.util.concurrent.Executor) r1);
            ajcqVarO = ahvr.ak(new ajcq[]{ajcqVarH, ajcqVarH2}).o(new defpackage.gzk(ajcqVarH, ajcqVarH2, 12), kvaVar.f);
        }
        return ahrv.g(ajcqVarO).h(new defpackage.kxn(this, 5), this.c);
    }

    public final j$.util.Optional f() {
        rus rusVar = new rus();
        rusVar.d(ruz.b);
        rusVar.c(rvc.o);
        rusVar.e(new rva(2132018201));
        rusVar.b(this.b.getDrawable(2131231053));
        return j$.util.Optional.of(rusVar.a());
    }
}
