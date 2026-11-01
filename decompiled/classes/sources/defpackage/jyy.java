package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jyy {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/calllog/coalescer/CoalescedRowsDao");
    public static final defpackage.agxj b = new defpackage.agxj("COALESCED_ROWS_DAO_CONVERSATION_HISTORY_DATA_SOURCE_LOCAL_KEY");
    public final defpackage.ajct c;
    public final defpackage.ruc d;
    public final java.util.concurrent.atomic.AtomicReference e = new java.util.concurrent.atomic.AtomicReference();
    public final defpackage.afhf f;
    public final defpackage.aogc g;

    public jyy(defpackage.afhf afhfVar, defpackage.ajct ajctVar, defpackage.ruc rucVar, defpackage.aogc aogcVar) {
        this.f = afhfVar;
        this.c = ajctVar;
        this.d = rucVar;
        this.g = aogcVar;
    }

    public final defpackage.ajcq a(java.lang.Runnable runnable) {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/calllog/coalescer/CoalescedRowsDao", "loadForAllCallsInConversationHistory", 148, "CoalescedRowsDao.java")).v("loadForAllCallsInConversationHistory");
        j$.util.Optional optional = (j$.util.Optional) this.e.get();
        if (optional != null) {
            return new defpackage.ajcm(optional);
        }
        defpackage.ruc rucVar = this.d;
        defpackage.afhf afhfVar = this.f;
        j$.util.Optional optionalA = rucVar.a();
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(afhfVar.c());
        int i = 1;
        defpackage.kvf kvfVar = new defpackage.kvf(i);
        defpackage.ajct ajctVar = this.c;
        return ahrvVarG.h(kvfVar, ajctVar).h(new defpackage.jtv(this, optionalA, 3), ajctVar).e(java.lang.Throwable.class, new defpackage.rml(this, optionalA, runnable, i), ajctVar);
    }
}
