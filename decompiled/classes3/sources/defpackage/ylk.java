package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class ylk extends ylc implements defpackage.yll {
    public ylk() {
        super("com.google.android.apps.aicore.aidl.IDownloadListener2");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i == 2) {
            java.lang.String string = parcel.readString();
            long j = parcel.readLong();
            yld.c(parcel);
            d(string, j);
        } else if (i == 3) {
            java.lang.String string2 = parcel.readString();
            long j2 = parcel.readLong();
            yld.c(parcel);
            c(string2, j2);
        } else if (i == 4) {
            java.lang.String string3 = parcel.readString();
            int i2 = parcel.readInt();
            java.lang.String string4 = parcel.readString();
            yld.c(parcel);
            b(string3, i2, string4);
        } else {
            if (i != 5) {
                return false;
            }
            java.lang.String string5 = parcel.readString();
            yld.c(parcel);
            a(string5);
        }
        return true;
    }
}
