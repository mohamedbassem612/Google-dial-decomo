package androidx.core.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class RemoteActionCompatParcelizer {
    public static androidx.core.app.RemoteActionCompat read(defpackage.gmg gmgVar) {
        androidx.core.app.RemoteActionCompat remoteActionCompat = new androidx.core.app.RemoteActionCompat();
        remoteActionCompat.a = (androidx.core.graphics.drawable.IconCompat) gmgVar.t(remoteActionCompat.a);
        remoteActionCompat.b = gmgVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = gmgVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (android.app.PendingIntent) gmgVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = gmgVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = gmgVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(androidx.core.app.RemoteActionCompat remoteActionCompat, defpackage.gmg gmgVar) {
        gmgVar.u(remoteActionCompat.a);
        gmgVar.g(remoteActionCompat.b, 2);
        gmgVar.g(remoteActionCompat.c, 3);
        gmgVar.i(remoteActionCompat.d, 4);
        gmgVar.f(remoteActionCompat.e, 5);
        gmgVar.f(remoteActionCompat.f, 6);
    }
}
