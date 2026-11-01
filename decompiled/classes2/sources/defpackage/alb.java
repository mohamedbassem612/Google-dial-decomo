package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class alb implements cer {
    public final defpackage.ale a;
    public aonj b;
    public aonj c;
    final /* synthetic */ defpackage.ett d;

    public alb(defpackage.ett ettVar, defpackage.ale aleVar, aonj aonjVar, aonj aonjVar2) {
        this.d = ettVar;
        this.a = aleVar;
        this.b = aonjVar;
        this.c = aonjVar2;
    }

    public final java.lang.Object a() {
        b(((alg) this.d.b).e(), null, null);
        return this.a.a();
    }

    public final void b(alc alcVar, java.lang.Object obj, aiw aiwVar) {
        java.lang.Object objA = this.c.a(alcVar.c());
        if (!((alg) this.d.b).C()) {
            this.a.m(objA, (ajl) this.b.a(alcVar), obj, aiwVar);
        } else {
            this.a.l(this.c.a(alcVar.b()), objA, (ajl) this.b.a(alcVar));
        }
    }
}
