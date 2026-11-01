package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aaah extends defpackage.ylc implements android.os.IInterface {
    public aaah() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override // defpackage.ylc
    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        switch (i) {
            case 1:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.yld.c(parcel);
                b(status);
                return true;
            case 2:
                defpackage.yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 3:
                parcel.readLong();
                defpackage.yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 4:
                defpackage.yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 5:
                parcel.readLong();
                defpackage.yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yld.a(parcel, com.google.android.gms.common.data.DataHolder.CREATOR);
                defpackage.yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.yld.c(parcel);
                a(status2);
                return true;
            case 9:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) defpackage.yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                defpackage.yld.c(parcel);
                c(status3);
                return true;
            default:
                return false;
        }
    }

    public void a(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void b(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException();
    }

    public void c(com.google.android.gms.common.api.Status status) {
        throw new java.lang.UnsupportedOperationException();
    }
}
