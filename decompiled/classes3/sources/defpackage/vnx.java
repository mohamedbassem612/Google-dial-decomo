package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vnx {
    private static final aimz c = aimz.i("com/android/dialer/voicemail/settings/CarrierVoicemailSettingsFragmentProvider");
    public final aoss a;
    public final android.os.UserManager b;
    private final aolr d;
    private final zrw e;

    public vnx(aoss aossVar, aolr aolrVar, zrw zrwVar, android.os.UserManager userManager, zjs zjsVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(zjsVar, "dialerTelecom");
        this.a = aossVar;
        this.d = aolrVar;
        this.e = zrwVar;
        this.b = userManager;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.vnw vnwVar;
        if (aolnVar instanceof defpackage.vnw) {
            vnwVar = (defpackage.vnw) aolnVar;
            int i = vnwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vnwVar.c = i - Integer.MIN_VALUE;
            } else {
                vnwVar = new defpackage.vnw(this, aolnVar);
            }
        } else {
            vnwVar = new defpackage.vnw(this, aolnVar);
        }
        java.lang.Object objAj = vnwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = vnwVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objAj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objAj);
            }
            if (!((java.lang.Boolean) objAj).booleanValue()) {
                return java.lang.Boolean.TRUE;
            }
            c.b().l("com/android/dialer/voicemail/settings/CarrierVoicemailSettingsFragmentProvider", "shouldShowCarrierVoicemailSettings", 40, "CarrierVoicemailSettingsFragmentProvider.kt").v("missing READ_PHONE_STATE");
            return java.lang.Boolean.FALSE;
        }
        aooc.af(objAj);
        vnwVar.c = 1;
        objAj = aoov.aj(this.d, new uer(this, (aoln) null, 7), vnwVar);
        if (objAj == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) objAj).booleanValue()) {
            c.b().l("com/android/dialer/voicemail/settings/CarrierVoicemailSettingsFragmentProvider", "shouldShowCarrierVoicemailSettings", 35, "CarrierVoicemailSettingsFragmentProvider.kt").v("user is not primary user");
            return java.lang.Boolean.FALSE;
        }
        zrw zrwVar = this.e;
        vnwVar.c = 2;
        objAj = zrwVar.u(vnwVar);
        if (objAj == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) objAj).booleanValue()) {
            return java.lang.Boolean.TRUE;
        }
        c.b().l("com/android/dialer/voicemail/settings/CarrierVoicemailSettingsFragmentProvider", "shouldShowCarrierVoicemailSettings", 40, "CarrierVoicemailSettingsFragmentProvider.kt").v("missing READ_PHONE_STATE");
        return java.lang.Boolean.FALSE;
    }
}
