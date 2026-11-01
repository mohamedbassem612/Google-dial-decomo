package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class aaqt extends ylc implements android.os.IInterface {
    public aaqt() {
        super("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        switch (i) {
            case 1:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 2:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 3:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState backupAndSyncOptInState = (com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState) yld.a(parcel, com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState.CREATOR);
                com.google.android.gms.common.api.ApiMetadata apiMetadata = (com.google.android.gms.common.api.ApiMetadata) yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                d(status, backupAndSyncOptInState, apiMetadata);
                return true;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                parcel.createTypedArrayList(com.google.android.gms.people.account.categories.ClassifyAccountTypeResult.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.b(parcel);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 15:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 16:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                parcel.readInt();
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 17:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.b(parcel);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 18:
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                l();
                return true;
            case 19:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.common.api.ApiMetadata apiMetadata2 = (com.google.android.gms.common.api.ApiMetadata) yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                i(status2, apiMetadata2);
                return true;
            case 20:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 21:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                java.lang.String string = parcel.readString();
                com.google.android.gms.common.api.ApiMetadata apiMetadata3 = (com.google.android.gms.common.api.ApiMetadata) yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                g(status3, string, apiMetadata3);
                return true;
            case 22:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 23:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                parcel.createTypedArrayList(com.google.android.gms.people.cpg.CpgDocument.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 24:
                com.google.android.gms.common.api.Status status4 = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse createCallingCardResponse = (com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse) yld.a(parcel, com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse.CREATOR);
                com.google.android.gms.common.api.ApiMetadata apiMetadata4 = (com.google.android.gms.common.api.ApiMetadata) yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                a(status4, createCallingCardResponse, apiMetadata4);
                return true;
            case 25:
                com.google.android.gms.common.api.Status status5 = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                java.util.ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse.CREATOR);
                com.google.android.gms.common.api.ApiMetadata apiMetadata5 = (com.google.android.gms.common.api.ApiMetadata) yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                e(status5, arrayListCreateTypedArrayList, apiMetadata5);
                return true;
            case 26:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 27:
                com.google.android.gms.common.api.Status status6 = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                java.util.ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus.CREATOR);
                com.google.android.gms.common.api.ApiMetadata apiMetadata6 = (com.google.android.gms.common.api.ApiMetadata) yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                b(status6, arrayListCreateTypedArrayList2, apiMetadata6);
                return true;
            case 28:
                com.google.android.gms.common.api.Status status7 = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardResponse upsertCallingCardResponse = (com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardResponse) yld.a(parcel, com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardResponse.CREATOR);
                com.google.android.gms.common.api.ApiMetadata apiMetadata7 = (com.google.android.gms.common.api.ApiMetadata) yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                k(status7, upsertCallingCardResponse, apiMetadata7);
                return true;
            case 29:
                com.google.android.gms.common.api.Status status8 = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                java.util.ArrayList arrayListB = yld.b(parcel);
                com.google.android.gms.common.api.ApiMetadata apiMetadata8 = (com.google.android.gms.common.api.ApiMetadata) yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                f(status8, arrayListB, apiMetadata8);
                return true;
            case 30:
                com.google.android.gms.common.api.Status status9 = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                java.util.ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus.CREATOR);
                com.google.android.gms.common.api.ApiMetadata apiMetadata9 = (com.google.android.gms.common.api.ApiMetadata) yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                c(status9, arrayListCreateTypedArrayList3, apiMetadata9);
                return true;
            case 31:
                com.google.android.gms.common.api.Status status10 = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus callingCardRequestStatus = (com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus) yld.a(parcel, com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus.CREATOR);
                com.google.android.gms.common.api.ApiMetadata apiMetadata10 = (com.google.android.gms.common.api.ApiMetadata) yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                h(status10, callingCardRequestStatus, apiMetadata10);
                return true;
            case 32:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 33:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 34:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 35:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 36:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                parcel.createTypedArrayList(com.google.android.gms.people.contactssync.model.BackupSyncSettings.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 37:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                throw new java.lang.UnsupportedOperationException();
            case 38:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 39:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                parcel.createTypedArrayList(com.google.android.gms.people.cpg.actionpreferences.RawContactActionPreference.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 40:
                com.google.android.gms.common.api.Status status11 = (com.google.android.gms.common.api.Status) yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.people.contactssync.model.TetheredSyncStatus tetheredSyncStatus = (com.google.android.gms.people.contactssync.model.TetheredSyncStatus) yld.a(parcel, com.google.android.gms.people.contactssync.model.TetheredSyncStatus.CREATOR);
                com.google.android.gms.common.api.ApiMetadata apiMetadata11 = (com.google.android.gms.common.api.ApiMetadata) yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                j(status11, tetheredSyncStatus, apiMetadata11);
                return true;
            case 41:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 42:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 43:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 44:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 45:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 46:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 47:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 48:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 49:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 50:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 51:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 52:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 53:
                yld.a(parcel, com.google.android.gms.common.api.Status.CREATOR);
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            case 54:
                yld.a(parcel, com.google.android.gms.common.api.ApiMetadata.CREATOR);
                yld.c(parcel);
                return true;
            default:
                return false;
        }
    }

    public void l() {
    }

    public void i(com.google.android.gms.common.api.Status status, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
    }

    public void a(com.google.android.gms.common.api.Status status, com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse createCallingCardResponse, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
    }

    public void b(com.google.android.gms.common.api.Status status, java.util.List list, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
    }

    public void c(com.google.android.gms.common.api.Status status, java.util.List list, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
    }

    public void d(com.google.android.gms.common.api.Status status, com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState backupAndSyncOptInState, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
    }

    public void e(com.google.android.gms.common.api.Status status, java.util.List list, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
    }

    public void f(com.google.android.gms.common.api.Status status, java.util.List list, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
    }

    public void g(com.google.android.gms.common.api.Status status, java.lang.String str, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
    }

    public void h(com.google.android.gms.common.api.Status status, com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus callingCardRequestStatus, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
    }

    public void j(com.google.android.gms.common.api.Status status, com.google.android.gms.people.contactssync.model.TetheredSyncStatus tetheredSyncStatus, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
    }

    public void k(com.google.android.gms.common.api.Status status, com.google.android.gms.people.cpg.callingcard.v2.UpsertCallingCardResponse upsertCallingCardResponse, com.google.android.gms.common.api.ApiMetadata apiMetadata) {
    }
}
