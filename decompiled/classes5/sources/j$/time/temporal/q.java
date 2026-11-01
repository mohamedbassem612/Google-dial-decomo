package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class q implements java.io.Serializable {
    public static final j$.util.concurrent.ConcurrentHashMap g = new j$.util.concurrent.ConcurrentHashMap(4, 0.75f, 2);
    public static final j$.time.temporal.g h;
    private static final long serialVersionUID = -1177360819670808121L;
    public final j$.time.DayOfWeek a;
    public final int b;
    public final transient j$.time.temporal.p c;
    public final transient j$.time.temporal.p d;
    public final transient j$.time.temporal.p e;
    public final transient j$.time.temporal.p f;

    static {
        new j$.time.temporal.q(j$.time.DayOfWeek.MONDAY, 4);
        a(j$.time.DayOfWeek.SUNDAY, 1);
        h = j$.time.temporal.h.d;
    }

    public q(j$.time.DayOfWeek dayOfWeek, int i) {
        j$.time.temporal.ChronoUnit chronoUnit = j$.time.temporal.ChronoUnit.DAYS;
        j$.time.temporal.ChronoUnit chronoUnit2 = j$.time.temporal.ChronoUnit.WEEKS;
        this.c = new j$.time.temporal.p("DayOfWeek", this, chronoUnit, chronoUnit2, j$.time.temporal.p.f);
        this.d = new j$.time.temporal.p("WeekOfMonth", this, chronoUnit2, j$.time.temporal.ChronoUnit.MONTHS, j$.time.temporal.p.g);
        j$.time.temporal.g gVar = j$.time.temporal.h.d;
        this.e = new j$.time.temporal.p("WeekOfWeekBasedYear", this, chronoUnit2, gVar, j$.time.temporal.p.i);
        this.f = new j$.time.temporal.p("WeekBasedYear", this, gVar, j$.time.temporal.ChronoUnit.FOREVER, j$.time.temporal.a.YEAR.b);
        j$.util.Objects.requireNonNull(dayOfWeek, "firstDayOfWeek");
        if (i < 1 || i > 7) {
            j$.time.g.b("Minimal number of days is invalid");
            throw null;
        }
        this.a = dayOfWeek;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static j$.time.temporal.q a(j$.time.DayOfWeek dayOfWeek, int i) {
        java.lang.String str = dayOfWeek.toString() + i;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = g;
        j$.time.temporal.q qVar = (j$.time.temporal.q) concurrentHashMap.get(str);
        if (qVar != null) {
            return qVar;
        }
        concurrentHashMap.putIfAbsent(str, new j$.time.temporal.q(dayOfWeek, i));
        return (j$.time.temporal.q) concurrentHashMap.get(str);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        if (this.a == null) {
            throw new java.io.InvalidObjectException("firstDayOfWeek is null");
        }
        int i = this.b;
        if (i < 1 || i > 7) {
            throw new java.io.InvalidObjectException("Minimal number of days is invalid");
        }
    }

    private java.lang.Object readResolve() throws java.io.InvalidObjectException {
        try {
            return a(this.a, this.b);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.io.InvalidObjectException("Invalid serialized WeekFields: " + e.getMessage());
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof j$.time.temporal.q) && hashCode() == obj.hashCode();
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.ordinal() * 7) + this.b;
    }

    public final java.lang.String toString() {
        return "WeekFields[" + java.lang.String.valueOf(this.a) + "," + this.b + "]";
    }
}
