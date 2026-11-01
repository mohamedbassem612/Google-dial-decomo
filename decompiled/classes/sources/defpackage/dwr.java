package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class dwr extends defpackage.dzk {
    public dwr() {
        super((char[]) null);
    }

    private static int V(android.graphics.fonts.FontStyle fontStyle, android.graphics.fonts.FontStyle fontStyle2) {
        return (java.lang.Math.abs(fn$.ExternalSyntheticApiModelOutline0.m(fontStyle) - fn$.ExternalSyntheticApiModelOutline0.m(fontStyle2)) / 100) + (fn$.ExternalSyntheticApiModelOutline0.m$1(fontStyle) == fn$.ExternalSyntheticApiModelOutline0.m$1(fontStyle2) ? 0 : 2);
    }

    private static final android.graphics.fonts.Font W(android.graphics.fonts.FontFamily fontFamily, int i) {
        android.graphics.fonts.FontStyle fontStyle = new android.graphics.fonts.FontStyle(1 != (i & 1) ? 400 : 700, (i & 2) != 0 ? 1 : 0);
        android.graphics.fonts.Font fontM = fn$.ExternalSyntheticApiModelOutline0.m(fontFamily, 0);
        int iV = V(fontStyle, fn$.ExternalSyntheticApiModelOutline0.m(fontM));
        for (int i2 = 1; i2 < fn$.ExternalSyntheticApiModelOutline0.m(fontFamily); i2++) {
            android.graphics.fonts.Font fontM2 = fn$.ExternalSyntheticApiModelOutline0.m(fontFamily, i2);
            int iV2 = V(fontStyle, fn$.ExternalSyntheticApiModelOutline0.m(fontM2));
            if (iV2 < iV) {
                fontM = fontM2;
                iV = iV2;
            }
        }
        return fontM;
    }

    protected android.graphics.fonts.Font h(dxo dxoVar) {
        throw new java.lang.UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    @Override // defpackage.dzk
    public final android.graphics.Typeface i(android.content.Context context, dxo[] dxoVarArr, int i) {
        try {
            android.graphics.fonts.FontFamily fontFamilyK = k(dxoVarArr, context.getContentResolver());
            if (fontFamilyK != null) {
                return da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyK), fn$.ExternalSyntheticApiModelOutline0.m(W(fontFamilyK, i))));
            }
            return null;
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.dzk
    public final android.graphics.Typeface j(android.content.Context context, java.util.List list, int i) {
        android.content.ContentResolver contentResolver = context.getContentResolver();
        try {
            android.graphics.fonts.FontFamily fontFamilyK = k((dxo[]) list.get(0), contentResolver);
            if (fontFamilyK == null) {
                return null;
            }
            android.graphics.Typeface.CustomFallbackBuilder customFallbackBuilder = new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyK);
            for (int i2 = 1; i2 < list.size(); i2++) {
                android.graphics.fonts.FontFamily fontFamilyK2 = k((dxo[]) list.get(i2), contentResolver);
                if (fontFamilyK2 != null) {
                    da$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, fontFamilyK2);
                }
            }
            return da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(customFallbackBuilder, fn$.ExternalSyntheticApiModelOutline0.m(W(fontFamilyK, i))));
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    protected final android.graphics.fonts.FontFamily k(dxo[] dxoVarArr, android.content.ContentResolver contentResolver) {
        android.graphics.fonts.Font fontM;
        android.graphics.fonts.FontFamily.Builder builder = null;
        for (dxo dxoVar : dxoVarArr) {
            if (dxoVar.a()) {
                fontM = h(dxoVar);
            } else {
                try {
                    android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(dxoVar.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            android.graphics.fonts.Font.Builder builderM$2 = da$.ExternalSyntheticApiModelOutline0.m$2(da$.ExternalSyntheticApiModelOutline0.m$1(da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(parcelFileDescriptorOpenFileDescriptor), dxoVar.c), dxoVar.d ? 1 : 0), dxoVar.b);
                            java.lang.String str = dxoVar.e;
                            if (!android.text.TextUtils.isEmpty(str)) {
                                da$.ExternalSyntheticApiModelOutline0.m(builderM$2, str);
                            }
                            fontM = da$.ExternalSyntheticApiModelOutline0.m(builderM$2);
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (java.lang.Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        fontM = null;
                    }
                } catch (java.io.IOException e) {
                    android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontM = null;
                }
            }
            if (fontM != null) {
                if (builder == null) {
                    builder = new android.graphics.fonts.FontFamily.Builder(fontM);
                } else {
                    fn$.ExternalSyntheticApiModelOutline0.m(builder, fontM);
                }
            }
        }
        if (builder != null) {
            return da$.ExternalSyntheticApiModelOutline0.m(builder);
        }
        return null;
    }

    @Override // defpackage.dzk
    public final android.graphics.Typeface l(android.content.res.Resources resources, int i) {
        try {
            android.graphics.fonts.Font fontM = da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(resources, i));
            return da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.Typeface.CustomFallbackBuilder(da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.FontFamily.Builder(fontM))), fn$.ExternalSyntheticApiModelOutline0.m(fontM)));
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // defpackage.dzk
    public final android.graphics.Typeface m(ni niVar, android.content.res.Resources resources, int i) {
        try {
            java.lang.Object obj = niVar.a;
            int length = ((dwf[]) obj).length;
            android.graphics.fonts.FontFamily.Builder builder = null;
            for (int i2 = 0; i2 < length; i2++) {
                dwf dwfVar = ((dwf[]) obj)[i2];
                try {
                    android.graphics.fonts.Font fontM = da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m$2(da$.ExternalSyntheticApiModelOutline0.m$1(da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.fonts.Font.Builder(resources, dwfVar.e), dwfVar.a), dwfVar.b ? 1 : 0), dwfVar.d), dwfVar.c));
                    if (builder == null) {
                        builder = new android.graphics.fonts.FontFamily.Builder(fontM);
                    } else {
                        fn$.ExternalSyntheticApiModelOutline0.m(builder, fontM);
                    }
                } catch (java.io.IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            android.graphics.fonts.FontFamily fontFamilyM = da$.ExternalSyntheticApiModelOutline0.m(builder);
            return da$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(new android.graphics.Typeface.CustomFallbackBuilder(fontFamilyM), fn$.ExternalSyntheticApiModelOutline0.m(W(fontFamilyM, i))));
        } catch (java.lang.Exception e) {
            android.util.Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }
}
