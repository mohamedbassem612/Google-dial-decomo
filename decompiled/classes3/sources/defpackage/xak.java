package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xak implements agye {
    final /* synthetic */ defpackage.xan a;

    public xak(defpackage.xan xanVar) {
        j$.util.Objects.requireNonNull(xanVar);
        this.a = xanVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.xan.a.d(), "failed to load setting UI data", "com/android/incallui/atlas/ui/impl/settings/AtlasSettingsFragmentPeer$OnSettingsModelUpdatedSubscriptionCallbacks", "onError", 'h', "AtlasSettingsFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        defpackage.xae xaeVar = (defpackage.xae) obj;
        defpackage.xan.a.b().l("com/android/incallui/atlas/ui/impl/settings/AtlasSettingsFragmentPeer$OnSettingsModelUpdatedSubscriptionCallbacks", "onNewData", 97, "AtlasSettingsFragmentPeer.java").v("onNewData");
        boolean z = xaeVar.e;
        defpackage.xan xanVar = this.a;
        xanVar.m.I(z);
        android.content.Context context = xanVar.e;
        defpackage.xad xadVar = xanVar.d;
        xadVar.ee(context.getString(2132017407)).I(z);
        defpackage.tyw tywVar = xaeVar.d;
        if (tywVar == null) {
            tywVar = defpackage.tyw.a;
        }
        defpackage.tyv tyvVarB = defpackage.tyv.b(tywVar.d);
        if (tyvVarB == null) {
            tyvVarB = defpackage.tyv.UNRECOGNIZED;
        }
        if (tyvVarB != defpackage.tyv.ALREADY_AVAILABLE || xanVar.j.isPresent()) {
            xanVar.j = j$.util.Optional.of(tywVar);
            defpackage.tyx tyxVar = (defpackage.tyx) xadVar.N().findViewById(2131428975);
            if (tyxVar != null) {
                tyxVar.y().a(tywVar);
                return;
            }
            defpackage.tyx tyxVarB = defpackage.tys.b(xanVar.h, tywVar);
            tyxVarB.setId(2131428975);
            ((android.view.ViewGroup) xadVar.N()).addView(tyxVarB, 0);
        }
    }

    public final /* synthetic */ void c() {
    }
}
