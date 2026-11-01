package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qan extends na {
    final /* synthetic */ defpackage.qar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qan(defpackage.qar qarVar) {
        super(false);
        j$.util.Objects.requireNonNull(qarVar);
        this.a = qarVar;
    }

    public final void b() {
        defpackage.qar.a.b().l("com/android/dialer/incall/incallscreen/ui/ScreenHostFragmentPeer$1", "handleOnBackPressed", 103, "ScreenHostFragmentPeer.java").y("Prevent back navigation for screen: %s", this.a.j);
    }
}
