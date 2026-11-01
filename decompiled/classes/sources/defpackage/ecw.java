package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ecw {
    public defpackage.ecq a;
    private final defpackage.efe b;
    private final defpackage.aolr c;
    private java.util.List d;

    public ecw(defpackage.efe efeVar, defpackage.aolr aolrVar) {
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        this.b = efeVar;
        this.c = aolrVar;
        this.a = new defpackage.efj();
        this.d = defpackage.aokc.a;
    }

    public final defpackage.ecx a() {
        defpackage.ecq ecqVar = this.a;
        java.util.List list = this.d;
        if (list == null) {
            defpackage.aooh.i("migrations");
        }
        defpackage.efe efeVar = this.b;
        java.util.List listSingletonList = java.util.Collections.singletonList(new defpackage.efu(list, (defpackage.aoln) null, 1));
        defpackage.aooh.e(listSingletonList, "singletonList(...)");
        return new defpackage.eei(efeVar, listSingletonList, ecqVar, this.c);
    }

    public final void b(java.util.List list) {
        if (list == null) {
            defpackage.aooh.i("migrations");
        }
        this.d = defpackage.ajsz.bT(this.d, list);
    }
}
