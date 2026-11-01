package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apih {
    public static final defpackage.apih a = new defpackage.apih(defpackage.ajsz.cf(new java.util.ArrayList()), null);
    public final defpackage.apod b;
    private final java.util.Set c;

    public apih(java.util.Set set, defpackage.apod apodVar) {
        if (set == null) {
            defpackage.aooh.i("pins");
        }
        this.c = set;
        this.b = apodVar;
    }

    public final defpackage.apih a(defpackage.apod apodVar) {
        if (apodVar == null) {
            defpackage.aooh.i("certificateChainCleaner");
        }
        return !defpackage.aooh.n(this.b, apodVar) ? new defpackage.apih(this.c, apodVar) : this;
    }

    public final void b() {
        java.util.Iterator it = this.c.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.apih) {
            defpackage.apih apihVar = (defpackage.apih) obj;
            if (defpackage.aooh.n(apihVar.c, this.c) && defpackage.aooh.n(apihVar.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() + 1517;
        defpackage.apod apodVar = this.b;
        return (iHashCode * 41) + (apodVar != null ? apodVar.hashCode() : 0);
    }
}
