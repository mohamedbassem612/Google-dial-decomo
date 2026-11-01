package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apnl extends defpackage.apnn {
    public final java.util.List a;

    public apnl() {
        defpackage.apnw[] apnwVarArr = new defpackage.apnw[3];
        apnwVarArr[0] = defpackage.aoov.aX() ? new defpackage.apnp() : null;
        apnwVarArr[1] = new defpackage.apno();
        apnwVarArr[2] = new defpackage.apnv(defpackage.apnu.a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.ajsz.di(apnwVarArr, arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((defpackage.apnw) obj).c()) {
                arrayList2.add(obj);
            }
        }
        this.a = arrayList2;
    }

    @Override // defpackage.apnn
    public final javax.net.ssl.SSLContext a() {
        android.os.StrictMode.noteSlowCall("newSSLContext");
        return super.a();
    }

    @Override // defpackage.apnn
    public final void b(java.lang.String str, java.lang.Throwable th) {
        int i = apnm.a;
        android.util.Log.i("OkHttp", str, th);
    }
}
