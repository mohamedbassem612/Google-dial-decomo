package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abdj extends defpackage.abcq {
    public abdj() {
        super(defpackage.zvl.START_SERVICE, 10L);
    }

    @Override // defpackage.abcq
    public final defpackage.abcv a(defpackage.abcv abcvVar, ahyn ahynVar) {
        if (!ahynVar.f() || ((defpackage.zvz) ahynVar.b()).c != 10) {
            throw new java.lang.IllegalArgumentException();
        }
        defpackage.zvz zvzVar = (defpackage.zvz) ahynVar.b();
        defpackage.zvx zvxVar = zvzVar.c == 10 ? (defpackage.zvx) zvzVar.d : defpackage.zvx.a;
        android.content.Context context = abcvVar.b;
        java.lang.String packageName = context.getPackageName();
        android.content.Intent intent = new android.content.Intent().setPackage(packageName);
        if ((zvxVar.b & 1) != 0) {
            intent.setAction(zvxVar.c);
        }
        if ((zvxVar.b & 2) != 0) {
            intent.setComponent(new android.content.ComponentName(packageName, zvxVar.d));
        }
        for (int i = 0; i < zvxVar.e.size(); i++) {
            intent.addCategory((java.lang.String) zvxVar.e.get(i));
        }
        java.util.Iterator it = zvxVar.f.iterator();
        while (it.hasNext()) {
            afsq.bH(intent, (zvr) it.next());
        }
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            throw new java.lang.IllegalStateException("No receiver for intent. ".concat(java.lang.String.valueOf(java.lang.String.valueOf(intent))));
        }
        android.util.Log.i("START_SERVICE_FIX", "Starting service: intent=".concat(java.lang.String.valueOf(java.lang.String.valueOf(intent))));
        if (zvxVar.g) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
        return abcvVar;
    }

    @Override // defpackage.abcq
    public final java.lang.String b() {
        return "START_SERVICE_FIX";
    }
}
