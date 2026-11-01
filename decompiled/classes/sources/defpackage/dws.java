package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dws extends defpackage.dwr {
    @Override // defpackage.dwr
    protected final android.graphics.fonts.Font h(dxo dxoVar) {
        android.graphics.fonts.Font fontB;
        java.lang.String authority = dxoVar.a() ? dxoVar.a.getAuthority() : null;
        if (authority == null) {
            return null;
        }
        android.graphics.Typeface typefaceCreate = android.graphics.Typeface.create(authority, 0);
        android.graphics.Typeface typefaceCreate2 = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            typefaceCreate = null;
        }
        if (typefaceCreate == null || (fontB = defpackage.dwq.b(typefaceCreate)) == null) {
            return null;
        }
        java.lang.String str = dxoVar.e;
        if (android.text.TextUtils.isEmpty(str)) {
            return fontB;
        }
        try {
            return da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(fontB), str));
        } catch (java.io.IOException unused) {
            android.util.Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
            return null;
        }
    }
}
