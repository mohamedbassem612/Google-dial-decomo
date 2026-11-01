package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anvg {
    static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.anmd.class.getName());
    public final java.lang.Object b = new java.lang.Object();
    public final defpackage.anns c;

    public anvg(defpackage.anns annsVar, long j, java.lang.String str) {
        if (annsVar == null) {
            throw new java.lang.NullPointerException("logId");
        }
        this.c = annsVar;
        defpackage.annk annkVar = new defpackage.annk();
        annkVar.a = str.concat(" created");
        annkVar.b = defpackage.annl.b;
        annkVar.b(j);
        b(annkVar.a());
    }

    static void a(defpackage.anns annsVar, java.util.logging.Level level, java.lang.String str) {
        java.util.logging.Logger logger = a;
        if (logger.isLoggable(level)) {
            java.util.logging.LogRecord logRecord = new java.util.logging.LogRecord(level, "[" + annsVar.toString() + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void b(defpackage.annm annmVar) {
        java.util.logging.Level level;
        int iOrdinal = annmVar.b.ordinal();
        if (iOrdinal != 2) {
            level = iOrdinal != 3 ? java.util.logging.Level.FINEST : java.util.logging.Level.FINE;
        } else {
            level = java.util.logging.Level.FINER;
        }
        synchronized (this.b) {
        }
        a(this.c, level, annmVar.a);
    }
}
