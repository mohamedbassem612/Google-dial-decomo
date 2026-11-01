package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aalt implements aafm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ com.google.android.gms.feedback.FeedbackOptions a;
    public final /* synthetic */ long b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ aalt(com.google.android.gms.feedback.FeedbackOptions feedbackOptions, long j, defpackage.uwk uwkVar, int i) {
        this.$cid = i;
        this.a = feedbackOptions;
        this.b = j;
        this.c = uwkVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.os.Parcelable, com.google.android.gms.feedback.FeedbackOptions] */
    public final void a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            defpackage.aalz aalzVar = (defpackage.aalz) obj;
            long j = this.b;
            ?? r0 = this.c;
            ?? r10 = this.a;
            try {
                aaoo.n((android.os.Bundle) r0);
                aaoo.o((com.google.android.gms.feedback.FeedbackOptions) r10);
                defpackage.aamb aambVar = (defpackage.aamb) aalzVar.v();
                android.os.Parcel parcelEP = aambVar.eP();
                yld.d(parcelEP, (android.os.Parcelable) r10);
                yld.d(parcelEP, (android.os.Parcelable) r0);
                parcelEP.writeLong(j);
                aambVar.eR(5, parcelEP);
                ((zzx) obj2).i((java.lang.Object) null);
                return;
            } catch (java.lang.Exception e) {
                android.util.Log.e("gF_FeedbackClient", "Requesting to save the async feedback psbd failed!", e);
                ((zzx) obj2).h(new android.os.RemoteException("Internall Error: Failed to start feedback"));
                return;
            }
        }
        defpackage.aalz aalzVar2 = (defpackage.aalz) obj;
        long j2 = this.b;
        com.google.android.gms.feedback.FeedbackOptions feedbackOptions = this.a;
        if (feedbackOptions != null) {
            try {
                aaoo aaooVar = feedbackOptions.u;
                if (aaooVar != null) {
                    android.content.Context context = ((aagf) aalzVar2).b;
                    aaoo.p(new defpackage.aama(context, aaooVar, j2, 1));
                    aaoo.p(new defpackage.aama(context, aaooVar, j2, 0));
                }
            } catch (android.os.RemoteException e2) {
                android.util.Log.e("gF_FeedbackClient", "Failed to start feedback", e2);
                ((zzx) obj2).h(new android.os.RemoteException("Internall Error: Failed to start feedback"));
                return;
            }
        }
        aaoo.o(feedbackOptions);
        com.google.android.gms.common.internal.ReflectedParcelable errorReport = new com.google.android.gms.feedback.ErrorReport(feedbackOptions, aalzVar2.a.getCacheDir());
        java.lang.Object obj3 = this.c;
        if (obj3 == null) {
            defpackage.aamb aambVar2 = (defpackage.aamb) aalzVar2.v();
            android.os.Parcel parcelEP2 = aambVar2.eP();
            yld.d(parcelEP2, errorReport);
            parcelEP2.writeLong(j2);
            aambVar2.eS(6, parcelEP2);
        } else {
            aafe aafeVarAz = aais.az(obj3, android.os.Looper.getMainLooper(), "feedback_callback");
            defpackage.aamb aambVar3 = (defpackage.aamb) aalzVar2.v();
            defpackage.ylo yloVar = new defpackage.ylo(aalzVar2, aafeVarAz, 9);
            android.os.Parcel parcelEP3 = aambVar3.eP();
            yld.d(parcelEP3, errorReport);
            parcelEP3.writeLong(j2);
            yld.f(parcelEP3, yloVar);
            aambVar3.eS(9, parcelEP3);
        }
        ((zzx) obj2).i((java.lang.Object) null);
    }

    public /* synthetic */ aalt(com.google.android.gms.feedback.FeedbackOptions feedbackOptions, android.os.Bundle bundle, long j, int i) {
        this.$cid = i;
        this.a = feedbackOptions;
        this.c = bundle;
        this.b = j;
    }
}
