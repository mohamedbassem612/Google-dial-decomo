package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aewx extends defpackage.aexb {
    final /* synthetic */ defpackage.aewy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aewx(defpackage.aewz aewzVar, java.lang.String str, java.lang.String str2, defpackage.aewy aewyVar) {
        super(aewzVar, str, str2);
        this.a = aewyVar;
    }

    @Override // defpackage.aexb
    public final java.lang.Object a(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            try {
                return this.a.a(android.util.Base64.decode((java.lang.String) obj, 3));
            } catch (java.io.IOException | java.lang.IllegalArgumentException unused) {
            }
        }
        android.util.Log.e("PhenotypeFlag", "Invalid byte[] value for " + super.d() + ": " + java.lang.String.valueOf(obj));
        return null;
    }
}
