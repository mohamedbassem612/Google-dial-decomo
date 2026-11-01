package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jxv implements emj {
    final /* synthetic */ defpackage.jxw a;

    public jxv(defpackage.jxw jxwVar) {
        this.a = jxwVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aaos */
    public final void b(emx emxVar) throws aaos {
        aaky aakyVar = this.a.d.a;
        aaog aaogVar = aakyVar.c;
        if (aaogVar == null) {
            aakyVar.a(1);
            return;
        }
        try {
            aaom aaomVar = aaogVar.c;
            aaomVar.eR(5, aaomVar.eP());
        } catch (android.os.RemoteException e) {
            throw new aaos(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aaos */
    public final void c(emx emxVar) throws aaos {
        aaky aakyVar = this.a.d.a;
        aaog aaogVar = aakyVar.c;
        if (aaogVar == null) {
            aakyVar.a(5);
            return;
        }
        try {
            aaom aaomVar = aaogVar.c;
            aaomVar.eR(4, aaomVar.eP());
        } catch (android.os.RemoteException e) {
            throw new aaos(e);
        }
    }

    public final void e(emx emxVar) {
        aaky aakyVar = this.a.d.a;
        aakyVar.b((android.os.Bundle) null, new defpackage.aakw(aakyVar, 1, null));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aaos */
    public final void f(emx emxVar) throws aaos {
        aaky aakyVar = this.a.d.a;
        aaog aaogVar = aakyVar.c;
        if (aaogVar == null) {
            aakyVar.a(4);
            return;
        }
        try {
            aaom aaomVar = aaogVar.c;
            aaomVar.eR(13, aaomVar.eP());
        } catch (android.os.RemoteException e) {
            throw new aaos(e);
        }
    }

    public final void fn(emx emxVar) {
        aaky aakyVar = this.a.d.a;
        aakyVar.b((android.os.Bundle) null, new defpackage.aakw(aakyVar, 0));
    }

    public final /* synthetic */ void a(emx emxVar) {
    }
}
