package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class un {
    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final void c(java.lang.String str) {
        throw new java.lang.IndexOutOfBoundsException(str);
    }

    public static final void d(java.lang.String str) {
        throw new java.util.NoSuchElementException(str);
    }

    public static final baa e(android.view.View view) {
        baa baaVar;
        java.util.WeakHashMap weakHashMap = baa.a;
        synchronized (weakHashMap) {
            java.lang.Object baaVar2 = weakHashMap.get(view);
            if (baaVar2 == null) {
                baaVar2 = new baa(view);
                weakHashMap.put(view, baaVar2);
            }
            baaVar = (baa) baaVar2;
        }
        return baaVar;
    }

    public static final baa f(defpackage.cav cavVar) {
        android.view.View view = (android.view.View) cavVar.e(defpackage.dep.f);
        baa baaVarE = e(view);
        boolean zD = cavVar.D(baaVarE) | cavVar.D(view);
        java.lang.Object objG = cavVar.g();
        if (zD || objG == defpackage.cau.a) {
            objG = new aum(baaVarE, view, 6, (byte[]) null);
            cavVar.w(objG);
        }
        defpackage.cbp.c(baaVarE, (defpackage.aonj) objG, cavVar);
        return baaVarE;
    }

    public static final defpackage.cmw g(defpackage.cmw cmwVar, float f, float f2) {
        return cmwVar.a(new ayo(f, f2));
    }

    public static final long h(int i) {
        return ((long) i) << 32;
    }

    public static final defpackage.cmw i(defpackage.cmw cmwVar, defpackage.aonj aonjVar) {
        return cmwVar.a(new cuj(aonjVar, (defpackage.aonj) null));
    }

    public static final int j(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final long k(android.view.KeyEvent keyEvent) {
        return h(keyEvent.getKeyCode());
    }

    public static final void l(org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next = xmlPullParser.next();
        while (next != 2) {
            if (next == 1) {
                throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
            }
            next = xmlPullParser.next();
        }
    }

    public static final defpackage.cqd m(defpackage.akbx akbxVar) {
        if (!akbxVar.i()) {
            return null;
        }
        java.lang.Object obj = akbxVar.a;
        return obj != null ? new cqe((android.graphics.Shader) obj) : new defpackage.crf(((long) akbxVar.b) << 32);
    }
}
