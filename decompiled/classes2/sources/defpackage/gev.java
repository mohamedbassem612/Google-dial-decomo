package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gev {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.Class[] b = {android.content.Context.class, android.util.AttributeSet.class};
    private static final java.util.HashMap c = new java.util.HashMap();

    public static final androidx.preference.Preference a(org.xmlpull.v1.XmlPullParser xmlPullParser, androidx.preference.PreferenceGroup preferenceGroup, android.content.Context context, java.lang.Object[] objArr, gez gezVar, java.lang.String[] strArr) throws java.lang.Throwable {
        java.lang.Throwable th;
        org.xmlpull.v1.XmlPullParser xmlPullParser2;
        org.xmlpull.v1.XmlPullParserException xmlPullParserException;
        java.io.IOException iOException;
        int next;
        androidx.preference.PreferenceGroup preferenceGroup2;
        synchronized (objArr) {
            try {
                try {
                    android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
                    objArr[0] = context;
                    do {
                        try {
                            next = xmlPullParser.next();
                            try {
                                if (next == 2) {
                                    androidx.preference.PreferenceGroup preferenceGroup3 = (androidx.preference.PreferenceGroup) d(xmlPullParser.getName(), attributeSetAsAttributeSet, context, objArr, strArr);
                                    if (preferenceGroup == null) {
                                        preferenceGroup3.E(gezVar);
                                        preferenceGroup2 = preferenceGroup3;
                                    } else {
                                        preferenceGroup2 = preferenceGroup;
                                    }
                                    xmlPullParser2 = xmlPullParser;
                                    try {
                                        b(xmlPullParser2, preferenceGroup2, attributeSetAsAttributeSet, context, objArr, gezVar, strArr);
                                        return preferenceGroup2;
                                    } catch (android.view.InflateException e) {
                                        e = e;
                                    } catch (java.io.IOException e2) {
                                        e = e2;
                                        iOException = e;
                                        android.view.InflateException inflateException = new android.view.InflateException(xmlPullParser2.getPositionDescription() + ": " + iOException.getMessage());
                                        inflateException.initCause(iOException);
                                        throw inflateException;
                                    } catch (org.xmlpull.v1.XmlPullParserException e3) {
                                        e = e3;
                                        xmlPullParserException = e;
                                        android.view.InflateException inflateException2 = new android.view.InflateException(xmlPullParserException.getMessage());
                                        inflateException2.initCause(xmlPullParserException);
                                        throw inflateException2;
                                    }
                                }
                            } catch (android.view.InflateException e4) {
                                throw e4;
                            } catch (java.io.IOException e5) {
                                iOException = e5;
                                xmlPullParser2 = xmlPullParser;
                                android.view.InflateException inflateException3 = new android.view.InflateException(xmlPullParser2.getPositionDescription() + ": " + iOException.getMessage());
                                inflateException3.initCause(iOException);
                                throw inflateException3;
                            } catch (org.xmlpull.v1.XmlPullParserException e6) {
                                xmlPullParserException = e6;
                                android.view.InflateException inflateException4 = new android.view.InflateException(xmlPullParserException.getMessage());
                                inflateException4.initCause(xmlPullParserException);
                                throw inflateException4;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } catch (android.view.InflateException e7) {
                            e = e7;
                        } catch (java.io.IOException e8) {
                            e = e8;
                            xmlPullParser2 = xmlPullParser;
                        } catch (org.xmlpull.v1.XmlPullParserException e9) {
                            e = e9;
                        }
                        throw e;
                    } while (next != 1);
                    throw new android.view.InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                th = th;
                throw th;
            }
        }
    }

    private static final void b(org.xmlpull.v1.XmlPullParser xmlPullParser, androidx.preference.Preference preference, android.util.AttributeSet attributeSet, android.content.Context context, java.lang.Object[] objArr, gez gezVar, java.lang.String[] strArr) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    return;
                } else {
                    next = 3;
                }
            }
            if (next == 1) {
                return;
            }
            if (next == 2) {
                java.lang.String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.t = android.content.Intent.parseIntent(context.getResources(), xmlPullParser, attributeSet);
                    } catch (java.io.IOException e) {
                        org.xmlpull.v1.XmlPullParserException xmlPullParserException = new org.xmlpull.v1.XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    context.getResources().parseBundleExtra("extra", attributeSet, preference.t());
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (java.io.IOException e2) {
                        org.xmlpull.v1.XmlPullParserException xmlPullParserException2 = new org.xmlpull.v1.XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    androidx.preference.Preference preferenceD = d(name, attributeSet, context, objArr, strArr);
                    ((androidx.preference.PreferenceGroup) preference).ae(preferenceD);
                    b(xmlPullParser, preferenceD, attributeSet, context, objArr, gezVar, strArr);
                }
            }
        }
    }

    private static final androidx.preference.Preference c(java.lang.String str, java.lang.String[] strArr, android.util.AttributeSet attributeSet, android.content.Context context, java.lang.Object[] objArr) throws java.lang.ClassNotFoundException {
        java.lang.Class<?> cls;
        java.lang.reflect.Constructor<?> constructor = (java.lang.reflect.Constructor) c.get(str);
        if (constructor == null) {
            try {
                try {
                    java.lang.ClassLoader classLoader = context.getClassLoader();
                    if (strArr != null) {
                        cls = null;
                        java.lang.ClassNotFoundException e = null;
                        for (int i = 0; i < 2; i++) {
                            try {
                                cls = java.lang.Class.forName(strArr[i] + str, false, classLoader);
                                break;
                            } catch (java.lang.ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e == null) {
                                throw new android.view.InflateException(a.bn(str, attributeSet, ": Error inflating class "));
                            }
                            throw e;
                        }
                    } else {
                        cls = java.lang.Class.forName(str, false, classLoader);
                    }
                    constructor = cls.getConstructor(b);
                    constructor.setAccessible(true);
                    c.put(str, constructor);
                } catch (java.lang.Exception e3) {
                    android.view.InflateException inflateException = new android.view.InflateException(a.bn(str, attributeSet, ": Error inflating class "));
                    inflateException.initCause(e3);
                    throw inflateException;
                }
            } catch (java.lang.ClassNotFoundException e4) {
                throw e4;
            }
        }
        objArr[1] = attributeSet;
        return (androidx.preference.Preference) constructor.newInstance(objArr);
    }

    private static final androidx.preference.Preference d(java.lang.String str, android.util.AttributeSet attributeSet, android.content.Context context, java.lang.Object[] objArr, java.lang.String[] strArr) {
        try {
            return str.indexOf(46) == -1 ? c(str, strArr, attributeSet, context, objArr) : c(str, null, attributeSet, context, objArr);
        } catch (android.view.InflateException e) {
            throw e;
        } catch (java.lang.ClassNotFoundException e2) {
            android.view.InflateException inflateException = new android.view.InflateException(a.bn(str, attributeSet, ": Error inflating class (not found)"));
            inflateException.initCause(e2);
            throw inflateException;
        } catch (java.lang.Exception e3) {
            android.view.InflateException inflateException2 = new android.view.InflateException(a.bn(str, attributeSet, ": Error inflating class "));
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }
}
