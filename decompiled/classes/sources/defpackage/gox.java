package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gox implements defpackage.gov {
    public java.util.List a = defpackage.aokc.a;
    final /* synthetic */ defpackage.goy b;

    public gox(defpackage.goy goyVar) {
        this.b = goyVar;
    }

    @Override // defpackage.gov
    public final void a(java.util.List list) {
        this.a = list;
        java.util.Iterator it = this.b.d.iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            ((defpackage.ajxw) it.next()).f(list);
        }
    }

    @Override // defpackage.gov
    public final void b() {
    }
}
