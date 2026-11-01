package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final /* synthetic */ class aouj extends aoof implements aono {
    public static final defpackage.aouj a = new defpackage.aouj();

    public aouj() {
        super(3, aoul.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object objE;
        aoul aoulVar = (aoul) obj;
        apdm apdmVar = (apdm) obj2;
        do {
            objE = aoulVar.E();
            if (!(objE instanceof aotx)) {
                if (!(objE instanceof aosk)) {
                    objE = aoum.b(objE);
                }
                apdmVar.e = objE;
            }
            return aojh.a;
        } while (aoulVar.fH(objE) < 0);
        apdmVar.c = aooc.U(aoulVar, true, new defpackage.aoui(aoulVar, apdmVar));
        return aojh.a;
    }
}
