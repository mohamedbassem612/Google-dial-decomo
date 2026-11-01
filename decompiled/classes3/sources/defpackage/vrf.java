package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class vrf implements agtk {
    final /* synthetic */ defpackage.vrh a;

    public vrf(defpackage.vrh vrhVar) {
        j$.util.Objects.requireNonNull(vrhVar);
        this.a = vrhVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        defpackage.vrh vrhVar = this.a;
        vrhVar.b();
        a.bq(defpackage.vrh.a.c(), "failed to change PIN", "com/android/dialer/voicemail/settings/pin/VoicemailChangePinFragmentPeer$4", "onFailure", (char) 234, "VoicemailChangePinFragmentPeer.java", th, zct.b);
        vrhVar.f(vrhVar.a(6));
        vrhVar.i(3);
    }

    public final /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.vrh vrhVar = this.a;
        java.lang.Integer num = (java.lang.Integer) obj2;
        vrhVar.b();
        aimz aimzVar = defpackage.vrh.a;
        aimzVar.b().l("com/android/dialer/voicemail/settings/pin/VoicemailChangePinFragmentPeer$4", "onSuccess", 203, "VoicemailChangePinFragmentPeer.java").y("Verify old PIN result: %s", num);
        if (num.intValue() == 0) {
            vrhVar.m.d.c(vrhVar.j);
            vrhVar.g.n(rmw.aU);
            android.content.Context context = vrhVar.b;
            defpackage.vra vraVar = vrhVar.c;
            android.widget.Toast.makeText(context, vraVar.Y(2132018004), 0).show();
            ahvr.i(new defpackage.vrg(), vraVar);
            return;
        }
        java.lang.String strA = vrhVar.a(num.intValue());
        a.bt(aimzVar.d(), "Change PIN failed: %s", num, "com/android/dialer/voicemail/settings/pin/VoicemailChangePinFragmentPeer$4", "onSuccess", (char) 219, "VoicemailChangePinFragmentPeer.java", zct.b);
        vrhVar.f(strA);
        if (num.intValue() == 4) {
            vrhVar.i(2);
        } else {
            vrhVar.i(3);
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
