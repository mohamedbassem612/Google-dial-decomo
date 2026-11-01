package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zyl extends defpackage.zym {
    protected final /* bridge */ /* synthetic */ void b(aacr aacrVar) {
        defpackage.zyh zyhVar = (defpackage.zyh) aacrVar;
        defpackage.zyr zyrVar = (defpackage.zyr) zyhVar.v();
        defpackage.zyk zykVar = new defpackage.zyk(this);
        com.google.android.gms.common.internal.ReflectedParcelable reflectedParcelable = zyhVar.a;
        android.os.Parcel parcelEP = zyrVar.eP();
        yld.f(parcelEP, zykVar);
        yld.d(parcelEP, reflectedParcelable);
        zyrVar.eR(103, parcelEP);
    }

    protected final /* bridge */ /* synthetic */ aadl a(com.google.android.gms.common.api.Status status) {
        return status;
    }
}
