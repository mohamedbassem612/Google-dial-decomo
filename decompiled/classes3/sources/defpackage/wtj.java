package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wtj extends na {
    final /* synthetic */ defpackage.wtk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtj(defpackage.wtk wtkVar) {
        super(true);
        j$.util.Objects.requireNonNull(wtkVar);
        this.a = wtkVar;
    }

    public final void b() {
        ainm ainmVarB = defpackage.wtk.a.b();
        defpackage.wtk wtkVar = this.a;
        a.bt(ainmVarB, "onBackPressed: isDialpadShown: %s", java.lang.Boolean.valueOf(wtkVar.x), "com/android/dialer/xatu/impl/ui/XatuInCallFragmentPeer$XatuInCallOnBackPressedCallback", "handleOnBackPressed", (char) 1650, "XatuInCallFragmentPeer.java", zct.a);
        if (wtkVar.x) {
            wtkVar.g();
        } else {
            wtkVar.u(30);
            wtkVar.e(defpackage.wre.USER_ENDED);
        }
    }
}
