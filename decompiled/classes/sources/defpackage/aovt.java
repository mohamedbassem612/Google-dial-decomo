package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aovt extends defpackage.aovu implements defpackage.aota {
    public final android.os.Handler a;
    public final defpackage.aovt b;
    private final java.lang.String c;
    private final boolean d;

    public aovt(android.os.Handler handler, java.lang.String str, boolean z) {
        this.a = handler;
        this.c = str;
        this.d = z;
        this.b = z ? this : new defpackage.aovt(handler, str, true);
    }

    private final void k(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        defpackage.aooc.W(aolrVar, new java.util.concurrent.CancellationException(defpackage.a.bg(this, "The task was rejected, the handler underlying the dispatcher '", "' was closed")));
        defpackage.aosp aospVar = defpackage.aoth.a;
        defpackage.apcz.a.a(aolrVar, runnable);
    }

    @Override // defpackage.aosp
    public final void a(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        k(aolrVar, runnable);
    }

    @Override // defpackage.aovu, defpackage.aota
    public final defpackage.aotj c(long j, java.lang.Runnable runnable, defpackage.aolr aolrVar) {
        if (this.a.postDelayed(runnable, defpackage.aooc.E(j))) {
            return new aovs(this, runnable);
        }
        k(aolrVar, runnable);
        return defpackage.aous.a;
    }

    @Override // defpackage.aota
    public final void d(long j, defpackage.aosb aosbVar) {
        defpackage.anxz anxzVar = new defpackage.anxz(aosbVar, this, 11);
        if (this.a.postDelayed(anxzVar, defpackage.aooc.E(j))) {
            aosbVar.d(new agvo(this, anxzVar, 9, (byte[]) null));
        } else {
            k(((defpackage.aosc) aosbVar).b, anxzVar);
        }
    }

    @Override // defpackage.aosp
    public final boolean dB(defpackage.aolr aolrVar) {
        if (this.d) {
            if (defpackage.aooh.n(android.os.Looper.myLooper(), this.a.getLooper())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.aovt) {
            defpackage.aovt aovtVar = (defpackage.aovt) obj;
            if (aovtVar.a == this.a && aovtVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.System.identityHashCode(this.a) ^ (true != this.d ? 1237 : 1231);
    }

    @Override // defpackage.aovu, defpackage.aoup
    public final /* synthetic */ defpackage.aoup j() {
        return this.b;
    }

    @Override // defpackage.aoup, defpackage.aosp
    public final java.lang.String toString() {
        java.lang.String strH = h();
        if (strH != null) {
            return strH;
        }
        java.lang.String string = this.c;
        if (string == null) {
            string = this.a.toString();
        }
        return this.d ? java.lang.String.valueOf(string).concat(".immediate") : string;
    }
}
