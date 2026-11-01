package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class aiqh extends aipl {
    private final defpackage.aiqf a;
    private final aiql b;
    private final defpackage.aiqg c;
    private final aipk d;

    public aiqh() {
        defpackage.aiqf aiqfVar = (defpackage.aiqf) p(defpackage.aiqf.class, "flogger.backend_factory");
        this.a = aiqfVar == null ? defpackage.aiqi.a : aiqfVar;
        aiql aiqlVar = (aiql) p(aiql.class, "flogger.logging_context");
        this.b = aiqlVar == null ? aiqn.a : aiqlVar;
        defpackage.aiqg aiqgVar = (defpackage.aiqg) p(defpackage.aiqg.class, "flogger.clock");
        this.c = aiqgVar == null ? defpackage.aiqk.a : aiqgVar;
        this.d = defpackage.aiqj.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6 A[LOOP:0: B:37:0x00c0->B:39:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    private static java.lang.Object p(java.lang.Class cls, java.lang.String str) {
        java.lang.String property;
        int i;
        java.lang.Object objCast;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        int size;
        try {
            property = java.lang.System.getProperty(str, null);
        } catch (java.lang.SecurityException e) {
            defpackage.airh.a("cannot read property name %s: %s", str, e);
            property = null;
        }
        if (property != null) {
            int iIndexOf = property.indexOf(35);
            java.lang.String strSubstring = iIndexOf == -1 ? property : property.substring(0, iIndexOf);
            java.lang.String strSubstring2 = iIndexOf == -1 ? "getInstance" : property.substring(iIndexOf + 1);
            java.lang.String str2 = strSubstring + '#' + strSubstring2 + "()";
            i = 0;
            try {
                java.lang.Class<?> cls2 = java.lang.Class.forName(strSubstring);
                try {
                    objCast = cls.cast(cls2.getMethod(strSubstring2, null).invoke(null, null));
                } catch (java.lang.NoSuchMethodException e2) {
                    if (iIndexOf == -1 || !strSubstring2.equals("getInstance")) {
                        defpackage.airh.a("method '%s' does not exist: %s\n", property, e2);
                        objCast = null;
                    } else {
                        a.bk(strSubstring, "new ", "()");
                        objCast = cls.cast(cls2.getConstructor(null).newInstance(null));
                    }
                }
            } catch (java.lang.ClassCastException e3) {
                defpackage.airh.a("cannot cast result of calling '%s' to '%s': %s\n", str2, cls.getName(), e3);
            } catch (java.lang.ClassNotFoundException unused) {
            } catch (java.lang.Exception e4) {
                defpackage.airh.a("cannot call expected no-argument constructor or static method '%s': %s\n", str2, e4);
            }
            if (objCast != null) {
                return objCast;
            }
            arrayList = new java.util.ArrayList();
            it = java.util.ServiceLoader.load(cls).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            size = arrayList.size();
            if (size != 0) {
                return null;
            }
            if (size != 1) {
                return arrayList.get(i);
            }
            java.io.PrintStream printStream = java.lang.System.err;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[i] = cls.getName();
            objArr[1] = arrayList;
            objArr[2] = str;
            printStream.printf("Multiple implementations of service %s found on the classpath: %s%nEnsure only the service implementation you want to use is included on the classpath or else specify the service class at startup with the '%s' system property. The default implementation will be used instead.%n", objArr);
            return null;
        }
        i = 0;
        objCast = null;
        if (objCast != null) {
            return objCast;
        }
        arrayList = new java.util.ArrayList();
        it = java.util.ServiceLoader.load(cls).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        size = arrayList.size();
        if (size != 0) {
            return null;
        }
        if (size != 1) {
            return arrayList.get(i);
        }
        java.io.PrintStream printStream2 = java.lang.System.err;
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[i] = cls.getName();
        objArr2[1] = arrayList;
        objArr2[2] = str;
        printStream2.printf("Multiple implementations of service %s found on the classpath: %s%nEnsure only the service implementation you want to use is included on the classpath or else specify the service class at startup with the '%s' system property. The default implementation will be used instead.%n", objArr2);
        return null;
    }

    protected final long c() {
        return this.c.a();
    }

    protected final aion e(java.lang.String str) {
        return this.a.a(str);
    }

    protected final aipk h() {
        return this.d;
    }

    protected final aiql j() {
        return this.b;
    }

    protected final java.lang.String m() {
        return "Platform: " + getClass().getName() + "\nBackendFactory: " + this.a.toString() + "\nClock: " + this.c.toString() + "\nContextDataProvider: " + java.lang.String.valueOf(this.b) + "\nLogCallerFinder: Default stack-based caller finder\n";
    }
}
