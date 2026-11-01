package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abzi extends anne {
    final /* synthetic */ abzj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abzi(abzj abzjVar, ajsz ajszVar) {
        super(ajszVar);
        j$.util.Objects.requireNonNull(abzjVar);
        this.a = abzjVar;
    }

    public final void a(anty antyVar, anph anphVar) {
        java.lang.String strA = this.a.a();
        if (android.text.TextUtils.isEmpty(strA)) {
            ahzn.c(new defpackage.abzh());
        } else {
            anphVar.h(abzj.a, strA);
        }
        super.a(antyVar, anphVar);
    }
}
