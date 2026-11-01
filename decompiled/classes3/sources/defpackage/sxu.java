package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class sxu implements agye {
    final /* synthetic */ defpackage.sxv a;

    public sxu(defpackage.sxv sxvVar) {
        j$.util.Objects.requireNonNull(sxvVar);
        this.a = sxvVar;
    }

    public final void a(java.lang.Throwable th) {
        a.bq(defpackage.sxv.a.c(), "failed retrieving whether audio has been downloaded", "com/android/dialer/revelio/impl/tidepods/impl/demo/TidepodsRevelioDemoFragmentPeer$2", "onError", 'b', "TidepodsRevelioDemoFragmentPeer.java", th, zct.b);
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        defpackage.sxv sxvVar = this.a;
        android.widget.Button button = (android.widget.Button) ((aw) sxvVar.d).Q.findViewById(2131428792);
        if (!zBooleanValue) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
            button.setOnClickListener(new defpackage.szl(sxvVar, 1, (byte[]) null));
        }
    }

    public final /* synthetic */ void c() {
    }
}
