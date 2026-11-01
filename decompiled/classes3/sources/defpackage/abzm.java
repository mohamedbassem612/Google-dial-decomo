package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abzm extends defpackage.anqa {
    final /* synthetic */ defpackage.abzp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abzm(defpackage.abzn abznVar, anty antyVar, defpackage.abzp abzpVar) {
        super(antyVar);
        this.a = abzpVar;
        j$.util.Objects.requireNonNull(abznVar);
    }

    @Override // defpackage.anqa
    public final void a(anqw anqwVar, anph anphVar) {
        defpackage.abzp abzpVar = this.a;
        synchronized (abzpVar.a) {
            if (!abzpVar.c) {
                abzpVar.c = true;
                defpackage.abzo abzoVar = abzpVar.b;
                if (abzoVar == null) {
                    defpackage.aeto aetoVar = abzpVar.d;
                    aetoVar.p = anqwVar.o.r;
                    aenl.a().e(aetoVar);
                } else {
                    synchronized (abzoVar.a) {
                        try {
                            defpackage.aeto aetoVar2 = abzoVar.b;
                            int i = abzoVar.d;
                            int i2 = abzoVar.e;
                            aetoVar2.c = android.os.SystemClock.elapsedRealtime() - aetoVar2.a;
                            aetoVar2.d = i;
                            aetoVar2.e = i2;
                            aetoVar2.p = anqwVar.o.r;
                            aenl.a().e(aetoVar2);
                            abzoVar.c = true;
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
        super.a(anqwVar, anphVar);
    }
}
