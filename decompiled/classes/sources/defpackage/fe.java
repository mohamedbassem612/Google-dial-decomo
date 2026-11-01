package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fe extends android.view.MenuInflater {
    static final java.lang.Class[] a;
    static final java.lang.Class[] b;
    final java.lang.Object[] c;
    final java.lang.Object[] d;
    final android.content.Context e;
    public java.lang.Object f;

    static {
        java.lang.Class[] clsArr = {android.content.Context.class};
        a = clsArr;
        b = clsArr;
    }

    public fe(android.content.Context context) {
        super(context);
        this.e = context;
        java.lang.Object[] objArr = {context};
        this.c = objArr;
        this.d = objArr;
    }

    private final void b(org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.view.Menu menu) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.ColorStateList colorStateList;
        boolean z;
        boolean z2;
        boolean z3;
        defpackage.fd fdVar = new defpackage.fd(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new java.lang.RuntimeException("Expecting menu, got ".concat(java.lang.String.valueOf(name)));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z4 = false;
        boolean z5 = false;
        java.lang.String str = null;
        while (!z4) {
            if (eventType == 1) {
                throw new java.lang.RuntimeException("Unexpected end of document");
            }
            if (eventType == 2) {
                if (!z5) {
                    java.lang.String name2 = xmlPullParser.getName();
                    if (name2.equals("group")) {
                        android.content.res.TypedArray typedArrayObtainStyledAttributes = fdVar.E.e.obtainStyledAttributes(attributeSet, defpackage.ef.q);
                        fdVar.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        fdVar.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        fdVar.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        fdVar.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        fdVar.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        fdVar.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name2.equals("item")) {
                            defpackage.fe feVar = fdVar.E;
                            int[] iArr = defpackage.ef.r;
                            android.content.Context context = feVar.e;
                            defpackage.ajxw ajxwVar = new defpackage.ajxw(context, context.obtainStyledAttributes(attributeSet, iArr));
                            fdVar.i = ajxwVar.r(2, 0);
                            fdVar.j = (ajxwVar.o(5, fdVar.c) & (-65536)) | ((char) ajxwVar.o(6, fdVar.d));
                            fdVar.k = ajxwVar.v(7);
                            fdVar.l = ajxwVar.v(8);
                            fdVar.m = ajxwVar.r(0, 0);
                            java.lang.String strW = ajxwVar.w(9);
                            fdVar.n = strW == null ? (char) 0 : strW.charAt(0);
                            fdVar.o = ajxwVar.o(16, 4096);
                            java.lang.String strW2 = ajxwVar.w(10);
                            fdVar.p = strW2 == null ? (char) 0 : strW2.charAt(0);
                            fdVar.q = ajxwVar.o(20, 4096);
                            if (ajxwVar.z(11)) {
                                fdVar.r = ajxwVar.y(11, false) ? 1 : 0;
                            } else {
                                fdVar.r = fdVar.e;
                            }
                            fdVar.s = ajxwVar.y(3, false);
                            fdVar.t = ajxwVar.y(4, fdVar.f);
                            fdVar.u = ajxwVar.y(1, fdVar.g);
                            fdVar.v = ajxwVar.o(21, -1);
                            fdVar.z = ajxwVar.w(12);
                            fdVar.w = ajxwVar.r(13, 0);
                            fdVar.x = ajxwVar.w(15);
                            fdVar.y = ajxwVar.w(14);
                            java.lang.String str2 = fdVar.y;
                            if (str2 == null) {
                                fdVar.F = null;
                            } else if (fdVar.w == 0 && fdVar.x == null) {
                                fdVar.F = (defpackage.dzk) fdVar.b(str2, b, feVar.d);
                            } else {
                                android.util.Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                fdVar.F = null;
                            }
                            fdVar.A = ajxwVar.v(17);
                            fdVar.B = ajxwVar.v(22);
                            if (ajxwVar.z(19)) {
                                int iO = ajxwVar.o(19, -1);
                                android.graphics.PorterDuff.Mode mode = fdVar.D;
                                android.graphics.Rect rect = defpackage.iz.a;
                                fdVar.D = defpackage.a.q(iO, mode);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                fdVar.D = null;
                            }
                            if (ajxwVar.z(18)) {
                                fdVar.C = ajxwVar.s(18);
                            } else {
                                fdVar.C = colorStateList;
                            }
                            ajxwVar.x();
                            fdVar.h = false;
                        } else if (name2.equals("menu")) {
                            xmlPullParser = xmlPullParser;
                            b(xmlPullParser, attributeSet, fdVar.a());
                        } else {
                            str = name2;
                        }
                        z = false;
                    }
                    xmlPullParser = xmlPullParser;
                    z = false;
                }
                z = true;
            } else if (eventType == 3) {
                java.lang.String name3 = xmlPullParser.getName();
                if (!z5) {
                    z3 = false;
                } else if (name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z = false;
                    str = null;
                } else {
                    z3 = true;
                }
                if (name3.equals("group")) {
                    fdVar.c();
                    z4 = z4;
                    z2 = z3;
                } else if (name3.equals("item")) {
                    if (!fdVar.h) {
                        defpackage.dzk dzkVar = fdVar.F;
                        if (dzkVar == null || !dzkVar.c()) {
                            z4 = z4;
                            z2 = z3;
                            z4 = z4;
                            z2 = z3;
                            fdVar.h = true;
                            fdVar.d(fdVar.a.add(fdVar.b, fdVar.i, fdVar.j, fdVar.k));
                            z4 = z4;
                            z2 = z3;
                        } else {
                            z4 = z4;
                            z2 = z3;
                            fdVar.a();
                            z4 = z4;
                            z2 = z3;
                        }
                    }
                } else if (name3.equals("menu")) {
                    z4 = z4;
                    z2 = z3;
                    z4 = true;
                    z2 = z3;
                }
                z4 = z4;
                z2 = z3;
                z4 = z4;
                z2 = z3;
                z = z2;
                xmlPullParser = xmlPullParser;
            } else {
                z4 = z4;
                z2 = z3;
                z4 = z4;
                z2 = z3;
                z = z2;
                xmlPullParser = xmlPullParser;
            }
            int next = xmlPullParser.next();
            z5 = z;
            eventType = next;
            z4 = z4;
        }
    }

    public final java.lang.Object a(java.lang.Object obj) {
        return ((obj instanceof android.app.Activity) || !(obj instanceof android.content.ContextWrapper)) ? obj : a(((android.content.ContextWrapper) obj).getBaseContext());
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, android.view.Menu menu) {
        if (!(menu instanceof defpackage.dww)) {
            super.inflate(i, menu);
            return;
        }
        android.content.res.XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.e.getResources().getLayout(i);
                android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(layout);
                if (menu instanceof defpackage.ft) {
                    defpackage.ft ftVar = (defpackage.ft) menu;
                    if (!ftVar.h) {
                        ftVar.u();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((defpackage.ft) menu).t();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (java.io.IOException e) {
                throw new android.view.InflateException("Error inflating menu XML", e);
            } catch (org.xmlpull.v1.XmlPullParserException e2) {
                throw new android.view.InflateException("Error inflating menu XML", e2);
            }
        } catch (java.lang.Throwable th) {
            if (z) {
                ((defpackage.ft) menu).t();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
