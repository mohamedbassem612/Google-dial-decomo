package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class yg {
    public int a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;

    public yg() {
        this.c = new czi[32];
        this.b = new float[32];
        this.d = new byte[32];
        ady adyVar = adz.a;
        new ady(6);
        new ady(6);
    }

    public static defpackage.yg e(afzz afzzVar) {
        defpackage.yg ygVar = new defpackage.yg(null);
        ygVar.h(android.util.StateSet.WILD_CARD, afzzVar);
        return ygVar;
    }

    public static defpackage.yg f(android.content.Context context, android.content.res.TypedArray typedArray, afzz afzzVar) {
        int next;
        int depth;
        int i = 3;
        int resourceId = typedArray.getResourceId(3, 0);
        if (resourceId == 0) {
            return e(agal.f(typedArray, 3, afzzVar));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return e(agal.f(typedArray, 3, afzzVar));
        }
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                defpackage.yg ygVar = new defpackage.yg(null);
                android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            android.content.res.Resources.Theme theme = context.getTheme();
                            int depth2 = xml.getDepth() + 1;
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || ((depth = xml.getDepth()) < depth2 && next2 == i)) {
                                    break;
                                }
                                if (next2 == 2 && depth <= depth2 && xml.getName().equals("item")) {
                                    android.content.res.TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSetAsAttributeSet, agah.b) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, agah.b, 0, 0);
                                    afzz afzzVarF = agal.f(typedArrayObtainAttributes, 5, new afzw(0.0f));
                                    typedArrayObtainAttributes.recycle();
                                    int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                                    int[] iArr = new int[attributeCount];
                                    int i2 = 0;
                                    for (int i3 = 0; i3 < attributeCount; i3++) {
                                        int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i3);
                                        if (attributeNameResource != 2130969203) {
                                            int i4 = i2 + 1;
                                            if (!attributeSetAsAttributeSet.getAttributeBooleanValue(i3, false)) {
                                                attributeNameResource = -attributeNameResource;
                                            }
                                            iArr[i2] = attributeNameResource;
                                            i2 = i4;
                                        }
                                    }
                                    ygVar.h(android.util.StateSet.trimStateSet(iArr, i2), afzzVarF);
                                    i = 3;
                                }
                            }
                        }
                        if (xml == null) {
                            return ygVar;
                        }
                        xml.close();
                        return ygVar;
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
            return e(afzzVar);
        }
    }

    private final int g(int[] iArr) {
        java.lang.Object obj = this.c;
        for (int i = 0; i < this.a; i++) {
            if (android.util.StateSet.stateSetMatches(((int[][]) obj)[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    private final void h(int[] iArr, afzz afzzVar) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = afzzVar;
        }
        java.lang.Object obj = this.c;
        if (i >= ((int[][]) obj).length) {
            int i2 = i + 10;
            int[][] iArr2 = new int[i2][];
            java.lang.System.arraycopy(obj, 0, iArr2, 0, i);
            this.c = iArr2;
            afzz[] afzzVarArr = new afzz[i2];
            java.lang.System.arraycopy(this.d, 0, afzzVarArr, 0, i);
            this.d = afzzVarArr;
        }
        java.lang.Object obj2 = this.c;
        int i3 = this.a;
        ((int[][]) obj2)[i3] = iArr;
        ((afzz[]) this.d)[i3] = afzzVar;
        this.a = i3 + 1;
    }

    public final float a(czi cziVar) {
        int iCJ = ajsz.cJ((java.lang.Object[]) this.c, cziVar);
        if (iCJ < 0) {
            return Float.NaN;
        }
        return ((float[]) this.b)[iCJ];
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [afzz, java.lang.Object] */
    public final afzz b(int[] iArr) {
        int iG = g(iArr);
        if (iG < 0) {
            iG = g(android.util.StateSet.WILD_CARD);
        }
        return iG < 0 ? this.b : ((afzz[]) this.d)[iG];
    }

    public final boolean c() {
        return this.a > 1;
    }

    public final acvh d() {
        ahvr.ci(this.b);
        if (this.d == null) {
            this.d = "Download result code: ".concat(java.lang.String.valueOf(((acvg) this.b).name()));
        }
        return new acvh(this);
    }

    public yg(byte[] bArr, byte[] bArr2) {
    }

    public yg(byte[] bArr) {
        this.c = new int[10][];
        this.d = new afzz[10];
    }
}
