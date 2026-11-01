package com.google.android.libraries.surveys.internal.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class QuestionMetrics implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.acay(11);
    private long a;
    private long b;

    public QuestionMetrics(android.os.Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
    }

    public final void a() {
        if (!c()) {
            android.util.Log.e("SurveyQuestionMetrics", "Question was marked as answered but was never marked as shown.");
        } else if (this.b >= 0) {
            long j = afjz.a;
        } else {
            this.b = android.os.SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (c()) {
            return;
        }
        this.a = android.os.SystemClock.elapsedRealtime();
    }

    public final boolean c() {
        return this.a >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public QuestionMetrics() {
        this.a = -1L;
        this.b = -1L;
    }
}
