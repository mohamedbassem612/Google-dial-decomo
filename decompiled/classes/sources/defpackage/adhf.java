package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adhf extends java.lang.Exception {
    private adhf(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public static void a(java.util.Collection collection, java.lang.String str, java.lang.Object... objArr) {
        java.util.Iterator it = collection.iterator();
        java.util.ArrayList arrayList = null;
        defpackage.aift aiftVar = null;
        while (it.hasNext()) {
            defpackage.ajcq ajcqVar = (defpackage.ajcq) it.next();
            try {
                defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
                defpackage.a.h(ajcqVar);
            } catch (java.util.concurrent.ExecutionException e) {
                if (aiftVar == null) {
                    aiftVar = new defpackage.aift(4);
                }
                aiftVar.i(defpackage.agab.cp(e));
            }
        }
        if (aiftVar == null) {
            return;
        }
        defpackage.aify aifyVarG = aiftVar.g();
        java.lang.String strK = java.lang.String.format(java.util.Locale.US, str, objArr);
        int i = ((defpackage.aike) aifyVarG).d;
        if (i > 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(strK);
            sb.append('\n');
            sb.append(i - 1);
            sb.append(" additional failure(s) besides cause:\n");
            java.lang.String string = sb.toString();
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            java.lang.StringBuffer buffer = stringWriter.getBuffer();
            java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
            try {
                printWriter.println(string);
                int i2 = 0;
                int i3 = 1;
                while (i3 < i) {
                    java.lang.Throwable th = (java.lang.Throwable) aifyVarG.get(i3);
                    i3++;
                    printWriter.printf("--- Failure %d ----------------------------\n", java.lang.Integer.valueOf(i3));
                    if (i2 > 32) {
                        printWriter.println(defpackage.agab.co(th, 1));
                    } else {
                        th.printStackTrace(printWriter);
                        int i4 = 1;
                        for (int length = buffer.length() - 1; length < buffer.length(); length++) {
                            if (buffer.charAt(length) == '\n') {
                                i4++;
                            }
                        }
                        i2 += i4;
                    }
                }
                printWriter.println("-------------------------------------------");
                strK = stringWriter.toString();
                for (adhj adhjVarCn = defpackage.agab.cn(strK, 0); adhjVarCn != null; adhjVarCn = defpackage.agab.cn(strK, adhjVarCn.b + 1)) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    int i5 = 0;
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        adhj adhjVar = (adhj) arrayList.get(i6);
                        if (adhjVar.e >= 0) {
                            i5++;
                        }
                        if (adhjVar.hashCode() == adhjVarCn.hashCode()) {
                            adhjVarCn.e = i5;
                            break;
                        }
                    }
                    arrayList.add(adhjVarCn);
                }
                if (arrayList != null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    int i7 = 0;
                    for (int i8 = 0; i8 < arrayList.size(); i8++) {
                        adhj adhjVar2 = (adhj) arrayList.get(i8);
                        sb2.append((java.lang.CharSequence) strK, i7, adhjVar2.a);
                        if (adhjVar2.e >= 0) {
                            sb2.append("\tSame as stack trace [");
                            sb2.append(adhjVar2.e + 1);
                            sb2.append("]\n");
                        } else {
                            sb2.append(adhjVar2);
                        }
                        i7 = adhjVar2.b + 1;
                    }
                    if (i7 < strK.length()) {
                        sb2.append((java.lang.CharSequence) strK, i7, strK.length());
                    }
                    strK = sb2.toString();
                }
            } catch (java.lang.Throwable th2) {
                try {
                    strK = defpackage.hgb.k(th2, "Failed to build string from throwables: ");
                } finally {
                    printWriter.close();
                }
            }
        }
        throw new defpackage.adhf(strK, (java.lang.Throwable) aifyVarG.get(0));
    }
}
