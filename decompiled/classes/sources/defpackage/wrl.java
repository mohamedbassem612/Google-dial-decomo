package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wrl implements defpackage.ahek {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/xatu/impl/storage/postcall/XatuMetricsListener");
    private final defpackage.zjx b;
    private final defpackage.ajct c;

    public wrl(defpackage.zjx zjxVar, defpackage.ajct ajctVar) {
        this.b = zjxVar;
        this.c = ajctVar;
    }

    @Override // defpackage.ahek
    public final defpackage.ajcq a() {
        defpackage.aimz aimzVar = defpackage.wrp.a;
        defpackage.aguv aguvVarA = defpackage.aguz.a(defpackage.wrp.class);
        aguvVarA.f(new defpackage.aguy("com.android.dialer.xatu.impl.storage.postcall.XatuMetricsWorker", 1));
        aguvVarA.d(new defpackage.aguw(defpackage.wrp.c, defpackage.ahwt.a));
        aguvVarA.c(defpackage.wrp.b);
        defpackage.ajcq ajcqVarB = this.b.b(aguvVarA.a());
        defpackage.ahvr.J(ajcqVarB, new defpackage.lcn(this, 5), this.c);
        return ajcqVarB;
    }
}
