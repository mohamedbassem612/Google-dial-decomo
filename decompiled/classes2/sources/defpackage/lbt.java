package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class lbt implements ahyc {
    public final /* synthetic */ lbu a;
    public final /* synthetic */ kfj b;
    public final /* synthetic */ long c;
    public final /* synthetic */ defpackage.lkq d;

    public /* synthetic */ lbt(lbu lbuVar, kfj kfjVar, long j, defpackage.lkq lkqVar) {
        this.a = lbuVar;
        this.b = kfjVar;
        this.c = j;
        this.d = lkqVar;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("call_screen_details", ((defpackage.kir) obj).i());
        this.b.d(this.c, contentValues);
        j$.util.concurrent.atomic.DesugarAtomicLong.getAndAccumulate(this.a.c, this.d.f, new defpackage.kvc(2));
        return null;
    }
}
