package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class ammx implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ ammx(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        java.lang.String strE;
        java.lang.String strE2;
        java.lang.String strE3;
        java.lang.String strE4;
        java.lang.String strE5;
        java.lang.String strE6;
        switch (this.$cid) {
            case 0:
                return ((java.security.MessageDigest) obj).getAlgorithm();
            case 1:
                return new java.util.HashSet((java.util.List) obj);
            case 2:
                android.content.Context context = (android.content.Context) obj;
                java.lang.String str = defpackage.andz.a;
                if (str != null) {
                    return str;
                }
                synchronized (defpackage.andz.class) {
                    strE = defpackage.andz.a;
                    if (strE == null) {
                        strE = aewo.e(context, "com.google.android.libraries.consentverifier");
                        defpackage.andz.a = strE;
                    }
                    break;
                }
                return strE;
            case 3:
                android.content.Context context2 = (android.content.Context) obj;
                java.lang.String str2 = defpackage.anhf.a;
                if (str2 != null) {
                    return str2;
                }
                synchronized (defpackage.anhf.class) {
                    strE2 = defpackage.anhf.a;
                    if (strE2 == null) {
                        strE2 = aewo.e(context2, "com.google.android.libraries.onegoogle");
                        defpackage.anhf.a = strE2;
                    }
                    break;
                }
                return strE2;
            case 4:
                android.content.Context context3 = (android.content.Context) obj;
                java.lang.String str3 = defpackage.anhj.a;
                if (str3 != null) {
                    return str3;
                }
                synchronized (defpackage.anhj.class) {
                    strE3 = defpackage.anhj.a;
                    if (strE3 == null) {
                        strE3 = aewo.e(context3, "com.google.android.libraries.user.profile.photopicker");
                        defpackage.anhj.a = strE3;
                    }
                    break;
                }
                return strE3;
            case 5:
                android.content.Context context4 = (android.content.Context) obj;
                java.lang.String str4 = defpackage.anhq.a;
                if (str4 != null) {
                    return str4;
                }
                synchronized (defpackage.anhq.class) {
                    strE4 = defpackage.anhq.a;
                    if (strE4 == null) {
                        strE4 = aewo.e(context4, "com.google.android.libraries.performance.primes");
                        defpackage.anhq.a = strE4;
                    }
                    break;
                }
                return strE4;
            case 6:
                android.content.Context context5 = (android.content.Context) obj;
                java.lang.String str5 = defpackage.anjq.a;
                if (str5 != null) {
                    return str5;
                }
                synchronized (defpackage.anjq.class) {
                    strE5 = defpackage.anjq.a;
                    if (strE5 == null) {
                        strE5 = aewo.e(context5, "com.google.privacy.ptoken.ondevice");
                        defpackage.anjq.a = strE5;
                    }
                    break;
                }
                return strE5;
            case 7:
                android.content.Context context6 = (android.content.Context) obj;
                java.lang.String str6 = defpackage.anju.a;
                if (str6 != null) {
                    return str6;
                }
                synchronized (defpackage.anju.class) {
                    strE6 = defpackage.anju.a;
                    if (strE6 == null) {
                        strE6 = aewo.e(context6, "com.google.android.libraries.surveys");
                        defpackage.anju.a = strE6;
                    }
                    break;
                }
                return strE6;
            default:
                java.util.logging.Logger logger = defpackage.aoap.f;
                return ((defpackage.aoao) obj).a;
        }
    }
}
