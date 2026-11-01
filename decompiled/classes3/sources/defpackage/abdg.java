package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abdg extends defpackage.abcq {
    public abdg() {
        super(defpackage.zvl.SEND_BROADCAST, 10L);
    }

    @Override // defpackage.abcq
    public final defpackage.abcv a(defpackage.abcv abcvVar, ahyn ahynVar) {
        if (!ahynVar.f() || ((defpackage.zvz) ahynVar.b()).c != 3) {
            throw new java.lang.IllegalArgumentException();
        }
        defpackage.zvz zvzVar = (defpackage.zvz) ahynVar.b();
        defpackage.zvv zvvVar = zvzVar.c == 3 ? (defpackage.zvv) zvzVar.d : defpackage.zvv.a;
        android.content.Context context = abcvVar.b;
        java.lang.String packageName = context.getPackageName();
        android.content.Intent intent = new android.content.Intent().setPackage(packageName);
        if ((zvvVar.b & 1) != 0) {
            intent.setAction(zvvVar.c);
        }
        if ((zvvVar.b & 2) != 0) {
            intent.setComponent(new android.content.ComponentName(packageName, zvvVar.d));
        }
        if ((zvvVar.b & 4) != 0) {
            intent.setData(android.net.Uri.parse(zvvVar.e));
        }
        java.util.Iterator it = zvvVar.f.iterator();
        while (it.hasNext()) {
            afsq.bH(intent, (zvr) it.next());
        }
        java.util.List<android.content.pm.ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
            throw new java.lang.IllegalStateException("No receiver for intent. ".concat(java.lang.String.valueOf(java.lang.String.valueOf(intent))));
        }
        android.util.Log.d("SEND_BROADCAST_FIX", "Broadcasting: intent=".concat(java.lang.String.valueOf(java.lang.String.valueOf(intent))));
        context.sendBroadcast(intent);
        return abcvVar;
    }

    @Override // defpackage.abcq
    public final java.lang.String b() {
        return "SEND_BROADCAST_FIX";
    }
}
