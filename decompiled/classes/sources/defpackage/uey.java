package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uey {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/spam/inapp/SpamGrpcStubFactory");
    public final java.util.concurrent.ScheduledExecutorService b;
    public final defpackage.rsr c;

    public uey(defpackage.rsr rsrVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.c = rsrVar;
        this.b = scheduledExecutorService;
    }

    public static java.lang.String a(android.content.Context context) {
        try {
            return defpackage.aish.g.k(java.security.MessageDigest.getInstance("SHA1").digest(context.getPackageManager().getPackageInfo(context.getApplicationInfo().packageName, 64).signatures[0].toByteArray()));
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/spam/inapp/SpamGrpcStubFactory", "androidCert", 'k', "SpamGrpcStubFactory.java")).v("androidCert NameNotFoundException");
            return null;
        } catch (java.security.NoSuchAlgorithmException e2) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.c()).i(defpackage.zct.b)).k(e2)).l("com/android/dialer/spam/inapp/SpamGrpcStubFactory", "androidCert", 'q', "SpamGrpcStubFactory.java")).v("androidCert NoSuchAlgorithmException");
            return null;
        }
    }
}
