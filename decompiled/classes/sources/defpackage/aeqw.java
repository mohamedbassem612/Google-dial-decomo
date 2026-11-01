package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aeqw implements defpackage.ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aeqw(int i) {
        this.$cid = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: agng */
    /* JADX INFO: Thrown type has an unknown type hierarchy: agpf */
    @Override // defpackage.ahyc
    public final java.lang.Object apply(java.lang.Object obj) throws agpf, agng {
        java.lang.String str;
        switch (this.$cid) {
            case 0:
                defpackage.aphg aphgVar = (defpackage.aphg) obj;
                defpackage.akzx akzxVarM = defpackage.apgw.a.m();
                akzxVarM.u();
                defpackage.apgw apgwVar = (defpackage.apgw) akzxVarM.b;
                j$.util.Objects.requireNonNull(aphgVar);
                apgwVar.d = aphgVar;
                apgwVar.c = 3;
                defpackage.akzx akzxVarM2 = apha.a.m();
                akzxVarM2.u();
                apha aphaVar = akzxVarM2.b;
                aphaVar.b |= 2;
                aphaVar.e = true;
                apha aphaVarR = akzxVarM2.r();
                akzxVarM.u();
                defpackage.apgw apgwVar2 = (defpackage.apgw) akzxVarM.b;
                j$.util.Objects.requireNonNull(aphaVarR);
                apgwVar2.e = aphaVarR;
                apgwVar2.b |= 1;
                return (defpackage.apgw) akzxVarM.r();
            case 1:
                return null;
            case 2:
                return defpackage.aify.n((java.util.List) obj);
            case 3:
                return java.lang.Boolean.FALSE;
            case 4:
                android.util.Log.e("CheckboxChecker", "fetching usage reporting opt-in failed", (java.lang.Throwable) obj);
                return java.lang.Boolean.TRUE;
            case 5:
                return agmc.ag((java.lang.String) obj);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Integer.valueOf(android.util.Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (java.io.IOException) obj));
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.aezt.b((defpackage.aexg) obj);
            case 9:
                throw new agng();
            case 10:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return com.google.apps.tiktok.account.api.controller.ValidationResult.d();
                }
                throw new agng();
            case 11:
                com.google.apps.tiktok.account.api.controller.ValidationResult validationResult = (com.google.apps.tiktok.account.api.controller.ValidationResult) obj;
                return validationResult == null ? com.google.apps.tiktok.account.api.controller.ValidationResult.d() : validationResult;
            case 12:
                agon agonVar = (agon) obj;
                int i = agonVar.c;
                int i2 = defpackage.agop.a;
                if (i != 1) {
                    str = i != 2 ? "DISABLED" : "ENABLED";
                } else {
                    str = "UNSPECIFIED";
                }
                defpackage.ahvr.bR(i == 2, "Account must be in ENABLED state, but was %s.", str);
                return agonVar;
            case 13:
                boolean z = ((agon) obj).c == 2;
                int i3 = defpackage.agop.a;
                return java.lang.Boolean.valueOf(z);
            case 14:
                defpackage.akzx akzxVarL = ((defpackage.agpc) obj).L();
                akzxVarL.x();
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                akzxVarL.u();
                defpackage.agpc agpcVar = (defpackage.agpc) akzxVarL.b;
                agpcVar.b |= 2;
                agpcVar.d = epochMilli;
                return (defpackage.agpc) akzxVarL.r();
            case 15:
                return defpackage.ahyn.h((java.util.List) obj);
            case 16:
                defpackage.agpc agpcVar2 = (defpackage.agpc) obj;
                return (agpcVar2.b & 1) != 0 ? defpackage.ahyn.h(java.lang.Long.valueOf(agpcVar2.c)) : defpackage.ahwt.a;
            case 17:
                throw new agpf((java.lang.IllegalArgumentException) obj);
            case 18:
                java.lang.String str2 = (java.lang.String) obj;
                defpackage.ahvr.bN(str2 != null, "AccountId was not a Google account");
                return new android.accounts.Account(str2, "com.google");
            case 19:
                return null;
            default:
                java.lang.String str3 = (java.lang.String) obj;
                ((defpackage.aimw) defpackage.agpt.a.c().l("com/google/apps/tiktok/account/data/google/GmsAccounts", "getAccountId$<anonymous>$<anonymous>$<anonymous>", 403, "GmsAccounts.kt")).v("Found case where getToken fixed the getAccountId failure");
                return str3;
        }
    }
}
