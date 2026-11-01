package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dux {
    static void a(android.app.Notification.BigPictureStyle bigPictureStyle, android.graphics.drawable.Icon icon) {
        ac$.ExternalSyntheticApiModelOutline0.m(bigPictureStyle, icon);
    }

    static void b(android.app.Notification.BigPictureStyle bigPictureStyle, java.lang.CharSequence charSequence) {
        ac$.ExternalSyntheticApiModelOutline0.m(bigPictureStyle, (java.lang.CharSequence) null);
    }

    static void c(android.app.Notification.BigPictureStyle bigPictureStyle, boolean z) {
        ac$.ExternalSyntheticApiModelOutline0.m(bigPictureStyle, false);
    }

    public static android.app.Person d(defpackage.dvv dvvVar) {
        android.app.Person.Builder builderM = ft$.ExternalSyntheticApiModelOutline0.m(new android.app.Person.Builder(), dvvVar.a);
        androidx.core.graphics.drawable.IconCompat iconCompat = dvvVar.b;
        return ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m$1(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m$1(ft$.ExternalSyntheticApiModelOutline0.m(ft$.ExternalSyntheticApiModelOutline0.m(builderM, iconCompat != null ? defpackage.dvg.c(iconCompat) : null), dvvVar.c), dvvVar.d), dvvVar.e), dvvVar.f));
    }

    public static final defpackage.duw e(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!arrayList.isEmpty()) {
        }
        return new defpackage.duw(iconCompat, charSequence, pendingIntent, bundle, arrayList2.isEmpty() ? null : (dvf[]) arrayList2.toArray(new dvf[arrayList2.size()]));
    }

    public static int f(android.app.AppOpsManager appOpsManager, java.lang.String str, int i, java.lang.String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }
}
