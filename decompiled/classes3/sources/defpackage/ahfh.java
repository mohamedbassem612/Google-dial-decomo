package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahfh extends eoa {
    public volatile java.lang.Object a;
    public final amxw b;
    public final amyl c;
    public final java.lang.Object d = new java.lang.Object();
    public defpackage.ahga e;

    public ahfh(java.lang.Object obj, amxw amxwVar, amyl amylVar) {
        this.a = obj;
        this.b = amxwVar;
        this.c = amylVar;
    }

    protected final void d() {
        amxh amxhVarA;
        synchronized (this.d) {
            defpackage.ahga ahgaVar = this.e;
            amxhVarA = ahgaVar != null ? ((defpackage.ahfi) aooc.ar(ahgaVar, defpackage.ahfi.class)).a() : null;
        }
        if (amxhVarA != null) {
            amxhVarA.b();
        }
    }
}
