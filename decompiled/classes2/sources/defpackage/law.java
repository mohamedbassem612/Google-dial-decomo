package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class law extends aftt {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ defpackage.lay b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public law(defpackage.lay layVar, java.lang.String str) {
        super((byte[]) null);
        this.a = str;
        j$.util.Objects.requireNonNull(layVar);
        this.b = layVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, int i) {
        if (i == 1) {
            defpackage.lay layVar = this.b;
            java.lang.String str = this.a;
            defpackage.kwc kwcVar = layVar.d;
            ahrv ahrvVarG = ahrv.g(kwcVar.m.aU(str));
            defpackage.kvd kvdVar = new defpackage.kvd(kwcVar, 17);
            ajct ajctVar = kwcVar.e;
            ahrv ahrvVarI = ahrvVarG.i(kvdVar, ajctVar).i(new defpackage.kvd(kwcVar, 18), ajctVar);
            kwcVar.k.s(ahrvVarI, defpackage.kzj.a);
            layVar.g.i(zoe.N(ahrvVarI), layVar.n);
        }
    }
}
