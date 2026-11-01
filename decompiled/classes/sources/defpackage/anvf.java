package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anvf extends defpackage.anmd {
    private final defpackage.anvg a;

    public anvf(defpackage.anvg anvgVar, defpackage.aodo aodoVar) {
        if (anvgVar == null) {
            throw new java.lang.NullPointerException("tracer");
        }
        this.a = anvgVar;
        if (aodoVar == null) {
            throw new java.lang.NullPointerException("time");
        }
    }

    public static java.util.logging.Level c(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3) ? java.util.logging.Level.FINE : java.util.logging.Level.FINEST;
        }
        return java.util.logging.Level.FINER;
    }

    private final void d(int i) {
        if (i != 1) {
            synchronized (this.a.b) {
            }
        }
    }

    @Override // defpackage.anmd
    public final void a(int i, java.lang.String str) {
        java.util.logging.Level levelC = c(i);
        if (defpackage.anvg.a.isLoggable(levelC)) {
            defpackage.anvg.a(this.a.c, levelC, str);
        }
        d(i);
    }

    @Override // defpackage.anmd
    public final void b(int i, java.lang.String str, java.lang.Object... objArr) {
        java.util.logging.Level levelC = c(i);
        d(i);
        a(i, defpackage.anvg.a.isLoggable(levelC) ? java.text.MessageFormat.format(str, objArr) : null);
    }
}
