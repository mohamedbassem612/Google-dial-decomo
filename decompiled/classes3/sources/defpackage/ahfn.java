package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahfn extends eoa {
    public final enr a;
    public final com.google.apps.tiktok.account.AccountId b;
    public final amwx c;
    public final amyl d;
    public final java.lang.Object e = new java.lang.Object();
    public volatile java.lang.Object f;
    public final apjb g;

    public ahfn(enr enrVar, apjb apjbVar, com.google.apps.tiktok.account.AccountId accountId, amwx amwxVar, amyl amylVar) {
        this.a = enrVar;
        this.g = apjbVar;
        this.b = accountId;
        this.c = amwxVar;
        this.d = amylVar;
    }

    public final void d() {
        amxh amxhVarC;
        synchronized (this.e) {
            amxhVarC = this.f != null ? ((defpackage.ahfm) aooc.ar(this.f, defpackage.ahfm.class)).c() : null;
        }
        if (amxhVarC != null) {
            amxhVarC.b();
        }
    }
}
