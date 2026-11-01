package com.google.android.libraries.notifications.platform.registration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class YouTubeVisitor implements com.google.android.libraries.notifications.platform.registration.AccountRepresentation {
    public static final com.google.android.libraries.notifications.platform.registration.YouTubeVisitor a = new com.google.android.libraries.notifications.platform.registration.YouTubeVisitor();
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(6);

    private YouTubeVisitor() {
    }

    public final java.lang.String a() {
        return "signed_out";
    }

    public final /* synthetic */ boolean b() {
        return agab.by(this);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.notifications.platform.registration.YouTubeVisitor)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -436297177;
    }

    public final java.lang.String toString() {
        return "YouTubeVisitor";
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        aooh.f(parcel, "dest");
        parcel.writeInt(1);
    }
}
