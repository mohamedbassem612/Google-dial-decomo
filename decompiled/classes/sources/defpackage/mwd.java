package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mwd {
    static final /* synthetic */ defpackage.mwd a = new defpackage.mwd();
    public static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/dobby/impl/mdd/impl/DobbyMddModule");

    public static final boolean a(defpackage.rlv rlvVar, defpackage.mvz mvzVar) {
        boolean z;
        java.lang.String strSubstring;
        int i;
        java.lang.String strSubstring2;
        java.lang.String strSubstring3;
        defpackage.aooh.f(rlvVar, "loggingBindings");
        defpackage.aimz aimzVar = mwa.a;
        defpackage.alat<defpackage.acuw> alatVar = mvzVar.a().h;
        defpackage.aooh.e(alatVar, "getFileList(...)");
        defpackage.aooh.f(alatVar, "fileList");
        boolean z2 = true;
        if (!(alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
            for (defpackage.acuw acuwVar : alatVar) {
                agmh agmhVar = mwa.b;
                java.lang.String str = acuwVar.d;
                try {
                    java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                    defpackage.ahvr.ci(str);
                    defpackage.ahvr.ci(charset);
                    int i2 = 0;
                    while (i2 < str.length() && ":/\\?#".indexOf(str.charAt(i2)) < 0) {
                        i2++;
                    }
                    if (i2 <= 0 || !str.startsWith(":", i2)) {
                        strSubstring = null;
                        i = 0;
                    } else {
                        strSubstring = str.substring(0, i2);
                        i = i2 + 1;
                    }
                    if (str.startsWith("//", i)) {
                        int i3 = i + 2;
                        int i4 = i3;
                        while (i4 < str.length() && "/\\?#".indexOf(str.charAt(i4)) < 0) {
                            i4++;
                        }
                        int i5 = i4;
                        strSubstring2 = str.substring(i3, i4);
                        i = i5;
                    } else {
                        strSubstring2 = null;
                    }
                    int i6 = i;
                    while (i6 < str.length() && "?#".indexOf(str.charAt(i6)) < 0) {
                        i6++;
                    }
                    java.lang.String strSubstring4 = i6 > i ? str.substring(i, i6) : null;
                    if (str.startsWith("?", i6)) {
                        int i7 = i6 + 1;
                        while (i6 < str.length() && str.charAt(i6) != '#') {
                            i6++;
                        }
                        strSubstring3 = str.substring(i7, i6);
                    } else {
                        strSubstring3 = null;
                    }
                    java.lang.String strSubstring5 = str.startsWith("#", i6) ? str.substring(i6 + 1) : null;
                    aizc aizcVar = ((strSubstring == null || strSubstring.equals(aizc.b(strSubstring))) && charset.equals(java.nio.charset.StandardCharsets.UTF_8)) ? new aizc(strSubstring, strSubstring2, strSubstring4, strSubstring3, strSubstring5, charset, str) : new aizc(strSubstring, strSubstring2, strSubstring4, strSubstring3, strSubstring5, charset);
                    aizcVar.a();
                    z = agmhVar.a.contains(defpackage.ahvr.p(aizcVar.a().a));
                } catch (java.lang.IllegalStateException unused) {
                }
                ((defpackage.aimw) mwa.a.b().l("com/android/dialer/dobby/impl/mdd/impl/DobbyDuplexFileGroupDomainAllowList", "verifyAll$<anonymous>$<anonymous>", 19, "DobbyDuplexFileGroupDomainAllowList.kt")).J("%s in allowed domain list: %b", acuwVar.c, z);
                if (!z) {
                    z2 = false;
                    break;
                }
            }
        }
        if (!z2) {
            rlvVar.o(defpackage.rmx.DOBBY_URL_FROM_DUPLEX_DATA_FILE_GROUP_NOT_IN_ALLOWLIST);
        }
        return z2;
    }
}
