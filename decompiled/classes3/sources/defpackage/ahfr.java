package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahfr implements amyp {
    public final com.google.apps.tiktok.account.AccountId a;
    public final defpackage.ahfp b;
    private final ahyn c;
    private final java.lang.Object d = new java.lang.Object();
    private final ahgd e;
    private volatile hke f;

    public ahfr(com.google.apps.tiktok.account.AccountId accountId, ahyn ahynVar, ahgd ahgdVar, defpackage.ahfp ahfpVar) {
        this.a = accountId;
        this.c = ahynVar;
        this.e = ahgdVar;
        this.b = ahfpVar;
    }

    private final hke b() {
        ahyn ahynVar = this.c;
        boolean zF = ahynVar.f();
        defpackage.ahfp ahfpVar = this.b;
        if (zF) {
            hhx hhxVarA = ((defpackage.ahfq) aooc.ar(ahfpVar.b(this.a), defpackage.ahfq.class)).a();
            hhxVarA.a = (android.app.Activity) ahynVar.b();
            return hhxVarA.a();
        }
        hhx hhxVarA2 = ((defpackage.ahfq) aooc.ar(ahfpVar.b(this.a), defpackage.ahfq.class)).a();
        hhxVarA2.b = this.e;
        return hhxVarA2.a();
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hke B() {
        hke hkeVarB;
        if (this.f == null) {
            synchronized (this.d) {
                if (this.f == null) {
                    if (ahns.q()) {
                        ahoq ahoqVarW = ahvr.W(1381, "ActAcc#Comp");
                        try {
                            hkeVarB = b();
                            ahoqVarW.close();
                        } catch (java.lang.Throwable th) {
                            try {
                                ahoqVarW.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } else {
                        hkeVarB = b();
                    }
                    this.f = hkeVarB;
                }
            }
        }
        return this.f;
    }
}
