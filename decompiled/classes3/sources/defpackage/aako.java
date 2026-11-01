package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aako implements aafm {
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        android.os.IBinder iBinderB = ((aafh) obj).b();
        aais.as(iBinderB);
        android.os.IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.apps.tachyon.contacts.reachability.IReachabilityService");
        ((zzx) obj2).i(iInterfaceQueryLocalInterface instanceof defpackage.yrr ? (defpackage.yrr) iInterfaceQueryLocalInterface : new defpackage.yrr(iBinderB));
    }
}
