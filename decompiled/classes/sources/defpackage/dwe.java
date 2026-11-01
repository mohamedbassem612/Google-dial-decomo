package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dwe {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.ThreadLocal b = new java.lang.ThreadLocal();

    public static android.content.res.ColorStateList a(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
            }
        } while (next != 1);
        throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:75:0x012b  */
    /* JADX WARN: Code duplicated, block: B:76:0x012d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0131  */
    /* JADX WARN: Code duplicated, block: B:80:0x0134  */
    /* JADX WARN: Code duplicated, block: B:82:0x0147  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r36v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static android.content.res.ColorStateList b(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth;
        int color;
        float f;
        float f2;
        int iAlpha;
        int i;
        int[] iArr;
        double d;
        float f3;
        float f4;
        int i2;
        android.util.TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        java.lang.String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        java.lang.Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = defpackage.dur.a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i3, i3);
                int resourceId = ObtainAttributes.getResourceId(i3, -1);
                if (resourceId != -1) {
                    java.lang.ThreadLocal threadLocal = b;
                    android.util.TypedValue typedValue2 = (android.util.TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new android.util.TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r4);
                    if (typedValue.type < 28 || typedValue.type > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (java.lang.Exception unused) {
                            color = ObtainAttributes.getColor(i3, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i3, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i3, -65281);
                }
                float f5 = 1.0f;
                if (ObtainAttributes.hasValue(r4)) {
                    f = ObtainAttributes.getFloat(r4, 1.0f);
                } else {
                    f = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                float f6 = (android.os.Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                ?? r16 = r4;
                int i5 = i3;
                int i6 = i5;
                while (true) {
                    f2 = f5;
                    if (i6 >= attributeCount) {
                        break;
                    }
                    int attributeNameResource = attributeSet.getAttributeNameResource(i6);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != 2130968638 && attributeNameResource != 2130969646) {
                        int i7 = i5 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i6, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i5] = attributeNameResource;
                        i5 = i7;
                    }
                    i6++;
                    f5 = f2;
                }
                int[] iArrTrimStateSet = android.util.StateSet.trimStateSet(iArr4, i5);
                boolean z = (f6 < 0.0f || f6 > 100.0f) ? false : r16 == true ? 1 : 0;
                boolean z2 = z;
                if (f != f2) {
                    iAlpha = (int) ((android.graphics.Color.alpha(color) * f) + 0.5f);
                    if (iAlpha < 0) {
                        i = 0;
                    } else {
                        i = 255;
                        if (iAlpha <= 255) {
                            i = iAlpha;
                        }
                    }
                    if (z2) {
                        dwc dwcVarB = dwc.b(color);
                        float f7 = dwcVarB.a;
                        float f8 = dwcVarB.b;
                        iArr = iArr2;
                        d = f8;
                        dwl dwlVar = dwl.a;
                        if (d >= 1.0d) {
                            f3 = f6;
                            if (java.lang.Math.round(f6) <= 0.0d && java.lang.Math.round(f3) < 100.0d) {
                                float fMin = f7 < 0.0f ? 0.0f : java.lang.Math.min(360.0f, f7);
                                float f9 = f8;
                                boolean z3 = r16 == true ? 1 : 0;
                                float f10 = 0.0f;
                                dwc dwcVar = null;
                                while (true) {
                                    if (java.lang.Math.abs(f10 - f8) < 0.4f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        if (dwcVar != null) {
                                            color = dwcVar.a(dwlVar);
                                            break;
                                        }
                                        color = dwd.b(f3);
                                        break;
                                    }
                                    float f11 = 1000.0f;
                                    float f12 = 0.0f;
                                    float f13 = 100.0f;
                                    float f14 = 1000.0f;
                                    dwc dwcVar2 = null;
                                    while (true) {
                                        if (java.lang.Math.abs(f12 - f13) <= 0.01f) {
                                            iArrTrimStateSet = iArrTrimStateSet;
                                            depth2 = depth2;
                                            fMin = fMin;
                                            break;
                                        }
                                        float f15 = f12 + ((f13 - f12) / 2.0f);
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        int iA = dwc.c(f15, f9, fMin).a(dwlVar);
                                        int i8 = dwd.e;
                                        float fA = dwd.a(android.graphics.Color.red(iA));
                                        float fA2 = dwd.a(android.graphics.Color.green(iA));
                                        float fA3 = dwd.a(android.graphics.Color.blue(iA));
                                        float[] fArr = dwd.d[r16 == true ? 1 : 0];
                                        float f16 = (((fA * fArr[0]) + (fA2 * fArr[r16 == true ? 1 : 0])) + (fA3 * fArr[2])) / 100.0f;
                                        float fCbrt = f16 <= 0.008856452f ? f16 * 903.2963f : (((float) java.lang.Math.cbrt(f16)) * 116.0f) - 16.0f;
                                        float fAbs = java.lang.Math.abs(f3 - fCbrt);
                                        if (fAbs < 0.2f) {
                                            f4 = fCbrt;
                                            dwc dwcVarB2 = dwc.b(iA);
                                            dwc dwcVarC = dwc.c(dwcVarB2.c, dwcVarB2.b, fMin);
                                            float f17 = dwcVarB2.d;
                                            float f18 = dwcVarC.d;
                                            float f19 = dwcVarB2.e;
                                            float f20 = dwcVarC.e;
                                            float f21 = dwcVarB2.f - dwcVarC.f;
                                            float f22 = f19 - f20;
                                            float f23 = f17 - f18;
                                            double dSqrt = java.lang.Math.sqrt((f23 * f23) + (f22 * f22) + (f21 * f21));
                                            depth2 = depth2;
                                            fMin = fMin;
                                            float fPow = (float) (java.lang.Math.pow(dSqrt, 0.63d) * 1.41d);
                                            if (fPow <= f2) {
                                                dwcVar2 = dwcVarB2;
                                                f14 = fPow;
                                                f11 = fAbs;
                                            }
                                        } else {
                                            f4 = fCbrt;
                                            depth2 = depth2;
                                            fMin = fMin;
                                        }
                                        if (f11 == 0.0f && f14 == 0.0f) {
                                            break;
                                        }
                                        if (f4 >= f3) {
                                            f13 = f15;
                                        }
                                        if (f4 < f3) {
                                            f12 = f15;
                                        }
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        fMin = fMin;
                                    }
                                    dwc dwcVar3 = dwcVar2;
                                    if (!z3) {
                                        if (dwcVar3 != null) {
                                            dwcVar = dwcVar3;
                                            f10 = f9;
                                        } else {
                                            f8 = f9;
                                        }
                                        f9 = f10 + ((f8 - f10) / 2.0f);
                                    } else {
                                        if (dwcVar3 != null) {
                                            color = dwcVar3.a(dwlVar);
                                            break;
                                        }
                                        f9 = f10 + ((f8 - f10) / 2.0f);
                                        z3 = false;
                                    }
                                }
                            }
                        } else {
                            f3 = f6;
                        }
                        color = dwd.b(f3);
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                        iArr = iArr2;
                    }
                    color = (color & 16777215) | (i << 24);
                } else if (z) {
                    z2 = r16 == true ? 1 : 0;
                    iAlpha = (int) ((android.graphics.Color.alpha(color) * f) + 0.5f);
                    if (iAlpha < 0) {
                        i = 0;
                    } else {
                        i = 255;
                        if (iAlpha <= 255) {
                            i = iAlpha;
                        }
                    }
                    if (z2) {
                        dwc dwcVarB3 = dwc.b(color);
                        float f24 = dwcVarB3.a;
                        float f25 = dwcVarB3.b;
                        iArr = iArr2;
                        d = f25;
                        dwl dwlVar2 = dwl.a;
                        if (d >= 1.0d) {
                            f3 = f6;
                            if (java.lang.Math.round(f6) <= 0.0d) {
                            }
                        } else {
                            f3 = f6;
                        }
                        color = dwd.b(f3);
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                        iArr = iArr2;
                    }
                    color = (color & 16777215) | (i << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                    iArr = iArr2;
                }
                int i9 = i4 + 1;
                if (i9 > iArr.length) {
                    int[] iArr5 = new int[defpackage.dzk.D(i4)];
                    i2 = 0;
                    java.lang.System.arraycopy(iArr, 0, iArr5, 0, i4);
                    iArr2 = iArr5;
                } else {
                    i2 = 0;
                    iArr2 = iArr;
                }
                iArr2[i4] = color;
                if (i9 > objArr.length) {
                    java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), defpackage.dzk.D(i4));
                    java.lang.System.arraycopy(objArr, i2, objArr2, i2, i4);
                    objArr = objArr2;
                }
                objArr[i4] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i4 = i9;
                r4 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i3 = 0;
            } else {
                iArr2 = iArr2;
                r4 = r4 == true ? 1 : 0;
                depth2 = depth2;
                i3 = 0;
            }
        }
        int[] iArr6 = new int[i4];
        int[][] iArr7 = new int[i4][];
        java.lang.System.arraycopy(iArr2, 0, iArr6, 0, i4);
        java.lang.System.arraycopy(objArr, 0, iArr7, 0, i4);
        return new android.content.res.ColorStateList(iArr7, iArr6);
    }
}
