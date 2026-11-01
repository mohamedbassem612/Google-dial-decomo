package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class xa {
    public static boolean a(alc alcVar, java.lang.Object obj, java.lang.Object obj2) {
        return aooh.n(obj, alcVar.b()) && aooh.n(obj2, alcVar.c());
    }

    public static final boolean b(defpackage.bhd bhdVar) {
        return bhdVar == defpackage.bhh.b;
    }

    public static final boolean c(int i) {
        int type = java.lang.Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final android.graphics.Rect d(android.text.TextPaint textPaint, java.lang.CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, android.text.style.MetricAffectingSpan.class) != i2) {
                android.graphics.Rect rect = new android.graphics.Rect();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                android.text.TextPaint textPaint2 = new android.text.TextPaint();
                while (i < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i, i2, android.text.style.MetricAffectingSpan.class);
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr = (android.text.style.MetricAffectingSpan[]) spanned.getSpans(i, iNextSpanTransition, android.text.style.MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    rz$.ExternalSyntheticApiModelOutline1.m(textPaint2, charSequence, i, iNextSpanTransition, rect2);
                    rect.right += rect2.width();
                    rect.top = java.lang.Math.min(rect.top, rect2.top);
                    rect.bottom = java.lang.Math.max(rect.bottom, rect2.bottom);
                    i = iNextSpanTransition;
                }
                return rect;
            }
        }
        android.graphics.Rect rect3 = new android.graphics.Rect();
        rz$.ExternalSyntheticApiModelOutline1.m(textPaint, charSequence, i, i2, rect3);
        return rect3;
    }

    public static final int e(float f) {
        return (int) java.lang.Math.ceil(f);
    }

    public static final int f(java.util.List list, int i) {
        int i2;
        int i3 = ((dka) ajsz.bI(list)).b;
        if (i > ((dka) ajsz.bI(list)).b) {
            defpackage.dnv.b(a.bf(i3, i, "Index ", " should be less or equal than last line's end "));
        }
        if (i == ((dka) ajsz.bI(list)).b) {
            return ajsz.aZ(list);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            byte b = 1;
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            int i5 = (i4 + size) >>> 1;
            dka dkaVar = (dka) list.get(i5);
            if (dkaVar.a <= i) {
                b = dkaVar.b <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    i2 = i5;
                    break;
                }
                size = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        if (i2 < 0 || i2 >= list.size()) {
            defpackage.dnv.b("Found paragraph index " + i2 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i + ", paragraphs=[" + dpy.c(list, (java.lang.CharSequence) null, (java.lang.CharSequence) null, (java.lang.CharSequence) null, new defpackage.bxb(18), 31) + ']');
        }
        return i2;
    }

    public static final int g(java.util.List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (true) {
            byte b = 1;
            if (i2 > size) {
                return -(i2 + 1);
            }
            int i3 = (i2 + size) >>> 1;
            dka dkaVar = (dka) list.get(i3);
            if (dkaVar.c <= i) {
                b = dkaVar.d <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
    }

    public static final int h(java.util.List list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((dka) ajsz.bI(list)).f) {
            return ajsz.aZ(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (true) {
            byte b = 1;
            if (i > size) {
                return -(i + 1);
            }
            int i2 = (i + size) >>> 1;
            dka dkaVar = (dka) list.get(i2);
            if (dkaVar.e <= f) {
                b = dkaVar.f <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
    }

    public static final defpackage.hwv i(cav cavVar) {
        gat gatVar = (gat) cavVar.e(dfo.g);
        dnx dnxVar = (dnx) cavVar.e(dfo.k);
        dpf dpfVar = (dpf) cavVar.e(dfo.e);
        dpq dpqVar = (dpq) cavVar.e(dfo.j);
        boolean zB = cavVar.B(gatVar) | cavVar.B(dnxVar) | cavVar.B(dpfVar) | cavVar.z(dpqVar.ordinal()) | cavVar.z(8);
        java.lang.Object objG = cavVar.g();
        if (zB || objG == cau.a) {
            objG = new defpackage.hwv(gatVar, dnxVar, dpfVar, dpqVar);
            cavVar.w(objG);
        }
        return (defpackage.hwv) objG;
    }

    public static final void j(vx vxVar, java.lang.Object obj, java.lang.String str, int i, aonj aonjVar) {
        vxVar.l(new defpackage.bhf(obj, str, i, aonjVar));
    }

    public static final void k(vx vxVar, java.lang.Object obj, android.view.textclassifier.TextClassification textClassification, int i, android.graphics.drawable.Drawable drawable) {
        vxVar.l(new defpackage.bhj(obj, textClassification, i, drawable));
    }
}
