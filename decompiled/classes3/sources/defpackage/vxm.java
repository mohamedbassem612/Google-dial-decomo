package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
class vxm implements agtk {
    final /* synthetic */ defpackage.vxq a;

    public vxm(defpackage.vxq vxqVar) {
        j$.util.Objects.requireNonNull(vxqVar);
        this.a = vxqVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        long jLongValue = ((java.lang.Long) obj).longValue();
        defpackage.vxq vxqVar = this.a;
        if (!vxqVar.x(jLongValue)) {
            defpackage.vxq.a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer$7", "onFailure", 351, "VisualVoicemailFragmentPeer.java").v("expanded row has changed");
        } else {
            vxqVar.i(2132020944);
            a.bq(defpackage.vxq.a.d(), "failed to share voicemail", "com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer$7", "onFailure", (char) 355, "VisualVoicemailFragmentPeer.java", th, zct.b);
        }
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto parcelableProto = (com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto) obj2;
        long jLongValue = ((java.lang.Long) obj).longValue();
        defpackage.vxq vxqVar = this.a;
        if (!vxqVar.x(jLongValue)) {
            defpackage.vxq.a.b().l("com/android/dialer/voicemail/tab/impl/ui/VisualVoicemailFragmentPeer$7", "onSuccess", 337, "VisualVoicemailFragmentPeer.java").v("expanded row has changed");
            return;
        }
        vxqVar.j();
        defpackage.vtr vtrVarA = parcelableProto.a(defpackage.vtr.a, akzq.a());
        android.net.Uri uri = android.net.Uri.parse(vtrVarA.c);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setFlags(1);
        ojo ojoVar = vxqVar.o;
        aooh.f(uri, "uri");
        intent.setType(ojoVar.a.getContentResolver().getType(uri));
        if (!vtrVarA.d.isEmpty()) {
            intent.putExtra("android.intent.extra.TEXT", vtrVarA.d);
        }
        ahqx.l(vxqVar.g, android.content.Intent.createChooser(intent, vxqVar.b.getResources().getText(2132017695)));
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
