package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class zzr implements android.os.Parcelable.Creator {
    /* JADX INFO: Thrown type has an unknown type hierarchy: aahs */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) throws aahs {
        int iK = defpackage.aais.K(parcel);
        int[] iArrAd = null;
        java.lang.String[] strArrAg = null;
        int[] iArrAd2 = null;
        byte[][] bArrAh = null;
        com.google.android.gms.phenotype.ExperimentTokens[] experimentTokensArr = null;
        com.google.android.gms.clearcut.internal.LogVerifierResultParcelable logVerifierResultParcelable = null;
        java.lang.String[] strArrAg2 = null;
        com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable dataCollectionIdentifierParcelable = null;
        com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelable = null;
        byte[] bArrAc = null;
        java.lang.Long lT = null;
        int I = 0;
        boolean zAb = true;
        com.google.android.gms.clearcut.internal.PlayLoggerContext playLoggerContext = null;
        byte[] bArrAc2 = null;
        while (parcel.dataPosition() < iK) {
            int i = parcel.readInt();
            com.google.android.gms.clearcut.internal.PlayLoggerContext playLoggerContext2 = playLoggerContext;
            switch ((char) i) {
                case 2:
                    playLoggerContext = (com.google.android.gms.clearcut.internal.PlayLoggerContext) defpackage.aais.O(parcel, i, com.google.android.gms.clearcut.internal.PlayLoggerContext.CREATOR);
                    continue;
                case 3:
                    bArrAc2 = defpackage.aais.ac(parcel, i);
                    break;
                case 4:
                    iArrAd = defpackage.aais.ad(parcel, i);
                    break;
                case 5:
                    strArrAg = defpackage.aais.ag(parcel, i);
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    iArrAd2 = defpackage.aais.ad(parcel, i);
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    bArrAh = defpackage.aais.ah(parcel, i);
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    zAb = defpackage.aais.ab(parcel, i);
                    break;
                case '\t':
                    experimentTokensArr = (com.google.android.gms.phenotype.ExperimentTokens[]) defpackage.aais.af(parcel, i, com.google.android.gms.phenotype.ExperimentTokens.CREATOR);
                    break;
                case '\n':
                default:
                    defpackage.aais.aa(parcel, i);
                    break;
                case 11:
                    logVerifierResultParcelable = (com.google.android.gms.clearcut.internal.LogVerifierResultParcelable) defpackage.aais.O(parcel, i, com.google.android.gms.clearcut.internal.LogVerifierResultParcelable.CREATOR);
                    break;
                case '\f':
                    strArrAg2 = defpackage.aais.ag(parcel, i);
                    break;
                case '\r':
                    I = defpackage.aais.I(parcel, i);
                    break;
                case 14:
                    dataCollectionIdentifierParcelable = (com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable) defpackage.aais.O(parcel, i, com.google.android.gms.clearcut.internal.DataCollectionIdentifierParcelable.CREATOR);
                    break;
                case 15:
                    batchedLogErrorParcelable = (com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable) defpackage.aais.O(parcel, i, com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable.CREATOR);
                    break;
                case 16:
                    bArrAc = defpackage.aais.ac(parcel, i);
                    break;
                case 17:
                    lT = defpackage.aais.T(parcel, i);
                    break;
            }
            playLoggerContext = playLoggerContext2;
        }
        defpackage.aais.Y(parcel, iK);
        return new com.google.android.gms.clearcut.LogEventParcelable(playLoggerContext, bArrAc2, iArrAd, strArrAg, iArrAd2, bArrAh, zAb, experimentTokensArr, logVerifierResultParcelable, strArrAg2, I, dataCollectionIdentifierParcelable, batchedLogErrorParcelable, bArrAc, lT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.clearcut.LogEventParcelable[i];
    }
}
