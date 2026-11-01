package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adka implements adhy {
    final /* synthetic */ adai a;
    private final defpackage.adkb b;
    private final java.util.concurrent.atomic.AtomicBoolean c;

    public adka(adai adaiVar, defpackage.adkb adkbVar) {
        j$.util.Objects.requireNonNull(adaiVar);
        this.a = adaiVar;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.b = adkbVar;
        synchronized (adkbVar.b) {
            adkbVar.c++;
        }
    }

    public final java.io.File b() {
        return this.b.a;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.adka a() {
        if (this.c.get()) {
            throw new java.lang.IllegalStateException("Can't copy a closed reference.");
        }
        return new defpackage.adka(this.a, this.b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void close() {
        if (this.c.getAndSet(true)) {
            return;
        }
        adai adaiVar = this.a;
        ?? r2 = adaiVar.b;
        synchronized (r2) {
            defpackage.adkb adkbVar = this.b;
            synchronized (adkbVar.b) {
                try {
                    int i = adkbVar.c - 1;
                    adkbVar.c = i;
                    if (i < 0) {
                        adhn.a.d().l("com/google/android/libraries/micore/superpacks/gc/FileRefTable$FileRefImpl", "close", 110, "FileRefTable.java").y("File %s was closed more times than it was referenced!", adkbVar);
                    } else if (i == 0) {
                        r2.remove(adkbVar.a);
                        adaiVar.a(b(), 2);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final java.lang.String d() {
        java.lang.String str;
        defpackage.adkb adkbVar = this.b;
        synchronized (adkbVar.b) {
            str = adkbVar.a.getName() + '(' + adkbVar.c + (this.c.get() ? "x)" : ")");
        }
        return str;
    }

    public final void finalize() throws java.lang.Throwable {
        super.finalize();
        if (this.c.get()) {
            return;
        }
        adhn.a.d().l("com/google/android/libraries/micore/superpacks/gc/FileRefTable$FileRefImpl", "finalize", 126, "FileRefTable.java").y("File ref is being finalized but wasn't closed, file: %s", this.b);
    }

    public final java.lang.String toString() {
        return d();
    }
}
