package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cmz extends dca {
    private final float a = 1.0f;

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.cna();
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        ((defpackage.cna) cmvVar).a = 1.0f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.cmz)) {
            return false;
        }
        float f = ((defpackage.cmz) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1065353216;
    }

    public final java.lang.String toString() {
        return "ZIndexElement(zIndex=1.0)";
    }
}
