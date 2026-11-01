package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeww extends defpackage.aexb {
    public aeww(defpackage.aewz aewzVar, java.lang.String str, java.lang.Object obj) {
        super(aewzVar, str, obj, false);
    }

    @Override // defpackage.aexb
    public final java.lang.Object a(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            try {
                return (defpackage.amue) defpackage.alad.y(defpackage.amue.a, android.util.Base64.decode((java.lang.String) obj, 3));
            } catch (java.io.IOException | java.lang.IllegalArgumentException unused) {
            }
        }
        android.util.Log.e("PhenotypeFlag", "Invalid byte[] value for " + super.d() + ": " + java.lang.String.valueOf(obj));
        return null;
    }
}
