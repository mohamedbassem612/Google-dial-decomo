package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aewv extends aexb {
    public aewv(aewz aewzVar, java.lang.Double d) {
        super(aewzVar, "fraction_free_space_after_download", d, true);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        if (obj instanceof java.lang.Double) {
            return (java.lang.Double) obj;
        }
        if (obj instanceof java.lang.Float) {
            return java.lang.Double.valueOf(((java.lang.Float) obj).doubleValue());
        }
        if (obj instanceof java.lang.String) {
            try {
                return java.lang.Double.valueOf(java.lang.Double.parseDouble((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        android.util.Log.e("PhenotypeFlag", "Invalid double value for " + super.d() + ": " + java.lang.String.valueOf(obj));
        return null;
    }
}
