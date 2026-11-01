package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nii implements defpackage.nik {
    public final defpackage.Cnew a;

    public nii(defpackage.Cnew cnew) {
        this.a = cnew;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.nii) && this.a == ((defpackage.nii) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "WithPlayRecordingResult(result=" + this.a + ')';
    }
}
