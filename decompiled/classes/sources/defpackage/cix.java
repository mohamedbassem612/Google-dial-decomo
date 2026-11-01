package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cix {
    public java.lang.Object a;
    public final java.lang.Object b;
    public java.lang.Object c;
    private final java.lang.Object d;
    private java.lang.Object e;

    public cix() {
        this.d = new java.lang.Object();
        this.b = new defpackage.civ();
        this.e = new defpackage.adq(16);
        this.c = new defpackage.adq(16);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dxw, java.lang.Object] */
    private final void f(android.graphics.Typeface typeface) {
        this.e = typeface;
        this.d.accept(typeface);
    }

    public final cal a(ciw ciwVar, defpackage.aomy aomyVar) {
        int i;
        int i2;
        int i3;
        defpackage.aoor aoorVar = new defpackage.aoor();
        aoorVar.a = -1;
        synchronized (this.d) {
            java.lang.Object obj = this.a;
            if (obj != null) {
                ciwVar.b((java.lang.Throwable) obj);
                return cak.a;
            }
            java.lang.Object obj2 = this.b;
            do {
                i = ((defpackage.civ) obj2).get();
                i2 = i + 1;
            } while (!((defpackage.civ) obj2).compareAndSet(i, i2));
            int i4 = 134217727 & i2;
            aoorVar.a = (i2 >>> 27) & 15;
            ((defpackage.adq) this.e).q(ciwVar);
            if (i4 == 1 && aomyVar != null) {
                try {
                    aomyVar.a();
                } catch (java.lang.Throwable th) {
                    synchronized (this.d) {
                        if (this.a == null) {
                            this.a = th;
                            java.lang.Object obj3 = this.e;
                            java.lang.Object[] objArr = ((defpackage.adq) obj3).a;
                            int i5 = ((defpackage.adq) obj3).b;
                            for (int i6 = 0; i6 < i5; i6++) {
                                ((ciw) objArr[i6]).b(th);
                            }
                            ((defpackage.adq) this.e).l();
                            java.lang.Object obj4 = this.b;
                            do {
                                i3 = ((defpackage.civ) obj4).get();
                            } while (!((defpackage.civ) obj4).compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                        }
                    }
                }
            }
            return new ccs(new af(ciwVar, this, aoorVar, 12));
        }
    }

    public final void b(defpackage.aonj aonjVar) {
        int i;
        synchronized (this.d) {
            java.lang.Object obj = this.e;
            this.e = this.c;
            this.c = obj;
            java.lang.Object obj2 = this.b;
            do {
                i = ((defpackage.civ) obj2).get();
            } while (!((defpackage.civ) obj2).compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
            int i2 = ((defpackage.adq) obj).b;
            for (int i3 = 0; i3 < i2; i3++) {
                aonjVar.a(((defpackage.adq) obj).c(i3));
            }
            ((defpackage.adq) obj).l();
        }
    }

    public final boolean c() {
        return (((defpackage.civ) this.b).get() & 134217727) > 0;
    }

    public final void d(android.graphics.Typeface typeface) {
        this.c = typeface;
        f(typeface);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    public final boolean e(java.lang.String str) {
        int iM;
        java.lang.String strM;
        android.graphics.fonts.FontVariationAxis[] fontVariationAxisArrM;
        int length;
        java.lang.Object obj = this.b;
        java.lang.Object typeface = this.c;
        android.widget.TextView textView = (android.widget.TextView) obj;
        android.text.TextPaint paint = textView.getPaint();
        if (this.e != paint.getTypeface()) {
            android.util.Log.w("FontVarSettings", "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
            typeface = paint.getTypeface();
        }
        if (android.os.Build.VERSION.SDK_INT < 31 || (iM = ac$.ExternalSyntheticApiModelOutline0.m(textView.getContext().getResources().getConfiguration())) == Integer.MAX_VALUE) {
            iM = 0;
        }
        defpackage.add addVar = ih.a;
        android.graphics.Typeface typeface2 = (android.graphics.Typeface) typeface;
        ig igVar = new ig(typeface2, str, iM);
        defpackage.add addVar2 = ih.a;
        android.graphics.Typeface typeface3 = (android.graphics.Typeface) addVar2.a(igVar);
        if (typeface3 == null) {
            android.graphics.Paint paint2 = ih.b;
            if (paint2 == null) {
                paint2 = new android.graphics.Paint();
                ih.b = paint2;
            }
            if (iM == 0) {
                strM = str;
            } else {
                if (android.text.TextUtils.isEmpty(str)) {
                    fontVariationAxisArrM = new android.graphics.fonts.FontVariationAxis[0];
                } else {
                    fontVariationAxisArrM = aa$.ExternalSyntheticApiModelOutline0.m(str);
                    if (fontVariationAxisArrM == null) {
                        strM = str;
                    }
                }
                int i = 0;
                boolean z = false;
                while (true) {
                    length = fontVariationAxisArrM.length;
                    if (i >= length) {
                        break;
                    }
                    android.graphics.fonts.FontVariationAxis fontVariationAxis = fontVariationAxisArrM[i];
                    if ("wght".equals(aa$.ExternalSyntheticApiModelOutline0.m(fontVariationAxis))) {
                        fontVariationAxisArrM[i] = new android.graphics.fonts.FontVariationAxis("wght", ih.a(aa$.ExternalSyntheticApiModelOutline0.m(fontVariationAxis) + iM));
                        z = true;
                    }
                    i++;
                }
                if (!z) {
                    android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr = new android.graphics.fonts.FontVariationAxis[length + 1];
                    java.lang.System.arraycopy(fontVariationAxisArrM, 0, fontVariationAxisArr, 0, length);
                    fontVariationAxisArr[length] = new android.graphics.fonts.FontVariationAxis("wght", ih.a(iM + 400));
                    fontVariationAxisArrM = fontVariationAxisArr;
                }
                strM = aa$.ExternalSyntheticApiModelOutline0.m(fontVariationAxisArrM);
            }
            if (j$.util.Objects.equals(aa$.ExternalSyntheticApiModelOutline0.m(paint2), strM)) {
                aa$.ExternalSyntheticApiModelOutline0.m(paint2, (java.lang.String) null);
            }
            paint2.setTypeface(typeface2);
            if (aa$.ExternalSyntheticApiModelOutline0.m(paint2, strM)) {
                typeface3 = paint2.getTypeface();
                addVar2.b(igVar, typeface3);
            } else {
                typeface3 = null;
            }
        }
        if (typeface3 == null) {
            return false;
        }
        f(typeface3);
        this.a = str;
        return true;
    }

    public cix(android.widget.TextView textView, defpackage.dxw dxwVar) {
        this.b = textView;
        this.d = dxwVar;
    }
}
