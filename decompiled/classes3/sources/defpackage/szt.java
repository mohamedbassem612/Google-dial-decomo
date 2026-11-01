package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class szt {
    public static final aimz a = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioConversationListener");
    public final lgi b;
    public final defpackage.szs c;
    public final ajct d;
    public final java.util.concurrent.Executor e;
    public boolean f;

    public szt(lgi lgiVar, defpackage.szs szsVar, ajct ajctVar) {
        this.b = lgiVar;
        this.c = szsVar;
        this.d = ajctVar;
        this.e = new ajdc(ajctVar);
    }

    public final void a(lgp lgpVar) {
        if (lgpVar == null) {
            a.bI(a.d(), "conversation is null", "com/android/dialer/revelio/impl/tidepods/impl/service/RevelioConversationListener", "onConversationChanged", 'D', "RevelioConversationListener.java", zct.b);
        } else {
            agsm.i(856, ahvr.G(new qat(this, lgpVar, 12), this.e), "failed to process call screening conversation changes", new java.lang.Object[0]);
        }
    }
}
