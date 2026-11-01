package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anvl extends defpackage.anwe {
    final /* synthetic */ anqw a;
    final /* synthetic */ anph b;
    final /* synthetic */ defpackage.anvn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anvl(defpackage.anvn anvnVar, anqw anqwVar, anph anphVar) {
        super(anvnVar.b.e);
        this.a = anqwVar;
        this.b = anphVar;
        j$.util.Objects.requireNonNull(anvnVar);
        this.c = anvnVar;
    }

    @Override // defpackage.anwe
    public final void a() {
        int i = defpackage.aoik.a;
        defpackage.anvn anvnVar = this.c;
        anvnVar.b.f.c();
        anqw anqwVar = this.a;
        anph anphVar = this.b;
        anqw anqwVar2 = anvnVar.a;
        if (anqwVar2 != null) {
            anphVar = new anph();
            anqwVar = anqwVar2;
        }
        try {
            defpackage.anvo.d(anvnVar.c, anqwVar, anphVar);
        } finally {
            this.c.b.d.a(anqwVar.h());
        }
    }
}
