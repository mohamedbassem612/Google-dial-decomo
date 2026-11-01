package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bim implements defpackage.biv {
    final /* synthetic */ defpackage.bin a;
    private final long b;

    public bim(defpackage.bin binVar, long j) {
        this.a = binVar;
        this.b = j;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    @Override // defpackage.biv
    public final long a(cxi cxiVar) throws aoiq {
        cxi cxiVar2 = (cxi) this.a.b.a();
        if (cxiVar2 == null) {
            defpackage.avo.b("Tried to open context menu before the anchor was placed.");
            throw new aoiq();
        }
        if (cxiVar2.u()) {
            return cxiVar.n(cxiVar2.l(this.b));
        }
        return 0L;
    }

    @Override // defpackage.biv
    public final defpackage.bhe b() {
        return defpackage.zb.h(this.a);
    }

    @Override // defpackage.biv
    public final cpn c(cxi cxiVar) {
        return cdh.x(a(cxiVar), 0L);
    }
}
