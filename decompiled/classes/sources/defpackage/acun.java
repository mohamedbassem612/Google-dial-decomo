package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acun {
    private static final java.util.TimeZone a;
    private volatile long b;

    static {
        int i = defpackage.airu.a;
        a = j$.util.DesugarTimeZone.getTimeZone("America/Los_Angeles");
    }

    public acun() {
        new java.util.HashSet();
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(a);
        gregorianCalendar.setTimeInMillis(j$.time.Instant.now().toEpochMilli());
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        this.b = gregorianCalendar.getTimeInMillis();
    }
}
