package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adik {
    private static final java.text.NumberFormat c = java.text.NumberFormat.getIntegerInstance(java.util.Locale.US);
    public static final java.util.Set a = new java.util.HashSet();
    public static final java.lang.Object b = new java.lang.Object();

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.HOURS;
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.MINUTES;
        java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.SECONDS;
    }

    public static java.lang.String a(int i, int i2, int i3, int i4) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4 = "?";
        if (i == 0) {
            str = "*";
        } else if (i != 1) {
            str = i != 2 ? "?" : "m";
        } else {
            str = "W";
        }
        if (i2 == 0) {
            str2 = "*";
        } else if (i2 != 1) {
            str2 = i2 != 2 ? "?" : "b";
        } else {
            str2 = "C";
        }
        if (i3 == 0) {
            str3 = "*";
        } else if (i3 != 1) {
            str3 = i3 != 2 ? "?" : "u";
        } else {
            str3 = "I";
        }
        if (i4 == 0) {
            str4 = "*";
        } else if (i4 == 1) {
            str4 = "N";
        } else if (i4 == 2) {
            str4 = "l";
        }
        return str + ':' + str2 + ':' + str3 + ':' + str4;
    }

    public static java.lang.String b(long j) {
        java.lang.String str;
        java.lang.String str2;
        if (j >= 1073741824) {
            str = c.format(java.lang.Math.min(java.lang.Math.ceil(j / 1.073741824E9d), 999.0d));
        } else {
            java.text.NumberFormat numberFormat = c;
            double d = j;
            str = j >= 1048576 ? numberFormat.format(java.lang.Math.ceil(d / 1048576.0d)) : numberFormat.format(java.lang.Math.ceil(d / 1024.0d));
        }
        if (j >= 1073741824) {
            str2 = "GB";
        } else {
            str2 = j >= 1048576 ? "MB" : "kB";
        }
        return defpackage.a.bE(str2, (byte) 32, str);
    }

    public static java.lang.String c(long j) {
        return java.text.DateFormat.getDateTimeInstance(3, 3).format(new java.util.Date(j));
    }

    public static java.lang.String d(java.io.File file) {
        java.io.File parentFile = file.getParentFile();
        if (parentFile == null) {
            return file.getName();
        }
        return parentFile.getName() + '/' + file.getName();
    }

    public static java.lang.String e(java.util.Collection collection, defpackage.ahyc ahycVar) {
        if (collection.isEmpty()) {
            return "[]";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append('[');
        for (java.lang.Object obj : collection) {
            if (sb.length() > 1) {
                sb.append(", ");
            }
            sb.append((java.lang.String) ahycVar.apply(obj));
        }
        sb.append(']');
        return sb.toString();
    }

    public static java.lang.String f(java.lang.String str, java.lang.String str2) {
        boolean zContains;
        synchronized (b) {
            zContains = a.contains(str);
        }
        return zContains ? "redacted" : str2;
    }

    public static java.lang.String g(int i) {
        java.lang.String strN;
        if (i == 0) {
            return "*";
        }
        java.lang.String strN2 = "";
        if ((i & 1) != 0) {
            strN2 = n("", "fg");
            i &= -2;
        }
        if ((i & 2) != 0) {
            strN = n(strN2, "bg");
            i &= -3;
        } else {
            strN = strN2;
        }
        return i != 0 ? n(strN, "?") : strN;
    }

    public static java.lang.String h(java.lang.String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }
        return str.substring(i);
    }

    public static void i(boolean z) {
        if (z) {
            throw new java.lang.UnsupportedOperationException("Operation not supported on a closed object.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0016 A[SYNTHETIC] */
    public static void j(java.util.Collection collection, java.util.Collection collection2, adij adijVar, java.util.Comparator comparator) {
        char c2;
        java.lang.Object objAY;
        java.lang.Object objAY2;
        int iCompare;
        defpackage.ailk ailkVarY = ((defpackage.aify) collection).listIterator(0);
        defpackage.ailk ailkVarY2 = ((defpackage.aify) collection2).listIterator(0);
        java.lang.Object objAY3 = defpackage.ahvr.aY(ailkVarY, null);
        java.lang.Object objAY4 = defpackage.ahvr.aY(ailkVarY2, null);
        while (true) {
            if (objAY3 != null) {
                if (objAY4 == null || (iCompare = comparator.compare(objAY3, objAY4)) < 0) {
                    c2 = 2;
                } else if (iCompare <= 0) {
                    c2 = 0;
                }
                if (c2 != 1) {
                    if (c2 == 2) {
                        defpackage.ahvr.ci(objAY3);
                        adijVar.a(objAY3, 2);
                    }
                    objAY2 = defpackage.ahvr.aY(ailkVarY, null);
                    if (objAY2 != null) {
                        defpackage.ahvr.ci(objAY3);
                        if (comparator.compare(objAY3, objAY2) > 0) {
                            throw new java.lang.IllegalArgumentException("The left list is not ordered.");
                        }
                    }
                    objAY3 = objAY2;
                }
                if (c2 == 2) {
                    if (c2 == 1) {
                        defpackage.ahvr.ci(objAY4);
                        adijVar.a(objAY4, 1);
                    }
                    objAY = defpackage.ahvr.aY(ailkVarY2, null);
                    if (objAY != null) {
                        defpackage.ahvr.ci(objAY4);
                        if (comparator.compare(objAY4, objAY) > 0) {
                            throw new java.lang.IllegalArgumentException("The right list is not ordered.");
                        }
                    }
                    objAY4 = objAY;
                }
            } else if (objAY4 == null) {
                return;
            }
            c2 = 1;
            if (c2 != 1) {
                if (c2 == 2) {
                    defpackage.ahvr.ci(objAY3);
                    adijVar.a(objAY3, 2);
                }
                objAY2 = defpackage.ahvr.aY(ailkVarY, null);
                if (objAY2 != null) {
                    defpackage.ahvr.ci(objAY3);
                    if (comparator.compare(objAY3, objAY2) > 0) {
                        throw new java.lang.IllegalArgumentException("The left list is not ordered.");
                    }
                }
                objAY3 = objAY2;
            }
            if (c2 == 2) {
                if (c2 == 1) {
                    defpackage.ahvr.ci(objAY4);
                    adijVar.a(objAY4, 1);
                }
                objAY = defpackage.ahvr.aY(ailkVarY2, null);
                if (objAY != null) {
                    defpackage.ahvr.ci(objAY4);
                    if (comparator.compare(objAY4, objAY) > 0) {
                        throw new java.lang.IllegalArgumentException("The right list is not ordered.");
                    }
                }
                objAY4 = objAY;
            }
        }
    }

    public static void k(java.lang.String str, long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "%s must be greater than or equal to zero.", str));
        }
    }

    public static java.util.List l(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String[] strArr, defpackage.ahyc ahycVar) throws java.lang.Throwable {
        java.lang.Throwable th;
        android.database.Cursor cursorRawQuery;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            sb.append("SELECT ");
            afcd.g(", ", strArr, sb);
            sb.append(" FROM ");
            sb.append(str);
            sb.append(" GROUP BY " + strArr[0]);
            afao afaoVarF = afcd.f(sb, arrayList2);
            cursorRawQuery = sQLiteDatabase.rawQuery(afaoVarF.a, afaoVarF.a());
            while (cursorRawQuery != null) {
                try {
                    if (!cursorRawQuery.moveToNext()) {
                        cursorRawQuery.close();
                        break;
                    }
                    java.lang.Object objApply = ahycVar.apply(cursorRawQuery);
                    if (objApply != null) {
                        arrayList.add(objApply);
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    throw th;
                }
            }
            return arrayList;
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursorRawQuery = null;
        }
    }

    public static void m(int i) {
        if (i < 0 || i > 2) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bj(i, "Invalid reservation state value: "));
        }
    }

    private static java.lang.String n(java.lang.String str, java.lang.String str2) {
        if (!str.isEmpty()) {
            str = str.concat("|");
        }
        return str.concat(str2);
    }
}
