package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aewu extends defpackage.aexb {
    public aewu(defpackage.aewz aewzVar, java.lang.String str, java.lang.Boolean bool) {
        super(aewzVar, str, bool, true);
    }

    @Override // defpackage.aexb
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        if (obj instanceof java.lang.Boolean) {
            return (java.lang.Boolean) obj;
        }
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (defpackage.aayn.c.matcher(str).matches()) {
                return java.lang.Boolean.TRUE;
            }
            if (defpackage.aayn.d.matcher(str).matches()) {
                return java.lang.Boolean.FALSE;
            }
        }
        android.util.Log.e("PhenotypeFlag", "Invalid boolean value for " + super.d() + ": " + java.lang.String.valueOf(obj));
        return null;
    }
}
