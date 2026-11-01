package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agbf {
    public int a;
    public xtq c;
    int[][] b = new int[10][];
    public xtq[] d = new xtq[10];

    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    public static defpackage.agbf b(android.content.Context context, android.content.res.TypedArray typedArray) {
        int next;
        int depth;
        defpackage.agbe agbeVar;
        int resourceId = typedArray.getResourceId(2, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                defpackage.agbf agbfVar = new defpackage.agbf();
                android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            android.content.res.Resources.Theme theme = context.getTheme();
                            int depth2 = xml.getDepth() + 1;
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || ((depth = xml.getDepth()) < depth2 && next2 == 3)) {
                                    break;
                                }
                                if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                                    android.content.res.TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSetAsAttributeSet, agah.c) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, agah.c, 0, 0);
                                    android.util.TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(0);
                                    if (typedValuePeekValue == null) {
                                        agbeVar = null;
                                    } else if (typedValuePeekValue.type == 5) {
                                        agbeVar = new defpackage.agbe(2, android.util.TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainAttributes.getResources().getDisplayMetrics()));
                                    } else if (typedValuePeekValue.type == 6) {
                                        agbeVar = new defpackage.agbe(1, typedValuePeekValue.getFraction(1.0f, 1.0f));
                                    } else {
                                        agbeVar = null;
                                    }
                                    typedArrayObtainAttributes.recycle();
                                    int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                                    int[] iArr = new int[attributeCount];
                                    int i = 0;
                                    for (int i2 = 0; i2 < attributeCount; i2++) {
                                        int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i2);
                                        if (attributeNameResource != 2130971039) {
                                            int i3 = i + 1;
                                            if (!attributeSetAsAttributeSet.getAttributeBooleanValue(i2, false)) {
                                                attributeNameResource = -attributeNameResource;
                                            }
                                            iArr[i] = attributeNameResource;
                                            i = i3;
                                        }
                                    }
                                    int[] iArrTrimStateSet = android.util.StateSet.trimStateSet(iArr, i);
                                    xtq xtqVar = new xtq(agbeVar, (byte[]) null);
                                    int i4 = agbfVar.a;
                                    if (i4 == 0 || iArrTrimStateSet.length == 0) {
                                        agbfVar.c = xtqVar;
                                    }
                                    int[][] iArr2 = agbfVar.b;
                                    if (i4 >= iArr2.length) {
                                        int i5 = i4 + 10;
                                        int[][] iArr3 = new int[i5][];
                                        java.lang.System.arraycopy(iArr2, 0, iArr3, 0, i4);
                                        agbfVar.b = iArr3;
                                        xtq[] xtqVarArr = new xtq[i5];
                                        java.lang.System.arraycopy(agbfVar.d, 0, xtqVarArr, 0, i4);
                                        agbfVar.d = xtqVarArr;
                                    }
                                    int[][] iArr4 = agbfVar.b;
                                    int i6 = agbfVar.a;
                                    iArr4[i6] = iArrTrimStateSet;
                                    agbfVar.d[i6] = xtqVar;
                                    agbfVar.a = i6 + 1;
                                }
                            }
                        }
                        if (xml != null) {
                            xml.close();
                        }
                        return agbfVar;
                    }
                } while (next != 1);
                throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
            } catch (java.lang.Throwable th) {
                if (xml == null) {
                    throw th;
                }
                try {
                    xml.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (android.content.res.Resources.NotFoundException | java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
            return null;
        }
    }

    public final int a(int[] iArr) {
        int[][] iArr2 = this.b;
        for (int i = 0; i < this.a; i++) {
            if (android.util.StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }
}
