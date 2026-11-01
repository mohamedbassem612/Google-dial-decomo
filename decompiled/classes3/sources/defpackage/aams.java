package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aams extends aada {
    static final defpackage.aame a = new defpackage.aamr();
    public final android.app.Activity l;

    public aams(android.content.Context context) {
        super(context, (android.app.Activity) null, defpackage.aamh.a, (aacu) null, aacz.a);
        this.l = null;
    }

    public final void a(android.content.Intent intent) {
        aais.as(this.l);
        aafq aafqVar = new aafq();
        aafqVar.a = new defpackage.zxc((java.lang.Object) this, (java.lang.Object) intent, 7);
        aafqVar.c = 34401;
        super.i(1, aafqVar.a());
    }

    public final void b(com.google.android.gms.googlehelp.InProductHelp inProductHelp) {
        aafq aafqVar = new aafq();
        aafqVar.a = new defpackage.zxc((java.lang.Object) this, (java.lang.Object) inProductHelp, 8);
        aafqVar.c = 34402;
        super.i(1, aafqVar.a());
    }

    public aams(android.app.Activity activity) {
        super(activity, activity, defpackage.aamh.a, (aacu) null, aacz.a);
        this.l = activity;
    }
}
