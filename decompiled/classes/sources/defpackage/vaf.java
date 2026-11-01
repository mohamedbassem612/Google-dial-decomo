package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vaf {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/dualsim/PhoneAccountCapabilitiesAsync");
    private final defpackage.okj b;
    private final defpackage.aoss c;

    public vaf(android.content.Context context, defpackage.okj okjVar, defpackage.ahbv ahbvVar, defpackage.aoss aossVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (ahbvVar == null) {
            defpackage.aooh.i("voicemailClientMigrator");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        this.b = okjVar;
        this.c = aossVar;
    }

    public final defpackage.ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.aooh.f(phoneAccountHandle, "phoneAccountHandle");
        return defpackage.aosv.F(this.c, 0, new vjf(this, phoneAccountHandle, (defpackage.aoln) null, 1), 3);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) throws java.lang.Throwable {
        vae vaeVar;
        int i;
        if (aolnVar instanceof vae) {
            vaeVar = (vae) aolnVar;
            int i2 = vaeVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vaeVar.d = i2 - Integer.MIN_VALUE;
            } else {
                vaeVar = new vae(this, aolnVar);
            }
        } else {
            vaeVar = new vae(this, aolnVar);
        }
        java.lang.Object objD = vaeVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = vaeVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                defpackage.aooc.af(objD);
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = vaeVar.a;
                defpackage.aooc.af(objD);
            }
            return java.lang.Boolean.valueOf(((java.lang.Number) objD).intValue() == i);
        }
        defpackage.aooc.af(objD);
        defpackage.ajcq ajcqVarF = this.b.f(phoneAccountHandle);
        vaeVar.d = 1;
        objD = defpackage.aosv.D(ajcqVarF, vaeVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        int iIntValue = ((java.lang.Number) objD).intValue();
        if (iIntValue == -1) {
            ((defpackage.aimw) a.b().l("com/android/dialer/voicemail/dualsim/PhoneAccountCapabilitiesAsync", "isDefaultDataSim", 95, "PhoneAccountCapabilitiesAsync.kt")).v("invalid subscription id.");
            return java.lang.Boolean.FALSE;
        }
        defpackage.ajcq ajcqVarE = this.b.e();
        vaeVar.a = iIntValue;
        vaeVar.d = 2;
        objD = defpackage.aosv.D(ajcqVarE, vaeVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        i = iIntValue;
        return java.lang.Boolean.valueOf(((java.lang.Number) objD).intValue() == i);
    }
}
