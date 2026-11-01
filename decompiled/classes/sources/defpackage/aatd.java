package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aatd extends defpackage.ylc implements android.os.IInterface {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aatd(defpackage.aata aataVar, defpackage.zzx zzxVar, int i) {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
        this.$cid = i;
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aataVar);
    }

    @Override // defpackage.ylc
    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        int iW;
        int i2 = this.$cid;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i != 2) {
                    return false;
                }
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                byte[] bArrCreateByteArray = parcel.createByteArray();
                defpackage.yld.c(parcel);
                if (status.c()) {
                    try {
                        defpackage.alad aladVarE = defpackage.alad.E(defpackage.aexy.a, bArrCreateByteArray, 0, bArrCreateByteArray.length, defpackage.akzq.a);
                        defpackage.alad.V(aladVarE);
                        defpackage.aais.ax(status, (defpackage.aexy) aladVarE, (defpackage.zzx) this.a);
                    } catch (defpackage.alaz e) {
                        ((defpackage.zzx) this.a).h(e);
                    }
                } else {
                    defpackage.aais.ax(status, null, (defpackage.zzx) this.a);
                }
            } else {
                if (i != 1) {
                    return false;
                }
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                defpackage.yld.c(parcel);
                try {
                    defpackage.alad aladVarE2 = defpackage.alad.E(defpackage.ajdp.a, bArrCreateByteArray2, 0, bArrCreateByteArray2.length, defpackage.akzq.a());
                    defpackage.alad.V(aladVarE2);
                    int i3 = ((defpackage.ajdp) aladVarE2).b;
                    int iW2 = defpackage.a.W(i3);
                    if ((iW2 != 0 && iW2 == 2) || (iW = defpackage.a.W(i3)) == 0 || iW == 1) {
                        ((defpackage.zzx) this.a).i(java.lang.Boolean.FALSE);
                    } else {
                        ((defpackage.zzx) this.a).i(java.lang.Boolean.TRUE);
                    }
                } catch (defpackage.alaz | java.lang.NullPointerException e2) {
                    if (!((defpackage.zzx) this.a).h(e2)) {
                        android.util.Log.e("DuoStateFetcher", "Error setting exception--task is already complete.", e2);
                    }
                }
            }
        } else {
            if (i != 2) {
                return false;
            }
            byte[] bArrCreateByteArray3 = parcel.createByteArray();
            defpackage.yld.c(parcel);
            ((defpackage.aafe) this.a).b(new aaoc(this, bArrCreateByteArray3, 3));
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aatd(defpackage.zzx zzxVar, int i) {
        super("com.google.android.apps.tachyon.clientapi.IGetRegisteredIdTypeCallback");
        this.$cid = i;
        this.a = zzxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aatd(defpackage.aata aataVar, defpackage.aafe aafeVar, int i) {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
        this.$cid = i;
        this.a = aafeVar;
        j$.util.Objects.requireNonNull(aataVar);
    }
}
