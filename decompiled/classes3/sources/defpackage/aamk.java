package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aamk extends defpackage.aamq {
    final /* synthetic */ android.os.Bundle a;
    final /* synthetic */ long h;
    final /* synthetic */ com.google.android.gms.googlehelp.GoogleHelp i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aamk(defpackage.aamr aamrVar, aade aadeVar, android.os.Bundle bundle, long j, com.google.android.gms.googlehelp.GoogleHelp googleHelp) {
        super(aadeVar);
        this.a = bundle;
        this.h = j;
        this.i = googleHelp;
        j$.util.Objects.requireNonNull(aamrVar);
    }

    @Override // defpackage.aamp
    protected final void n(defpackage.aamv aamvVar) {
        try {
            android.os.Bundle bundle = this.a;
            long j = this.h;
            com.google.android.gms.common.internal.ReflectedParcelable reflectedParcelable = this.i;
            defpackage.aamj aamjVar = new defpackage.aamj(this);
            android.os.Parcel parcelEP = aamvVar.eP();
            yld.d(parcelEP, bundle);
            parcelEP.writeLong(j);
            yld.d(parcelEP, reflectedParcelable);
            yld.f(parcelEP, aamjVar);
            aamvVar.eS(9, parcelEP);
        } catch (java.lang.Exception e) {
            android.util.Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            j(defpackage.aamr.a);
        }
    }
}
