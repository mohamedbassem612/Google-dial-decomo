package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adqs {
    private static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/micore/telephony/common/infra/PackageUtils");

    public static j$.util.Optional a(android.content.Context context) {
        defpackage.aisc aiscVar;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            ((defpackage.aimw) ((defpackage.aimw) a.c()).l("com/google/android/libraries/micore/telephony/common/infra/PackageUtils", "getCertificateFingerprint", 35, "PackageUtils.java")).v("Package manager is not available");
            return j$.util.Optional.empty();
        }
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        java.lang.String packageName = context.getPackageName();
        try {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 64);
            if (packageInfo.signatures != null && packageInfo.signatures.length > 0) {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA1");
                if (messageDigest == null) {
                    ((defpackage.aimw) ((defpackage.aimw) a.c()).l("com/google/android/libraries/micore/telephony/common/infra/PackageUtils", "getCertificateFingerprint", 46, "PackageUtils.java")).y("No MessageDigest for %s", "SHA1");
                    return j$.util.Optional.empty();
                }
                byte[] bArrDigest = messageDigest.digest(packageInfo.signatures[0].toByteArray());
                if (bArrDigest == null) {
                    ((defpackage.aimw) ((defpackage.aimw) a.c()).l("com/google/android/libraries/micore/telephony/common/infra/PackageUtils", "getCertificateFingerprint", 53, "PackageUtils.java")).v("Can not digest signature");
                    return j$.util.Optional.empty();
                }
                defpackage.aish aishVar = defpackage.aish.g;
                defpackage.aish aisdVar = ((defpackage.aisg) aishVar).d;
                if (aisdVar == null) {
                    defpackage.aisc aiscVar2 = ((defpackage.aisg) aishVar).b;
                    if (aiscVar2.d()) {
                        defpackage.ahvr.bZ(!aiscVar2.e(), "Cannot call upperCase() on a mixed-case alphabet");
                        char[] cArr = aiscVar2.b;
                        char[] cArr2 = new char[cArr.length];
                        for (int i = 0; i < cArr.length; i++) {
                            cArr2[i] = defpackage.ahvr.o(cArr[i]);
                        }
                        aiscVar = new defpackage.aisc(aiscVar2.a.concat(".upperCase()"), cArr2);
                        if (aiscVar2.h) {
                            aiscVar = aiscVar.c();
                        }
                    } else {
                        aiscVar = aiscVar2;
                    }
                    if (aiscVar == aiscVar2) {
                        aisdVar = aishVar;
                    } else {
                        java.lang.Character ch = ((defpackage.aisg) aishVar).c;
                        aisdVar = new defpackage.aisd(aiscVar);
                    }
                    ((defpackage.aisg) aishVar).d = aisdVar;
                }
                return j$.util.Optional.of(aisdVar.k(bArrDigest));
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            ((defpackage.aimw) ((defpackage.aimw) a.c()).l("com/google/android/libraries/micore/telephony/common/infra/PackageUtils", "getCertificateFingerprint", 59, "PackageUtils.java")).y("Can not find certificate for package %s", packageName);
        } catch (java.security.NoSuchAlgorithmException unused2) {
            ((defpackage.aimw) ((defpackage.aimw) a.c()).l("com/google/android/libraries/micore/telephony/common/infra/PackageUtils", "getCertificateFingerprint", 61, "PackageUtils.java")).y("Can not find %s algorithm", "SHA1");
        }
        return optionalEmpty;
    }
}
