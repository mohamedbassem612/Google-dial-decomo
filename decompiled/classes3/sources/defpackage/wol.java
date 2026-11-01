package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wol extends aomh implements aonj {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wol(aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        if (this.$cid != 0) {
            return new defpackage.wol((aoln) obj, 1, null).b(aojh.a);
        }
        new defpackage.wol((aoln) obj, 0);
        return anar.o(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        if (this.$cid == 0) {
            return anar.o(obj);
        }
        aooc.af(obj);
        jfc.a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "onBeeslySessionStarting$<anonymous>", 527, "BeeslyLifecycleControllerV2.kt").v("Beesly session starting.");
        return aojh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wol(aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
    }
}
