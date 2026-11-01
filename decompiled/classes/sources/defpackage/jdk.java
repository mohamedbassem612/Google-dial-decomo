package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jdk {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/beesly/impl/v2/moirai/BeeslyMoiraiProtectionsDownloader");
    private final defpackage.iqm b;
    private final defpackage.ugs c;

    public jdk(defpackage.ugs ugsVar, defpackage.iqm iqmVar) {
        this.c = ugsVar;
        this.b = iqmVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8 A[Catch: abbe -> 0x00bb, TRY_LEAVE, TryCatch #0 {abbe -> 0x00bb, blocks: (B:14:0x0032, B:18:0x003f, B:31:0x0088, B:35:0x008f, B:37:0x00a8, B:19:0x0043, B:27:0x0074, B:29:0x007c, B:25:0x0068), top: B:49:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v18 */
    public final java.lang.Object a(defpackage.aoln aolnVar) {
        jdj jdjVar;
        boolean z;
        ?? r11;
        defpackage.ugs ugsVar;
        ugv ugvVar;
        if (aolnVar instanceof jdj) {
            jdjVar = (jdj) aolnVar;
            int i = jdjVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jdjVar.d = i - Integer.MIN_VALUE;
            } else {
                jdjVar = new jdj(this, aolnVar);
            }
        } else {
            jdjVar = new jdj(this, aolnVar);
        }
        java.lang.Object objG = jdjVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jdjVar.d;
        boolean z2 = false;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    defpackage.aooc.af(objG);
                } else if (i2 == 2) {
                    defpackage.aooc.af(objG);
                    if (objG == zdp.a) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ((defpackage.aimw) a.b().l("com/android/dialer/beesly/impl/v2/moirai/BeeslyMoiraiProtectionsDownloader", "downloadProtections", 36, "BeeslyMoiraiProtectionsDownloader.kt")).y("Need to download protections model: %b", java.lang.Boolean.valueOf(z));
                    if (z) {
                        ugsVar = this.c;
                        ugvVar = ugv.b;
                        jdjVar.a = 1;
                        jdjVar.d = 3;
                        if (ugsVar.c(ugvVar, jdjVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    r11 = z;
                } else {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = jdjVar.a;
                    defpackage.aooc.af(objG);
                    r11 = i3;
                }
                if (r11 != 0) {
                    z2 = true;
                }
                return java.lang.Boolean.valueOf(z2);
            }
            defpackage.aooc.af(objG);
            if (!this.b.e()) {
                ((defpackage.aimw) a.b().l("com/android/dialer/beesly/impl/v2/moirai/BeeslyMoiraiProtectionsDownloader", "downloadProtections", 25, "BeeslyMoiraiProtectionsDownloader.kt")).v("Spam/Scam detection is disabled. Skipping protections download.");
                return java.lang.Boolean.FALSE;
            }
            defpackage.ugs ugsVar2 = this.c;
            ugv ugvVar2 = ugv.b;
            jdjVar.d = 1;
            objG = ugsVar2.g(ugvVar2, jdjVar);
            if (objG == aoluVar) {
                return aoluVar;
            }
            if (((java.lang.Boolean) objG).booleanValue()) {
                defpackage.ugs ugsVar3 = this.c;
                ugv ugvVar3 = ugv.b;
                jdjVar.d = 2;
                objG = ugsVar3.f(ugvVar3, jdjVar);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (objG == zdp.a) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            ((defpackage.aimw) a.b().l("com/android/dialer/beesly/impl/v2/moirai/BeeslyMoiraiProtectionsDownloader", "downloadProtections", 36, "BeeslyMoiraiProtectionsDownloader.kt")).y("Need to download protections model: %b", java.lang.Boolean.valueOf(z));
            if (z) {
                ugsVar = this.c;
                ugvVar = ugv.b;
                jdjVar.a = 1;
                jdjVar.d = 3;
                if (ugsVar.c(ugvVar, jdjVar) == aoluVar) {
                    return aoluVar;
                }
            }
            r11 = z;
            if (r11 != 0) {
                z2 = true;
            }
        } catch (defpackage.abbe e) {
            boolean zA = e.a();
            defpackage.aimz aimzVar = a;
            if (zA) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).k(e).l("com/android/dialer/beesly/impl/v2/moirai/BeeslyMoiraiProtectionsDownloader", "downloadProtections", 46, "BeeslyMoiraiProtectionsDownloader.kt")).v("Retryable MoiraiException caught while downloading protections model");
            } else {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).k(e).l("com/android/dialer/beesly/impl/v2/moirai/BeeslyMoiraiProtectionsDownloader", "downloadProtections", 51, "BeeslyMoiraiProtectionsDownloader.kt")).v("MoiraiException caught while downloading protections model");
            }
        }
        return java.lang.Boolean.valueOf(z2);
    }
}
