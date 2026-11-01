package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apcl {
    private static final java.lang.StackTraceElement a;
    private static final java.lang.String b;
    private static final java.lang.String c;

    static {
        java.lang.Object objAe;
        java.lang.Object objAe2;
        java.lang.Exception exc = new java.lang.Exception();
        java.lang.String simpleName = defpackage.a.class.getSimpleName();
        defpackage.aooh.e(simpleName, "getSimpleName(...)");
        java.lang.StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        java.lang.String strValueOf = java.lang.String.valueOf(simpleName);
        a = new java.lang.StackTraceElement("_COROUTINE.".concat(strValueOf), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objAe = java.lang.Class.forName("aomb").getCanonicalName();
        } catch (java.lang.Throwable th) {
            objAe = defpackage.aooc.ae(th);
        }
        if (defpackage.aoiw.c(objAe) != null) {
            objAe = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (java.lang.String) objAe;
        try {
            objAe2 = java.lang.Class.forName("apcl").getCanonicalName();
        } catch (java.lang.Throwable th2) {
            objAe2 = defpackage.aooc.ae(th2);
        }
        if (defpackage.aoiw.c(objAe2) != null) {
            objAe2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (java.lang.String) objAe2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    public static final java.lang.Throwable a(java.lang.Throwable th, defpackage.aome aomeVar) {
        defpackage.aoiu aoiuVar;
        boolean z = defpackage.apba.a;
        int i = 0;
        if (defpackage.apba.a) {
            defpackage.aooh.f(th, "exception");
            defpackage.aooh.f(aomeVar, "topFrame");
            if (th instanceof java.util.concurrent.CancellationException) {
                return th;
            }
            defpackage.aooh.f(aomeVar, "topFrame");
            defpackage.aooh.f(aomeVar, "<this>");
            apaw apawVar = new apaw(defpackage.aooc.k(defpackage.aooc.n(defpackage.aooc.h(aomeVar, apay.a), apaz.a)));
            apaw[] suppressed = th.getSuppressed();
            defpackage.aooh.e(suppressed, "getSuppressed(...)");
            int length = suppressed.length;
            while (i < length) {
                apaw apawVar2 = suppressed[i];
                if (apawVar2 instanceof apaw) {
                    java.util.List list = apawVar.a;
                    int size = list.size();
                    java.util.List list2 = apawVar2.a;
                    if (size <= list2.size() && defpackage.aooh.n(list, list2.subList(list2.size() - list.size(), list2.size()))) {
                        return th;
                    }
                }
                i++;
            }
            aoil.b(th, apawVar);
            return th;
        }
        java.lang.Throwable cause = th.getCause();
        if (cause == null) {
            aoiuVar = new defpackage.aoiu(th, new java.lang.StackTraceElement[0]);
        } else if (defpackage.aooh.n(cause.getClass(), th.getClass())) {
            java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
            int length2 = stackTrace.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    aoiuVar = new defpackage.aoiu(th, new java.lang.StackTraceElement[0]);
                    break;
                }
                if (d(stackTrace[i2])) {
                    aoiuVar = new defpackage.aoiu(cause, stackTrace);
                    break;
                }
                i2++;
            }
        } else {
            aoiuVar = new defpackage.aoiu(th, new java.lang.StackTraceElement[0]);
        }
        java.lang.Object obj = aoiuVar.b;
        java.lang.Throwable th2 = (java.lang.Throwable) aoiuVar.a;
        java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) obj;
        java.lang.Throwable thA = apbv.a(th2);
        if (thA == null) {
            return th;
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.lang.StackTraceElement stackTraceElementCJ = aomeVar.cJ();
        if (stackTraceElementCJ != null) {
            arrayDeque.add(stackTraceElementCJ);
        }
        while (true) {
            if (true != (aomeVar instanceof defpackage.aome)) {
                aomeVar = null;
            }
            if (aomeVar == null || (aomeVar = aomeVar.cK()) == null) {
                break;
            }
            java.lang.StackTraceElement stackTraceElementCJ2 = aomeVar.cJ();
            if (stackTraceElementCJ2 != null) {
                arrayDeque.add(stackTraceElementCJ2);
            }
        }
        if (arrayDeque.isEmpty()) {
            return th;
        }
        if (th2 != th) {
            int length3 = stackTraceElementArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length3) {
                    i3 = -1;
                    break;
                }
                if (d(stackTraceElementArr[i3])) {
                    break;
                }
                i3++;
            }
            int i4 = i3 + 1;
            int length4 = stackTraceElementArr.length - 1;
            if (i4 <= length4) {
                while (true) {
                    java.lang.StackTraceElement stackTraceElement = stackTraceElementArr[length4];
                    java.lang.StackTraceElement stackTraceElement2 = (java.lang.StackTraceElement) arrayDeque.getLast();
                    if (stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && defpackage.aooh.n(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && defpackage.aooh.n(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && defpackage.aooh.n(stackTraceElement.getClassName(), stackTraceElement2.getClassName())) {
                        arrayDeque.removeLast();
                    }
                    arrayDeque.addFirst(stackTraceElementArr[length4]);
                    if (length4 == i4) {
                        break;
                    }
                    length4--;
                }
            }
        }
        arrayDeque.addFirst(a);
        java.lang.StackTraceElement[] stackTrace2 = th2.getStackTrace();
        int iE = e(stackTrace2, b);
        if (iE == -1) {
            thA.setStackTrace((java.lang.StackTraceElement[]) arrayDeque.toArray(new java.lang.StackTraceElement[0]));
        } else {
            java.lang.StackTraceElement[] stackTraceElementArr2 = new java.lang.StackTraceElement[arrayDeque.size() + iE];
            for (int i5 = 0; i5 < iE; i5++) {
                stackTraceElementArr2[i5] = stackTrace2[i5];
            }
            java.util.Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                stackTraceElementArr2[i + iE] = (java.lang.StackTraceElement) it.next();
                i++;
            }
            thA.setStackTrace(stackTraceElementArr2);
        }
        return thA;
    }

    public static final java.lang.Throwable b(java.lang.Throwable th) {
        java.lang.Throwable thA;
        boolean z = defpackage.apba.a;
        if (defpackage.apba.a || !defpackage.aosu.b || (thA = apbv.a(th)) == null) {
            return th;
        }
        java.lang.StackTraceElement[] stackTrace = thA.getStackTrace();
        int length = stackTrace.length;
        int i = length - 1;
        if (i < 0) {
            i = -1;
            break;
        }
        while (true) {
            int i2 = i - 1;
            if (!defpackage.aooh.n(c, stackTrace[i].getClassName())) {
                if (i2 < 0) {
                    i = -1;
                    break;
                }
                i = i2;
            } else {
                break;
            }
        }
        int iE = e(stackTrace, b);
        int i3 = 0;
        int i4 = (length - i) - (iE == -1 ? 0 : length - iE);
        java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? a : stackTrace[((i + 1) + i3) - 1];
            i3++;
        }
        thA.setStackTrace(stackTraceElementArr);
        return thA;
    }

    public static final java.lang.Throwable c(java.lang.Throwable th) {
        java.lang.Throwable cause = th.getCause();
        if (cause == null) {
            return th;
        }
        if (!defpackage.aooh.n(cause.getClass(), th.getClass())) {
            return th;
        }
        for (java.lang.StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (d(stackTraceElement)) {
                return cause;
            }
        }
        return th;
    }

    public static final boolean d(java.lang.StackTraceElement stackTraceElement) {
        return defpackage.aoov.ad(stackTraceElement.getClassName(), "_COROUTINE");
    }

    private static final int e(java.lang.StackTraceElement[] stackTraceElementArr, java.lang.String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (defpackage.aooh.n(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
