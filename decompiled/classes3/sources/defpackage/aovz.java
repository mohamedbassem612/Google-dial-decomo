package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aovz extends aoof implements aono {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aovz(java.lang.Object obj, int i, byte[] bArr) {
        super(3, obj, defpackage.wbt.class, "onError", "onError(Lcom/android/dialer/externals/androidapis/media/DialerMediaPlayer;II)Z", 0);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            aonj aonjVar = ((aowe) this.e).a;
            aooh.c(aonjVar);
            aoil.e(aonjVar, obj2, (aolr) obj3);
            return aojh.a;
        }
        if (i != 1) {
            java.lang.Object obj4 = ((aowm) obj2).b;
            aonj aonjVar2 = ((aowe) this.e).a;
            aooh.c(aonjVar2);
            java.lang.Object objA = aowm.a(obj4);
            aooh.c(objA);
            aoil.e(aonjVar2, objA, (aolr) obj3);
            return aojh.a;
        }
        oii oiiVar = (oii) obj;
        int iIntValue = ((java.lang.Number) obj2).intValue();
        int iIntValue2 = ((java.lang.Number) obj3).intValue();
        aooh.f(oiiVar, "p0");
        defpackage.wbt wbtVar = (defpackage.wbt) this.e;
        aimz aimzVar = defpackage.wbt.a;
        wbtVar.f(oiiVar, iIntValue, iIntValue2);
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aovz(java.lang.Object obj, int i) {
        super(3, obj, aowe.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aovz(java.lang.Object obj, int i, char[] cArr) {
        super(3, obj, aowe.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        this.$cid = i;
    }
}
