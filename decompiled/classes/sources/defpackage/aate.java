package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aate extends defpackage.ylc implements android.os.IInterface {
    private final defpackage.zzx a;

    public aate(defpackage.zzx zzxVar) {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
        this.a = zzxVar;
    }

    @Override // defpackage.ylc
    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        switch (i) {
            case 1:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status, null, this.a);
                return true;
            case 2:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status2, null, this.a);
                return true;
            case 3:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status3, null, this.a);
                return true;
            case 4:
                com.google.android.gms.common.api.Status status4 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.phenotype.Configurations configurations = (com.google.android.gms.phenotype.Configurations) defpackage.yld.a(parcel, com.google.android.gms.phenotype.Configurations.CREATOR);
                defpackage.yld.c(parcel);
                a(status4, configurations);
                return true;
            case 5:
                com.google.android.gms.common.api.Status status5 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status5, null, this.a);
                return true;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                com.google.android.gms.common.api.Status status6 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.phenotype.ExperimentTokens experimentTokens = (com.google.android.gms.phenotype.ExperimentTokens) defpackage.yld.a(parcel, com.google.android.gms.phenotype.ExperimentTokens.CREATOR);
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status6, experimentTokens, this.a);
                return true;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                com.google.android.gms.common.api.Status status7 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.phenotype.DogfoodsToken dogfoodsTokenA = defpackage.yld.a(parcel, com.google.android.gms.phenotype.DogfoodsToken.CREATOR);
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status7, dogfoodsTokenA, this.a);
                return true;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                com.google.android.gms.common.api.Status status8 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status8, null, this.a);
                return true;
            case 9:
                com.google.android.gms.common.api.Status status9 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.phenotype.Flag flag = (com.google.android.gms.phenotype.Flag) defpackage.yld.a(parcel, com.google.android.gms.phenotype.Flag.CREATOR);
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status9, flag, this.a);
                return true;
            case 10:
                com.google.android.gms.common.api.Status status10 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.phenotype.Configurations configurations2 = (com.google.android.gms.phenotype.Configurations) defpackage.yld.a(parcel, com.google.android.gms.phenotype.Configurations.CREATOR);
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status10, configurations2, this.a);
                return true;
            case 11:
                com.google.android.gms.common.api.Status status11 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                parcel.readLong();
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status11, null, this.a);
                return true;
            case 12:
                com.google.android.gms.common.api.Status status12 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status12, null, this.a);
                return true;
            case 13:
                com.google.android.gms.common.api.Status status13 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.phenotype.FlagOverrides flagOverridesA = defpackage.yld.a(parcel, com.google.android.gms.phenotype.FlagOverrides.CREATOR);
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status13, flagOverridesA, this.a);
                return true;
            case 14:
                com.google.android.gms.common.api.Status status14 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status14, null, this.a);
                return true;
            case 15:
                com.google.android.gms.common.api.Status status15 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status15, null, this.a);
                return true;
            case 16:
                com.google.android.gms.common.api.Status status16 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                long j = parcel.readLong();
                defpackage.yld.c(parcel);
                defpackage.aais.ax(status16, java.lang.Long.valueOf(j), this.a);
                return true;
            default:
                return false;
        }
    }

    public final void a(com.google.android.gms.common.api.Status status, com.google.android.gms.phenotype.Configurations configurations) {
        defpackage.aais.ax(status, configurations, this.a);
    }
}
