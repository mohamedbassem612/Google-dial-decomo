package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aekm {
    public final aeiv a;
    public final defpackage.aele b;
    public final defpackage.aelt c;
    public final defpackage.aejo d;
    public final defpackage.aljb e;
    public final defpackage.wsk f;
    private final java.util.concurrent.ExecutorService g;
    private final defpackage.acov h;
    private final ahyn i;

    public aekm(defpackage.aljb aljbVar, aeiv aeivVar, java.util.concurrent.ExecutorService executorService, defpackage.wsk wskVar, defpackage.aele aeleVar, defpackage.acov acovVar, defpackage.aelt aeltVar, defpackage.aejo aejoVar, ahyn ahynVar) {
        this.e = aljbVar;
        this.a = aeivVar;
        this.g = executorService;
        this.f = wskVar;
        this.b = aeleVar;
        this.h = acovVar;
        this.c = aeltVar;
        this.d = aejoVar;
        this.i = ahynVar;
    }

    public static defpackage.aekl a(android.content.Context context) {
        defpackage.aekl aeklVar = new defpackage.aekl();
        aeklVar.b = new defpackage.aekk();
        aeklVar.a = context.getApplicationContext();
        return aeklVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aekm) {
            defpackage.aekm aekmVar = (defpackage.aekm) obj;
            if (this.e.equals(aekmVar.e) && this.a.equals(aekmVar.a) && this.g.equals(aekmVar.g) && this.f.equals(aekmVar.f) && this.b.equals(aekmVar.b) && this.h.equals(aekmVar.h) && this.c.equals(aekmVar.c) && this.d.equals(aekmVar.d) && this.i.equals(aekmVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.e.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332;
    }

    public final java.lang.String toString() {
        ahyn ahynVar = this.i;
        defpackage.aejo aejoVar = this.d;
        defpackage.aelt aeltVar = this.c;
        defpackage.acov acovVar = this.h;
        defpackage.aele aeleVar = this.b;
        defpackage.wsk wskVar = this.f;
        java.util.concurrent.ExecutorService executorService = this.g;
        aeiv aeivVar = this.a;
        return "ExpressSignInManager{limitedAvailableAccountsModel=" + java.lang.String.valueOf(this.e) + ", internalAccountsModel=" + java.lang.String.valueOf(aeivVar) + ", backgroundExecutor=" + java.lang.String.valueOf(executorService) + ", avatarImageLoader=" + java.lang.String.valueOf(wskVar) + ", oneGoogleEventLogger=" + java.lang.String.valueOf(aeleVar) + ", vePrimitives=" + java.lang.String.valueOf(acovVar) + ", visualElements=" + java.lang.String.valueOf(aeltVar) + ", accountLayer=" + java.lang.String.valueOf(aejoVar) + ", appIdentifier=" + java.lang.String.valueOf(ahynVar) + '}';
    }

    public aekm() {
        throw null;
    }
}
