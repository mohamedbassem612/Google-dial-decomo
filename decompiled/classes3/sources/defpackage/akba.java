package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class akba extends defpackage.anqa {
    final /* synthetic */ defpackage.akbb a;
    private anph b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akba(defpackage.akbb akbbVar, anty antyVar) {
        super(antyVar);
        j$.util.Objects.requireNonNull(akbbVar);
        this.a = akbbVar;
    }

    @Override // defpackage.anqa
    public final void a(anqw anqwVar, anph anphVar) {
        if (anphVar.b(defpackage.akaa.b) == null) {
            anph anphVar2 = this.b;
            if (anphVar2 != null) {
                this.f.c(anphVar2);
                this.b = null;
            }
            this.f.a(anqwVar, anphVar);
            return;
        }
        defpackage.akbb akbbVar = this.a;
        synchronized (akbbVar.a) {
            akbbVar.g = defpackage.agwm.w(akbbVar.f, akbbVar.c, akbbVar.d, akbbVar.e.e(defpackage.akaa.a, java.lang.Boolean.TRUE));
            java.util.Iterator it = akbbVar.b.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
        }
    }

    @Override // defpackage.anqa
    public final void c(anph anphVar) {
        this.b = anphVar;
    }

    @Override // defpackage.anqa
    public final void d(java.lang.Object obj) {
        anph anphVar = this.b;
        if (anphVar != null) {
            this.f.c(anphVar);
            this.b = null;
        }
        this.f.d(obj);
    }
}
