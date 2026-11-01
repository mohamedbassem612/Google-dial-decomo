package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aasf extends defpackage.aaql {
    final /* synthetic */ java.lang.String a;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aasf(defpackage.aasg aasgVar, aade aadeVar, java.lang.String str, int i) {
        super(aadeVar);
        this.a = str;
        this.h = i;
        j$.util.Objects.requireNonNull(aasgVar);
    }

    public final /* synthetic */ aadl a(com.google.android.gms.common.api.Status status) {
        return new defpackage.aase(this, status);
    }

    protected final /* bridge */ /* synthetic */ void b(aacr aacrVar) {
        defpackage.aahc aahcVar;
        defpackage.aasa aasaVar = (defpackage.aasa) aacrVar;
        defpackage.aarx aarxVar = new defpackage.aarx(this);
        int i = this.h;
        java.lang.String str = this.a;
        defpackage.aahc aahcVar2 = null;
        try {
            defpackage.aaru aaruVarQ = aasaVar.Q();
            android.content.Context context = aasaVar.w;
            com.google.android.gms.common.api.ApiMetadata apiMetadataX = aazc.x();
            android.os.Parcel parcelEP = aaruVarQ.eP();
            yld.f(parcelEP, aarxVar);
            parcelEP.writeString(str);
            parcelEP.writeString(null);
            parcelEP.writeInt(i);
            parcelEP.writeInt(1);
            yld.d(parcelEP, apiMetadataX);
            android.os.Parcel parcelEQ = aaruVarQ.eQ(505, parcelEP);
            android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
            if (strongBinder == null) {
                aahcVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                aahcVar = iInterfaceQueryLocalInterface instanceof defpackage.aahc ? (defpackage.aahc) iInterfaceQueryLocalInterface : new defpackage.aahc(strongBinder);
            }
            parcelEQ.recycle();
            aahcVar2 = aahcVar;
        } catch (android.os.RemoteException unused) {
            aarxVar.c(8, null, null, null);
        }
        synchronized (((com.google.android.gms.common.api.internal.BasePendingResult) this).c) {
            ((com.google.android.gms.common.api.internal.BasePendingResult) this).g = aahcVar2;
        }
    }
}
