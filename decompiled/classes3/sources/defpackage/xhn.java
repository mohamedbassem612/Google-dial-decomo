package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xhn implements defpackage.xpa {
    public static final defpackage.xer a = new defpackage.xer(5);
    private j$.time.Instant b;
    private android.os.PersistableBundle c;

    /* JADX WARN: Illegal instructions before constructor call */
    public xhn() {
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "now(...)");
        this(instantNow, new android.os.PersistableBundle());
    }

    private final android.os.PersistableBundle c(android.os.PersistableBundle persistableBundle) {
        android.os.PersistableBundle persistableBundle2 = new android.os.PersistableBundle();
        persistableBundle2.putAll(persistableBundle);
        for (java.lang.String str : persistableBundle.keySet()) {
            java.lang.Object obj = persistableBundle.get(str);
            if (obj instanceof android.os.PersistableBundle) {
                persistableBundle2.putPersistableBundle(str, c((android.os.PersistableBundle) obj));
            }
        }
        return persistableBundle2;
    }

    public final void a() {
        synchronized (this.c) {
            j$.time.Instant instantNow = j$.time.Instant.now();
            aooh.e(instantNow, "now(...)");
            this.b = instantNow;
            this.c.clear();
        }
    }

    public final boolean b() {
        return this.c.isEmpty();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xhn) {
            defpackage.xhn xhnVar = (defpackage.xhn) obj;
            if (this.b.getEpochSecond() == xhnVar.b.getEpochSecond() && defpackage.xff.l(this.c, xhnVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.b.getEpochSecond()) * 31) + defpackage.xff.m(this.c);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        persistableBundle.putLong("lastUpdate", this.b.getEpochSecond());
        persistableBundle.putPersistableBundle("bundle", this.c);
        return persistableBundle;
    }

    public final java.lang.String toString() {
        return "OnboardingMetadataStore{lastUpdate=" + this.b + ", metadata=" + defpackage.xff.n(this.c) + '}';
    }

    public xhn(j$.time.Instant instant, android.os.PersistableBundle persistableBundle) {
        this.b = instant;
        this.c = c(persistableBundle);
    }
}
