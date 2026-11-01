package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dni {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.ThreadLocal b = new java.lang.ThreadLocal();

    public static final android.graphics.Typeface a(android.graphics.Typeface typeface, defpackage.dnb dnbVar, android.content.Context context) throws java.io.IOException {
        java.lang.String strC;
        float fC;
        if (typeface == null) {
            return null;
        }
        java.util.List list = dnbVar.a;
        if (list.isEmpty()) {
            return typeface;
        }
        java.lang.ThreadLocal threadLocal = b;
        android.graphics.Paint paint = (android.graphics.Paint) threadLocal.get();
        if (paint == null) {
            paint = new android.graphics.Paint();
            threadLocal.set(paint);
        }
        android.graphics.Paint paint2 = paint;
        aa$.ExternalSyntheticApiModelOutline0.m(paint2, (java.lang.String) null);
        paint2.setTypeface(typeface);
        defpackage.dpe.m(context);
        int iBn = defpackage.mni.bn(context);
        if (iBn == 0) {
            strC = defpackage.dpy.c(list, null, null, null, new dkq(3), 31);
        } else {
            int size = list.size();
            java.lang.String strConcat = "";
            boolean z = false;
            for (int i = 0; i < size; i++) {
                defpackage.dmy dmyVar = (defpackage.dmy) list.get(i);
                if (defpackage.aooh.n(dmyVar.a(), "wght")) {
                    fC = defpackage.aooc.s(dmyVar.c() + iBn, 1.0f, 1000.0f);
                    z = true;
                } else {
                    fC = dmyVar.c();
                }
                if (i != 0) {
                    strConcat = strConcat.concat(",");
                }
                strConcat = ((java.lang.Object) strConcat) + '\'' + dmyVar.a() + "' " + fC;
            }
            if (z) {
                strC = strConcat;
            } else {
                float fS = defpackage.aooc.s(iBn + 400.0f, 1.0f, 1000.0f);
                if (!list.isEmpty()) {
                    strConcat = strConcat.concat(",");
                }
                strC = ((java.lang.Object) strConcat) + "'wght' " + fS;
            }
        }
        aa$.ExternalSyntheticApiModelOutline0.m(paint2, strC);
        return paint2.getTypeface();
    }
}
