package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aayv extends defpackage.aayx {
    public aayv(java.lang.String str, java.lang.Boolean bool) {
        super(str, bool);
    }

    @Override // defpackage.aayx
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        boolean zBooleanValue;
        android.content.ContentResolver contentResolver = defpackage.aayx.a;
        java.lang.Boolean bool = (java.lang.Boolean) this.c;
        boolean zBooleanValue2 = bool.booleanValue();
        aayu aayuVar = aaym.a;
        aayu aayuVar2 = aayuVar;
        aayuVar2.e(contentResolver);
        aayuVar2.c(contentResolver);
        aayuVar2.e.lock();
        java.lang.String str = this.b;
        try {
            java.lang.Object obj = aayuVar.j;
            java.lang.Boolean bool2 = (java.lang.Boolean) aayuVar.b(aayuVar.g, str, bool, aayu.a);
            aayuVar2.e.unlock();
            if (bool2 != null) {
                zBooleanValue = bool2.booleanValue();
            } else {
                java.lang.String strA = aayuVar2.a(contentResolver, str, (java.lang.String) null);
                if (strA != null && !strA.isEmpty()) {
                    if (aayn.c.matcher(strA).matches()) {
                        bool2 = java.lang.Boolean.TRUE;
                        zBooleanValue2 = true;
                    } else if (aayn.d.matcher(strA).matches()) {
                        bool2 = java.lang.Boolean.FALSE;
                        zBooleanValue2 = false;
                    } else {
                        android.util.Log.w("Gservices", "attempt to read Gservices key " + str + " (value \"" + strA + "\") as boolean");
                    }
                }
                aayuVar2.d(obj, aayuVar2.g, str, bool2, aayu.a);
                zBooleanValue = zBooleanValue2;
            }
            return java.lang.Boolean.valueOf(zBooleanValue);
        } catch (java.lang.Throwable th) {
            aayuVar2.e.unlock();
            throw th;
        }
    }
}
