package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afau extends defpackage.afay {
    @Override // defpackage.afay
    protected final int a(android.content.Context context, defpackage.afpl afplVar, boolean z) {
        return (((android.net.Uri) afplVar.a).getAuthority().lastIndexOf(64) < 0 || dff.i(context, "android.permission.INTERACT_ACROSS_USERS", android.os.Process.myPid(), android.os.Process.myUid(), context.getPackageName()) != 0) ? 3 : 2;
    }
}
