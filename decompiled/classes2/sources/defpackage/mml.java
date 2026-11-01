package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mml {
    public final aoss b;
    private final ecx d;
    private final aogc f;
    private static final mni e = new mni();
    private static final aimz c = aimz.i("com/android/dialer/display/settings/impl/DisplayOptionsSettingsDataService");
    public static final agxj a = new agxj("display_options_settings_data_source_key");

    public mml(ecx ecxVar, aoss aossVar, aogc aogcVar) {
        aooh.f(ecxVar, "dataStore");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aogcVar, "resultPropagator");
        this.d = ecxVar;
        this.b = aossVar;
        this.f = aogcVar;
    }

    public final java.lang.Object a(aoln aolnVar) {
        return aoov.au(this.d.b(), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(boolean z, aoln aolnVar) {
        defpackage.mmk mmkVar;
        if (aolnVar instanceof defpackage.mmk) {
            mmkVar = (defpackage.mmk) aolnVar;
            int i = mmkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mmkVar.c = i - Integer.MIN_VALUE;
            } else {
                mmkVar = new defpackage.mmk(this, aolnVar);
            }
        } else {
            mmkVar = new defpackage.mmk(this, aolnVar);
        }
        java.lang.Object objA = mmkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mmkVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            c.b().l("com/android/dialer/display/settings/impl/DisplayOptionsSettingsDataService", "setForcePortraitMode", 45, "DisplayOptionsSettingsDataService.kt").y("setForcePortraitMode: %s", java.lang.Boolean.valueOf(z));
            ecx ecxVar = this.d;
            mni mniVar = e;
            skg skgVar = new skg(z, 1);
            mmkVar.c = 1;
            objA = mniVar.a(ecxVar, skgVar, mmkVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        if (((java.lang.Boolean) objA).booleanValue()) {
            aogc aogcVar = this.f;
            aooh.f(aogcVar, "<this>");
            aogcVar.s(ajcm.a, a);
        }
        return aojh.a;
    }
}
