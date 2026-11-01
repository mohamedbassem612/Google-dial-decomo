package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ajaj extends defpackage.ajdm implements defpackage.ajcq {
    static final java.lang.Object j = new java.lang.Object();
    static final defpackage.ajcp k = new defpackage.ajcp(defpackage.ajac.class);
    static final boolean l;
    public static final defpackage.ajad m;
    volatile defpackage.aizz listenersField;
    volatile java.lang.Object valueField;
    volatile defpackage.ajai waitersField;

    static {
        boolean z;
        ajae ajaeVar;
        try {
            z = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (java.lang.SecurityException unused) {
            z = false;
        }
        l = z;
        java.lang.String property = java.lang.System.getProperty("java.runtime.name", "");
        if (property == null || property.contains("Android")) {
            try {
                ajaeVar = new defpackage.ajah();
            } catch (java.lang.Error | java.lang.Exception unused2) {
                ajaeVar = new ajae();
            }
        } else {
            ajaeVar = new ajae();
        }
        m = ajaeVar;
    }

    private final void a(defpackage.ajai ajaiVar) {
        ajaiVar.thread = null;
        while (true) {
            defpackage.ajai ajaiVar2 = this.waitersField;
            if (ajaiVar2 != defpackage.ajai.a) {
                defpackage.ajai ajaiVar3 = null;
                while (ajaiVar2 != null) {
                    defpackage.ajai ajaiVar4 = ajaiVar2.next;
                    if (ajaiVar2.thread != null) {
                        ajaiVar3 = ajaiVar2;
                    } else if (ajaiVar3 != null) {
                        ajaiVar3.next = ajaiVar4;
                        if (ajaiVar3.thread == null) {
                        }
                    } else if (b(ajaiVar2, ajaiVar4)) {
                    }
                    ajaiVar2 = ajaiVar4;
                }
                return;
            }
            return;
        }
    }

    private final boolean b(defpackage.ajai ajaiVar, defpackage.ajai ajaiVar2) {
        return m.g(this, ajaiVar, ajaiVar2);
    }

    public final java.lang.Object s() throws java.lang.InterruptedException {
        java.lang.Object obj;
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj2 = this.valueField;
        boolean z = obj2 != null;
        int i = defpackage.ajac.i;
        if (z && (!(obj2 instanceof defpackage.aizw))) {
            return defpackage.ajac.h(obj2);
        }
        defpackage.ajai ajaiVar = this.waitersField;
        if (ajaiVar != defpackage.ajai.a) {
            defpackage.ajai ajaiVar2 = new defpackage.ajai();
            do {
                m.c(ajaiVar2, ajaiVar);
                if (b(ajaiVar, ajaiVar2)) {
                    do {
                        java.util.concurrent.locks.LockSupport.park(this);
                        if (java.lang.Thread.interrupted()) {
                            a(ajaiVar2);
                            throw new java.lang.InterruptedException();
                        }
                        obj = this.valueField;
                    } while (!((obj != null) & (!(obj instanceof defpackage.aizw))));
                    return defpackage.ajac.h(obj);
                }
                ajaiVar = this.waitersField;
            } while (ajaiVar != defpackage.ajai.a);
        }
        return defpackage.ajac.h(j$.util.Objects.requireNonNull(this.valueField));
    }

    public final java.lang.Object t(long j2, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (java.lang.Thread.interrupted()) {
            throw new java.lang.InterruptedException();
        }
        java.lang.Object obj = this.valueField;
        boolean z = true;
        if ((obj != null) && defpackage.ajac.n(obj)) {
            return defpackage.ajac.h(obj);
        }
        long jNanoTime = nanos > 0 ? java.lang.System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            defpackage.ajai ajaiVar = this.waitersField;
            if (ajaiVar != defpackage.ajai.a) {
                defpackage.ajai ajaiVar2 = new defpackage.ajai();
                while (true) {
                    m.c(ajaiVar2, ajaiVar);
                    if (b(ajaiVar, ajaiVar2)) {
                        do {
                            java.util.concurrent.locks.LockSupport.parkNanos(this, java.lang.Math.min(nanos, 2147483647999999999L));
                            if (java.lang.Thread.interrupted()) {
                                a(ajaiVar2);
                                throw new java.lang.InterruptedException();
                            }
                            java.lang.Object obj2 = this.valueField;
                            if ((obj2 != null) && defpackage.ajac.n(obj2)) {
                                return defpackage.ajac.h(obj2);
                            }
                            nanos = jNanoTime - java.lang.System.nanoTime();
                        } while (nanos >= 1000);
                        a(ajaiVar2);
                        break;
                    }
                    ajaiVar = this.waitersField;
                    if (ajaiVar == defpackage.ajai.a) {
                    }
                }
            }
            return defpackage.ajac.h(j$.util.Objects.requireNonNull(this.valueField));
        }
        while (nanos > 0) {
            java.lang.Object obj3 = this.valueField;
            if ((obj3 != null) && defpackage.ajac.n(obj3)) {
                return defpackage.ajac.h(obj3);
            }
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException();
            }
            nanos = jNanoTime - java.lang.System.nanoTime();
        }
        java.lang.String string = toString();
        java.lang.String lowerCase = timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
        java.lang.String strConcat = "Waited " + j2 + ' ' + timeUnit.toString().toLowerCase(java.util.Locale.ROOT);
        if (nanos + 1000 < 0) {
            java.lang.String strConcat2 = strConcat.concat(" (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, java.util.concurrent.TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z = false;
            }
            if (jConvert > 0) {
                java.lang.String strConcat3 = strConcat2 + jConvert + ' ' + lowerCase;
                if (z) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = strConcat3.concat(" ");
            }
            if (z) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = strConcat2.concat("delay)");
        }
        if (isDone()) {
            throw new java.util.concurrent.TimeoutException(strConcat.concat(" but future completed as timeout expired"));
        }
        throw new java.util.concurrent.TimeoutException(defpackage.a.br(string, strConcat, " for "));
    }
}
