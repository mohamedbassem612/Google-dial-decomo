package com.google.android.play.core.review;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class AutoValue_ReviewInfo extends com.google.android.play.core.review.ReviewInfo {
    private final android.app.PendingIntent a;
    private final boolean b;

    public AutoValue_ReviewInfo(android.app.PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            throw new java.lang.NullPointerException("Null pendingIntent");
        }
        this.a = pendingIntent;
        this.b = z;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final android.app.PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.play.core.review.ReviewInfo) {
            com.google.android.play.core.review.ReviewInfo reviewInfo = (com.google.android.play.core.review.ReviewInfo) obj;
            if (this.a.equals(reviewInfo.a()) && this.b == reviewInfo.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return "ReviewInfo{pendingIntent=" + this.a.toString() + ", isNoOp=" + this.b + '}';
    }
}
