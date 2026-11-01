package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hbr extends defpackage.hgp {
    final /* synthetic */ defpackage.hgo a;
    final /* synthetic */ defpackage.hgp b;
    final /* synthetic */ defpackage.hcu c;

    public hbr(defpackage.hbs hbsVar, defpackage.hgo hgoVar, defpackage.hgp hgpVar, defpackage.hcu hcuVar) {
        this.a = hgoVar;
        this.b = hgpVar;
        this.c = hcuVar;
        j$.util.Objects.requireNonNull(hbsVar);
    }

    @Override // defpackage.hgp
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.hgo hgoVar) {
        float f = hgoVar.a;
        float f2 = hgoVar.b;
        java.lang.String str = ((defpackage.hcu) hgoVar.c).a;
        java.lang.String str2 = ((defpackage.hcu) hgoVar.d).a;
        defpackage.hgo hgoVar2 = this.a;
        hgoVar2.a(f, f2, str, str2, hgoVar.e, hgoVar.f, hgoVar.g);
        java.lang.String str3 = (java.lang.String) this.b.a(hgoVar2);
        defpackage.hcu hcuVar = (defpackage.hcu) (hgoVar.f == 1.0f ? hgoVar.d : hgoVar.c);
        defpackage.hcu hcuVar2 = this.c;
        hcuVar2.a(str3, hcuVar.b, hcuVar.c, hcuVar.m, hcuVar.d, hcuVar.e, hcuVar.f, hcuVar.g, hcuVar.h, hcuVar.i, hcuVar.j, hcuVar.k, hcuVar.l);
        return hcuVar2;
    }
}
