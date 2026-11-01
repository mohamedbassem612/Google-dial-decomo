package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kue {
    public final android.os.Bundle a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;
    private final long e;

    public kue(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, boolean z, long j) {
        this.a = bundle;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.kue) {
            defpackage.kue kueVar = (defpackage.kue) obj;
            if (this.a.equals(kueVar.a) && this.b.equals(kueVar.b) && this.c.equals(kueVar.c) && this.d == kueVar.d && this.e == kueVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        int i = true != this.d ? 1237 : 1231;
        long j = this.e;
        return (((iHashCode * 1000003) ^ i) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final java.lang.String toString() {
        return "CallQualityRatingDialogData{callExtras=" + java.lang.String.valueOf(this.a) + ", displayName=" + this.b + ", rawNumber=" + this.c + ", isSpamCall=" + this.d + ", callCreationTime=" + this.e + '}';
    }

    public kue() {
        throw null;
    }
}
