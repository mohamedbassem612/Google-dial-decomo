package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gkq extends defpackage.gla {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.util.ArrayList b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.util.ArrayList d;
    final /* synthetic */ defpackage.gks e;

    public gkq(defpackage.gks gksVar, java.lang.Object obj, java.util.ArrayList arrayList, java.lang.Object obj2, java.util.ArrayList arrayList2) {
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = gksVar;
    }

    @Override // defpackage.gla, defpackage.gkw
    public final void b(gkz gkzVar) {
        gkzVar.I(this);
    }

    @Override // defpackage.gla, defpackage.gkw
    public final void f() {
        java.lang.Object obj = this.a;
        if (obj != null) {
            this.e.f(obj, this.b, (java.util.ArrayList) null);
        }
        java.lang.Object obj2 = this.c;
        if (obj2 != null) {
            this.e.f(obj2, this.d, (java.util.ArrayList) null);
        }
    }
}
