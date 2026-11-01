package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aamm extends defpackage.aamq {
    final /* synthetic */ com.google.android.gms.feedback.FeedbackOptions a;
    final /* synthetic */ android.os.Bundle h;
    final /* synthetic */ long i;
    final /* synthetic */ com.google.android.gms.googlehelp.GoogleHelp j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aamm(defpackage.aamr aamrVar, aade aadeVar, com.google.android.gms.feedback.FeedbackOptions feedbackOptions, android.os.Bundle bundle, long j, com.google.android.gms.googlehelp.GoogleHelp googleHelp) {
        super(aadeVar);
        this.a = feedbackOptions;
        this.h = bundle;
        this.i = j;
        this.j = googleHelp;
        j$.util.Objects.requireNonNull(aamrVar);
    }

    @Override // defpackage.aamp
    protected final void n(defpackage.aamv aamvVar) {
        try {
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable abstractSafeParcelable = this.a;
            android.os.Bundle bundle = this.h;
            long j = this.i;
            com.google.android.gms.common.internal.ReflectedParcelable reflectedParcelable = this.j;
            defpackage.aaml aamlVar = new defpackage.aaml(this);
            android.os.Parcel parcelEP = aamvVar.eP();
            yld.d(parcelEP, abstractSafeParcelable);
            yld.d(parcelEP, bundle);
            parcelEP.writeLong(j);
            yld.d(parcelEP, reflectedParcelable);
            yld.f(parcelEP, aamlVar);
            aamvVar.eS(10, parcelEP);
        } catch (java.lang.Exception e) {
            android.util.Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psbd failed!", e);
            j(defpackage.aamr.a);
        }
    }
}
