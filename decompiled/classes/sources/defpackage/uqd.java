package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class uqd implements defpackage.ajat {
    private final /* synthetic */ int $cid;

    public /* synthetic */ uqd(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) throws java.lang.Exception {
        int i = 3;
        switch (this.$cid) {
            case 0:
                j$.util.Optional optional = (j$.util.Optional) obj;
                return optional.isPresent() ? ((defpackage.xef) optional.orElseThrow()).a() : defpackage.ajcm.a;
            case 1:
                return new defpackage.ahda(new defpackage.anpu(true, defpackage.aify.j((defpackage.aify) obj)), (byte[]) null).o(new defpackage.kve(i), defpackage.ajbm.INSTANCE);
            case 2:
                return defpackage.aiql.z(acuv.a);
            case 3:
                return defpackage.aiql.y(new java.lang.IllegalStateException());
            case 4:
                throw ((java.lang.Exception) obj);
            case 5:
                return new defpackage.ajcm(java.lang.Boolean.TRUE);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.ajcm.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((adsf) obj).a();
                throw null;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.adtz adtzVar = (defpackage.adtz) obj;
                defpackage.aiof aiofVar = defpackage.aeha.a;
                if (adtzVar.g()) {
                    ((defpackage.aiob) ((defpackage.aiob) ((defpackage.aiob) defpackage.aeha.a.d()).k(adtzVar.f())).l("com/google/android/libraries/notifications/platform/tiktok/registration/GnpRegistrationInterceptor", "handleGnpRegistration", 64, "GnpRegistrationInterceptor.java")).v("Failed scheduling GNP registration");
                }
                return defpackage.ajcm.a;
            case 9:
                defpackage.aacw aacwVar = (defpackage.aacw) obj;
                throw new defpackage.aexj(aacwVar.a(), aacwVar.getMessage(), aacwVar);
            case 10:
                return defpackage.aiql.z("");
            case 11:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                defpackage.aooh.f(th, "t");
                j$.util.Objects.checkIndex(0, 3);
                if (th != null && ((th instanceof defpackage.aacm) || (th instanceof defpackage.aacl))) {
                    return defpackage.aiql.y(th);
                }
                ((defpackage.aimw) ((defpackage.aimw) defpackage.agpt.a.c()).k(th).l("com/google/apps/tiktok/account/data/google/GmsAccounts", "loadOwnersReturningEmptyListOnFailure$<anonymous>", 125, "GmsAccounts.kt")).v("GoogleOwnersProvider failed");
                return defpackage.aiql.z(defpackage.aike.a);
            case 12:
                return ((aguu) obj).c();
            default:
                akxm akxmVar = (akxm) obj;
                return !((java.lang.Boolean) akxmVar.b).booleanValue() ? defpackage.ajcm.a : defpackage.ajan.f(((ahid) akxmVar.a).a(), defpackage.ahqx.a(new ahds(akxmVar, 9)), akxmVar.c);
        }
    }
}
