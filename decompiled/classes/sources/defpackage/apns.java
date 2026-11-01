package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apns extends java.util.logging.Handler {
    public static final defpackage.apns a = new defpackage.apns();

    @Override // java.util.logging.Handler
    public final void publish(java.util.logging.LogRecord logRecord) {
        int i;
        int iMin;
        defpackage.aooh.f(logRecord, "record");
        java.util.Map map = defpackage.apnr.a;
        java.lang.String loggerName = logRecord.getLoggerName();
        defpackage.aooh.e(loggerName, "getLoggerName(...)");
        if (logRecord.getLevel().intValue() > java.util.logging.Level.INFO.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == java.util.logging.Level.INFO.intValue() ? 4 : 3;
        }
        java.lang.String message = logRecord.getMessage();
        defpackage.aooh.e(message, "getMessage(...)");
        java.lang.Throwable thrown = logRecord.getThrown();
        defpackage.aooh.f(loggerName, "loggerName");
        defpackage.aooh.f(message, "message");
        java.lang.String strAa = (java.lang.String) defpackage.apnr.a.get(loggerName);
        if (strAa == null) {
            strAa = defpackage.aoov.aa(loggerName, 23);
        }
        if (android.util.Log.isLoggable(strAa, i)) {
            if (thrown != null) {
                message = message + '\n' + android.util.Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iM = defpackage.aoov.M(message, '\n', i2);
                if (iM == -1) {
                    iM = length;
                }
                while (true) {
                    iMin = java.lang.Math.min(iM, i2 + 4000);
                    java.lang.String strSubstring = message.substring(i2, iMin);
                    defpackage.aooh.e(strSubstring, "substring(...)");
                    android.util.Log.println(i, strAa, strSubstring);
                    if (iMin >= iM) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
