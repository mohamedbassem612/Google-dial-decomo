package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dll {
    public final android.text.TextPaint a;
    public final android.text.TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public dln e;
    public final android.text.Layout f;
    public final int g;
    public final int h;
    public final float i;
    public final float j;
    public final android.graphics.Paint.FontMetricsInt k;
    private final defpackage.dlg l;
    private final int m;
    private final boolean n;
    private final int o;
    private final defpackage.dlv[] p;
    private final android.graphics.Rect q = new android.graphics.Rect();
    private dlf r;

    /* JADX WARN: Code duplicated, block: B:101:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:109:0x0205  */
    /* JADX WARN: Code duplicated, block: B:111:0x020c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0224  */
    /* JADX WARN: Code duplicated, block: B:115:0x0228  */
    /* JADX WARN: Code duplicated, block: B:117:0x022e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0230  */
    /* JADX WARN: Code duplicated, block: B:120:0x0239  */
    /* JADX WARN: Code duplicated, block: B:123:0x0245  */
    /* JADX WARN: Code duplicated, block: B:124:0x0247  */
    /* JADX WARN: Code duplicated, block: B:126:0x024c  */
    /* JADX WARN: Code duplicated, block: B:127:0x024e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0140  */
    /* JADX WARN: Code duplicated, block: B:69:0x0175  */
    /* JADX WARN: Code duplicated, block: B:82:0x018c  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r27v8, types: [boolean] */
    public dll(java.lang.CharSequence charSequence, float f, android.text.TextPaint textPaint, int i, android.text.TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, defpackage.dlg dlgVar) {
        int i9;
        android.text.Layout layoutV;
        defpackage.dlv[] dlvVarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        long j;
        char c;
        int i14;
        long j2;
        int i15;
        int i16;
        long j3;
        android.text.StaticLayout staticLayout;
        ?? r15;
        boolean zM;
        android.text.TextPaint paint;
        java.lang.CharSequence text;
        android.graphics.Rect rectD;
        int lineAscent;
        int topPadding;
        int i17;
        int lineDescent;
        int bottomPadding;
        android.text.BoringLayout boringLayout;
        boolean zM2;
        int i18;
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        int i19;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        this.l = dlgVar;
        int length = charSequence.length();
        android.text.TextDirectionHeuristic textDirectionHeuristicA = defpackage.dlm.a(i2);
        android.text.Layout.Alignment alignment = defpackage.dlj.a;
        boolean z2 = true;
        android.text.Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? defpackage.dlj.b : defpackage.dlj.a : android.text.Layout.Alignment.ALIGN_CENTER : android.text.Layout.Alignment.ALIGN_OPPOSITE : android.text.Layout.Alignment.ALIGN_NORMAL;
        boolean z3 = (charSequence instanceof android.text.Spanned) && ((android.text.Spanned) charSequence).nextSpanTransition(-1, length, defpackage.dlo.class) < length;
        android.os.Trace.beginSection("TextLayout:initLayout");
        try {
            android.text.BoringLayout.Metrics metricsC = dlgVar.c();
            double d = f;
            int iCeil = (int) java.lang.Math.ceil(d);
            if (metricsC == null || dlgVar.b() > f || z3) {
                this.n = false;
                i9 = i3;
                textDirectionHeuristicA = textDirectionHeuristicA;
                layoutV = defpackage.den.v(new defpackage.dli(charSequence, charSequence.length(), textPaint, iCeil, textDirectionHeuristicA, alignment2, i9, truncateAt, (int) java.lang.Math.ceil(d), i8, z, i4, i5, i6, i7));
                z2 = false;
            } else {
                this.n = true;
                if (iCeil < 0) {
                    dnv.b("negative width");
                    dnv.b("negative ellipsized width");
                }
                layoutV = android.os.Build.VERSION.SDK_INT >= 33 ? new android.text.BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsC, z, truncateAt, iCeil, true) : new android.text.BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsC, z, truncateAt, iCeil);
                i9 = i3;
            }
            this.f = layoutV;
            android.os.Trace.endSection();
            int iMin = java.lang.Math.min(layoutV.getLineCount(), i9);
            this.g = iMin;
            int i20 = iMin - 1;
            this.d = iMin >= i9 && (layoutV.getEllipsisCount(i20) > 0 || layoutV.getLineEnd(i20) != charSequence.length());
            if (m() instanceof android.text.Spanned) {
                java.lang.CharSequence charSequenceM = m();
                if (charSequenceM == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type android.text.Spanned");
                }
                if (defpackage.den.w((android.text.Spanned) charSequenceM, defpackage.dlv.class) || m().length() <= 0) {
                    java.lang.CharSequence charSequenceM2 = m();
                    if (charSequenceM2 == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type android.text.Spanned");
                    }
                    i10 = 0;
                    dlvVarArr = (defpackage.dlv[]) ((android.text.Spanned) charSequenceM2).getSpans(0, m().length(), defpackage.dlv.class);
                } else {
                    dlvVarArr = null;
                    i10 = 0;
                }
            } else {
                dlvVarArr = null;
                i10 = 0;
            }
            this.p = dlvVarArr;
            if (dlvVarArr == null) {
                i11 = 2;
                i12 = i10;
            } else {
                defpackage.dlv dlvVar = dlvVarArr.length == 0 ? null : dlvVarArr[i10];
                if (dlvVar == null || !dlvVar.b) {
                    i11 = 2;
                } else {
                    i11 = 2;
                    i12 = dlvVar.e == 2 ? 1 : i12;
                }
                i12 = i10;
            }
            if (dlvVarArr == null) {
                i13 = i10;
            } else {
                defpackage.dlv dlvVar2 = dlvVarArr.length == 0 ? null : dlvVarArr[i10];
                if (dlvVar2 != null && dlvVar2.c && dlvVar2.e == i11) {
                    i13 = 1;
                } else {
                    i13 = i10;
                }
            }
            long j4 = 0;
            if (i12 == 0) {
                if (z) {
                    j = 4294967295L;
                    c = ' ';
                    i14 = 33;
                } else {
                    if (z2) {
                        if (layoutV == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type android.text.BoringLayout");
                        }
                        boringLayout = (android.text.BoringLayout) layoutV;
                        i14 = 33;
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                            zM2 = ae$.ExternalSyntheticApiModelOutline0.m(boringLayout);
                        } else {
                            r15 = i10;
                        }
                    } else {
                        i14 = 33;
                        if (layoutV == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type android.text.StaticLayout");
                        }
                        staticLayout = (android.text.StaticLayout) layoutV;
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                            zM = ae$.ExternalSyntheticApiModelOutline0.m(staticLayout);
                        } else {
                            r15 = 1;
                        }
                    }
                    if (r15 != 0) {
                        r15 = zM;
                        j2 = 0;
                        j = 4294967295L;
                        c = ' ';
                    } else {
                        r15 = zM;
                        paint = layoutV.getPaint();
                        text = layoutV.getText();
                        j = 4294967295L;
                        rectD = xa.d(paint, text, layoutV.getLineStart(i10), layoutV.getLineEnd(i10));
                        lineAscent = layoutV.getLineAscent(i10);
                        c = ' ';
                        if (rectD.top < lineAscent) {
                            r15 = zM2;
                            topPadding = lineAscent - rectD.top;
                        } else {
                            r15 = zM2;
                            topPadding = layoutV.getTopPadding();
                        }
                        i17 = topPadding;
                        if (iMin != 1) {
                            int i21 = iMin - 1;
                            rectD = xa.d(paint, text, layoutV.getLineStart(i21), layoutV.getLineEnd(i21));
                        }
                        lineDescent = layoutV.getLineDescent(iMin - 1);
                        if (rectD.bottom > lineDescent) {
                            bottomPadding = rectD.bottom - lineDescent;
                        } else {
                            bottomPadding = layoutV.getBottomPadding();
                        }
                        if (i17 == 0) {
                            i17 = bottomPadding != 0 ? i10 : i17;
                        }
                        j2 = (((long) i17) << 32) | (((long) bottomPadding) & 4294967295L);
                    }
                    if (i12 != 0) {
                        i15 = i10;
                    } else {
                        i15 = (int) (j2 >> c);
                    }
                    if (i13 != 0) {
                        r15 = zM2;
                        r15 = zM2;
                        i16 = i10;
                    } else {
                        r15 = zM2;
                        r15 = zM2;
                        i16 = (int) (j2 & j);
                    }
                    j3 = (((long) i15) << c) | (((long) i16) & j);
                }
                j2 = 0;
                if (i12 != 0) {
                    i15 = i10;
                } else {
                    i15 = (int) (j2 >> c);
                }
                if (i13 != 0) {
                    r15 = zM2;
                    r15 = zM2;
                    i16 = i10;
                } else {
                    r15 = zM2;
                    r15 = zM2;
                    i16 = (int) (j2 & j);
                }
                j3 = (((long) i15) << c) | (((long) i16) & j);
            } else if (i13 != 0) {
                j3 = 0;
                j = 4294967295L;
                c = ' ';
                i14 = 33;
            } else {
                i13 = i10;
                if (z) {
                    if (z2) {
                        if (layoutV == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type android.text.BoringLayout");
                        }
                        boringLayout = (android.text.BoringLayout) layoutV;
                        i14 = 33;
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                            zM2 = ae$.ExternalSyntheticApiModelOutline0.m(boringLayout);
                        } else {
                            r15 = i10;
                        }
                    } else {
                        i14 = 33;
                        if (layoutV == null) {
                            defpackage.aooh.h("null cannot be cast to non-null type android.text.StaticLayout");
                        }
                        staticLayout = (android.text.StaticLayout) layoutV;
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                            zM = ae$.ExternalSyntheticApiModelOutline0.m(staticLayout);
                        } else {
                            r15 = 1;
                        }
                    }
                    if (r15 != 0) {
                        r15 = zM;
                        j2 = 0;
                        j = 4294967295L;
                        c = ' ';
                    } else {
                        r15 = zM;
                        paint = layoutV.getPaint();
                        text = layoutV.getText();
                        j = 4294967295L;
                        rectD = xa.d(paint, text, layoutV.getLineStart(i10), layoutV.getLineEnd(i10));
                        lineAscent = layoutV.getLineAscent(i10);
                        c = ' ';
                        if (rectD.top < lineAscent) {
                            r15 = zM2;
                            topPadding = lineAscent - rectD.top;
                        } else {
                            r15 = zM2;
                            topPadding = layoutV.getTopPadding();
                        }
                        i17 = topPadding;
                        if (iMin != 1) {
                            int i22 = iMin - 1;
                            rectD = xa.d(paint, text, layoutV.getLineStart(i22), layoutV.getLineEnd(i22));
                        }
                        lineDescent = layoutV.getLineDescent(iMin - 1);
                        if (rectD.bottom > lineDescent) {
                            bottomPadding = rectD.bottom - lineDescent;
                        } else {
                            bottomPadding = layoutV.getBottomPadding();
                        }
                        if (i17 == 0) {
                            if (bottomPadding != 0) {
                            }
                        }
                        j2 = (((long) i17) << 32) | (((long) bottomPadding) & 4294967295L);
                    }
                    if (i12 != 0) {
                        i15 = i10;
                    } else {
                        i15 = (int) (j2 >> c);
                    }
                    if (i13 != 0) {
                        r15 = zM2;
                        r15 = zM2;
                        i16 = i10;
                    } else {
                        r15 = zM2;
                        r15 = zM2;
                        i16 = (int) (j2 & j);
                    }
                    j3 = (((long) i15) << c) | (((long) i16) & j);
                } else {
                    j = 4294967295L;
                    c = ' ';
                    i14 = 33;
                }
                j2 = 0;
                if (i12 != 0) {
                    i15 = i10;
                } else {
                    i15 = (int) (j2 >> c);
                }
                if (i13 != 0) {
                    r15 = zM2;
                    r15 = zM2;
                    i16 = i10;
                } else {
                    r15 = zM2;
                    r15 = zM2;
                    i16 = (int) (j2 & j);
                }
                j3 = (((long) i15) << c) | (((long) i16) & j);
            }
            if (dlvVarArr != null) {
                int iMax = i10;
                int iMax2 = iMax;
                for (int i23 = iMax2; i23 < dlvVarArr.length; i23++) {
                    defpackage.dlv dlvVar3 = dlvVarArr[i23];
                    int i24 = dlvVar3.f;
                    iMax = i24 < 0 ? java.lang.Math.max(iMax, java.lang.Math.abs(i24)) : iMax;
                    int i25 = dlvVar3.g;
                    if (i25 < 0) {
                        iMax2 = java.lang.Math.max(iMax, java.lang.Math.abs(i25));
                    }
                }
                if (iMax == 0) {
                    i19 = iMax2 != 0 ? i10 : i19;
                } else {
                    i19 = iMax;
                }
                j4 = (((long) i19) << c) | (((long) iMax2) & j);
            }
            this.h = java.lang.Math.max((int) (j3 >> c), (int) (j4 >> c));
            this.m = java.lang.Math.max((int) (j3 & j), (int) (j4 & j));
            android.text.TextPaint textPaint2 = this.a;
            defpackage.dlv[] dlvVarArr2 = this.p;
            int i26 = this.g - 1;
            if (this.f.getLineStart(i26) != this.f.getLineEnd(i26) || dlvVarArr2 == null || dlvVarArr2.length == 0) {
                i18 = i10;
                fontMetricsInt = null;
            } else {
                android.text.SpannableString spannableString = new android.text.SpannableString("\u200b");
                defpackage.dlv dlvVar4 = (defpackage.dlv) defpackage.ajsz.cO(dlvVarArr2);
                spannableString.setSpan(new defpackage.dlv(dlvVar4.a, spannableString.length(), (i26 == 0 || !dlvVar4.c) ? dlvVar4.c : i10, dlvVar4.c, dlvVar4.d, dlvVar4.e), i10, spannableString.length(), i14);
                i18 = i10;
                android.text.StaticLayout staticLayoutV = defpackage.den.v(new defpackage.dli(spannableString, spannableString.length(), textPaint2, Integer.MAX_VALUE, textDirectionHeuristicA, dld.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0));
                fontMetricsInt = new android.graphics.Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutV.getLineAscent(i18);
                fontMetricsInt.descent = staticLayoutV.getLineDescent(i18);
                fontMetricsInt.top = staticLayoutV.getLineTop(i18);
                fontMetricsInt.bottom = staticLayoutV.getLineBottom(i18);
            }
            this.o = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) c(i20)) : i18;
            this.k = fontMetricsInt;
            android.text.Layout layout = this.f;
            this.i = defpackage.dez.f(layout, i20, layout.getPaint());
            android.text.Layout layout2 = this.f;
            this.j = defpackage.dez.g(layout2, i20, layout2.getPaint());
        } catch (java.lang.Throwable th) {
            android.os.Trace.endSection();
            throw th;
        }
    }

    public final float a(int i) {
        if (i == this.g - 1) {
            return this.i + this.j;
        }
        return 0.0f;
    }

    public final float b(int i) {
        android.graphics.Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g - 1;
        if (i == i2 && (fontMetricsInt = this.k) != null) {
            return this.f.getLineBottom(i - 1) + fontMetricsInt.bottom;
        }
        return (i == i2 ? this.m : 0) + this.h + this.f.getLineBottom(i);
    }

    public final float c(int i) {
        return b(i) - d(i);
    }

    public final float d(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float e(int i, boolean z) {
        return l().a(i, true, z) + a(i(i));
    }

    public final float f(int i, boolean z) {
        return l().a(i, false, z) + a(i(i));
    }

    public final int g() {
        boolean z = this.d;
        android.text.Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.m + this.o;
    }

    public final int h(int i) {
        java.lang.ThreadLocal threadLocal = defpackage.dlm.a;
        android.text.Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != android.text.TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int i(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        android.text.Layout layout = this.f;
        if (i >= layout.getText().length()) {
            return i2 - 1;
        }
        if (i <= 0) {
            return 0;
        }
        int i3 = i2 - 1;
        int lineForOffset = layout.getLineForOffset(i);
        return lineForOffset <= i3 ? lineForOffset : i3;
    }

    public final int j(int i) {
        return this.f.getLineStart(i);
    }

    public final int k(int i) {
        return this.f.getParagraphDirection(i);
    }

    public final dlf l() {
        dlf dlfVar = this.r;
        if (dlfVar != null) {
            return dlfVar;
        }
        dlf dlfVar2 = new dlf(this.f);
        this.r = dlfVar2;
        return dlfVar2;
    }

    public final java.lang.CharSequence m() {
        return this.f.getText();
    }

    public final void n(android.graphics.Canvas canvas) {
        if (canvas.getClipBounds(this.q)) {
            int i = this.h;
            if (i != 0) {
                canvas.translate(0.0f, i);
            }
            java.lang.ThreadLocal threadLocal = defpackage.dlm.a;
            java.lang.Object dlkVar = threadLocal.get();
            if (dlkVar == null) {
                dlkVar = new defpackage.dlk();
                threadLocal.set(dlkVar);
            }
            defpackage.dlk dlkVar2 = (defpackage.dlk) dlkVar;
            dlkVar2.a = canvas;
            try {
                this.f.draw(dlkVar2);
                dlkVar2.a = null;
                int i2 = this.h;
                if (i2 != 0) {
                    canvas.translate(0.0f, -i2);
                }
            } catch (java.lang.Throwable th) {
                dlkVar2.a = null;
                throw th;
            }
        }
    }

    public final boolean o(int i) {
        return this.f.isRtlCharAt(i);
    }
}
