package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfx implements agtk {
    final /* synthetic */ defpackage.sfz a;

    public sfx(defpackage.sfz sfzVar) {
        this.a = sfzVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        defpackage.sfz.a.c().k(th).l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer$launchOnboardingFlowCallback$<anonymous>", "onFailure", 201, "CallingCardSettingsFragmentPeer.kt").v("Patrick settings contact failed to load.");
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto parcelableProto = (com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto) obj2;
        aooh.f(parcelableProto, "onboardingFlowArgumentParcel");
        this.a.o.b(parcelableProto.a(defpackage.abxl.C(defpackage.abxn.a.m()).M(), akzq.a()));
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
