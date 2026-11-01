package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aavn extends defpackage.ylc implements android.os.IInterface {
    public aavn() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    @Override // defpackage.ylc
    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        switch (i) {
            case 2:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.usagereporting.UsageReportingOptInOptions usageReportingOptInOptions = (com.google.android.gms.usagereporting.UsageReportingOptInOptions) defpackage.yld.a(parcel, com.google.android.gms.usagereporting.UsageReportingOptInOptions.CREATOR);
                defpackage.yld.c(parcel);
                a(status, usageReportingOptInOptions);
                return true;
            case 3:
                defpackage.yld.c(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 4:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.yld.c(parcel);
                b(status2);
                return true;
            case 5:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.yld.c(parcel);
                c(status3);
                return true;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                parcel.createStringArrayList();
                defpackage.yld.c(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yld.c(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yld.g(parcel);
                defpackage.yld.a(parcel, com.google.android.gms.usagereporting.ConsentInformation.CREATOR);
                defpackage.yld.c(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 9:
                defpackage.yld.a(parcel, com.google.android.gms.usagereporting.ConsentInformation.CREATOR);
                defpackage.yld.c(parcel);
                throw new java.lang.IllegalStateException("Not implemented");
            case 10:
                defpackage.yld.c(parcel);
                throw new java.lang.IllegalStateException("Not implemented");
            case 11:
                defpackage.yld.c(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 12:
                defpackage.yld.a(parcel, com.google.android.gms.usagereporting.ElCapitanOptions.CREATOR);
                defpackage.yld.c(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 13:
                defpackage.yld.c(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 14:
                defpackage.yld.a(parcel, com.google.android.gms.usagereporting.SafetyOptions.CREATOR);
                defpackage.yld.c(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            case 15:
                defpackage.yld.a(parcel, com.google.android.gms.usagereporting.ConsentInformation.CREATOR);
                defpackage.yld.c(parcel);
                throw new java.lang.IllegalStateException("Not implemented.");
            default:
                return false;
        }
    }

    public void a(com.google.android.gms.common.api.Status status, com.google.android.gms.usagereporting.UsageReportingOptInOptions usageReportingOptInOptions) {
        throw new java.lang.IllegalStateException("Not implemented.");
    }

    public void b(com.google.android.gms.common.api.Status status) {
        throw new java.lang.IllegalStateException("Not implemented.");
    }

    public void c(com.google.android.gms.common.api.Status status) {
        throw new java.lang.IllegalStateException("Not implemented.");
    }
}
