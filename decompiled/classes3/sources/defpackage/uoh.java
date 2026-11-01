package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class uoh implements oi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ uoh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void a(java.lang.Object obj) {
        int i = this.$cid;
        agnf agnfVarAL = null;
        if (i == 0) {
            android.net.Uri uri = (android.net.Uri) obj;
            if (uri != null) {
                defpackage.uoo uooVar = (defpackage.uoo) this.a;
                uooVar.j.n(rmw.iP);
                aimz aimzVar = zih.a;
                uooVar.A.i(aoov.al(uooVar.g, zih.b.plus(aols.a), 1, new defpackage.tgn((aoln) null, uooVar, uri, 5)));
                return;
            }
            return;
        }
        if (i == 1) {
            java.util.Map map = (java.util.Map) obj;
            aooh.f(map, "result");
            java.util.Collection collectionValues = map.values();
            if (!(collectionValues instanceof java.util.Collection) || !collectionValues.isEmpty()) {
                java.util.Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (!((java.lang.Boolean) it.next()).booleanValue()) {
                        return;
                    }
                }
            }
            ((defpackage.uoo) this.a).c.d();
            return;
        }
        if (i == 2) {
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.Object obj2 = this.a;
            if (zBooleanValue) {
                defpackage.vqn.a.b().l("com/android/dialer/voicemail/settings/greeting/single/impl/ui/VoicemailSingleGreetingSettingsFragmentPeer", "requestMicrophonePermissionsLauncher$<anonymous>", 75, "VoicemailSingleGreetingSettingsFragmentPeer.kt").v("record audio permission is granted");
                defpackage.vqn vqnVar = (defpackage.vqn) obj2;
                vqnVar.c.n(rmw.cx);
                vqnVar.c();
                return;
            }
            defpackage.vqn vqnVar2 = (defpackage.vqn) obj2;
            vqnVar2.c.n(rmw.cw);
            defpackage.vqe vqeVar = new defpackage.vqe();
            amxr.g(vqeVar);
            vqeVar.r(vqnVar2.b.I(), "microphone_permisson_alert_dialog_fragment");
            return;
        }
        if (i == 3) {
            androidx.activity.result.ActivityResult activityResult = (androidx.activity.result.ActivityResult) obj;
            aooh.f(activityResult, "result");
            int i2 = activityResult.a;
            android.content.Intent intent = activityResult.b;
            java.lang.Object obj3 = this.a;
            if (i2 == -1) {
                aooh.c(intent);
                ((defpackage.agnc) obj3).aJ(com.google.apps.tiktok.account.AccountId.b(intent.getIntExtra("new_account_id", -1)), false, 0);
            } else {
                defpackage.agnc agncVar = (defpackage.agnc) obj3;
                defpackage.agoa agoaVar = agncVar.e;
                if (!agoaVar.m()) {
                    agnfVarAL = intent != null ? defpackage.agnc.aL(intent) : null;
                    if (agnfVarAL == null) {
                        agnfVarAL = new defpackage.agnl();
                    }
                    agoaVar.k(agnfVarAL);
                }
                agncVar.aG();
            }
            ((defpackage.agnc) obj3).aI();
            return;
        }
        androidx.activity.result.ActivityResult activityResult2 = (androidx.activity.result.ActivityResult) obj;
        aooh.f(activityResult2, "result");
        int i3 = activityResult2.a;
        android.content.Intent intent2 = activityResult2.b;
        java.lang.Object obj4 = this.a;
        if (i3 == -1) {
            aooh.c(intent2);
            ((defpackage.agnc) obj4).aJ(com.google.apps.tiktok.account.AccountId.b(intent2.getIntExtra("new_account_id", -1)), false, 0);
        } else {
            if (intent2 != null) {
                if (intent2.getBooleanExtra("restart_account_selector", false)) {
                    defpackage.agnc agncVar2 = (defpackage.agnc) obj4;
                    agncVar2.aF();
                    agnf agnfVar = agncVar2.h;
                    if (agnfVar == null) {
                        aooh.j("config");
                    } else {
                        agnfVarAL = agnfVar;
                    }
                    boolean z = agnfVarAL.a;
                    throw new java.lang.IllegalStateException("Activity not configured for account selection.");
                }
                agnfVarAL = defpackage.agnc.aL(intent2);
            }
            defpackage.agnc agncVar3 = (defpackage.agnc) obj4;
            defpackage.agoa agoaVar2 = agncVar3.e;
            if (agnfVarAL == null) {
                agnfVarAL = new defpackage.agnl();
            }
            agoaVar2.k(agnfVarAL);
            agncVar3.aG();
        }
        ((defpackage.agnc) obj4).aI();
    }
}
