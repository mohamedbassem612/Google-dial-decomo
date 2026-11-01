package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sns {
    public static ssz A(android.content.Context context) {
        return (ssz) agab.aH(context, ssz.class);
    }

    public static void B(ajwr ajwrVar, defpackage.szk szkVar) {
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427629), new defpackage.szl(szkVar, 0));
        ajwrVar.f(((android.view.View) ajwrVar.a).findViewById(2131427627), new defpackage.szl(szkVar, 2));
    }

    private static albh C(byte[] bArr, albh albhVar) {
        try {
            return albhVar.L().h(bArr, akzq.a()).r();
        } catch (alaz e) {
            throw new java.lang.IllegalStateException(e.toString());
        }
    }

    public static final defpackage.spe a(defpackage.spo spoVar) {
        aooh.f(spoVar, "<this>");
        if (spoVar.c()) {
            return spoVar.b();
        }
        return null;
    }

    public static ssn b(android.content.Context context) {
        return (ssn) agab.aH(context, ssn.class);
    }

    public static sra c(android.content.Context context) {
        return (sra) agab.aH(context, sra.class);
    }

    public static boolean d(long j) {
        return j == 1 || j == 1000000001;
    }

    public static boolean e(long j) {
        return fh$.ExternalSyntheticApiModelOutline0.m$1(j) && !fh$.ExternalSyntheticApiModelOutline0.m(j);
    }

    public static ajcq f(sqn sqnVar, android.content.Context context, android.telecom.Call.Details details) {
        return ahvr.I(((sqm) agab.aH(context, sqm.class)).fF().eU(ahqx.i(new defpackage.qfb(context, details, 16))), new defpackage.qfc(sqnVar, 20), ajbm.a);
    }

    public static final /* synthetic */ defpackage.ryu g(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ryu(akzxVar, null);
    }

    public static final /* synthetic */ defpackage.ryu h(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ryu(akzxVar, null);
    }

    public static /* synthetic */ ajcq i(aoin aoinVar, defpackage.ahau ahauVar) {
        aify aifyVar = ahauVar.a;
        defpackage.ahap ahapVar = defpackage.ahap.a;
        if (!aifyVar.contains(ahapVar)) {
            return aiql.z(defpackage.ahas.d);
        }
        defpackage.ahaq ahaqVarA = defpackage.ahar.a();
        ahaqVarA.b(false);
        ahaqVarA.a = ahapVar;
        ahaqVarA.c(akzc.v(java.lang.String.valueOf(aoinVar.a()), java.nio.charset.StandardCharsets.UTF_8));
        return aiql.z(ahaqVarA.a());
    }

    public static tdw j(android.content.Context context) {
        return (tdw) agab.aH(context, tdw.class);
    }

    public static tdu k(android.content.Context context) {
        return (tdu) agab.aH(context, tdu.class);
    }

    public static tdq l(android.content.Context context) {
        return (tdq) agab.aH(context, tdq.class);
    }

    public static boolean m(android.content.Context context) {
        return android.provider.Settings.Secure.getInt(context.getContentResolver(), "rtt_calling_mode", 0) != 0;
    }

    public static final void n(java.lang.String str) {
        defpackage.tck.a.b().l("com/android/dialer/ringing/OsloAction$OsloConnectionListener", "onConnectionFailed", 145, "OsloAction.java").y("ConnectionListener.onConnectionFailed: %s", str);
    }

    public static final void o(java.lang.String str, java.lang.String str2) {
        defpackage.tck.a.b().l("com/android/dialer/ringing/OsloAction$OsloConnectionListener", "onVersionNotCompatible", 150, "OsloAction.java").I("ConnectionListener.onVersionNotCompatible: error='%s' package='%s'", str, str2);
    }

    public static /* synthetic */ java.lang.String p(int i) {
        switch (i) {
            case 1:
                return "INTRO";
            case 2:
                return "INTRO_RECORDING_ON";
            case 3:
                return "TRY_TO_REACH";
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return "TRANSFER_TO_VOICEMAIL";
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return "END_CALL_AFTER_VOICEMAIL";
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return "NO_RESPONSE_FROM_CALLER";
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return "PROMOTION_TITLE";
            default:
                return "PROMOTION_DETAILS";
        }
    }

    public static tba q(android.content.Context context) {
        return (tba) agab.aH(context, tba.class);
    }

    public static albh r(android.content.ContentValues contentValues, java.lang.String str, albh albhVar) {
        ahvr.ci(contentValues);
        ahvr.ci(albhVar);
        return C(contentValues.getAsByteArray(str), albhVar.t());
    }

    public static albh s(android.os.Bundle bundle, java.lang.String str, albh albhVar) {
        ahvr.ci(bundle);
        ahvr.ci(albhVar);
        return C(bundle.getByteArray(str), albhVar.t());
    }

    public static albh t(android.content.Intent intent, java.lang.String str, albh albhVar) {
        ahvr.ci(intent);
        return s(intent.getExtras(), str, albhVar);
    }

    public static void u(android.content.Intent intent, java.lang.String str, albh albhVar) {
        ahvr.ci(albhVar);
        intent.putExtra(str, albhVar.i());
    }

    public static void v(android.os.Bundle bundle, java.lang.String str, albh albhVar) {
        ahvr.ci(albhVar);
        bundle.putByteArray(str, albhVar.i());
    }

    public static sug x(android.content.Context context) {
        return (sug) agab.aH(context, sug.class);
    }

    public static stv y(android.content.Context context) {
        return (stv) agab.aH(context, stv.class);
    }

    public static stc z(android.content.Context context) {
        return (stc) agab.aH(context, stc.class);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object w(ojo ojoVar, android.net.Uri uri, java.lang.String[] strArr, aonj aonjVar, aoln aolnVar) {
        defpackage.suk sukVar;
        if (aolnVar instanceof defpackage.suk) {
            sukVar = (defpackage.suk) aolnVar;
            int i = sukVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sukVar.b = i - Integer.MIN_VALUE;
            } else {
                sukVar = new defpackage.suk(this, aolnVar);
            }
        } else {
            sukVar = new defpackage.suk(this, aolnVar);
        }
        defpackage.suk sukVar2 = sukVar;
        java.lang.Object objI = sukVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = sukVar2.b;
        try {
            if (i2 == 0) {
                aooc.af(objI);
                sukVar2.b = 1;
                objI = ojoVar.i(uri, strArr, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null, aonjVar, sukVar2);
                if (objI == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objI);
            }
            return (aify) objI;
        } catch (agui e) {
            defpackage.suo.a.b().k(e).l("com/android/dialer/preferredsim/impl/simselector/DataIdProvider$Companion", "queryOrNull", 200, "DataIdProvider.kt").v("query failed");
            return null;
        }
    }
}
