package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aayw extends defpackage.aayx {
    public aayw(java.lang.Integer num) {
        super("gms:feedback_client:feedback_options_max_data_size", num);
    }

    @Override // defpackage.aayx
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        int iIntValue;
        android.content.ContentResolver contentResolver = defpackage.aayx.a;
        java.lang.Integer num = (java.lang.Integer) this.c;
        int iIntValue2 = num.intValue();
        aayu aayuVar = aaym.a;
        aayu aayuVar2 = aayuVar;
        aayuVar2.e(contentResolver);
        aayuVar2.c(contentResolver);
        aayuVar2.e.lock();
        java.lang.String str = this.b;
        try {
            java.lang.Object obj = aayuVar.j;
            java.lang.Integer numValueOf = (java.lang.Integer) aayuVar.b(aayuVar.h, str, num, aayu.b);
            aayuVar2.e.unlock();
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                java.lang.String strA = aayuVar2.a(contentResolver, str, (java.lang.String) null);
                if (strA != null) {
                    try {
                        int i = java.lang.Integer.parseInt(strA);
                        numValueOf = java.lang.Integer.valueOf(i);
                        iIntValue2 = i;
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
                aayuVar2.d(obj, aayuVar2.h, str, numValueOf, aayu.b);
                iIntValue = iIntValue2;
            }
            return java.lang.Integer.valueOf(iIntValue);
        } catch (java.lang.Throwable th) {
            aayuVar2.e.unlock();
            throw th;
        }
    }
}
