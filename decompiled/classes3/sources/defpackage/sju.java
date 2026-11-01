package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class sju extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    java.lang.Object f;
    int g;
    final /* synthetic */ defpackage.abxt h;
    final /* synthetic */ sjy i;
    final /* synthetic */ int j;
    final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sju(defpackage.abxt abxtVar, sjy sjyVar, int i, int i2, aoln aolnVar) {
        super(2, aolnVar);
        this.h = abxtVar;
        this.i = sjyVar;
        this.j = i;
        this.k = i2;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f1 A[Catch: all -> 0x0266, TryCatch #1 {all -> 0x0266, blocks: (B:80:0x01e9, B:82:0x01f1, B:84:0x0205, B:77:0x01cb), top: B:108:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0205 A[Catch: all -> 0x0266, TRY_LEAVE, TryCatch #1 {all -> 0x0266, blocks: (B:80:0x01e9, B:82:0x01f1, B:84:0x0205, B:77:0x01cb), top: B:108:0x01cb }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final java.lang.Object b(java.lang.Object obj) {
        ?? r2;
        java.lang.Throwable th;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object objC;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object objD;
        ?? r6;
        ?? r7;
        java.io.File file;
        defpackage.abxp abxpVarE;
        defpackage.abxs abxsVarG;
        boolean z;
        aoiu aoiuVar;
        android.graphics.Bitmap bitmapA;
        java.lang.Integer numO;
        aoiu aoiuVar2;
        java.lang.Integer numO2;
        aolu aoluVar = aolu.a;
        int i = this.g;
        try {
            if (i != 0) {
                try {
                    if (i != 1) {
                        obj6 = this.f;
                        obj2 = this.e;
                        obj7 = this.d;
                        obj3 = this.c;
                        java.lang.Object obj8 = this.b;
                        java.lang.Object obj9 = this.a;
                        aooc.af(obj);
                        obj4 = obj9;
                        objD = obj;
                        r7 = obj8;
                    } else {
                        obj2 = this.e;
                        java.lang.Object obj10 = this.d;
                        obj3 = this.c;
                        java.lang.Object obj11 = this.b;
                        obj4 = this.a;
                        aooc.af(obj);
                        obj5 = obj10;
                        objC = obj;
                        r7 = obj11;
                        try {
                            file = (java.io.File) objC;
                            this.a = obj4;
                            this.b = r7;
                            this.c = obj3;
                            this.d = obj5;
                            this.e = obj2;
                            this.f = file;
                            this.g = 2;
                            android.graphics.Bitmap.CompressFormat compressFormat = sjy.a;
                            objD = ((sjy) obj3).d(this);
                            if (objD != aoluVar) {
                                return aoluVar;
                            }
                            obj6 = file;
                            obj7 = obj5;
                            r7 = r7;
                        } catch (java.lang.Throwable th2) {
                            i = 0;
                            th = th2;
                            r6 = r7;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th3) {
                                ajsz.ak((java.io.Closeable) r6, th);
                                throw th3;
                            }
                        }
                    }
                    if (((java.lang.Boolean) objD).booleanValue()) {
                        android.graphics.Bitmap.CompressFormat compressFormat2 = sjy.a;
                        if (((sjy) obj3).m((java.lang.String) obj4, (java.io.File) obj6, (android.graphics.Bitmap) obj2, 100)) {
                            defpackage.vqf vqfVarH = defpackage.abxl.H(((alad) obj7).p());
                            defpackage.vqf vqfVarK = defpackage.abxl.K(defpackage.abxp.a.m());
                            defpackage.vqf vqfVarI = defpackage.abxl.I(defpackage.abxs.a.m());
                            java.lang.String string = ((sjy) obj3).k.u((java.io.File) obj6).toString();
                            aooh.e(string, "toString(...)");
                            vqfVarI.P(string);
                            defpackage.abjl abjlVar = defpackage.abjl.a;
                            vqfVarI.R(abjlVar.b);
                            vqfVarI.S(abjlVar.c);
                            vqfVarI.T(abjlVar.d);
                            vqfVarK.ac(vqfVarI.O());
                            vqfVarH.M(vqfVarK.ab());
                            defpackage.abxt abxtVarL = vqfVarH.L();
                            ajsz.ak((java.io.Closeable) r7, (java.lang.Throwable) null);
                            return abxtVarL;
                        }
                    }
                    r2 = 0;
                    ajsz.ak((java.io.Closeable) r7, (java.lang.Throwable) null);
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    i = 0;
                    throw th;
                }
            } else {
                aooc.af(obj);
                defpackage.abxt abxtVar = this.h;
                if (abxtVar == null || (abxpVarE = defpackage.abxl.e(abxtVar)) == null || (abxsVarG = defpackage.abxl.g(abxpVarE)) == null) {
                    r2 = 0;
                } else {
                    java.lang.String str = abxsVarG.f;
                    aooh.e(str, "getImageUri(...)");
                    android.net.Uri uri = android.net.Uri.parse(str);
                    aooh.e(uri, "parse(...)");
                    sjy sjyVar = this.i;
                    java.lang.String strL = sjyVar.l(uri);
                    try {
                        java.io.InputStream inputStreamC = defpackage.afax.c(sjyVar.c, uri, pez.aw(uri));
                        int i2 = this.j;
                        int i3 = this.k;
                        try {
                            boolean z2 = false;
                            if (((java.lang.Boolean) sjyVar.i.a()).booleanValue()) {
                                defpackage.abwe abweVar = new defpackage.abwe(i2, i3, abxsVarG.c, abxsVarG.d, abxsVarG.e);
                                aooh.c(inputStreamC);
                                aooh.f(inputStreamC, "inputStream");
                                int iIntValue = (strL == null || (numO2 = aoov.o(strL)) == null) ? 1 : numO2.intValue();
                                if (iIntValue == 6) {
                                    z2 = true;
                                } else if (iIntValue == 8) {
                                    iIntValue = 8;
                                    z2 = true;
                                }
                                int i4 = z2 ? abweVar.b : abweVar.a;
                                int i5 = z2 ? abweVar.a : abweVar.b;
                                float f = abweVar.d;
                                float f2 = abweVar.e;
                                if (iIntValue == 3) {
                                    aoiuVar2 = new aoiu(java.lang.Float.valueOf(-f), java.lang.Float.valueOf(-f2));
                                } else if (iIntValue != 6) {
                                    aoiuVar2 = iIntValue != 8 ? new aoiu(java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2)) : new aoiu(java.lang.Float.valueOf(-f2), java.lang.Float.valueOf(f));
                                } else {
                                    aoiuVar2 = new aoiu(java.lang.Float.valueOf(f2), java.lang.Float.valueOf(-f));
                                }
                                bitmapA = defpackage.abjk.a(inputStreamC, i4, i5, new defpackage.abjl(abweVar.c, ((java.lang.Number) aoiuVar2.a).floatValue(), ((java.lang.Number) aoiuVar2.b).floatValue()));
                            } else {
                                aooh.c(inputStreamC);
                                int iIntValue2 = (strL == null || (numO = aoov.o(strL)) == null) ? 1 : numO.intValue();
                                if (iIntValue2 == 6) {
                                    z = true;
                                } else if (iIntValue2 == 8) {
                                    iIntValue2 = 8;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                int i6 = true != z ? i2 : i3;
                                if (true != z) {
                                    i2 = i3;
                                }
                                float f3 = abxsVarG.d;
                                float f4 = abxsVarG.e;
                                if (iIntValue2 == 3) {
                                    aoiuVar = new aoiu(java.lang.Float.valueOf(-f3), java.lang.Float.valueOf(-f4));
                                } else if (iIntValue2 != 6) {
                                    aoiuVar = iIntValue2 != 8 ? new aoiu(java.lang.Float.valueOf(f3), java.lang.Float.valueOf(f4)) : new aoiu(java.lang.Float.valueOf(-f4), java.lang.Float.valueOf(f3));
                                } else {
                                    aoiuVar = new aoiu(java.lang.Float.valueOf(f4), java.lang.Float.valueOf(-f3));
                                }
                                bitmapA = defpackage.abjk.a(inputStreamC, i6, i2, new defpackage.abjl(abxsVarG.c, ((java.lang.Number) aoiuVar.a).floatValue(), ((java.lang.Number) aoiuVar.b).floatValue()));
                            }
                            this.a = strL;
                            this.b = inputStreamC;
                            this.c = sjyVar;
                            this.d = abxtVar;
                            this.e = bitmapA;
                            this.g = 1;
                            objC = sjyVar.c(uri, this);
                            if (objC == aoluVar) {
                                return aoluVar;
                            }
                            android.graphics.Bitmap bitmap = bitmapA;
                            obj5 = abxtVar;
                            obj2 = bitmap;
                            obj3 = sjyVar;
                            obj4 = strL;
                            r7 = inputStreamC;
                            file = (java.io.File) objC;
                            this.a = obj4;
                            this.b = r7;
                            this.c = obj3;
                            this.d = obj5;
                            this.e = obj2;
                            this.f = file;
                            this.g = 2;
                            android.graphics.Bitmap.CompressFormat compressFormat3 = sjy.a;
                            objD = ((sjy) obj3).d(this);
                            if (objD != aoluVar) {
                                return aoluVar;
                            }
                            obj6 = file;
                            obj7 = obj5;
                            r7 = r7;
                            if (((java.lang.Boolean) objD).booleanValue()) {
                                android.graphics.Bitmap.CompressFormat compressFormat4 = sjy.a;
                                if (((sjy) obj3).m((java.lang.String) obj4, (java.io.File) obj6, (android.graphics.Bitmap) obj2, 100)) {
                                    defpackage.vqf vqfVarH2 = defpackage.abxl.H(((alad) obj7).p());
                                    defpackage.vqf vqfVarK2 = defpackage.abxl.K(defpackage.abxp.a.m());
                                    defpackage.vqf vqfVarI2 = defpackage.abxl.I(defpackage.abxs.a.m());
                                    java.lang.String string2 = ((sjy) obj3).k.u((java.io.File) obj6).toString();
                                    aooh.e(string2, "toString(...)");
                                    vqfVarI2.P(string2);
                                    defpackage.abjl abjlVar2 = defpackage.abjl.a;
                                    vqfVarI2.R(abjlVar2.b);
                                    vqfVarI2.S(abjlVar2.c);
                                    vqfVarI2.T(abjlVar2.d);
                                    vqfVarK2.ac(vqfVarI2.O());
                                    vqfVarH2.M(vqfVarK2.ab());
                                    defpackage.abxt abxtVarL2 = vqfVarH2.L();
                                    ajsz.ak((java.io.Closeable) r7, (java.lang.Throwable) null);
                                    return abxtVarL2;
                                }
                            }
                            r2 = 0;
                            ajsz.ak((java.io.Closeable) r7, (java.lang.Throwable) null);
                        } catch (java.lang.Throwable th5) {
                            i = 0;
                            th = th5;
                            r6 = inputStreamC;
                            throw th;
                        }
                    } catch (java.lang.Exception e) {
                        e = e;
                        i = 0;
                        sjy.b.d().k(e).l("com/android/dialer/patrick/onboarding/imageprocessor/CallingCardImageProcessor", "cropImage$<anonymous>", 322, "CallingCardImageProcessor.kt").v("Error trying to open input stream when cropping uri.");
                        r2 = i;
                    }
                }
            }
        } catch (java.lang.Exception e2) {
            e = e2;
        }
        return r2;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.sju(this.h, this.i, this.j, this.k, aolnVar);
    }
}
