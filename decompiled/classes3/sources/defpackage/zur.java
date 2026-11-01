package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zur {
    public static final aimz a = aimz.i("com/google/android/dialershared/wearabledatalayer/messageclient/sender/impl/DialerMessageSenderImpl");
    public final java.lang.String b = "dialer_wear";
    public final ajct c;
    public final defpackage.aawd d;
    private final defpackage.aavx e;

    public zur(java.lang.String str, defpackage.aavx aavxVar, defpackage.aawd aawdVar, ajct ajctVar) {
        this.e = aavxVar;
        this.d = aawdVar;
        this.c = ajctVar;
    }

    private final ajcq c() {
        defpackage.aavx aavxVar = this.e;
        java.lang.Object obj = aavxVar.a;
        aade aadeVar = ((aada) aavxVar).i;
        defpackage.aawo aawoVar = new defpackage.aawo((aaoo) obj, aadeVar, this.b);
        aadeVar.b(aawoVar);
        ahrv ahrvVarG = ahrv.g(aazc.e(aahm.a(aawoVar, new defpackage.aawq(1))));
        defpackage.zqi zqiVar = new defpackage.zqi(this, 3);
        ajct ajctVar = this.c;
        return ahrvVarG.h(zqiVar, ajctVar).e(java.lang.Throwable.class, new defpackage.zqi(this, 4), ajctVar);
    }

    public final ajcq a(defpackage.ztu ztuVar, albh albhVar) {
        a.b().l("com/google/android/dialershared/wearabledatalayer/messageclient/sender/impl/DialerMessageSenderImpl", "lookupCapableNodeThenSendMessage", 99, "DialerMessageSenderImpl.java").t();
        ahrv ahrvVarG = ahrv.g(c());
        defpackage.zum zumVar = new defpackage.zum(this, albhVar, ztuVar.d, 0);
        ajct ajctVar = this.c;
        return ahrvVarG.i(zumVar, ajctVar).h(new defpackage.ymu(4), ajctVar);
    }

    public final ajcq b(defpackage.ztw ztwVar, albh albhVar) {
        a.b().l("com/google/android/dialershared/wearabledatalayer/messageclient/sender/impl/DialerMessageSenderImpl", "lookupCapableNodeThenRequestMessage", 124, "DialerMessageSenderImpl.java").t();
        ahrv ahrvVarG = ahrv.g(c());
        defpackage.zum zumVar = new defpackage.zum(this, ztwVar.g, albhVar, 2, (byte[]) null);
        ajct ajctVar = this.c;
        return ahrv.g(ahrvVarG.i(zumVar, ajctVar)).h(new defpackage.zqi(ztwVar, 5), ajctVar);
    }
}
