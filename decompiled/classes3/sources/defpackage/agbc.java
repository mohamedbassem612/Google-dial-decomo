package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agbc {
    public int a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;
    public java.lang.Object g;
    public java.lang.Object h;

    public agbc(android.content.Context context, int i) {
        int next;
        int depth;
        f();
        try {
            try {
                android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
                try {
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
                                        android.content.res.TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSetAsAttributeSet, agah.a) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, agah.a, 0, 0);
                                        agal agalVar = new agal(agal.l(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)));
                                        typedArrayObtainAttributes.recycle();
                                        int attributeCount = attributeSetAsAttributeSet.getAttributeCount();
                                        int[] iArr = new int[attributeCount];
                                        int i2 = 0;
                                        for (int i3 = 0; i3 < attributeCount; i3++) {
                                            int attributeNameResource = attributeSetAsAttributeSet.getAttributeNameResource(i3);
                                            if (attributeNameResource != 2130970341 && attributeNameResource != 2130970352) {
                                                int i4 = i2 + 1;
                                                iArr[i2] = attributeSetAsAttributeSet.getAttributeBooleanValue(i3, false) ? attributeNameResource : -attributeNameResource;
                                                i2 = i4;
                                            }
                                        }
                                        try {
                                            b(android.util.StateSet.trimStateSet(iArr, i2), agalVar);
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            java.lang.Throwable th2 = th;
                                            if (xml == null) {
                                                throw th2;
                                            }
                                            try {
                                                xml.close();
                                                throw th2;
                                            } catch (java.lang.Throwable th3) {
                                                th2.addSuppressed(th3);
                                                throw th2;
                                            }
                                        }
                                    }
                                }
                            }
                            if (xml != null) {
                                xml.close();
                                return;
                            }
                            return;
                        }
                    } while (next != 1);
                    throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
                } catch (java.lang.Throwable th4) {
                    th = th4;
                }
            } catch (android.content.res.Resources.NotFoundException | java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                f();
            }
        } catch (android.content.res.Resources.NotFoundException | java.io.IOException | org.xmlpull.v1.XmlPullParserException unused2) {
            f();
        }
    }

    private final void f() {
        this.b = new agal();
        this.c = new int[10][];
        this.d = new agal[10];
    }

    public final defpackage.agbd a() {
        if (this.a == 0) {
            return null;
        }
        return new defpackage.agbd(this);
    }

    public final void b(int[] iArr, agal agalVar) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = agalVar;
        }
        java.lang.Object obj = this.c;
        if (i >= ((int[][]) obj).length) {
            int i2 = i + 10;
            int[][] iArr2 = new int[i2][];
            java.lang.System.arraycopy(obj, 0, iArr2, 0, i);
            this.c = iArr2;
            agal[] agalVarArr = new agal[i2];
            java.lang.System.arraycopy(this.d, 0, agalVarArr, 0, i);
            this.d = agalVarArr;
        }
        java.lang.Object obj2 = this.c;
        int i3 = this.a;
        ((int[][]) obj2)[i3] = iArr;
        ((agal[]) this.d)[i3] = agalVar;
        this.a = i3 + 1;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [albh, java.lang.Object] */
    public final defpackage.aclx c() {
        ?? r3;
        java.lang.Object obj = this.f;
        if (obj == null || (r3 = this.h) == 0 || this.a == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.f == null) {
                sb.append(" logSource");
            }
            if (this.h == null) {
                sb.append(" message");
            }
            if (this.a == 0) {
                sb.append(" qosTier");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        java.lang.Object obj2 = this.g;
        java.lang.Object obj3 = this.e;
        int[] iArr = (int[]) this.d;
        java.lang.Integer num = (java.lang.Integer) obj3;
        defpackage.aclx aclxVar = new defpackage.aclx((java.lang.String) obj, r3, (defpackage.aiva) obj2, num, iArr, (int[]) this.c, (zzl) this.b);
        zzl zzlVar = aclxVar.h;
        if (zzlVar != null) {
            ahvr.bD(zzlVar.b == 6);
        }
        return aclxVar;
    }

    public final void d(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null logSource");
        }
        this.f = str;
    }

    public final void e(albh albhVar) {
        if (albhVar == null) {
            throw new java.lang.NullPointerException("Null message");
        }
        this.h = albhVar;
    }

    public agbc(agal agalVar) {
        f();
        b(android.util.StateSet.WILD_CARD, agalVar);
    }

    public agbc(defpackage.agbd agbdVar) {
        int i = agbdVar.a;
        this.a = i;
        this.b = agbdVar.b;
        this.c = new int[agbdVar.c.length][];
        this.d = new agal[agbdVar.d.length];
        java.lang.System.arraycopy(agbdVar.c, 0, this.c, 0, i);
        java.lang.System.arraycopy(agbdVar.d, 0, this.d, 0, this.a);
        this.e = agbdVar.e;
        this.f = agbdVar.f;
        this.g = agbdVar.g;
        this.h = agbdVar.h;
    }
}
