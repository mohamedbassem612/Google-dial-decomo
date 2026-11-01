package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apdj {
    public final java.lang.Object a;
    public final defpackage.aono b;
    public final java.lang.Object c;
    public final defpackage.aono d;
    public java.lang.Object e;
    public int f = -1;
    final /* synthetic */ defpackage.apdm g;
    private final defpackage.aono h;
    private final java.lang.Object i;

    public apdj(defpackage.apdm apdmVar, java.lang.Object obj, defpackage.aono aonoVar, defpackage.aono aonoVar2, java.lang.Object obj2, java.lang.Object obj3, defpackage.aono aonoVar3) {
        this.g = apdmVar;
        this.a = obj;
        this.b = aonoVar;
        this.h = aonoVar2;
        this.c = obj2;
        this.i = obj3;
        this.d = aonoVar3;
    }

    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        java.lang.Object obj2 = this.c;
        java.lang.Object obj3 = this.i;
        return obj2 == defpackage.apdn.f ? ((defpackage.aonj) obj3).a(aolnVar) : ((defpackage.aonn) obj3).a(obj, aolnVar);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        return this.h.a(this.a, this.c, obj);
    }

    public final void c() {
        java.lang.Object obj = this.e;
        if (obj instanceof defpackage.apbi) {
            ((defpackage.apbi) obj).k(this.f, this.g.a);
            return;
        }
        defpackage.aotj aotjVar = obj instanceof defpackage.aotj ? (defpackage.aotj) obj : null;
        if (aotjVar != null) {
            aotjVar.fz();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [aono, java.lang.Object] */
    public final defpackage.aono d(defpackage.apdm apdmVar, java.lang.Object obj) {
        defpackage.aono aonoVar = this.d;
        if (aonoVar != null) {
            return aonoVar.a(apdmVar, this.c, obj);
        }
        return null;
    }
}
