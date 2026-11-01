package androidx.car.app.messaging.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class CarMessage {
    private final androidx.car.app.model.CarText mBody;
    private final boolean mIsRead;
    private final java.lang.String mMultimediaMimeType;
    private final android.net.Uri mMultimediaUri;
    private final long mReceivedTimeEpochMillis;
    private final android.os.Bundle mSender;

    CarMessage(defpackage.vp vpVar) {
        defpackage.dvv dvvVar = vpVar.a;
        this.mSender = null;
        androidx.car.app.model.CarText carText = vpVar.b;
        this.mBody = null;
        java.lang.String str = vpVar.c;
        this.mMultimediaMimeType = null;
        android.net.Uri uri = vpVar.d;
        this.mMultimediaUri = null;
        long j = vpVar.e;
        this.mReceivedTimeEpochMillis = 0L;
        boolean z = vpVar.f;
        this.mIsRead = false;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.messaging.model.CarMessage) {
            androidx.car.app.messaging.model.CarMessage carMessage = (androidx.car.app.messaging.model.CarMessage) obj;
            if (ru.c(getSender(), carMessage.getSender()) && j$.util.Objects.equals(this.mBody, carMessage.mBody) && this.mReceivedTimeEpochMillis == carMessage.mReceivedTimeEpochMillis && this.mIsRead == carMessage.mIsRead) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarText getBody() {
        return this.mBody;
    }

    public java.lang.String getMultimediaMimeType() {
        return this.mMultimediaMimeType;
    }

    public android.net.Uri getMultimediaUri() {
        return this.mMultimediaUri;
    }

    public long getReceivedTimeEpochMillis() {
        return this.mReceivedTimeEpochMillis;
    }

    public defpackage.dvv getSender() {
        android.os.Bundle bundle = this.mSender;
        if (bundle == null) {
            return null;
        }
        return defpackage.dvv.a(bundle);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(ru.b(getSender())), this.mBody, java.lang.Long.valueOf(this.mReceivedTimeEpochMillis), java.lang.Boolean.valueOf(this.mIsRead)});
    }

    public boolean isRead() {
        return this.mIsRead;
    }

    private CarMessage() {
        this.mSender = null;
        this.mBody = null;
        this.mMultimediaMimeType = null;
        this.mMultimediaUri = null;
        this.mReceivedTimeEpochMillis = 0L;
        this.mIsRead = false;
    }
}
