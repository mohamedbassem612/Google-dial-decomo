package com.android.dialer.patrick.onboarding.service;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class CameraUriState implements android.os.Parcelable {

    /* JADX INFO: compiled from: PG */
    public final class NoPermission extends com.android.dialer.patrick.onboarding.service.CameraUriState {
        public static final com.android.dialer.patrick.onboarding.service.CameraUriState.NoPermission a = new com.android.dialer.patrick.onboarding.service.CameraUriState.NoPermission();
        public static final android.os.Parcelable.Creator CREATOR = new gec(13);

        private NoPermission() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.android.dialer.patrick.onboarding.service.CameraUriState.NoPermission)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 484218233;
        }

        public final java.lang.String toString() {
            return "NoPermission";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            aooh.f(parcel, "dest");
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: compiled from: PG */
    public final class Success extends com.android.dialer.patrick.onboarding.service.CameraUriState {
        public static final android.os.Parcelable.Creator CREATOR = new gec(14);
        public final android.net.Uri a;

        public Success(android.net.Uri uri) {
            this.a = uri;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this != obj) {
                return (obj instanceof com.android.dialer.patrick.onboarding.service.CameraUriState.Success) && aooh.n(this.a, ((com.android.dialer.patrick.onboarding.service.CameraUriState.Success) obj).a);
            }
            return true;
        }

        public final int hashCode() {
            android.net.Uri uri = this.a;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public final java.lang.String toString() {
            return "Success(cameraUri=" + this.a + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            aooh.f(parcel, "dest");
            parcel.writeParcelable(this.a, i);
        }
    }
}
