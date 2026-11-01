package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class rou implements defpackage.aonj {
    private final /* synthetic */ int $cid;

    public /* synthetic */ rou(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(((defpackage.mhy) obj).b());
            case 1:
                return java.lang.Boolean.valueOf(((defpackage.mhy) obj).a.b());
            case 2:
                ((defpackage.aimw) ((defpackage.aimw) defpackage.rtx.a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/memorybudget/DialerMemoryBudgetInitializer", "overBudgetListener$<anonymous>", 59, "DialerMemoryBudgetInitializer.kt")).x("Dialer exceeded Terrarium memory budget of %d bytes", ((java.lang.Long) obj).longValue());
                return defpackage.aojh.a;
            case 3:
                tuf tufVar = (tuf) obj;
                defpackage.aooh.f(tufVar, "$this$create");
                j$.time.Instant instantOfEpochMilli = j$.time.Instant.ofEpochMilli(tufVar.a);
                defpackage.aooh.e(instantOfEpochMilli, "ofEpochMilli(...)");
                return instantOfEpochMilli;
            case 4:
                j$.time.Instant instant = (j$.time.Instant) obj;
                defpackage.aooh.f(instant, "$this$create");
                return new defpackage.abwy(instant.toEpochMilli());
            case 5:
                defpackage.wgm wgmVar = (defpackage.wgm) obj;
                if (wgmVar == null) {
                    defpackage.aooh.g();
                }
                defpackage.akzx akzxVarM = defpackage.amtg.a.m();
                if (akzxVarM == null) {
                    defpackage.aooh.i("builder");
                }
                int iAQ = defpackage.a.aQ(wgmVar.b);
                if (iAQ == 0) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                akzxVarM.u();
                defpackage.amtg amtgVar = (defpackage.amtg) akzxVarM.b;
                amtgVar.c = iAQ - 1;
                amtgVar.b |= 1;
                int iAS = defpackage.a.aS(wgmVar.c);
                if (iAS == 0) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                akzxVarM.u();
                defpackage.amtg amtgVar2 = (defpackage.amtg) akzxVarM.b;
                amtgVar2.d = iAS - 1;
                amtgVar2.b |= 2;
                int iAS2 = defpackage.a.aS(wgmVar.d);
                if (iAS2 == 0) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                akzxVarM.u();
                defpackage.amtg amtgVar3 = (defpackage.amtg) akzxVarM.b;
                amtgVar3.e = iAS2 - 1;
                amtgVar3.b |= 4;
                boolean z = wgmVar.e;
                akzxVarM.u();
                defpackage.amtg amtgVar4 = (defpackage.amtg) akzxVarM.b;
                amtgVar4.b |= 8;
                amtgVar4.f = z;
                defpackage.alad aladVarR = akzxVarM.r();
                defpackage.aooh.e(aladVarR, "build(...)");
                return (defpackage.amtg) aladVarR;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                if (((defpackage.ahkl) obj) == null) {
                    defpackage.aooh.i("<this>");
                }
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Boolean.valueOf(((android.telecom.PhoneAccount) obj).hasCapabilities(4));
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((java.lang.Boolean) obj).booleanValue();
                defpackage.aonn aonnVar = defpackage.abny.a;
                return defpackage.aojh.a;
            case 9:
                defpackage.aooh.f(obj, "$this$RoomKeyValueStore");
                return obj;
            case 10:
                if (((defpackage.dkw) obj) == null) {
                    defpackage.aooh.i("it");
                }
                return defpackage.aojh.a;
            case 11:
                defpackage.aooh.f((defpackage.ecp) obj, "it");
                return defpackage.agab.bS(defpackage.aegw.a.m()).z();
            case 12:
                defpackage.aooh.f((defpackage.ecp) obj, "it");
                return defpackage.agab.bS(defpackage.aegw.a.m()).z();
            case 13:
                defpackage.gin ginVarA = ((defpackage.gjh) obj).a("SELECT * FROM gnp_accounts");
                try {
                    int iS = defpackage.dzk.S(ginVarA, "id");
                    int iS2 = defpackage.dzk.S(ginVarA, "account_specific_id");
                    int iS3 = defpackage.dzk.S(ginVarA, "account_type");
                    int iS4 = defpackage.dzk.S(ginVarA, "obfuscated_gaia_id");
                    int iS5 = defpackage.dzk.S(ginVarA, "actual_account_name");
                    int iS6 = defpackage.dzk.S(ginVarA, "actual_account_oid");
                    int iS7 = defpackage.dzk.S(ginVarA, "registration_status");
                    int iS8 = defpackage.dzk.S(ginVarA, "registration_id");
                    int iS9 = defpackage.dzk.S(ginVarA, "sync_sources");
                    int iS10 = defpackage.dzk.S(ginVarA, "representative_target_id");
                    int iS11 = defpackage.dzk.S(ginVarA, "sync_version");
                    int iS12 = defpackage.dzk.S(ginVarA, "last_registration_time_ms");
                    int iS13 = defpackage.dzk.S(ginVarA, "last_registration_request_hash");
                    int iS14 = defpackage.dzk.S(ginVarA, "first_registration_version");
                    int iS15 = defpackage.dzk.S(ginVarA, "internal_target_id");
                    int iS16 = defpackage.dzk.S(ginVarA, "fitbit_decoded_id");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        long jC = ginVarA.c(iS);
                        java.lang.String strE = ginVarA.l(iS2) ? null : ginVarA.e(iS2);
                        int i = iS13;
                        int i2 = iS14;
                        int iBH = defpackage.agab.bH((int) ginVarA.c(iS3));
                        java.lang.String strE2 = ginVarA.l(iS4) ? null : ginVarA.e(iS4);
                        java.lang.String strE3 = ginVarA.l(iS5) ? null : ginVarA.e(iS5);
                        java.lang.String strE4 = ginVarA.l(iS6) ? null : ginVarA.e(iS6);
                        int iC = (int) ginVarA.c(iS7);
                        java.lang.String strE5 = ginVarA.l(iS8) ? null : ginVarA.e(iS8);
                        defpackage.aihd aihdVarBF = defpackage.agab.bF(ginVarA.l(iS9) ? null : ginVarA.e(iS9));
                        java.lang.String strE6 = ginVarA.l(iS10) ? null : ginVarA.e(iS10);
                        long jC2 = ginVarA.c(iS11);
                        long jC3 = ginVarA.c(iS12);
                        int i3 = iS3;
                        int i4 = iS2;
                        int iC2 = (int) ginVarA.c(i);
                        long jC4 = ginVarA.c(i2);
                        int i5 = iS;
                        int i6 = iS15;
                        java.lang.String strE7 = ginVarA.l(i6) ? null : ginVarA.e(i6);
                        iS15 = i6;
                        int i7 = iS16;
                        arrayList.add(defpackage.aduy.d(jC, strE, iBH, strE2, strE3, strE4, iC, strE5, aihdVarBF, strE6, jC2, jC3, iC2, jC4, strE7, ginVarA.c(i7)));
                        iS16 = i7;
                        iS13 = i;
                        iS2 = i4;
                        iS = i5;
                        iS14 = i2;
                        iS3 = i3;
                        break;
                    }
                    return arrayList;
                } finally {
                    ginVarA.close();
                }
            case 14:
                defpackage.aooh.f((java.lang.String) obj, "it");
                return new java.util.LinkedHashMap();
            case 15:
                java.lang.String str = (java.lang.String) obj;
                if (str != null) {
                    return str;
                }
                defpackage.aooh.i("it");
                return str;
            case 16:
                defpackage.aado aadoVar = (defpackage.aado) obj;
                defpackage.aooh.f(aadoVar, "e");
                return java.lang.Integer.valueOf(android.util.Log.w("ConfigurationUpdater", "Failed to update shared storage snapshot. GMS Core version too old.", aadoVar));
            case 17:
                defpackage.aexj aexjVar = (defpackage.aexj) obj;
                defpackage.aooh.f(aexjVar, "e");
                if (aexjVar.a == 29501) {
                    return null;
                }
                throw aexjVar;
            case 18:
                defpackage.aado aadoVar2 = (defpackage.aado) obj;
                defpackage.aooh.f(aadoVar2, "e");
                return java.lang.Integer.valueOf(android.util.Log.w("RegisterInternal", "GMS Core version too old", aadoVar2));
            case 19:
                defpackage.ajsy ajsyVar = (defpackage.ajsy) obj;
                defpackage.aooh.f(ajsyVar, "it");
                return ajsyVar.g;
            default:
                defpackage.ahbq ahbqVar = defpackage.ahew.k;
                defpackage.aooh.f((java.lang.Exception) obj, "it");
                return java.lang.Boolean.FALSE;
        }
    }
}
