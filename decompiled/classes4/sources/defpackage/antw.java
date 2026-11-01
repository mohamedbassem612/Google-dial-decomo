package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class antw {
    private static volatile java.lang.reflect.Method a;

    public antw(defpackage.ansh anshVar) {
        j$.util.Objects.requireNonNull(anshVar);
    }

    public static android.content.Context j(android.content.Context context, android.os.UserHandle userHandle) {
        if (a == null) {
            synchronized (defpackage.antw.class) {
                if (a == null) {
                    a = android.content.Context.class.getMethod("createContextAsUser", android.os.UserHandle.class, java.lang.Integer.TYPE);
                }
            }
        }
        return (android.content.Context) a.invoke(context, userHandle, 0);
    }

    public static void l(defpackage.anpk anpkVar, defpackage.anqm anqmVar, java.lang.String str, defpackage.anqq anqqVar, java.util.Map map) {
        z(new defpackage.apjb(anpkVar, anqmVar), str, map);
    }

    public static java.lang.String n(int i) {
        java.lang.String string = java.lang.Integer.toString(i, 16);
        aooh.e(string, "toString(...)");
        return "0x".concat(java.lang.String.valueOf(string));
    }

    public static void o(appa appaVar, int i, aonn aonnVar) throws java.io.IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new java.io.IOException("bad zip: truncated header in extra field");
            }
            char cX = (char) appaVar.x();
            long j2 = j - 4;
            long jX = ((long) appaVar.x()) & 65535;
            if (j2 < jX) {
                throw new java.io.IOException("bad zip: truncated value in extra field");
            }
            appaVar.z(jX);
            apoy apoyVar = ((appx) appaVar).b;
            long j3 = apoyVar.b;
            aonnVar.a(java.lang.Integer.valueOf(cX), java.lang.Long.valueOf(jX));
            long j4 = (apoyVar.b + jX) - j3;
            if (j4 < 0) {
                throw new java.io.IOException(a.bj(cX, "unsupported zip: too many bytes processed for "));
            }
            if (j4 > 0) {
                apoyVar.A(j4);
            }
            j = j2 - jX;
        }
    }

    public static boolean p(defpackage.appp apppVar) {
        appb appbVarS;
        int iA = defpackage.apqj.a(apppVar);
        if (iA != -1) {
            appbVarS = appb.s(apppVar.b, iA + 1, 0, 2);
        } else {
            appbVarS = (apppVar.a() == null || apppVar.b.c() != 2) ? apppVar.b : appb.a;
        }
        return !aoov.r(appbVarS.i(), ".class", true);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public static int q(defpackage.apqa apqaVar, int i) {
        int i2;
        int length = apqaVar.e.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = i + 1;
            i2 = (i3 + length) >>> 1;
            int i5 = apqaVar.f[i2];
            if (i5 < i4) {
                i3 = i2 + 1;
            } else {
                if (i5 <= i4) {
                    if (i2 < 0) {
                        return ~i2;
                    }
                    return i2;
                }
                length = i2 - 1;
            }
        }
        i2 = (-i3) - 1;
        if (i2 < 0) {
            return ~i2;
        }
        return i2;
    }

    public static defpackage.appp r(java.lang.String str) {
        aooh.f(str, "<this>");
        appb appbVar = defpackage.apqj.a;
        aooh.f(str, "<this>");
        apoy apoyVar = new apoy();
        apoyVar.Z(str);
        return defpackage.apqj.f(apoyVar);
    }

    public static defpackage.appp s(java.io.File file) {
        java.lang.String string = file.toString();
        aooh.e(string, "toString(...)");
        return r(string);
    }

    public static java.lang.String t(appb appbVar, appb[] appbVarArr, int i) {
        int i2;
        int i3;
        int i4;
        int iC = appbVar.c();
        int i5 = 0;
        while (i5 < iC) {
            int i6 = (i5 + iC) / 2;
            while (i6 >= 0 && appbVar.a(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (appbVar.a(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z) {
                    i3 = 46;
                } else {
                    byte bA = appbVarArr[i10].a(i11);
                    int i13 = apjv.a;
                    i3 = bA & 255;
                }
                byte bA2 = appbVar.a(i7 + i12);
                int i14 = apjv.a;
                i4 = i3 - (bA2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 != i9) {
                    if (appbVarArr[i10].c() != i11) {
                        z = false;
                    } else if (i10 != appbVarArr.length - 1) {
                        i10++;
                        z = true;
                        i11 = -1;
                    }
                }
                i4 = 0;
                break;
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i15 = i9 - i12;
                    int iC2 = appbVarArr[i10].c() - i11;
                    int length = appbVarArr.length;
                    for (int i16 = i10 + 1; i16 < length; i16++) {
                        iC2 += appbVarArr[i16].c();
                    }
                    if (iC2 >= i15) {
                        if (iC2 <= i15) {
                            return appbVar.j(i7, i9 + i7).h(aoqv.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iC = i6;
        }
        return null;
    }

    public static java.lang.String u(long j) {
        java.lang.String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        java.lang.String str2 = java.lang.String.format("%6s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        aooh.e(str2, "format(...)");
        return str2;
    }

    public static void v(java.util.logging.Logger logger, apjz apjzVar, apkb apkbVar, java.lang.String str) {
        java.lang.String str2 = java.lang.String.format("%-22s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        aooh.e(str2, "format(...)");
        logger.fine(apkbVar.b + ' ' + str2 + ": " + apjzVar.a);
    }

    public static apjk w(byte[] bArr, apiy apiyVar, int i) {
        aooh.f(bArr, "<this>");
        apjv.n(bArr.length, i);
        return new defpackage.apjj(apiyVar, i, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    public static int x(java.lang.String str, int i, int i2, boolean z) {
        boolean z2;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ') {
                if (cCharAt < 127 || ((cCharAt >= '0' && cCharAt < ':') || ((cCharAt >= 'a' && cCharAt < '{') || ((cCharAt >= 'A' && cCharAt < '[') || cCharAt == ':')))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if (cCharAt == '\t') {
                cCharAt = '\t';
                if (cCharAt < 127) {
                    z2 = true;
                } else {
                    z2 = true;
                }
            } else {
                z2 = true;
            }
            if (z2 == (true ^ z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.util.List] */
    public static defpackage.apjb y(java.lang.String str, defpackage.anqq anqqVar, java.util.Map map) {
        if (anqqVar == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            java.util.Iterator it = map.values().iterator();
            while (it.hasNext()) {
                arrayList.add(((defpackage.apjb) it.next()).a);
            }
            defpackage.apjb apjbVar = new defpackage.apjb(str);
            apjbVar.b.addAll(arrayList);
            anqqVar = new defpackage.anqq(apjbVar);
        }
        java.util.HashMap map2 = new java.util.HashMap(map);
        for (defpackage.anpk anpkVar : anqqVar.b) {
            java.lang.String str2 = anpkVar.b;
            defpackage.apjb apjbVar2 = (defpackage.apjb) map2.remove(str2);
            if (apjbVar2 == null) {
                throw new java.lang.IllegalStateException("No method bound for descriptor entry ".concat(str2));
            }
            if (apjbVar2.a != anpkVar) {
                throw new java.lang.IllegalStateException(a.bk(str2, "Bound method for ", " not same instance as method in service descriptor"));
            }
        }
        if (map2.size() <= 0) {
            return new defpackage.apjb(anqqVar, map);
        }
        throw new java.lang.IllegalStateException("No entry in descriptor matching bound method ".concat(((defpackage.anpk) ((defpackage.apjb) map2.values().iterator().next()).a).b));
    }

    public static void z(defpackage.apjb apjbVar, java.lang.String str, java.util.Map map) {
        defpackage.anpk anpkVar = (defpackage.anpk) apjbVar.a;
        boolean zEquals = str.equals(anpkVar.c);
        java.lang.String str2 = anpkVar.b;
        ahvr.bW(zEquals, "Method name should be prefixed with service name and separated with '/'. Expected service name: '%s'. Actual fully qualifed method name: '%s'.", str, str2);
        ahvr.cc(!map.containsKey(str2), "Method by same name already registered: %s", str2);
        map.put(str2, apjbVar);
    }

    public void f(defpackage.anqn anqnVar) {
        throw null;
    }

    public final synchronized void k() {
    }

    public anqw m(defpackage.anpt anptVar) {
        throw null;
    }

    public antw(char[] cArr) {
    }

    private antw() {
    }

    public void a() {
    }

    public void b() {
    }

    public void c() {
    }

    public void e() {
    }

    public void d(java.lang.Object obj) {
    }
}
