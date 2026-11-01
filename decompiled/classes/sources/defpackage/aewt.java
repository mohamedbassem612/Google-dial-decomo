package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aewt extends defpackage.aexb {
    public aewt(defpackage.aewz aewzVar, java.lang.String str, java.lang.Long l) {
        super(aewzVar, str, l, true);
    }

    @Override // defpackage.aexb
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        if (obj instanceof java.lang.Long) {
            return (java.lang.Long) obj;
        }
        if (obj instanceof java.lang.String) {
            try {
                return java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        android.util.Log.e("PhenotypeFlag", "Invalid long value for " + super.d() + ": " + java.lang.String.valueOf(obj));
        return null;
    }
}
