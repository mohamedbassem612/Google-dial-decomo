package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dvf {
    static android.app.Notification.MessagingStyle a(android.app.Notification.MessagingStyle messagingStyle, android.app.Notification.MessagingStyle.Message message) {
        return da$.ExternalSyntheticApiModelOutline1.m(messagingStyle, message);
    }

    public static android.app.RemoteInput[] b(defpackage.dvf[] dvfVarArr) {
        int length = dvfVarArr.length;
        android.app.RemoteInput[] remoteInputArr = new android.app.RemoteInput[length];
        if (length <= 0) {
            return remoteInputArr;
        }
        defpackage.dvf dvfVar = dvfVarArr[0];
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(dwo[] dwoVarArr, android.graphics.Path path) {
        int i;
        float[] fArr;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        dwo[] dwoVarArr2 = dwoVarArr;
        float[] fArr2 = new float[6];
        int length = dwoVarArr2.length;
        int i3 = 0;
        int i4 = 0;
        char c = 'm';
        while (i4 < length) {
            dwo dwoVar = dwoVarArr2[i4];
            char c2 = dwoVar.a;
            float f10 = fArr2[i3];
            float f11 = fArr2[1];
            float f12 = fArr2[2];
            float f13 = fArr2[3];
            float f14 = fArr2[4];
            int i5 = i3;
            float f15 = fArr2[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f14, f15);
                    f10 = f14;
                    f12 = f10;
                    f11 = f15;
                    f13 = f11;
                    i = 2;
                    break;
            }
            float f16 = f14;
            float f17 = f15;
            float f18 = f10;
            float f19 = f11;
            int i6 = i5;
            for (float[] fArr3 = dwoVar.b; i6 < fArr3.length; fArr3 = fArr) {
                if (c2 == 'A') {
                    fArr = fArr3;
                    i2 = i6;
                    dwoVar = dwoVar;
                    float f20 = f18;
                    float f21 = f19;
                    i4 = i4;
                    c2 = c2;
                    int i7 = i2 + 6;
                    int i8 = i2 + 5;
                    dwo.a(path, f20, f21, fArr[i8], fArr[i7], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f ? 1 : i5, fArr[i2 + 4] != 0.0f ? 1 : i5);
                    f12 = fArr[i8];
                    f = fArr[i7];
                    f13 = f;
                    f2 = f12;
                } else if (c2 == 'C') {
                    fArr = fArr3;
                    i2 = i6;
                    i4 = i4;
                    dwoVar = dwoVar;
                    c2 = c2;
                    int i9 = i2 + 5;
                    int i10 = i2 + 4;
                    int i11 = i2 + 3;
                    int i12 = i2 + 2;
                    path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i12], fArr[i11], fArr[i10], fArr[i9]);
                    float f22 = fArr[i10];
                    float f23 = fArr[i9];
                    f12 = fArr[i12];
                    f13 = fArr[i11];
                    f = f23;
                    f2 = f22;
                } else if (c2 == 'H') {
                    fArr = fArr3;
                    i2 = i6;
                    dwoVar = dwoVar;
                    c2 = c2;
                    f = f19;
                    i4 = i4;
                    path.lineTo(fArr[i2], f);
                    f2 = fArr[i2];
                } else if (c2 == 'Q') {
                    fArr = fArr3;
                    i2 = i6;
                    i4 = i4;
                    dwoVar = dwoVar;
                    c2 = c2;
                    int i13 = i2 + 3;
                    int i14 = i2 + 2;
                    int i15 = i2 + 1;
                    path.quadTo(fArr[i2], fArr[i15], fArr[i14], fArr[i13]);
                    float f24 = fArr[i2];
                    float f25 = fArr[i15];
                    f2 = fArr[i14];
                    f13 = f25;
                    f = fArr[i13];
                    f12 = f24;
                } else if (c2 == 'V') {
                    fArr = fArr3;
                    i2 = i6;
                    i4 = i4;
                    dwoVar = dwoVar;
                    f2 = f18;
                    c2 = c2;
                    path.lineTo(f2, fArr[i2]);
                    f = fArr[i2];
                } else if (c2 != 'a') {
                    if (c2 == 'c') {
                        fArr = fArr3;
                        i2 = i6;
                        int i16 = i2 + 5;
                        int i17 = i2 + 4;
                        int i18 = i2 + 3;
                        int i19 = i2 + 2;
                        path.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i19], fArr[i18], fArr[i17], fArr[i16]);
                        float f26 = fArr[i19] + f18;
                        float f27 = fArr[i18] + f19;
                        f18 += fArr[i17];
                        f19 += fArr[i16];
                        f12 = f26;
                        f13 = f27;
                    } else if (c2 == 'h') {
                        fArr = fArr3;
                        i2 = i6;
                        path.rLineTo(fArr[i2], 0.0f);
                        f18 += fArr[i2];
                    } else if (c2 != 'q') {
                        if (c2 != 'v') {
                            if (c2 != 'L') {
                                if (c2 == 'M') {
                                    fArr = fArr3;
                                    i2 = i6;
                                    f4 = fArr[i2];
                                    f5 = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path.lineTo(f4, f5);
                                    } else {
                                        path.moveTo(f4, f5);
                                        f16 = f4;
                                        f = f5;
                                        f17 = f;
                                        f2 = f16;
                                    }
                                } else if (c2 != 'S') {
                                    if (c2 == 'T') {
                                        fArr = fArr3;
                                        i2 = i6;
                                        int i20 = i2 + 1;
                                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                            f19 = (f19 + f19) - f13;
                                            f18 = (f18 + f18) - f12;
                                        }
                                        path.quadTo(f18, f19, fArr[i2], fArr[i20]);
                                        float f28 = fArr[i2];
                                        f = fArr[i20];
                                        f12 = f18;
                                        f13 = f19;
                                        f2 = f28;
                                        dwoVar = dwoVar;
                                    } else if (c2 == 'l') {
                                        fArr = fArr3;
                                        i2 = i6;
                                        int i21 = i2 + 1;
                                        path.rLineTo(fArr[i2], fArr[i21]);
                                        f18 += fArr[i2];
                                        f3 = fArr[i21];
                                    } else if (c2 == 'm') {
                                        fArr = fArr3;
                                        i2 = i6;
                                        float f29 = fArr[i2];
                                        f18 += f29;
                                        float f30 = fArr[i2 + 1];
                                        f19 += f30;
                                        if (i2 > 0) {
                                            path.rLineTo(f29, f30);
                                        } else {
                                            path.rMoveTo(f29, f30);
                                            f2 = f18;
                                            f16 = f2;
                                            f = f19;
                                            f17 = f;
                                        }
                                    } else if (c2 != 's') {
                                        if (c2 == 't') {
                                            int i22 = i6 + 1;
                                            if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                                f8 = f19 - f13;
                                                f9 = f18 - f12;
                                            } else {
                                                f8 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            path.rQuadTo(f9, f8, fArr3[i6], fArr3[i22]);
                                            float f31 = f9 + f18;
                                            float f32 = f8 + f19;
                                            f18 += fArr3[i6];
                                            f19 += fArr3[i22];
                                            f13 = f32;
                                            f12 = f31;
                                        }
                                        fArr = fArr3;
                                        i2 = i6;
                                    } else {
                                        int i23 = i6 + 3;
                                        int i24 = i6 + 2;
                                        int i25 = i6 + 1;
                                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                            f6 = f19 - f13;
                                            f7 = f18 - f12;
                                        } else {
                                            f7 = 0.0f;
                                            f6 = 0.0f;
                                        }
                                        int i26 = i6;
                                        fArr = fArr3;
                                        i2 = i26;
                                        path.rCubicTo(f7, f6, fArr3[i26], fArr3[i25], fArr3[i24], fArr3[i23]);
                                        float f33 = fArr[i2] + f18;
                                        float f34 = fArr[i25] + f19;
                                        f18 += fArr[i24];
                                        f19 += fArr[i23];
                                        f12 = f33;
                                        f13 = f34;
                                    }
                                    c2 = c2;
                                } else {
                                    fArr = fArr3;
                                    i2 = i6;
                                    int i27 = i2 + 3;
                                    int i28 = i2 + 2;
                                    int i29 = i2 + 1;
                                    if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                        f19 = (f19 + f19) - f13;
                                        f18 = (f18 + f18) - f12;
                                    }
                                    path.cubicTo(f18, f19, fArr[i2], fArr[i29], fArr[i28], fArr[i27]);
                                    f12 = fArr[i2];
                                    f13 = fArr[i29];
                                    f2 = fArr[i28];
                                    f = fArr[i27];
                                }
                                dwoVar = dwoVar;
                            } else {
                                fArr = fArr3;
                                i2 = i6;
                                int i30 = i2 + 1;
                                path.lineTo(fArr[i2], fArr[i30]);
                                f4 = fArr[i2];
                                f5 = fArr[i30];
                            }
                            f = f5;
                            f2 = f4;
                            dwoVar = dwoVar;
                        } else {
                            fArr = fArr3;
                            i2 = i6;
                            path.rLineTo(0.0f, fArr[i2]);
                            f3 = fArr[i2];
                        }
                        f19 += f3;
                    } else {
                        fArr = fArr3;
                        i2 = i6;
                        int i31 = i2 + 3;
                        int i32 = i2 + 2;
                        int i33 = i2 + 1;
                        path.rQuadTo(fArr[i2], fArr[i33], fArr[i32], fArr[i31]);
                        float f35 = fArr[i2] + f18;
                        float f36 = fArr[i33] + f19;
                        f18 += fArr[i32];
                        f19 += fArr[i31];
                        f13 = f36;
                        f12 = f35;
                    }
                    f2 = f18;
                    f = f19;
                    c2 = c2;
                } else {
                    fArr = fArr3;
                    i2 = i6;
                    int i34 = i2 + 6;
                    int i35 = i2 + 5;
                    int i36 = i2 + 4;
                    float f37 = fArr[i35] + f18;
                    float f38 = fArr[i34] + f19;
                    dwoVar = dwoVar;
                    dwo.a(path, f18, f19, f37, f38, fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f ? 1 : i5, fArr[i36] != 0.0f ? 1 : i5);
                    f2 = f18 + fArr[i35];
                    f = f19 + fArr[i34];
                    f12 = f2;
                    f13 = f;
                }
                i6 = i2 + i;
                path = path;
                dwoVar = dwoVar;
                c2 = c2;
                i4 = i4;
                f18 = f2;
                f19 = f;
                c = c2;
            }
            fArr2[i5] = f18;
            fArr2[1] = f19;
            fArr2[2] = f12;
            fArr2[3] = f13;
            fArr2[4] = f16;
            fArr2[5] = f17;
            c = dwoVar.a;
            i4++;
            dwoVarArr2 = dwoVarArr;
            i3 = i5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2 A[Catch: NumberFormatException -> 0x00ce, TryCatch #0 {NumberFormatException -> 0x00ce, blocks: (B:27:0x006d, B:30:0x0081, B:32:0x0087, B:36:0x0093, B:49:0x00ad, B:51:0x00b2, B:54:0x00c3, B:56:0x00c7), top: B:65:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3 A[Catch: NumberFormatException -> 0x00ce, TryCatch #0 {NumberFormatException -> 0x00ce, blocks: (B:27:0x006d, B:30:0x0081, B:32:0x0087, B:36:0x0093, B:49:0x00ad, B:51:0x00b2, B:54:0x00c3, B:56:0x00c7), top: B:65:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
    public static dwo[] d(java.lang.String str) {
        java.lang.String strTrim;
        int i;
        float[] fArrF;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if (((cCharAt - 'A') * (cCharAt - 'Z') > 0 && (cCharAt - 'a') * (cCharAt - 'z') > 0) || cCharAt == 'e' || cCharAt == 'E') {
                    i4++;
                } else {
                    strTrim = str.substring(i5, i4).trim();
                    if (strTrim.isEmpty()) {
                        i = i3;
                    } else {
                        if (strTrim.charAt(i3) != 'z' || strTrim.charAt(i3) == 'Z') {
                            i = i3;
                            fArrF = new float[i];
                        } else {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i6 = i2;
                                int i7 = i3;
                                while (i6 < length) {
                                    int i8 = i3;
                                    int i9 = i8;
                                    int i10 = i9;
                                    int i11 = i10;
                                    for (int i12 = i6; i12 < strTrim.length(); i12++) {
                                        char cCharAt2 = strTrim.charAt(i12);
                                        if (cCharAt2 == ' ') {
                                            i9 = 0;
                                            i10 = 1;
                                        } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                            switch (cCharAt2) {
                                                case ',':
                                                    i9 = 0;
                                                    i10 = 1;
                                                    break;
                                                case '-':
                                                    if (i12 == i6 || i9 != 0) {
                                                        i9 = 0;
                                                    } else {
                                                        i9 = 0;
                                                        i10 = 1;
                                                        i11 = 1;
                                                    }
                                                    break;
                                                case '.':
                                                    if (i8 == 0) {
                                                        i8 = 1;
                                                        i9 = 0;
                                                    } else {
                                                        i8 = 1;
                                                        i9 = 0;
                                                        i10 = 1;
                                                        i11 = 1;
                                                    }
                                                    break;
                                                default:
                                                    i9 = 0;
                                                    break;
                                            }
                                        } else {
                                            i9 = 1;
                                        }
                                        if (i10 != 0) {
                                            if (i6 < i12) {
                                                fArr[i7] = java.lang.Float.parseFloat(strTrim.substring(i6, i12));
                                                i7++;
                                            }
                                            if (i11 != 0) {
                                                i6 = i12;
                                            } else {
                                                i6 = i12 + 1;
                                            }
                                            i3 = 0;
                                        }
                                    }
                                    if (i6 < i12) {
                                        fArr[i7] = java.lang.Float.parseFloat(strTrim.substring(i6, i12));
                                        i7++;
                                    }
                                    if (i11 != 0) {
                                        i6 = i12;
                                    } else {
                                        i6 = i12 + 1;
                                    }
                                    i3 = 0;
                                }
                                fArrF = f(fArr, i7);
                                i = 0;
                            } catch (java.lang.NumberFormatException e) {
                                throw new java.lang.RuntimeException(defpackage.a.bp((byte) 34, strTrim, "error in parsing \""), e);
                            }
                        }
                        v(arrayList, strTrim.charAt(i), fArrF);
                    }
                    i5 = i4;
                    i4++;
                    i3 = i;
                    i2 = 1;
                }
            }
            strTrim = str.substring(i5, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i3) != 'z') {
                    i = i3;
                    fArrF = new float[i];
                } else {
                    i = i3;
                    fArrF = new float[i];
                }
                v(arrayList, strTrim.charAt(i), fArrF);
            } else {
                i = i3;
            }
            i5 = i4;
            i4++;
            i3 = i;
            i2 = 1;
        }
        if (i4 - i5 == i2 && i5 < str.length()) {
            v(arrayList, str.charAt(i5), new float[i3]);
        }
        return (dwo[]) arrayList.toArray(new dwo[i3]);
    }

    public static dwo[] e(dwo[] dwoVarArr) {
        dwo[] dwoVarArr2 = new dwo[dwoVarArr.length];
        for (int i = 0; i < dwoVarArr.length; i++) {
            dwoVarArr2[i] = new dwo(dwoVarArr[i]);
        }
        return dwoVarArr2;
    }

    public static float[] f(float[] fArr, int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        int iMin = java.lang.Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        java.lang.System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static float g(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i, float f) {
        return o(xmlPullParser, str) ? typedArray.getFloat(i, f) : f;
    }

    public static int h(android.content.Context context, int i, int i2) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId == 0 ? i2 : i;
    }

    public static int i(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i, int i2) {
        return o(xmlPullParser, str) ? typedArray.getInt(i, i2) : i2;
    }

    public static int j(android.content.res.TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static android.content.res.TypedArray k(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static java.lang.CharSequence l(android.content.res.TypedArray typedArray, int i, int i2) {
        java.lang.CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static java.lang.String m(android.content.res.TypedArray typedArray, int i, int i2) {
        java.lang.String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean n(android.content.res.TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean o(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static java.lang.CharSequence[] p(android.content.res.TypedArray typedArray, int i, int i2) {
        java.lang.CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int q(android.content.res.TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Integer.MAX_VALUE));
    }

    public static boolean r(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, boolean z) {
        return o(xmlPullParser, "autoMirrored") ? typedArray.getBoolean(5, z) : z;
    }

    public static int s(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i) {
        if (o(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    public static android.content.res.ColorStateList t(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) {
        if (!o(xmlPullParser, "tint")) {
            return null;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        typedArray.getValue(1, typedValue);
        if (typedValue.type == 2) {
            typedValue.toString();
            throw new java.lang.UnsupportedOperationException("Failed to resolve attribute at index 1: ".concat(typedValue.toString()));
        }
        if (typedValue.type >= 28 && typedValue.type <= 31) {
            return android.content.res.ColorStateList.valueOf(typedValue.data);
        }
        android.content.res.Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        int i = defpackage.dwe.a;
        try {
            return defpackage.dwe.a(resources, resources.getXml(resourceId), theme);
        } catch (java.lang.Exception e) {
            android.util.Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static defpackage.akbx u(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme, java.lang.String str, int i) {
        defpackage.akbx akbxVar;
        float f;
        android.graphics.Shader radialGradient;
        if (o(xmlPullParser, str)) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return new defpackage.akbx((android.graphics.Shader) null, (android.content.res.ColorStateList) null, typedValue.data);
            }
            android.content.res.Resources resources = typedArray.getResources();
            try {
                android.content.res.XmlResourceParser xml = resources.getXml(typedArray.getResourceId(i, 0));
                android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
                while (true) {
                    int next = xml.next();
                    if (next == 2) {
                        java.lang.String name = xml.getName();
                        int iHashCode = name.hashCode();
                        if (iHashCode != 89650992) {
                            if (iHashCode == 1191572447 && name.equals("selector")) {
                                android.content.res.ColorStateList colorStateListB = defpackage.dwe.b(resources, xml, attributeSetAsAttributeSet, theme);
                                akbxVar = new defpackage.akbx((android.graphics.Shader) null, colorStateListB, colorStateListB.getDefaultColor());
                                break;
                            }
                            throw new org.xmlpull.v1.XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                        }
                        if (name.equals("gradient")) {
                            java.lang.String name2 = xml.getName();
                            if (!name2.equals("gradient")) {
                                throw new org.xmlpull.v1.XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
                            }
                            android.content.res.TypedArray typedArrayK = k(resources, theme, attributeSetAsAttributeSet, defpackage.dur.e);
                            float fG = g(typedArrayK, xml, "startX", 8, 0.0f);
                            float fG2 = g(typedArrayK, xml, "startY", 9, 0.0f);
                            float fG3 = g(typedArrayK, xml, "endX", 10, 0.0f);
                            float fG4 = g(typedArrayK, xml, "endY", 11, 0.0f);
                            float fG5 = g(typedArrayK, xml, "centerX", 3, 0.0f);
                            float fG6 = g(typedArrayK, xml, "centerY", 4, 0.0f);
                            int i2 = i(typedArrayK, xml, "type", 2, 0);
                            int iS = s(typedArrayK, xml, "startColor", 0);
                            boolean zO = o(xml, "centerColor");
                            int iS2 = s(typedArrayK, xml, "centerColor", 7);
                            int iS3 = s(typedArrayK, xml, "endColor", 1);
                            int i3 = 1;
                            int i4 = i(typedArrayK, xml, "tileMode", 6, 0);
                            float fG7 = g(typedArrayK, xml, "gradientRadius", 5, 0.0f);
                            typedArrayK.recycle();
                            int depth = xml.getDepth() + 1;
                            java.util.ArrayList arrayList = new java.util.ArrayList(20);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(20);
                            while (true) {
                                int next2 = xml.next();
                                android.content.res.XmlResourceParser xmlResourceParser = xml;
                                if (next2 == i3) {
                                    f = fG;
                                    break;
                                }
                                int depth2 = xmlResourceParser.getDepth();
                                f = fG;
                                if (depth2 < depth && next2 == 3) {
                                    break;
                                }
                                if (next2 == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                                    android.content.res.TypedArray typedArrayK2 = k(resources, theme, attributeSetAsAttributeSet, defpackage.dur.f);
                                    boolean zHasValue = typedArrayK2.hasValue(0);
                                    boolean zHasValue2 = typedArrayK2.hasValue(1);
                                    if (!zHasValue || !zHasValue2) {
                                        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(xmlResourceParser.getPositionDescription()).concat(": <item> tag requires a 'color' attribute and a 'offset' attribute!"));
                                    }
                                    int color = typedArrayK2.getColor(0, 0);
                                    float f2 = typedArrayK2.getFloat(1, 0.0f);
                                    typedArrayK2.recycle();
                                    arrayList2.add(java.lang.Integer.valueOf(color));
                                    arrayList.add(java.lang.Float.valueOf(f2));
                                }
                                xml = xmlResourceParser;
                                fG = f;
                                i3 = 1;
                            }
                            defpackage.vx vxVar = arrayList2.size() > 0 ? new defpackage.vx((java.util.List) arrayList2, (java.util.List) arrayList) : null;
                            if (vxVar == null) {
                                vxVar = zO ? new defpackage.vx(iS, iS2, iS3) : new defpackage.vx(iS, iS3);
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    radialGradient = new android.graphics.LinearGradient(f, fG2, fG3, fG4, (int[]) vxVar.a, (float[]) vxVar.b, dve.c(i4));
                                } else {
                                    radialGradient = new android.graphics.SweepGradient(fG5, fG6, (int[]) vxVar.a, (float[]) vxVar.b);
                                }
                            } else {
                                if (fG7 <= 0.0f) {
                                    throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                                }
                                radialGradient = new android.graphics.RadialGradient(fG5, fG6, fG7, (int[]) vxVar.a, (float[]) vxVar.b, dve.c(i4));
                            }
                            akbxVar = new defpackage.akbx(radialGradient, (android.content.res.ColorStateList) null, 0);
                            break;
                        }
                        throw new org.xmlpull.v1.XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                    }
                    if (next == 1) {
                        throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
                    }
                }
            } catch (java.lang.Exception e) {
                android.util.Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                akbxVar = null;
            }
            if (akbxVar != null) {
                return akbxVar;
            }
        }
        return new defpackage.akbx((android.graphics.Shader) null, (android.content.res.ColorStateList) null, 0);
    }

    private static void v(java.util.ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new dwo(c, fArr));
    }
}
