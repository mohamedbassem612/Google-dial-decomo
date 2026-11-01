package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class esv {
    public esv(android.content.Context context, android.os.Looper looper, android.os.Looper looper2, defpackage.etc etcVar) {
        context.getApplicationContext();
        etcVar.b(looper, null);
        new defpackage.erz(this, etcVar.b(looper2, null));
    }

    public static void a(boolean z, java.lang.String str) throws defpackage.eti {
        if (!z) {
            throw new defpackage.eti(str, aike.a);
        }
    }

    public static boolean b() {
        return android.os.Build.VERSION.SDK_INT >= 33 && c("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean c(java.lang.String str) throws defpackage.eti {
        android.opengl.EGLDisplay eGLDisplayEglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        a(!eGLDisplayEglGetDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY), "No EGL display.");
        a(android.opengl.EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        int iEglGetError = android.opengl.EGL14.eglGetError();
        if (iEglGetError == 12288) {
            java.lang.String strEglQueryString = android.opengl.EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
            return strEglQueryString != null && strEglQueryString.contains(str);
        }
        throw new defpackage.eti("Error in getDefaultEglDisplay, error code: 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(iEglGetError))), aify.p(java.lang.Integer.valueOf(iEglGetError)));
    }

    public static java.lang.String d(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean e(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean f(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static int g(int i) {
        if (i == 0) {
            return -1;
        }
        return i << 2;
    }

    public static boolean h(int i, int i2) {
        if ((i >> 18) == 0) {
            return i == 0 || java.lang.Integer.bitCount(i) == i2;
        }
        return false;
    }

    public esv() {
    }
}
