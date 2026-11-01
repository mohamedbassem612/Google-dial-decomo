package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final /* synthetic */ class kco extends aoof implements aonj {
    public static final defpackage.kco a = new defpackage.kco();

    public kco() {
        super(1, kcq.class, "getCallLogItemType", "getCallLogItemType(Lcom/android/dialer/calllog/compose/ui/CallLogScreenUiModel;)Ljava/lang/String;", 1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) throws aois {
        kct kctVar = (kct) obj;
        aooh.f(kctVar, "p0");
        int iH = defpackage.jlr.h(kctVar);
        if (iH == 0) {
            return "call_log_header";
        }
        if (iH == 1) {
            return "call_log_item";
        }
        throw new aois();
    }
}
