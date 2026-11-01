package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acup extends java.lang.Exception {
    public final defpackage.aify a;

    private acup(java.lang.String str, java.lang.Throwable th, defpackage.aify aifyVar) {
        super(str, th);
        this.a = aifyVar;
    }

    static java.lang.Throwable a(java.lang.Throwable th) {
        java.lang.Throwable cause = th.getCause();
        return (cause == null || !th.getClass().equals(java.util.concurrent.ExecutionException.class)) ? th : a(cause);
    }

    public static void b(java.util.Collection collection, java.lang.String str, java.lang.Object... objArr) {
        c(collection, defpackage.ahwt.a, str, objArr);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ajcb, java.lang.Object] */
    public static void c(java.util.Collection collection, defpackage.ahyn ahynVar, java.lang.String str, java.lang.Object... objArr) throws defpackage.acup {
        java.util.Iterator it = collection.iterator();
        defpackage.aift aiftVar = null;
        while (it.hasNext()) {
            try {
                java.lang.Object objH = defpackage.aiql.H((defpackage.ajcq) it.next());
                if (ahynVar.f()) {
                    ahynVar.b();
                }
            } catch (java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException e) {
                if (aiftVar == null) {
                    aiftVar = new defpackage.aift(4);
                }
                java.lang.Throwable thA = a(e);
                aiftVar.i(thA);
                if (ahynVar.f()) {
                    ahynVar.b().a(thA);
                }
            }
        }
        if (aiftVar == null) {
            return;
        }
        defpackage.aify aifyVarG = aiftVar.g();
        java.lang.String strConcat = java.lang.String.format(java.util.Locale.US, str, objArr);
        int i = ((defpackage.aike) aifyVarG).d;
        if (i > 1) {
            java.lang.String str2 = strConcat + '\n' + i + " failure(s) in total:\n";
            try {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                try {
                    java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
                    try {
                        printWriter.println(str2);
                        int i2 = 0;
                        while (i2 < i) {
                            java.lang.Throwable th = (java.lang.Throwable) aifyVarG.get(i2);
                            i2++;
                            printWriter.printf("--- Failure %d ----------------------------\n", java.lang.Integer.valueOf(i2));
                            printWriter.println(d(th, 1));
                        }
                        printWriter.println("-------------------------------------------");
                        strConcat = stringWriter.toString();
                        printWriter.close();
                        stringWriter.close();
                    } catch (java.lang.Throwable th2) {
                        try {
                            printWriter.close();
                        } catch (java.lang.Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (java.lang.Throwable th4) {
                    try {
                        stringWriter.close();
                    } catch (java.lang.Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (java.lang.Throwable th6) {
                strConcat = "Failed to build string from throwables: ".concat(th6.toString());
            }
        }
        throw new defpackage.acup(strConcat, (java.lang.Throwable) aifyVarG.get(0), aifyVarG);
    }

    private static java.lang.String d(java.lang.Throwable th, int i) {
        java.lang.String str = th.getClass().getName() + ": " + th.getMessage();
        java.lang.Throwable cause = th.getCause();
        if (cause == null) {
            return str;
        }
        if (i >= 5) {
            return str.concat("\n(...)");
        }
        return str + "\nCaused by: " + d(cause, i + 1);
    }
}
